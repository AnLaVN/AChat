package com.AnLa.Controller;
//Make by Bình An || AnLaVN || KatoVN

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AnLa.DAO.UserDAO;
import com.AnLa.Entity.AChatException;
import com.AnLa.Entity.User;
import com.AnLa.FILE.Log;
import com.AnLa.HASH.BCrypt;

@RestController
@RequestMapping("/Account")
@CrossOrigin(origins = {"https://127.0.0.1:5500", "https://192.168.1.12:5500", "https://achat.pages.dev"})
public class Account {
	@Autowired
	UserDAO userDAO;


	/**Hàm xử lý đăng nhập cho tài khoản ẩn danh.
	 * @param pIP tham số email của người dùng. Chứa địa chỉ IP của người dùng ẩn danh.
	 * @return `Thông tin User` nếu đăng nhập thành công, ngược lại là các thông báo lỗi.
	 */
	@PostMapping("/AnonymousSignIn")
	public ResponseEntity<?> AnonymousSignIn(@RequestParam("email") String pIP) {
		try {
			// Thông báo Log khi có requset tới
			Log.add("User Anonymous " + pIP + " try to Sign In AChat.");
			
			if(!userDAO.existsByEmail(pIP)) 							// Nếu tài khoản không tồn tại thì trả về thông báo lỗi
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new AChatException("FA_SIGNIN_IP", "Thiết bị chưa được đăng ký !"));
			
			if(userDAO.existsByEmailAndActivated(pIP, false))			// Nếu tài khoản đã tồn tại nhưng bị vô hiệu hoá thì trả về thông báo lỗi
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new AChatException("FA_ACTIVATED", "Thiết bị đã bị vô hiệu hoá !!"));
			
			// Nếu tài khoản đã tồn tại và không bị vô hiệu hoá thì trả về thông tin tài khoản
			Log.add("User Anonymous " + pIP + " Sign In successfully.");// Thông báo Log trước khi return
			return ResponseEntity.ok(userDAO.findByEmail(pIP));			// Trả về thông tin tài khoản lấy từ địa chỉ email
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(new AChatException("ER_SIGNIN_IP", "Không thể xử lí yêu cầu đăng nhập người dùng ẩn danh!", e.toString()));
		}
	}


	/**Hàm xử lý đăng ký cho tài khoản ẩn danh.
	 * @param pIP tham số email của người dùng. Chứa địa chỉ IP của người dùng ẩn danh.
	 * @return `Thông tin User` nếu đăng ký thành công, ngược lại là các thông báo lỗi.
	 */
	@PostMapping("/AnonymousSignUp")
	public ResponseEntity<?> AnonymousSignUp(@RequestParam("email") String pIP) {
		try {
			// Thông báo Log khi có requset tới
			Log.add("User Anonymous " + pIP + " try to Sign Up AChat.");
			
			if(userDAO.existsByEmail(pIP))								// Nếu địa chỉ IP đã tồn tại thì trả về thông báo lỗi
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new AChatException("FA_SIGNUP_IP", "Thiết bị đã được đăng ký !"));
			
			User anonymousUser = new User(pIP, pIP);					// Khởi tạo 1 tài khoản mới với email và payment là địa chỉ IP
			userDAO.save(anonymousUser);								// Lưu tài khoản vào csdl
			Log.add("User Anonymous " + pIP + " Sign Up successfully.");// Thông báo Log trước khi return
			return ResponseEntity.ok(anonymousUser);					// Trả về thông tin tài khoản đã khởi tạo
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(new AChatException("ER_SIGNUP_IP", "Không thể xử lí yêu cầu đăng ký người dùng ẩn danh !", e.toString()));
		}
	}



	/**Hàm xử lý đăng nhập cho tài khoản email.
	 * @param pEmail tham số email của người dùng.
	 * @param pPassword tham số password của người dùng.
	 * @return `Thông tin User` nếu đăng nhập thành công, ngược lại là các thông báo lỗi.
	 */
	@PostMapping("/UserSignIn")
	public ResponseEntity<?> UserSignIn(@RequestParam("email") String pEmail, @RequestParam("password") String pPassword) {
		try {
			// Thông báo Log khi có requset tới
			Log.add("User " + pEmail + " try to Sign In AChat.");
			
			if(!userDAO.existsByEmail(pEmail)) 					// Nếu tài khoản không tồn tại thì trả về thông báo lỗi
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new AChatException("FA_SIGNIN_EM", "Tài khoản liên kết với email này không tồn tại !"));
			
			if(userDAO.existsByEmailAndActivated(pEmail, false))// Nếu tài khoản đã tồn tại nhưng bị vô hiệu hoá thì trả về thông báo lỗi
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new AChatException("FA_ACTIVATED", "Tài khoản đã bị vô hiệu hoá !!"));
			
			User dbUser = userDAO.findByEmail(pEmail);			// Lấy thông tin tài khoản từ csdl
			if(BCrypt.Check(pPassword, dbUser.getPassword())) { // Nếu mật khẩu hợp lệ thì trả về thông tin tài khoản
				Log.add("User " + pEmail +" Sign Up successfully.");// Thông báo Log trước khi return
				return ResponseEntity.ok(dbUser);					// Trả về thông tin tài khoản
			}													// Nếu mật khẩu không hợp lệ thì trả về thông báo lỗi
			else return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new AChatException("FA_SIGNIN_EM", "Email hoặc mật khẩu không hợp lệ !"));
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(new AChatException("ER_SIGNIN_EM", "Không thể xử lí yêu cầu đăng nhập người dùng email !", e.toString()));
		}
	}


	/**Hàm xử lý đăng ký cho tài khoản email.
	 * @param pFullname tham số fullname của người dùng.
	 * @param pEmail tham số email của người dùng.
	 * @param pPassword tham số password của người dùng.
	 * @return `Thông tin User` nếu đăng ký thành công, ngược lại là các thông báo lỗi.
	 */
	@PostMapping("/UserSignUp")
	public ResponseEntity<?> UserSignUp(@RequestParam("fullname") String pFullname, @RequestParam("email") String pEmail, @RequestParam("password") String pPassword) {
		try {
			// Thông báo Log khi có requset tới
			Log.add("User " + pEmail + " try to Sign Up AChat.");
			
			if(userDAO.existsByEmail(pEmail))						// Nếu địa chỉ email đã tồn tại thì trả về thông báo lỗi
				return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new AChatException("FA_SIGNUP_EM", "Địa chỉ email này đã được đăng ký !"));
			
			// Khởi tạo 1 tài khoản mới với email và payment là địa chỉ email
			User emailUser = new User(pEmail, pEmail);
			emailUser.setFullname(pFullname);	emailUser.setPassword(BCrypt.Encrypt(pPassword, BCrypt.genSalt(5)));
			userDAO.save(emailUser);								// Lưu tài khoản vào csdl
			Log.add("User " + pEmail + " Sign Up successfully.");	// Thông báo Log trước khi return
			return ResponseEntity.ok(emailUser);					// Trả về thông tin tài khoản đã khởi tạo
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(new AChatException("ER_SIGNUP_EM", "Không thể xử lí yêu cầu đăng ký người dùng email !", e.toString()));
		}
	}



	/**Hàm cập nhật thông tin cá nhân cho tất cả người dùng
	 * @param pID tham số email của người dùng. Bắt buộc phải có để xác định người dùng.
	 * @param pGender tham số gender của người dùng.
	 * @param pEGender tham số excitedGender của người dùng.
	 * @param pAge tham số age của người dùng.
	 * @param pEAge tham số excitedAge của người dùng.
	 * @param pFullname tham số fullname của người dùng.
	 * @param pEmail tham số email của người dùng.
	 * @param pPassword tham số password của người dùng.
	 * @return trạng thái cập nhật. Thành công / Lỗi.
	 */
	@PostMapping("/UserUpdate")
	public ResponseEntity<?> UserInfor(
			@RequestParam("userId") Integer pID,
			@RequestParam(value = "gender", required = false) String pGender,
			@RequestParam(value = "EGender", required = false) String pEGender,
			@RequestParam(value = "age", required = false) String pAge,
			@RequestParam(value = "EAge", required = false) String pEAge,
			
			@RequestParam(value = "fullname", required = false) String pFullname,
			@RequestParam(value = "email", required = false) String pEmail,
			@RequestParam(value = "password", required = false) String pPassword
			){
		try {
			String notification = "User "+pID+" Update Account Infor: ";// Khởi tạo thông báo
			User dbUser = userDAO.findById(pID).get();					// Lấy thông tin tài khoản cần cập nhật
			
			if(!dbUser.getActivated()) // Nếu tài khoản đã bị vô hiệu hoá thì trả về thông báo lỗi
				return ResponseEntity.status(HttpStatus.FORBIDDEN).body(new AChatException("ER_UPDATEINFOR", "Không thể cập nhật tài khoản đã bị vô hiệu hoá !"));

			if (pGender != null) {	// Cập nhật giá trị gender nếu tham số pGender được gọi tới
				dbUser.setGender(pGender.equals("null") ? null : Boolean.parseBoolean(pGender));
				notification += "gender = " + dbUser.getGender();
			}
			if (pAge != null) {		// Cập nhật giá trị age nếu tham số pAge được gọi tới
				dbUser.setAge(pAge.equals("null") ? null : Boolean.parseBoolean(pAge));
				notification += "age = " + dbUser.getAge();
			}
			if (pEGender != null) {	// Cập nhật giá trị excitedGender nếu tham số pEGender được gọi tới
				dbUser.setExcitedGender(pEGender.equals("null") ? null : Boolean.parseBoolean(pEGender));
				notification += "excitedGender = " + dbUser.getExcitedGender();
			}
			if (pEAge != null) {	// Cập nhật giá trị excitedAge nếu tham số pEAge được gọi tới
				dbUser.setExcitedAge(pEAge.equals("null") ? null : Boolean.parseBoolean(pEAge));
				notification += "excitedAge = " + dbUser.getExcitedAge();
			}
			
			if (pFullname != null) {// Cập nhật giá trị fullname nếu tham số pFullname được gọi tới
				dbUser.setFullname(pFullname);
				notification += "fullname = " + dbUser.getFullname();
			}
			
			if (pEmail != null) {	// Cập nhật giá trị email nếu tham số pEmail được gọi tới
				dbUser.setEmail(pEmail);
				notification += ", email = " + dbUser.getEmail();
			}
			
			if (pPassword != null) {// Cập nhật giá trị password nếu tham số pPassword được gọi tới
				dbUser.setPassword(pPassword.equals("null") ? null : BCrypt.Encrypt(pPassword, BCrypt.genSalt(5)));
				notification += ", password = " +pPassword;
			}

			userDAO.save(dbUser);			// Lưu tài khoản vào csdl
			Log.add(notification);			// Thông báo Log trước khi return
			return ResponseEntity.ok(true);	// Trả về trạng thái cập nhật thành công
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(new AChatException("ER_UPDATEINFOR", "Không thể xử lí yêu cầu cập nhật thông tin tài khoản !", e.toString()));
		}
	}



	/**Hàm xử lý huỷ kích hoạt tài khoản.
	 * @param pEmail tham số email của người dùng.
	 * @param pPassword tham số password của người dùng.
	 * @return `Thông tin User` nếu đăng ký thành công, ngược lại là các thông báo lỗi.
	 */
	@PostMapping("/Deactivate")
	public ResponseEntity<?>  Deactivate(@RequestParam("email") String pEmail, @RequestParam(value = "password", required = false) String pPassword) {
		try {
			// Thông báo Log khi có requset tới
			Log.add("User " + pEmail + " try to Deactivate account.");
			User dbUser = userDAO.findByEmail(pEmail);			// Lấy thông tin tài khoản cần huỷ kích hoạt
			if(pPassword == null)userDAO.delete(dbUser);		// Xoá tài khoản nếu là người dùng ẩn danh
			else if(BCrypt.Check(pPassword,dbUser.getPassword())){	// Xác nhận mật khẩu nếu là người dùng email
				dbUser.setActivated(false);						// Huỷ kích hoạt tài khoản
				userDAO.save(dbUser);							// Lưu tài khoản vào csdl
			}
			Log.add("User " + pEmail + " Deactivate successfully.");
			return ResponseEntity.ok(true);						// Trả về trạng thái huỷ kích hoạt thành công
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(new AChatException("ER_DEACTIVATE", "Không thể xử lí yêu cầu huỷ kích hoạt tài khoản !", e.toString()));
		}
	}


}