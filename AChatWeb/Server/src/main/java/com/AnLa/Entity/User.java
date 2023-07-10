package com.AnLa.Entity;
//Make by Bình An || AnLaVN || KatoVN

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "USERS", schema = "dbo", catalog = "ACHATSPRING", uniqueConstraints = {
		@UniqueConstraint(columnNames = "Payment"),
		@UniqueConstraint(columnNames = "Email") })
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UserID", unique = true, nullable = false)
	private Integer userId;

	@Column(name = "Password", length = 64)
	private String password;

	@Column(name = "Fullname")
	private String fullname;

	@Column(name = "Email", unique = true, length = 256)
	@NonNull
	private String email;

	@Column(name = "Avatar", length = 128)
	private String avatar;

	@Column(name = "Payment", unique = true, length = 256)
	@NonNull
	private String payment;

	@Column(name = "Gender")
	private Boolean gender;

	@Column(name = "Age")
	private Boolean age;

	@Column(name = "Excited_Gender")
	private Boolean excitedGender;

	@Column(name = "Excited_Age")
	private Boolean excitedAge;

	@Column(name = "Activated")
	private Boolean activated = true;
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userSend")
//	private Set<Message> messageses = new HashSet<Message>();

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userReported")
//	private Set<Reported> userReporteds = new HashSet<Reported>();

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userReport")
//	private Set<Reported> userReports = new HashSet<Reported>();

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user1")
//	private Set<Chat> user1s = new HashSet<>();
//
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user2")
//	private Set<Chat> user2s = new HashSet<>();
	
//	public User(String username, String password, Serializable fullname, String email, String avatar,
//			String paymentCode, Boolean gender, Byte age, Boolean excitingGender, Byte excitingAge, Boolean activated,
//			Set<Reported> reportedsForUserReported, Set<Messages> messageses, Set<Reported> reportedsForUserReport,
//			Set<Chats> chatsesForUser1, Set<Chats> chatsesForUser2) {
//		this.username = username;
//		this.password = password;
//		this.fullname = fullname;
//		this.email = email;
//		this.avatar = avatar;
//		this.paymentCode = paymentCode;
//		this.gender = gender;
//		this.age = age;
//		this.excitingGender = excitingGender;
//		this.excitingAge = excitingAge;
//		this.activated = activated;
//		this.reportedsForUserReported = reportedsForUserReported;
//		this.messageses = messageses;
//		this.reportedsForUserReport = reportedsForUserReport;
//		this.chatsesForUser1 = chatsesForUser1;
//		this.chatsesForUser2 = chatsesForUser2;
//		
//	}

}