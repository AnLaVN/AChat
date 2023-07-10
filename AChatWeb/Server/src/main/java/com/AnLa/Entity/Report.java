package com.AnLa.Entity;
//Make by Bình An || AnLaVN || KatoVN

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Entity
@Table(name = "REPORT", schema = "dbo", catalog = "ACHATSPRING")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Report {

	@Id
	@Column(name = "ReportID", unique = true, nullable = false)
	@NonNull
	private Integer reportId;
	
	@Column(name = "Description", nullable = false)
	@NonNull
	private String description;
	
	@Column(name = "Penalize", nullable = false)
	@NonNull
	private String penalize;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "report")
	private Set<Reported> reporteds = new HashSet<Reported>();

}