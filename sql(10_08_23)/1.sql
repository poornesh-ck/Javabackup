select Employee_id,last_Name,salary,job_id,
case job_id when 'IT_PROG' then salary*0.2+SALARY 
when 'PU_MAN' then salary*0.8+salary
when 'PU_CLERK' then salary*0.5+salary
else salary END  AS ANUUAL_SALARY from employees;
