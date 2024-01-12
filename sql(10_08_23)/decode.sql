
select Employee_id,last_Name,salary,job_id,
Decode( job_id , 'IT_PROG' , salary*0.2+SALARY 
, 'PU_MAN' , salary*0.8+salary
, 'PU_CLERK' , salary*0.5+salary
, salary )  AS ANUUAL_SALARY from employees;

