CREATE DATABASE QuanLySinhVien;
USE QuanLySinhVien;
CREATE TABLE Class
(
	ClassID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    ClassName VARCHAR(20) NOT NULL,
    StartDate DATETIME NOT NULL,
    Status BIT
);
CREATE TABLE Student
(	
	StudentID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    StudentName VARCHAR(30) NOT Null,
    Address VARCHAR(50),
    Phone VARCHAR(20),
    Status BIT,
    ClassID INT NOT NULL,
    FOREIGN KEY (ClassID) REFERENCES Class(ClassID)
);
CREATE TABLE Subject
(
	SubID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    SubName VARCHAR(30) NOT Null,
    Credit TINYINT NOT NULL DEFAULT 1 CHECK ( Credit >= 1 ),
	Status Bit DEFAULT 1
);
CREATE TABLE Mark
(
	MarkID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    SubID INT NOT NULL,
    StudentID INT NOT NULL,
    Mark FLOAT DEFAULT 0 CHECK (Mark BETWEEN 0 AND 100),
    ExamTimes TINYINT DEFAULT 1,
    UNIQUE (SubID, StudentID),
    FOREIGN KEY (SubID) REFERENCES Subject (SubID),
    FOREIGN KEY (StudentID) REFERENCES Student (StudentID)
    )