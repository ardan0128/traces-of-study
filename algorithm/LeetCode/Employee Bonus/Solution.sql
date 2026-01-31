-- Write your PostgreSQL query statement below
select A.name, B.bonus
from Employee A
left outer join Bonus B on A.empId = B.empId
where B.bonus < 1000 or Bonus is null