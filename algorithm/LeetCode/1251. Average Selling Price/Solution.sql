-- Write your PostgreSQL query statement below
select A.product_id, round(coalesce((sum(B.units * A.price)::decimal / sum(B.units)), 0.00), 2) as average_price
from Prices A
left outer join UnitsSold B on A.product_id = B.product_id
    and B.purchase_date between A.start_date and A.end_date
group by A.product_id