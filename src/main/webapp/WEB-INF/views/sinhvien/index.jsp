
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
    <div class="container">
        <h1>Danh sách Sinh Viên</h1>
        <a class="btn btn-primary" href="/sinhvien/create">Thêm sinh viên</a>
        <table class="table">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Name</th>
                <th scope="col">Class</th>
                <th scope="col">Age</th>
                <th>&nbsp;</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="sinhVien" items="${sinhviens}">
                <tr>
                    <th scope="row">${sinhVien.getId()}</th>
                    <td>${sinhVien.getName()}</td>
                    <td>${sinhVien.getLop()}</td>
                    <td>${sinhVien.getTuoi()}</td>
                    <td>
                        <a class="btn btn-warning"  href="/sinhvien/edit/${sinhVien.id}">Edit</a>
                        <a class="btn btn-danger"  href="/sinhvien/delete/${sinhVien.id}">Delete</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>