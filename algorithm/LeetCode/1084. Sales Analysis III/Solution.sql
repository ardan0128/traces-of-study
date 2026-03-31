-- Write your PostgreSQL query statement below
select A.product_id, A.product_name
from Product A
join Sales B on A.product_id = B.product_id
group by A.product_id, A.product_name
having min(b.sale_date) >= '2019-01-01' and max(b.sale_date) <= '2019-03-31'