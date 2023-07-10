package com.AnLa;
//Make by Bình An || AnLaVN || KatoVN

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.AnLa.DAO.UserDAO;
import com.AnLa.HASH.AES;
import com.AnLa.HASH.SHA256;
import com.AnLa.NET.DocNet;
import com.AnLa.NET.Email;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@SpringBootApplication
public class AChatApplication {

	public static void main(String[] args) throws IOException {
		DocNet authentication = new DocNet(
				"https://raw.githubusercontent.com/AnLaVN/DAS_Courses/Releases/AUTHENTICATION.txt");
		String hashUsername = authentication.readLine(), hashPassword = authentication.readLine(),
				hashEmail = authentication.readLine(), hashEPass = authentication.readLine(),
				hashKey = SHA256.Encrypt(authentication.readLine());
		System.setProperty("spring.datasource.username", AES.Decrypt(hashUsername, hashKey));
		System.setProperty("spring.datasource.password", AES.Decrypt(hashPassword, hashKey));
		
		
		SpringApplication.run(AChatApplication.class, args);

//		FileInputStream serviceAccount = new FileInputStream("achat-1a4cf-firebase-adminsdk-h0omj-8dfef3c9ef.json");
//
//		FirebaseOptions options = FirebaseOptions.builder()
//		    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//		    .setDatabaseUrl("https://achat-1a4cf-default-rtdb.asia-southeast1.firebasedatabase.app")
//		    .build();
//
//		FirebaseApp.initializeApp(options);
//		
//		
//		
//		FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference ref = database.getReference("path/to/data");
//
//        // Đọc dữ liệu từ Firebase Realtime Database
//        ref.addListenerForSingleValueEvent(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//                Object value = dataSnapshot.getValue();
//                System.out.println("Dữ liệu: " + value);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//                System.out.println("Lỗi: " + databaseError.getMessage());
//            }
//        });
//
//        // Ghi dữ liệu vào Firebase Realtime Database
//        ref.setValue("Hello, Firebase!", new DatabaseReference.CompletionListener() {
//            @Override
//            public void onComplete(DatabaseError databaseError, DatabaseReference databaseReference) {
//                if (databaseError != null) {
//                    System.out.println("Lỗi: " + databaseError.getMessage());
//                } else {
//                    System.out.println("Dữ liệu đã được ghi thành công.");
//                }
//            }
//        });

		// Replace the placeholder with your MongoDB deployment's connection string
//        String uri = "mongodb+srv://binhan29122003:UftDDRK32gfajXiU@anla.aqtiits.mongodb.net/?retryWrites=true&w=majority";
//        try (MongoClient mongoClient = MongoClients.create(uri)) {
//            MongoDatabase database = mongoClient.getDatabase("AChat");
//            MongoCollection<Document> collection = database.getCollection("Test");
//            Document doc = collection.find(eq("title", "Back to the Future")).first();
//            if (doc != null) {
//                System.out.println(doc.toJson());
//            } else {
//                System.out.println("No matching documents found.");
//            }
//            collection.insertOne(new Document().append("name", "Ram").append("age", 26).append("city", "Hyderabad"));
//        }

//		String CLOUDINARY_URL = "cloudinary://985969511487375:1zJ0Tonfsk5m3-asd9PotnkhiTc@anlavn";
//
//		Cloudinary cloudinary = new Cloudinary(CLOUDINARY_URL);
//		
//
//		String publicId = "AChat/Chats/mkzalp9qwpteljx15dsn.json";
//        String newContent = "{\"test\": \"Hello, updated content!\"}";
//
//        try {
//
//        	System.out.println(
//        			
//            cloudinary.uploader().upload(
//            		newContent.getBytes(), 
//            		ObjectUtils.asMap(
//            				"resource_type", "raw", 
//            				"public_id", "AChat/Chats/mkzalp9qwpteljx15dsn.json",
//            				"invalidate", true,
//            				"overwrite", true)
//            		)
//            .toString()
//            
//            );
//
//        } catch (IOException e) {
//            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
//        }
		
		

	}

}
