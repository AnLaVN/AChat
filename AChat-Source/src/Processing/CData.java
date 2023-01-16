package Processing; //Processing Cloundinary Data
// Make By Bình An || AnLaVN || KatoVN

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import java.io.*;
import java.util.Map;

public class CData {
    private static final Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
            "[This content has been censored by AnLaVN owner.]",
            "[This content has been censored by AnLaVN owner.]",
            "[This content has been censored by AnLaVN owner.]"
    ));
    
    public static String uploadIMG(String filePath){
        return "[This content has been censored by AnLaVN owner.]";
    }
    public static void deleteIMG(String url){
//        "[This content has been censored by AnLaVN owner.]"
    }
}