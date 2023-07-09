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
	PortID INT PRIMARY KEY,
	IPAddress VARCHAR(15),
	Available BIT NOT NULL -- 1 that mean available for connect, 0 that mean was had connect
	--HostUser CHAR(64),
	--FOREIGN KEY (HostUser) REFERENCES USERINFO(Username)
);
