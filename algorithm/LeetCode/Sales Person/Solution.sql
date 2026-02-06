-- Write your PostgreSQL query statement below
select s.name
from SalesPerson s
where s.name not in
(
    select A.name
    from SalesPerson A
    join Orders B on A.sales_id = B.sales_id
    join Company C on B.com_id = C.com_id
    where C.name = 'RED'
)