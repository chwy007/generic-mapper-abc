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
            $.get("${pageContext.request.contextPath}/banji/find/"+$("#3s").val(),function (data){
                $(".ts2").text(data.id+":"+data.name);
            })
        }

        function func2(){
            $.get("${pageContext.request.contextPath}/banji/all",function (data) {
                $.each(data,function (i,val){
                    $(".1t").append("<p>"+i+val.name+val.id+"</p>");

                })
            })
        }

        function func3(){
            $.get("${pageContext.request.contextPath}/banji/delete/"+$("#4s").val(),function (data){
                alert(data);

            })
        }



    </script>

    <title>HELLO jsp</title>
</head>
<body>
    <h3>hello,我是banji.jsp</h3>

    <div class="1t"></div>


    <p id="2s" class="ts2"></p>






    <form action="${pageContext.request.contextPath}/banji/insert" method="post">

        <p>请输入id: <input type="text" name="id" /></p>
        <p>请输入name: <input type="text" name="name" /></p>
        <input type="submit" value="注册" />
    </form>

    <h3>query</h3>

    <button type="button" onclick="func1()">根据id查询</button>
    <input id="3s" type="text" name="id">

    <h3>======================================</h3>

    <button type="button" onclick="func2()">点我查询所有</button>

    <h3>delete</h3>

    <button type="button" onclick="func3()">根据id删除</button>
    <input id="4s" type="text" name="id">




</body>
</html>
