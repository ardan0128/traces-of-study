-- Write your PostgreSQL query statement below
delete
from Person as A
using Person as B 
where A.email = B.email and A.id > B.id