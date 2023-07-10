package com.AnLa.DAO;
//Make by Bình An || AnLaVN || KatoVN

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.AnLa.Entity.ChatDTO;

public interface ChatDTODAO extends JpaRepository<ChatDTO, Integer>{
	@Query(value = "EXEC GetChats @UserID = :userId", nativeQuery = true)
	List<ChatDTO> findChatsByUserId(Integer userId);
}