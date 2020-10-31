<%--
  Created by IntelliJ IDEA.
  User: ychw
  Date: 2020/10/30
  Time: 14:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="${pageContext.request.contextPath}/static/js/jquery-3.4.1.js"></script>

    <script>
        function func1(){
            $.get("${pageContext.request.contextPath}/banji/find/2",function (data){
                alert(data);
            })
        }

        function func2(){
            $.get("${pageContext.request.contextPath}/banji/insert",{id:null,name:"六年级"},function (data) {
                alert(data);
            });
        }

    </script>

    <title>HELLO jsp</title>
</head>
<body>
    <h3>hello,我是banji.jsp</h3>
    <button type="button" onclick="func1()">点我查询</button>
    <button type="button" onclick="func2()">点我插入</button>


    <form action="${pageContext.request.contextPath}/banji/insert" method="post">
        <p>请输入id: <input type="text" name="id" /></p>
        <p>请输入name: <input type="text" name="name" /></p>
        <input type="submit" value="Submit" />
    </form>
</body>
</html>
