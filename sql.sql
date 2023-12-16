create database exam;
use exam;
create table student_details(name varchar(20),regno varchar(30) primary key,email text,pwd varchar(20));
create table questions(question_id int,question varchar(100),option1 varchar(40),option2 varchar(40),option3 varchar(40),option4 varchar(40),correct_answer varchar(20));
create table user_answers(regno varchar(30),question_id int,user_answer varchar(20));
create table grades(regno varchar(30) PRIMARY KEY,grade double);
SELECT * FROM QUESTIONS;
SELECT * FROM USER_ANSWERS;
select * from grades;
insert into questions values(1,'when is the finalise() method called?','A. MAY BE','B. NONE','C. TO BE','D.NOT BE','A'),
(2,'Which one among these is not a primitive datatype?','A. int','B. double','C. String','D. boolean','A'),
(3,'arrays in java are-','A. object reference','B. objects','C. premitive data type','D. None','B'),
(4,'when is the object created with new keyword ?','A. at run time','B. at compile time','C. depends on the code','D. None','C'),
(5,'what is Runnable?','A. abstract class','B. interface','C. class','D. method','D'),
(6,'compareTo() returns','True','False','An int value','None','A'),
(7,'what is Runnable ?','A. catch','B. throw','C. final','D. None','D'),
(8,'output of Math.floor(3.6)?','A. 3','B. 3.0','C. 4','D. 4.0','C'),
(9,'identify the modifier cannot used for constructor','A. public','B. protected','C. privete','D. static','A'),
(10,'what is implicit return type of constructor?','A. no return type','B. a class object is defined','C. void','D. None','D');
select * from student_details;
USE EXAM;
drop table user_answers;
drop table GRADES;
drop table questions;
drop table student_details;