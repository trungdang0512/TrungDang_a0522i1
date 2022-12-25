use QuanLySinhVien;

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select SubID, SubName, Credit
from Subject
having Credit >= all (select Credit from Subject)

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select S.SubID, S.SubName, M.Mark
from Subject S join Mark M on S.SubID = M.SubID
having M.Mark >= all (select M.Mark from Mark M);

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select Stu.StudentID, Stu.StudentName, Stu.ClassID, Stu.Address ,avg(M.Mark) as 'DiemTrungBinh'
from Student Stu 
inner join Mark M on Stu.StudentID = M.StudentID
group by Stu.StudentName
order by DiemTrungBinh DESC