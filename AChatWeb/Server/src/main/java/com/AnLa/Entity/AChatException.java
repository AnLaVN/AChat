package com.AnLa.Entity;
//Make by Bình An || AnLaVN || KatoVN

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class AChatException extends Exception{
	@NonNull
	private String acode;
	@NonNull
	private String message;
	private String exception;
}