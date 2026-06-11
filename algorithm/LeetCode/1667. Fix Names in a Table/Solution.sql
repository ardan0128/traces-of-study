-- Write your PostgreSQL query statement below
select user_id,
    upper(left(lower(name), 1)) || substring(lower(name) from 2) as name
from Users
order by user_id;