-- Write your PostgreSQL query statement below
select product_id, store, price
from Products, lateral(values ('store1', store1), ('store2', store2), ('store3', store3)) as v(store, price)
where price is not null