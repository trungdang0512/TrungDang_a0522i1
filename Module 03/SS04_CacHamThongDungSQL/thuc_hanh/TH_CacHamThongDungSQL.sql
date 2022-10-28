use QuanLySinhVien;

select Address, count(StudentID) as 'Số lượng học viên'
from Student
group by Address;

select S.StudentID, S.StudentName, avg(Mark)
from Student S join Mark M on S.StudentID = M.StudentID
group by S.StudentID, S.StudentName
having avg(Mark) > 15;

select S.StudentID, S.StudentName, avg(Mark)
from Student S join Mark M on S.StudentID = M.StudentID
group by S.StudentID, S.StudentName
having avg(Mark) >= all (select avg(Mark) from Mark group by Mark.StudentID);

