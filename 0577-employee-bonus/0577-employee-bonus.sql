# Write your MySQL query statement below
Select e.name as name, b.bonus as bonus from Employee E
left join Bonus b
on e.empid=b.empid
where b.bonus<1000 or b.bonus is null