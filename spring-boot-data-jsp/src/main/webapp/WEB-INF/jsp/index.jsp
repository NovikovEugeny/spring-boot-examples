<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
    <script src="../../js/jquery-3.2.0.js"></script>
</head>
<body>
<h1>Hello world!!!</h1>


<button onclick="show()">show user list</button>

<script>
    function show() {

        var data = {};
        data["id"] = 20;
        data["name"] = "vacya";
        data["age"] = 33;

        $.ajax({
            async: true,
            cache: false,
            url: '/showUserList',
            method: 'POST',
            data: JSON.stringify(data),
            contentType: "application/json; charset=utf-8",
            dataType: 'json',
            error: function (message) {
                alert('hren');
            },
            success: function (data) {
                alert("ok");

            }
        });
    }
</script>
</body>
</html>