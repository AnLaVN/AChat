package com.AnLa.DAO;
//Make by Bình An || AnLaVN || KatoVN

import org.springframework.data.jpa.repository.JpaRepository;

import com.AnLa.Entity.Chat;

public interface ChatDAO extends JpaRepository<Chat, Integer>{
	
//	@Query("SELECT c FROM Chat c WHERE c.user1.userId = :userId OR c.user2.userId = :userId")
//	List<Chat> findChatsByUserId(Integer userId);
	
//	@Query(value =  "SELECT ChatID, CASE WHEN User1 = :userId THEN User2 ELSE User1 END AS Other_User FROM CHATS WHERE User1 = :userId OR User2 = :userId",
//			nativeQuery = true)
//	List<Chat> findChatsByUserId(Integer userId);
	
//	@Query(value = "EXEC GetChats @UserID = :userId", nativeQuery = true)
//	@Procedure(name = "GetChats")
//	List<ChatDTO> findChatsByUserId(Integer userId);
}