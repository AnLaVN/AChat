package com.AnLa.Entity;
//Make by Bình An || AnLaVN || KatoVN

import java.util.Date;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "REPORTED", schema = "dbo", catalog = "ACHATSPRING")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Reported {

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "userReport",   column = @Column(name = "User_Report",   nullable = false)),
			@AttributeOverride(name = "userReported", column = @Column(name = "User_Reported", nullable = false)),
			@AttributeOverride(name = "reportId", 	  column = @Column(name = "ReportID", 	  nullable = false)) })
	private ReportedId id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Admin", nullable = false)
	private Admin admin;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ReportID", nullable = false, insertable = false, updatable = false)
	private Report report;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "User_Report", nullable = false, insertable = false, updatable = false)
	private User userReport;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "User_Reported", nullable = false, insertable = false, updatable = false)
	private User userReported;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Report_Time", nullable = false, length = 16)
	private Date reportTime;
	
	@Column(name = "Status", nullable = false)
	private boolean status;

}