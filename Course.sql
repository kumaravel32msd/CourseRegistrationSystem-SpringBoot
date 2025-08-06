create database course_reg_sys;
use course_reg_sys;
show tables;
desc course;
select * from course;
insert into course values("103","Digital Marketing",6,"NagaArjun");
insert into course values
("100","SpringBoot",6,"Akash"),
("101","Core Java",4,"Kumaravel"),
("102","Full Stack",10,"Dhivagar"),
("103","Digital Marketing",6,"NagaArjun");

alter table course modify column course_id varchar(255) not null;
alter table course modify column duration_in_weeks integer not null;
desc course_registry;
select * from course_registry;
insert into course_registry(course_name,email_id,name)
values("Core Java","rohit@gmail.com","rohit");

