package com.AnLa.Entity;
//Make by Bình An || AnLaVN || KatoVN

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatDTO {
	@Id
	@Column(name = "ChatID", unique = true, nullable = false)
	private Integer chatID;
	private String fullname, avatar;
	private Boolean gender;
}