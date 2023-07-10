package com.AnLa.Entity;
//Make by Bình An || AnLaVN || KatoVN

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Entity
@Table(name = "ADMINS", schema = "dbo", catalog = "ACHATSPRING", uniqueConstraints = {
		@UniqueConstraint(columnNames = "Username"), 
		@UniqueConstraint(columnNames = "Email") })

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "AdminID", unique = true, nullable = false)
	private Integer adminID;
	
	@Column(name = "Username", unique = true, nullable = false, length = 32)
	@NonNull
	private String username;
	
	@Column(name = "Password", length = 64)
	private String password;
	
	@Column(name = "Fullname")
	private String fullname;
	
	@Column(name = "Email", unique = true, length = 256)
	private String email;
	
	@Column(name = "Avatar", length = 128)
	private String avatar;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "admin")
	private Set<Reported> reporteds = new HashSet<Reported>();

}