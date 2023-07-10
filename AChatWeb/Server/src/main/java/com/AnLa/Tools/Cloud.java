package com.AnLa.Tools;
//Make by Bình An || AnLaVN || KatoVN

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import com.AnLa.FILE.Log;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

public class Cloud {
	public static Cloudinary cloudinary = new Cloudinary("cloudinary://985969511487375:1zJ0Tonfsk5m3-asd9PotnkhiTc@anlavn");
	
	public static void destroyFromList(List<String> images) throws MalformedURLException, IOException {
		images.forEach(image -> destroy(image));
	}
	
	public static void destroy(String pPublic_ID) {
		try {
			Log.add("Try to delete image: " + pPublic_ID);
			cloudinary.uploader().destroy(pPublic_ID, ObjectUtils.emptyMap());
		} catch (IOException e) {
			Log.add("Error try to delete image. Error code: " + e.toString());
		}
	}
}