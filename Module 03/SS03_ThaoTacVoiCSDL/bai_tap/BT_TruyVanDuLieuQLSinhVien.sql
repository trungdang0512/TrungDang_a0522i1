use QuanLySinhVien;

select *
from Student
where StudentName like 'H%';

select *
from Class
where MONTH(StartDate) = 12;

select *
from Subject
where Credit between 3 and 5;

set sql_safe_updates=0;
update Student set ClassID = '2' where StudentName = 'Hung';
set sql_safe_updates=1;

select S.StudentName, Sub.SubName, M.Mark
from Student S join Subject Sub join Mark M
order by Mark asc, StudentName asc;