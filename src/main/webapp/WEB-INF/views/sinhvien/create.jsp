
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <title>Danh Sách Sinh Viên</title>
</head>
<body>
<%--    ${sinhviens}--%>
    <div class="container">
        <h1>Thêm Sinh Viên</h1>
        <form action="" method="post" name="Form">
            <div class="form-floating">
                <label for="name">Tên</label>
                <input type="text" class="form-control" id="name" name="name" placeholder="Phan Duc Hai" required/>
            </div>
            <div class="form-floating">
                <label for="lop">Lớp</label>
                <input type="text" class="form-control" id="lop" name="lop" placeholder="VKU01" required/>
            </div>
            <div class="form-floating">
                <label for="tuoi">Tuổi</label>
                <input type="text" class="form-control" id="tuoi" name="tuoi" placeholder="23" required/>
            </div>
            <div class="text-center">
                <button class="btn btn-primary mt-2" type="submit">Thêm</button>
            </div>
        </form>
    </div>
</body>
</html>