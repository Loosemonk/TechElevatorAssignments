
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS department;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS project_employee;
START TRANSACTION;

CREATE TABLE department (
department_id serial,
name_of_dept varchar(64) not null,

constraint pk_department primary key (department_id)
);

CREATE TABLE employee (
employee_id serial,
department_id int not null,
job_title varchar(64) not null,
first_name varchar(64) not null,
last_name varchar(64) not null,
gender char(1),
date_of_birth date,
hire_on_date date not null,

constraint pk_employee primary key (employee_id),
constraint fk_employee_department foreign key (department_id) references department (department_id)
);



CREATE TABLE project (
project_id serial,
employee_id int null,
project_name varchar(64) not null,
date_to_start date,

constraint pk_project primary key (project_id),
constraint fk_project_employee foreign key (employee_id) references employee (employee_id)
);
CREATE TABLE project_employee(
project_id int not null,
employee_number int not null,

constraint fk_project_employee_project_id_employee_id primary key (project_id,employee_number)

);






INSERT INTO department (department_id,name_of_dept) VALUES(1,'Finance');
INSERT INTO department (department_id,name_of_dept) VALUES(2,'Human Resource');
INSERT INTO department (department_id,name_of_dept) VALUES(3,'Research and Development');
INSERT INTO department (department_id,name_of_dept) VALUES(4,'Engineering');

INSERT INTO employee (first_name,last_name,employee_id,gender,date_of_birth,hire_on_date,department_id,job_title) 
VALUES('Jon','Snow',1,'M','1985-10-01','2010-10-01',4,'Chemist');
INSERT INTO employee (first_name,last_name,employee_id,gender,date_of_birth,hire_on_date,department_id,job_title) 
VALUES('Jan','Schmoe',2,'F','1985-10-01','2010-10-01',1,'Accountant');
INSERT INTO employee (first_name,last_name,employee_id,gender,date_of_birth,hire_on_date,department_id,job_title) 
VALUES('April','ONEIL',3,'F','1985-10-01','2010-10-01',4,'Scientist');
INSERT INTO employee (first_name,last_name,employee_id,gender,date_of_birth,hire_on_date,department_id,job_title) 
VALUES('Jan','Schmoe',4,'M','1985-10-01','2010-10-01',1,'Launderer');
INSERT INTO employee (first_name,last_name,employee_id,gender,date_of_birth,hire_on_date,department_id,job_title) 
VALUES('Leo','Hines',5,'M','1985-10-01','2010-10-01',2,'Associate');
INSERT INTO employee (first_name,last_name,employee_id,gender,date_of_birth,hire_on_date,department_id,job_title) 
VALUES('Ed','Eddy',6,'M','1985-10-01','2010-10-01',2,'Associate');
INSERT INTO employee (first_name,last_name,employee_id,gender,date_of_birth,hire_on_date,department_id,job_title) 
VALUES('Johnson','John',7,'M','1985-10-01','2010-10-01',3,'Lab Tech');
INSERT INTO employee (first_name,last_name,employee_id,gender,date_of_birth,hire_on_date,department_id,job_title) 
VALUES('Pete','Schmoe',8,'M','1985-10-01','2010-10-01',3,'Lab Tech');

INSERT INTO project(project_name,project_id,date_to_start)
VALUES ('Medicine Making', 5, '2020-10-23');
INSERT INTO project(project_name,project_id,date_to_start)
VALUES ('Medicine Taking', 6, '2020-10-23');
INSERT INTO project(project_name,project_id,date_to_start)
VALUES ('Money Making', 7, '2020-10-23');
INSERT INTO project(project_name,project_id,date_to_start)
VALUES ('Money Taking', 8, '2020-10-23');


INSERT INTO project_employee (project_id,employee_number) VALUES (5,1);
INSERT INTO project_employee (project_id,employee_number) VALUES (5,3);
INSERT INTO project_employee (project_id,employee_number) VALUES (6,7);
INSERT INTO project_employee (project_id,employee_number) VALUES (6,8);
INSERT INTO project_employee (project_id,employee_number) VALUES (7,2);
INSERT INTO project_employee (project_id,employee_number) VALUES (7,4);
INSERT INTO project_employee (project_id,employee_number) VALUES (8,5);
INSERT INTO project_employee (project_id,employee_number) VALUES (8,6);



ROLLBACK;
COMMIT TRANSACTION;

