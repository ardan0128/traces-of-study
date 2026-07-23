-- Write your PostgreSQL query statement below
select coalesce(a.employee_id, b.employee_id) as employee_id
from Employees a full join salaries b on a.employee_id = b.employee_id
where a.name is null or b.salary is null
order by employee_id