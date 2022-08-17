<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form method="get" action="/product_discount_calculator">
    <input type="text" name="description" placeholder="Nhập mô tả sản phẩm">
    <input type="text" name="price" placeholder="Giá niêm yết của sản phẩm">
    <input type="text" name="percent" placeholder="Tỷ lệ chiết khấu">
    <input type="submit" value="Calculate Discount">

</form>
</body>
</html>