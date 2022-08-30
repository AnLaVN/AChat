DROP DATABASE IF EXISTS AChatDB;
CREATE DATABASE AChatDB;
USE AChatDB;

CREATE TABLE `NGUOIDUNG`(
	`Username` 	VARCHAR(64),
	`Password` 	VARCHAR(64),
	`Name`	 	VARCHAR(255),
	`Email`	 	VARCHAR(254),
	`Avatar`	VARCHAR(255),
    PRIMARY KEY (`Username`)
);
INSERT INTO `NGUOIDUNG` VALUES
	('67e571ffc1d92b62295a6f15b6f180996179cf967d75d3cfd2d30d11d2f5ce71','e86f78a8a3caf0b60d8e74e5942aa6d86dc150cd3c03338aef25b7d2d7e3acc7','Bình An','binhan2003@gmail.com','http://res.cloudinary.com/anlavn/image/upload/v1661488356/AChat/Avatar/tom_tlshue.jpg');
SELECT * FROM NGUOIDUNG;