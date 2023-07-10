package com.AnLa.Controller;
//Make by Bình An || AnLaVN || KatoVN

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.AnLa.DAO.ChatDAO;
import com.AnLa.DAO.ChatDTODAO;
import com.AnLa.Entity.AChatException;
import com.AnLa.FILE.Log;
import com.AnLa.Tools.Cloud;

@RestController
@RequestMapping("/Chats")
@CrossOrigin(origins = {"https://127.0.0.1:5500", "https://192.168.1.12:5500"})
public class Conversations {
	@Autowired
	ChatDAO chatDAO;
	
	@Autowired
	ChatDTODAO chatDTODAO;
	
	@PostMapping("/GetChats")
	public ResponseEntity<?> GetChats(@RequestParam("userId") Integer pUserID){
		try {
			// Thông báo Log khi có requset tới
			Log.add("User " + pUserID + " try to get all chats.");
			return ResponseEntity.ok(chatDTODAO.findChatsByUserId(pUserID));	// Trả về dữ liệu chat của người dùng
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(new AChatException("ER_GETCHATS", "Không thể xử lí yêu cầu truy vấn dữ liệu trò chuyện!", e.toString()));
		}
	}
	
	@PostMapping("/DeleteChats")
	public ResponseEntity<?> DeleteChats(@RequestParam("chatID") Integer pChatID, @RequestParam("listImage") List<String> pListImage){
		try {
			// Thông báo Log khi có requset tới
			Log.add("Try to delete Chat: " + pChatID);
			System.out.println(pListImage.toString());
			Cloud.destroyFromList(pListImage);
			chatDAO.deleteById(pChatID);
			return ResponseEntity.ok(true);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(new AChatException("ER_UPDATECHATS", "Không thể xử lí yêu cầu xoá bỏ dữ liệu trò chuyện!", e.toString()));
		}
	}

}