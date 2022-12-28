<%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 26/12/2022
  Time: 00:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Medical Form</title>
</head>
<body>
<center>
    <h2>Personal Medical Form</h2>
    <a href="/update">Update form</a>
    <table border="1">
        <tr>
            <td>Họ và Tên: </td>
            <td>${currentForm.name}</td>
        </tr>
        <tr>
            <td>Năm sinh: </td>
            <td>${currentForm.birthDate}</td>
        </tr>
        <tr>
            <td>Giới tính: </td>
            <td>${currentForm.gender}</td>
        </tr>
        <tr>
            <td>Quốc tịch: </td>
            <td>${currentForm.nationality}</td>
        </tr>
        <tr>
            <td>CMND hoặc Hộ chiếu: </td>
            <td>${currentForm.id}</td>
        </tr>
        <tr>
            <td>Thông tin đi lại:</td>
            <td>${currentForm.vehicle}</td>
        </tr>
        <tr>
            <td>Số hiệu phương tiện:</td>
            <td>${currentForm.vehicleId}</td>
            <td>Số ghế:</td>
            <td>${currentForm.vehicleChair}</td>
        </tr>
        <tr>
            <td>Ngày khởi hành:</td>
            <td>${currentForm.departDate}</td>
            <td>Ngày kết thúc:</td>
            <td>${currentForm.arriveDate}</td>
        </tr>
        <tr>
            <td>Thành phố/tỉnh đã đến trong 14 ngày qua:</td>
            <td>${currentForm.cityArrived}</td>
        </tr>
        <tr>
            <td>Địa chỉ:</td>
            <td>${currentForm.address}</td>
        </tr>
        <tr>
            <td>Phường/Xã:</td>
            <td>${currentForm.ward}</td>
            <td>Quận/Huyện: </td>
            <td>${currentForm.district}</td>
            <td>Tỉnh/Thành: </td>
            <td>${currentForm.city}</td>
        </tr>
        <tr>
            <td>Điện thoại:</td>
            <td>${currentForm.phoneNumber}</td>
            <td>Email: </td>
            <td>${currentForm.email}</td>
        </tr>
        <tr>
            <td>Triệu chứng trong 14 ngày qua: </td>
            <td>${currentForm.symptom}</td>
        </tr>
        <tr>
            <td>Lịch sử phơi nhiễm</td>
        </tr>
        <tr>
            <td>Đến trang trại chăn nuôi/chợ buôn bán động vật/ cơ sở giết mổ/ tiếp xúc động vật</td>
            <td>${currentForm.exposureNo1}</td>
        </tr>
        <tr>
            <td>Tiếp xúc gần (<2m) với người mắc bệnh do nCoV</td>
            <td>${currentForm.exposureNo2}</td>
        </tr>
    </table>
</center>
</body>
</html>
