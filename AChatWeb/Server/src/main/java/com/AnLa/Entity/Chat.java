package com.AnLa.Entity;
//Make by Bình An || AnLaVN || KatoVN

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "CHATS", schema = "dbo", catalog = "ACHATSPRING"
//, uniqueConstraints = @UniqueConstraint(columnNames = {"User1", "User2"})
)
@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
public class Chat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ChatID", unique = true, nullable = false)
	private Integer chatID;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//	@JoinColumn(name = "Other_User", nullable = false)
//	@NonNull
//	private User otherUser;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//	@JoinColumn(name = "User1", nullable = false)
//	@NonNull
//	private User user1;
//	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
//	@JoinColumn(name = "User2", nullable = false)
//	@NonNull
//	private User user2;
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "chat")
//	private List<Message> messageses = new ArrayList<>();

}