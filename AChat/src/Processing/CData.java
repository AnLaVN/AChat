package Processing; //Processing Cloundinary Data
// Make By Bình An || AnLaVN || KatoVN

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import java.io.File;
import java.io.IOException;
import java.util.Map;

public class CData {
    static Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
            "cloud_name", "anlavn",
            "api_key", "985969511487375",
            "api_secret", "1zJ0Tonfsk5m3-asd9PotnkhiTc"             ));
    public static String uploadIMG(String filePath){
        try {
            Map uploadResult = cloudinary.uploader().upload(new File(filePath), ObjectUtils.asMap("use_filename", true, "folder", "AChat/Avatar"));
            return (String) uploadResult.get("url");
        }
        catch (IOException ex) {
            System.out.println("!!! Error try to upload Image to Cloundinary. !!!");
            throw null;
        }
    }
}