package Processing; //Processing Cloundinary Data
// Make By Bình An || AnLaVN || KatoVN

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import java.io.*;
import java.util.Map;

public class CData {
    private static final Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
            "cloud_name", "anlavn",
            "api_key", "985969511487375",
            "api_secret", "1zJ0Tonfsk5m3-asd9PotnkhiTc"     ));
    
    public static String uploadIMG(String filePath){
        try {
            Map uploadResult = cloudinary.uploader().upload(new File(filePath), ObjectUtils.asMap("use_filename", true, "folder", "AChat/Avatar"));
            return (String) uploadResult.get("url");
        }catch (IOException e) {
            System.out.println("!!! Error trying to upload Image to Cloundinary. !!!");
            throw new RuntimeException(e);
        }
    }
    public static void deleteIMG(String url){
        try{
            String publicID = url.substring(url.indexOf("AChat/Avatar/"), url.lastIndexOf("."));
            cloudinary.uploader().destroy(publicID, ObjectUtils.emptyMap());
        }catch(IOException e){  System.out.println("!!! Error trying to delete Image on Cloundinary. !!!");}
    }
}