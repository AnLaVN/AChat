USE MASTER
GO

DROP DATABASE IF EXISTS AChatDB;
CREATE DATABASE AChatDB;
USE AChatDB;

CREATE TABLE USERINFO(
	Username CHAR(64) PRIMARY KEY,
	Password CHAR(64),
	Name	 NVARCHAR(255),
	Email	 VARCHAR(254),
	Avatar	 VARCHAR(255)
);
CREATE TABLE CHATSQUEUE(
	PortID CHAR(4) PRIMARY KEY,
	HostUser CHAR(64),
	FOREIGN KEY (HostUser) REFERENCES USERINFO(Username)
);
INSERT INTO USERINFO VALUES
	('67e571ffc1d92b62295a6f15b6f180996179cf967d75d3cfd2d30d11d2f5ce71', 'e86f78a8a3caf0b60d8e74e5942aa6d86dc150cd3c03338aef25b7d2d7e3acc7',	N'Bình An', 'binhan2003@gmail.com', '	http://res.cloudinary.com/anlavn/image/upload/v1661996159/AChat/Avatar/tom_ejhiqc.jpg')

select * from USERINFO
delete from CHATSQUEUE where PortID = '1234'
select * from CHATSQUEUE