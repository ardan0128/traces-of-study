-- Write your PostgreSQL query statement below
select A.name, sum(B.amount) as balance
from Users as A
join Transactions as B on A.account = B.account
group by A.account, A.name
having sum(B.amount) > 10000;