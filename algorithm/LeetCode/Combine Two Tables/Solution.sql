-- Write your PostgreSQL query statement below
select A.firstName, A.lastName, B.city, B.state
from Person as A
left outer join Address as B on A.personId = B.personId