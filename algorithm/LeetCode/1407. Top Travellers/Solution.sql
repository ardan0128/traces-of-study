-- Write your PostgreSQL query statement below
select Users.name, sum(coalesce(Rides.distance, 0)) as travelled_distance
from Users
left join Rides on Users.id = Rides.user_id
group by users.id, users.name
order by travelled_distance DESC, users.name ASC