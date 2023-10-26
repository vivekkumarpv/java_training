create database ust_db;
use ust_db;
create table employee(emp_id numeric(5), emp_name varchar(50),email varchar(50),salary numeric(8,2));
show tables;
desc employee;
insert into employee values(1001,'Suraj','suraj@yahoo.com',65000),
(1003,'Gaurav','gaurav@gmail.com',55000),
(1004,'Harsh','harsh@gmail.com',68000),
(1005,'Javed','javed@gmail.com',84000); 
select * from employee;
alter table employee add hiredate date;
alter table employee add primary key(emp_id);
update employee set hiredate='2020-04-27' where emp_id=1001;
update employee set hiredate='2021-04-20' where emp_id =1002;
update employee set hiredate='2020-10-15' where emp_id =1003;
update employee set hiredate='2019-02-10' where emp_id =1004;
update employee set hiredate='2015-05-20' where emp_id =1005;
delete from employee where emp_id=1002;
insert into employee values(1002,'Mohit','mohit@gmail.com',52000,'2021-04-20','Clerk');
select * from employee where emp_id=1002;
select * from employee where emp_name='Mohit';
select * from employee where salary>60000;
select * from employee where salary>60000 AND salary<70000;
select * from employee where salary between 60000 and 70000;
select * from employee where emp_id=1002 or emp_id=1003 or emp_id=1005;
select * from employee where emp_id in(1002,1003,1005);
select * from employee order by salary;  -- ascending order
select * from employee order by salary desc; -- descending order
select emp_id,emp_name,salary from employee;
alter table employee add job_role varchar(50);
insert into employee values(2001,'Priyanka','priyanka@yahoo.com',75000,'2018-05-20','Analyst'),
(2002,'Karan','karan@yahoo.com',72000,'2019-10-20','Analyst');  

update employee set job_role='Clerk' where emp_id=1001;
update employee set job_role='Salesman' where emp_id =1002;
update employee set job_role='Analyst' where emp_id =1003;
update employee set job_role='Clerk' where emp_id =1004;
update employee set job_role='Manager' where emp_id =1005;
select job_role from employee; -- all job roles
select distinct job_role from employee; -- unique / distinct jobs
select emp_name,salary,salary*12 as "Annual Salary",job_role from employee;

-- exercises

select * from employee where job_role='salesman';
select * from employee where job_role='Analyst' AND salary>60000;

update employee set salary=65000 where emp_id=1001;
update employee set salary=52000 where emp_id=1002;
update employee set salary=55000 where emp_id=1003;
update employee set salary=68000 where emp_id=1004;
update employee set salary=85000 where emp_id=1005;
update employee set salary=75000 where emp_id=2001;
update employee set salary=72000 where emp_id=2002;
update employee set salary=(salary*1.15) where emp_id in(1001,1002,1003,1004,1005,2001,2002);
update employee set salary=salary+2000 where emp_id between 1000 and 2003 and job_role='Clerk';
alter table employee add dept numeric(3);

update employee set dept=10 where emp_id=1001;
update employee set dept=20 where emp_id=1002;
update employee set dept=10 where emp_id=1003;
update employee set dept=30 where emp_id=1004;
update employee set dept=20 where emp_id=1005;
update employee set dept=10 where emp_id=2001;
update employee set dept=30 where emp_id=2002;

select * from employee where dept=10;

select * from employee where job_role='Analyst' AND dept=20;
select * from employee where job_role='Analyst' OR job_role='Clerk';

select * from employee order by dept asc,salary desc;
select * from employee order by salary desc;
select * from employee;

select avg(salary) as 'Average Salary' from employee;
select count(*) as 'Total Employees' from employee;
select sum(salary) as 'Total Salary' from employee;

-- total num of employee in each department

select dept,count(*) as 'Total Employees' from employee group by dept; 

-- find average salary based on job 

select job_role,avg(salary) as 'Average Salary' from employee group by job_role;

-- find the max , min , avg salary and total employees count based on jobrole

select job_role,max(salary) as 'Max Salary',min(salary)'Min Salary',avg(salary) as'Average Salary',
count(*) as'Total Employee'  from employee group by job_role;

-- find avg salary of dept 20

select dept, avg(salary) as 'Avg salary of dept 20' from employee where dept=20 group by dept;

-- find depts with more than 3 employees

select dept, count(*) as 'Total Employee'from employee group by dept having count(*)>=3;

-- extract date/month/year from hiredate

select emp_name, extract(year from hiredate) as 'Joining Year' from employee;

-- find the total experience of each of each employee

select emp_name, datediff(curdate(),hiredate)/365  as 'Total Exp.' from employee;

select emp_name, extract(year from now())-extract(year from hiredate) as 'Total Exp.' from employee order by 2 desc;

-- find all employess having gmail mails(wildcard)

select * from employee;


-- create a table called department 
-- dept  deptname        location
-- 10     IT             bangalore       
-- 20     accounts       trivandrum 
-- 30     sales			 chennai	
-- 40     management     kolkata

create table departments(dept numeric(3), deptname varchar(50), deptlocation varchar(50));
show tables; 
insert into departments values(10,'IT','Bangalore'),
(20,'Accounts','Trivandrum'),
(30,'Sales','Chennai'),
(40,'Management','Kolkata'); 

select * from departments;

-- find all the employee with dept details;

select emp_id,emp_name,e.dept,dept_name,location from employee e join departments d on e.dept=d.dept;

-- find all employes working in trivandrum

select emp_id,emp_name,e.dept,dept_name,location 
			from employee e join departments d on e.dept=d.dept 
			where location='trivandrum';

-- display the dept information along with employee count

select d.dept,d.dept_name,location, count(e.dept)as 'No. of Employees' 
					from employee e right join departments d on e.dept=d.dept group by dept;

-- find the dept with no employees



-- find the dept with highest employees

select d.dept,dept_name,location, count(d.dept) as "No. of Employees"
					from employee e right join departments d on e.dept=d.dept 
                    group by dept order by "No. of Employees" desc limit 1;

select * from employee;
select * from departments;




-- Find all the employees using gmail mails
-- Find employees join in 2020
-- Find employees name starts with P or J
-- Find employees joined in the month of January
-- Find employees joind in the first half of the year


select * from employee where email like '%@gmail.com';

select * from employee where year(hiredate)=2020;

select * from employee where emp_name like 'P%' or emp_name like 'j%';

select * from employee where month(hiredate)=4;

select * from employee where month(hiredate)<=6;


select * from employee;

drop table departments;

create table departments (dept numeric(3) primary key, dept_name varchar(50) unique not null,location varchar(20));

insert into departments values(10,'IT','Bangalore'),
(20,'Accounts','Trivandrum'),
(30,'Sales','Chennai'),
(40,'Management','Kolkata'); 

select * from departments;

alter table employee add constraint fk_dept foreign key(dept) references departments(dept);

insert into employee values(1001,'umesh','umesh@yahoo.com',65000);

-- sub query

-- nested query

show tables;
select * from customer;

truncate table customer;

select * from menu_item;

select * from book_table;

select * from employee;
-- Create two tables: “Employees” and “Departments.” The “Employees” table contains employee information, and the “Departments” table contains department information. The tables are related by the “DepartmentID” column.
-- Retrieve a list of employees along with their corresponding department names
-- Retrieve the total number of employees in each department
-- Retrieve the highest salary in each department
-- Retrieve the average salary for employees in each department
-- Retrieve the average salary for employees in Sales department 


select emp_name,dept_name from employee e join departments d on e.dept=d.dept ;

select dept_name,count(emp_id) as "no.of employees" from employee right join departments d using(dept) 
group by dept_name;

select d.dept_name,max(salary) from employee left join departments d using(dept) group by dept_name;

select dept_name,avg(salary) as "Average Salary" from employee e right join departments d 
on e.dept=d.dept group by dept_name;

select dept_name,avg(salary) as "Average Salary" from employee e right join departments d 
on e.dept=d.dept where dept_name='Sales';
