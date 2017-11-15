<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="../../js/jquery-3.2.0.js"></script>
    <title>Title</title>
</head>
<body>
<h1>test page</h1>
<!--
<form action="/models" method="post">
    <input type="text" name="message">
    <button type="submit">send</button>
</form>
-->
<input type="text" name="message" id="message">
<button onclick="send()">send</button>
<script>
    function send() {
            $.ajax({
                async : true,
                cache : false,
                url: '/models',
                method: "post",
                data: {'message': $("#message").val()},
                error: function (message) {
                    console.log(message);
                },
                success: function (data) {
                    alert(data);
                }
            });
    }
</script>
</body>
</html>
