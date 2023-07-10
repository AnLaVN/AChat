package com.AnLa.Entity;
//Make by Bình An || AnLaVN || KatoVN

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportedId {

	@Column(name = "User_Report", nullable = false)
	private int userReport;
	
	@Column(name = "User_Reported", nullable = false)
	private int userReported;
	
	@Column(name = "ReportID", nullable = false)
	private int reportId;

}