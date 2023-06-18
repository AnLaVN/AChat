<h1 align="center">AnLa-Chat-App or AChat</h1>
<p align="center">
  <img src="https://user-images.githubusercontent.com/90229487/212619385-e9045af7-c284-4839-a11f-a9ab3e5af3f4.png" width = "50%">
  <br><br>
  <a href="https://www.apache.org/licenses/LICENSE-2.0"><img src="https://img.shields.io/github/license/AnLaVN/AChat" alt="GitHub license"/></a>
  <a href="https://cloudinary.com/"><img src="https://img.shields.io/badge/Cloud-Cloudinary-blue"></a>
  <a href="https://www.radmin-vpn.com"><img src="https://img.shields.io/badge/Network-Radmin--VPN-blue"></a>
  <br><br>
  <img src="https://img.shields.io/github/repo-size/AnLaVN/AChat">
  <img src="https://img.shields.io/github/languages/code-size/AnLaVN/AChat">
  <img src="https://img.shields.io/github/downloads/AnLaVN/AChat/total">
  <a href="https://github.com/AnLaVN/AChat/commits/Releases"><img src="https://img.shields.io/github/commit-activity/w/AnLaVN/AChat"></a>
  <a href="https://github.com/AnLaVN/AChat/commits/Releases"><img src="https://img.shields.io/github/last-commit/AnLaVN/AChat"></a>
  <a href="https://github.com/AnLaVN/AChat/releases"><img src="https://img.shields.io/github/release-date/AnLaVN/AChat"></a>
</p>


# 1. Overview / Tổng quan
### Tiếng Việt
> AChat là dự án cá nhân đầu tiên của tôi, được viết sau khi học xong Java 3 tại FPoly, nhằm kiểm tra kiến thức của bản thân cũng như khả năng học hỏi kiến thức mới trên intenet, đây cũng là nền tảng cho các dự án sau này như [AL-Library](https://github.com/AnLaVN/AL-Library), [EOA](https://github.com/AnLaVN/EOA),...
>
> Về cơ bản AChat là một ứng dụng trò chuyện với người lạ, có nghĩa là danh tính của bạn và cả đối phương đều được giấu kín. Bạn không cần sợ bị lộ thông tin, trừ khi bạn cung cấp cho người lạ. Ứng dụng cũng không lưu trữ tin nhắn của bạn nên bạn hoàn toàn yên tâm về quyền riêng tư, chính vì vậy nếu bạn thoát ứng dụng hoặc kết thức cuộc trò chuyện, toàn bộ tin nhắn sẽ mất, hãy cẩn thận.
>
> Ứng dụng sử dụng socket trong Java để giao tiếp thông qua mạng cục bộ (LAN). Tính năng bảo mật được thêm vào bao gồm mã hoá tên đăng nhập và mật khẩu theo chuẩn SHA256, một hàm băm mật mã học được thiết kế bởi Cơ quan An ninh Quốc gia Hoa Kỳ và xuất bản lần đầu tiên vào năm 2001. Ngoài ra còn hỗ trợ giao diện Sáng và Tối, gói ngôn ngữ bao gồm Tiếng Việt và Tiếng Anh, với cài đặt mặc định là giao diện Tối và ngôn ngữ Tiếng Việt.
>
> Mặc dù chỉ được thiết kế để hoạt động trong môi trường mạng cục bộ (LAN). Nhưng AChat vẫn hoàn toàn có thể hoạt động được bình thường ở bên ngoài mạng LAN. Tất nhiên là nhờ vào sự giúp đỡ của ứng dụng bên thứ 3 là [Radmin-VPN](https://www.radmin-vpn.com). Với một kết nối mạng chung [Radmin-VPN](https://www.radmin-vpn.com), người dùng từ những khu vực địa lí khác nhau giờ đây đã có thể kết nối với nhau.
>
> Ứng dụng được lấy cảm hứng từ [cvnl.app](cvnl.app), cảm ơn vì đã cho tôi khoảng thời gian tuyệt vời và những ý tưởng tuyệt vời.
> 
### English
> AChat is my first personal project, written after finishing Java 3 at FPoly, to test my knowledge as well as my ability to learn new knowledge on the internet, this is also the foundation for projects later like [AL-Library](https://github.com/AnLaVN/AL-Library), [EOA](https://github.com/AnLaVN/EOA),...
>
> Basically AChat is a chat application with strangers, which means that both your identity and the other person's identity are hidden. You don't need to be afraid of your information being leaked, unless you give it to strangers. The app also doesn't store your messages so you can rest assured about your privacy, so if you exit the app or end the conversation, all messages will be lost, be careful.
>
> The application uses sockets in Java to communicate over a local area network (LAN). Added security features include SHA256 encryption of usernames and passwords, a cryptographic hash function designed by the US National Security Agency and first published in 2001. Additionally also supports Light and Dark interface, language packs include Vietnamese and English, with default settings being Dark theme and Vietnamese language.
>
> Although only designed to work in a local area network (LAN) environment. But AChat can still work properly outside the LAN. With the help of a 3rd party application, of course, [Radmin-VPN](https://www.radmin-vpn.com). With a common [Radmin-VPN](https://www.radmin-vpn.com) network connection, users from different geographical areas can now connect to each other.
>
> The app is inspired by [cvnl.app](cvnl.app), thanks for giving me a great time and great ideas.

# 2. Algorithm Flowchart / Lưu đồ thuật toán
<p align="center">
  <img src="https://user-images.githubusercontent.com/90229487/221405757-ea064e86-45f4-474a-80ae-deeadaf14f80.png">
  <br><br>
  <img src="https://user-images.githubusercontent.com/90229487/221405752-b6cca033-855c-4e92-895b-a302b4f78499.png">
</p>

# 3. Download / Tải xuống
* [Releases Version](https://github.com/AnLaVN/AChat/releases)
