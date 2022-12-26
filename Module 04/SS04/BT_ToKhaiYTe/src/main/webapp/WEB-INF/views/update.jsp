<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Trung Dang
  Date: 26/12/2022
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Form</title>
</head>
<body>
<center>
  <h2>Personal Medical Form Update</h2>

    <form:form method="post" action="update" modelAttribute="form">
      <table border="1px">
      <tr><td><form:label path="name">Họ Tên (ghi chữ IN HOA):</form:label></td></tr>
      <tr><td><form:input path="name"/></td></tr>
      <tr>
        <td><form:label path="birthDate">Năm sinh</form:label></td>
      </tr>
      <tr>
        <td><form:input path="birthDate"/></td>
      </tr>
      <tr>
        <td><form:label path="gender">Giới tính</form:label>
          <form:select path="gender">
            <form:option value="Nam">Nam</form:option>
            <form:option value="Nữ">Nữ</form:option>
            <form:option value="Khác">Khác</form:option></form:select>
        </td>
      </tr>
      <tr>
        <td><form:label path="nationality">Quốc tịch</form:label>
        <form:input path="nationality"/></td>
      </tr>
      <tr><td><form:label path="id">Số hộ chiếu, CMND hoặc giấy tờ thông hành hợp pháp khác</form:label></td></tr>
      <tr><td><form:input path="id"/></td></tr>
      <tr>
        <td>Thông tin đi lại</td>
      </tr>
      <tr>
        <td>
          <input:checkbox path="vehicle" value="Tàu bay"/>Tàu bay
          <input:checkbox path="vehicle" value="Tàu thuyền"/>Tàu thuyền
          <input:checkbox path="vehicle" value="ô tô"/>ô tô
          <input:checkbox path="vehicle" value="Khác"/>Khác
        </td>
      </tr>
      <tr>
        <td>Số hiệu phương tiện</td>
      </tr>
      <tr>
        <td><form:input path="vehicleId"/></td>
      </tr>
      <tr>
        <td>Số ghế</td>
      </tr>
      <tr>
        <td><form:input path="vehicleChair" type = "number"/></td>
      </tr>
      <tr>
        <td>
        <form:label path="departDate">Ngày khởi hành</form:label>
          <form:input type="date" path="departDate"/>

        </td>
      </tr>
      <tr>
        <td>
          <form:label path="arriveDate">Ngày kết thúc</form:label>
        <form:input type="date" path="arriveDate"/>
        </td>
      </tr>
      <tr>
        <td><form:label path="city">14 ngày qua anh/chị đã đến những thành phố/tỉnh nào</form:label></td>
      </tr>
      <tr>
        <td><form:textarea path="cityArrived" rows="5" cols="20"/></td>
      </tr>
      <tr>
        <td><form:label path="address">Địa chỉ liên lạc</form:label></td>
      </tr>
      <tr>
        <td>Tỉnh thành <form:input path="city"/></td>
      </tr>
      <tr>
        <td>Quận/Huyện <form:input path="district"/></td>
      </tr>
      <tr>
        <td>Phường/Xã <form:input path="ward"/></td>
      </tr>
      <tr>
        <td>Địa chỉ nơi ở <form:input path="address"/></td>
      </tr>
      <tr>
        <td>Số điện thoại <form:input path="phoneNumber"/></td>
      </tr>
      <tr>
        <td>Trong 14 ngày qua có triệu chứng nào sau đây</td>
      </tr>
      <tr>
        <td><form:checkbox path="symptom" value="Sốt"></form:checkbox>Sốt
          <form:checkbox path="symptom" value="Ho"></form:checkbox>Ho
          <form:checkbox path="symptom" value="Khó thở"></form:checkbox>Khó thở
          <form:checkbox path="symptom" value="Đau họng"></form:checkbox>Đau họng
        </td>
      </tr>
      <tr>
        <td>
          <form:checkbox path="symptom" value="Nôn/Buồn nôn"></form:checkbox>Nôn/Buồn nôn
          <form:checkbox path="symptom" value="Tiêu chảy"></form:checkbox>Tiêu chảy
          <form:checkbox path="symptom" value="Xuất huyết ngoài da"></form:checkbox>Xuất huyết ngoài da
          <form:checkbox path="symptom" value="Nổi ban"></form:checkbox>Nổi ban
        </td>
      </tr>
      <tr>
        <td>Lịch sử phơi nhiễm:</td>
      </tr>
      <tr>
        <td>
          Đến trang trại chăn nuôi/chợ buôn bán động vật/ cơ sở giết mổ/ tiếp xúc động vật
          <form:checkbox path="exposureNo1" value="Yes"></form:checkbox>Có
          <form:checkbox path="exposureNo1" value="No"></form:checkbox>Không </td>
      </tr>
      <tr>
        <td>
          Tiếp xúc gần (<2m) với người mắc bệnh do nCoV
          <form:checkbox path="exposureNo2" value="Yes"></form:checkbox>Có
          <form:checkbox path="exposureNo2" value="No"></form:checkbox>Không </td>
      </tr>
      <tr>
        <td>
          <input type="submit" value="Gửi"/>
          <input type="reset" value="Xóa hết"/>
        </td>
      </tr>
  </table>
    </form:form>

</center>
</body>
</html>
