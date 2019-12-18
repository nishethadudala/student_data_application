
create database application;

use application;


create table `student_info`(
`student_id` int (11) not null auto_increment,
`first_name` varchar(20) not null,
`last_name` varchar(20) not null,
`date_of_birth` varchar(10),
`address` varchar(50),
`phone_number` varchar(10),
`gender` varchar(20),
`date_of_join` date,
`student_course_enrollment_id` int,
primary key (student_id),
foreign key(student_course_enrollment_id) references enrolled_courses (student_course_enrollment_id)
);

create table `enrolled_courses`(
`student_course_enrollment_id` int not null auto_increment,
`student_id` int not null ,
`course_id` int ,
`enrolled_date` Date ,
primary key (student_course_enrollment_id),
foreign key (student_id) references student_info (student_id),
foreign key (course_id) references courses (course_id)
);

create table `courses`(
`course_id` int not null AUTO_INCREMENT,
`course_name` varchar(23),
`practicals` boolean,
primary key (course_id)
);

commit;