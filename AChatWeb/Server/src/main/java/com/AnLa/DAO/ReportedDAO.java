package com.AnLa.DAO;
//Make by Bình An || AnLaVN || KatoVN

import org.springframework.data.jpa.repository.JpaRepository;

import com.AnLa.Entity.Reported;
import com.AnLa.Entity.ReportedId;

public interface ReportedDAO extends JpaRepository<Reported, ReportedId>{

}