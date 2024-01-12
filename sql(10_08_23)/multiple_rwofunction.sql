select count(*) from employees
 select sum(salary) total_salary, round(avg(salary),2) avg_salary from employees
 select min(hire_date) as latest_hiring, max(hire_date) as first_hiring from employees;
 select count(department_id) from departments;
 
 select job_id,count(department_id),sum(salary),round(avg(salary),0),max(salary),min(salary)
 from employees
 group by job_id
 
 order by department_id;
 
 select job_id,department_id,count(department_id),sum(salary),round(avg(salary),0),max(salary),min(salary)
 from employees
 where department_id<>110
 having avg(salary)>1500
 group by job_id,department_id;
 