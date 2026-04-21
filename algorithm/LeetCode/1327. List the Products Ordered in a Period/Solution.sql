-- Write your PostgreSQL query statement below
select A.product_name, sum(B.unit) as unit
from Products A
join Orders B on A.product_id = B.product_id
where B.order_date between date '2020-02-01' and date '2020-02-29'
group by A.product_name
having sum(B.unit) >= 100