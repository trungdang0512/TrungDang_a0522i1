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
    <style>
      table, th, td {
        border-collapse: collapse;
        border: 1px outset;
      }
    </style>
</head>
<body>
<center>
  <h2 style="font-weight: bold">Personal Medical Form Update</h2>
    <form:form method="post" action="update" modelAttribute="covidForm">
      <table width="85%">
      <tr><td colspan="3" style="font-weight: bold"><form:label path="name">Họ Tên (ghi chữ IN HOA):</form:label></td></tr>
      <tr><td colspan="3"><form:input path="name" required = "required" size="75"/></td></tr>
      <tr>
        <td style="font-weight: bold"><form:label path="birthDate">Năm sinh</form:label></td>
        <td style="font-weight: bold"><form:label path="gender" required = "required" size="20">Giới tính</form:label></td>
        <td style="font-weight: bold"><form:label path="nationality">Quốc tịch</form:label></td>
      </tr>
      <tr>
        <td><form:input path="birthDate" required = "required"/></td>
        <td>
          <form:select path="gender">
            <form:option value="Nam">Nam</form:option>
            <form:option value="Nữ">Nữ</form:option>
            <form:option value="Khác">Khác</form:option></form:select>
        </td>
        <td>
        <form:input path="nationality" required="required"/></td>
      </tr>
      <tr><td colspan="3" style="font-weight: bold"><form:label path="id">Số hộ chiếu, CMND hoặc giấy tờ thông hành hợp pháp khác</form:label></td></tr>
      <tr><td colspan="3"><form:input path="id" required="required"/></td></tr>
      <tr>
        <td colspan="3" style="font-weight: bold">Thông tin đi lại</td>
      </tr>
      <tr>
        <td colspan="3">
          <form:radiobutton path="vehicle" value="Tàu bay" required="required"/>Tàu bay
          <form:radiobutton path="vehicle" value="Tàu thuyền" required="required"/>Tàu thuyền
          <form:radiobutton path="vehicle" value="ô tô" required="required"/>ô tô
          <form:radiobutton path="vehicle" value="Khác" required="required"/>Khác
        </td>
      </tr>
      <tr>
        <td>Số hiệu phương tiện <form:input path="vehicleId"/></td>
        <td>Số ghế <form:input path="vehicleChair" type = "number"/></td>
      </tr>
      <tr>
        <td >
        <form:label path="departDate">Ngày khởi hành</form:label>
          <form:input type="date" path="departDate" required="required"/>
        </td>

        <td >
          <form:label path="arriveDate">Ngày kết thúc</form:label>
        <form:input type="date" path="arriveDate" required="required"/>
        </td>
      </tr>
      <tr>
        <td colspan="3" style="font-weight: bold"><form:label path="city">14 ngày qua anh/chị đã đến những thành phố/tỉnh nào</form:label></td>
      </tr>
      <tr>
        <td colspan="3"><form:textarea path="cityArrived" rows="5" cols="150" required="required"/></td>
      </tr>
      <tr>
        <td colspan="3" style="font-weight: bold"><form:label path="address">Địa chỉ liên lạc</form:label></td>
      </tr>
      <tr>
        <td>Tỉnh thành <form:input path="city" required="required"/></td>
        <td>Quận/Huyện <form:input path="district" required="required"/></td>
        <td>Phường/Xã <form:input path="ward" required="required"/></td>
      </tr>
      <tr>
        <td>Địa chỉ nơi ở <form:input path="address" required="required"/></td>
        <td>Số điện thoại <form:input path="phoneNumber" required="required"/></td>
        <td>Email <form:input path="email"/></td>
      </tr>
      <tr>
        <td colspan="3" style="font-weight: bold">Trong 14 ngày qua có triệu chứng nào sau đây</td>
      </tr>
      <tr>
        <td colspan="3">
          <form:checkbox path="symptom" value="Sốt"></form:checkbox>Sốt
          <form:checkbox path="symptom" value="Ho"></form:checkbox>Ho
          <form:checkbox path="symptom" value="Khó thở"></form:checkbox>Khó thở
          <form:checkbox path="symptom" value="Đau họng"></form:checkbox>Đau họng
        </td>
      </tr>
      <tr>
        <td colspan="3">
          <form:checkbox path="symptom" value="Nôn/Buồn nôn"></form:checkbox>Nôn/Buồn nôn
          <form:checkbox path="symptom" value="Tiêu chảy"></form:checkbox>Tiêu chảy
          <form:checkbox path="symptom" value="Xuất huyết ngoài da"></form:checkbox>Xuất huyết ngoài da
          <form:checkbox path="symptom" value="Nổi ban"></form:checkbox>Nổi ban
        </td>
      </tr>
      <tr>
        <td colspan="3" style="font-weight: bold">Lịch sử phơi nhiễm:</td>
      </tr>
      <tr>
        <td  colspan="3">
          Đến trang trại chăn nuôi/chợ buôn bán động vật/ cơ sở giết mổ/ tiếp xúc động vật
<%--          <form:checkbox path="exposureNo1" value="Yes"></form:checkbox>Có--%>
<%--          <form:checkbox path="exposureNo1" value="No"></form:checkbox>Không </td>--%>
        <form:radiobutton path="exposureNo1" value="Có" required="required"/> Có
        <form:radiobutton path="exposureNo1" value="Không" required="required"/> Không

      </tr>
      <tr>
        <td  colspan="3">
          Tiếp xúc gần (<2m) với người mắc bệnh do nCoV
<%--          <form:checkbox path="exposureNo2" value="Yes"></form:checkbox>Có--%>
<%--          <form:checkbox path="exposureNo2" value="No"></form:checkbox>Không </td>--%>
        <form:radiobutton path="exposureNo2" value="Có" required="required"/> Có
        <form:radiobutton path="exposureNo2" value="Không" required="required"/> Không
      </tr>
      <tr>
        <td colspan="3">
          <center>
          <input type="submit" value="Gửi"/>
          <input type="reset" value="Xóa hết"/>
          </center>
        </td>
      </tr>
    </form:form>
      </table>
</center>
</body>
</html>
