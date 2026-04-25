# Write your MySQL query statement below
select firstName,lastName,city,state from Person as P left Join Address as A on P.personId = A.personId 