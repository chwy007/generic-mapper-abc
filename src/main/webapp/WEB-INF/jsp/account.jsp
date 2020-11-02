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
            $(".tran").remove();
            $.get("${pageContext.request.contextPath}/account/find/"+$("#3s").val(),function (data){
                $(".1t").append("<p class='tran'>"+data.id+","+data.accountName+","+data.name+","+data.password+","+data.tips+","+data.createdTime+","+data.lastmodifiedTime+"</p>");
            })
        }

        function func2(){
            $(".transient").remove();
            $.get("${pageContext.request.contextPath}/account/all",function (data) {
                $.each(data,function (i,val){
                    $("#tb1").append("<tr class='transient'><td>"+val.id+"</td><td>"+val.accountName+"</td><td>"+val.name+"</td><td>"+val.password+"</td><td>"+val.tips+"</td><td>"+val.createdTime+"</td><td>"+val.lastmodifiedTime+"</td></tr>");

                })
            })
        }

        function func3(){
            $.get("${pageContext.request.contextPath}/account/delete/"+$("#4s").val(),function (data){
                alert(data);

            })
        }



    </script>

    <!-- CSS goes in the document HEAD or added to your external stylesheet -->
    <style type="text/css">
        table.imagetable {
            font-family: verdana,arial,sans-serif;
            font-size:11px;
            color:#333333;
            border-width: 1px;
            border-color: #666666;
            border-collapse: collapse;
        }
        table.gridtable th {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #666666;
            background-color: #dedede;
        }
        table.gridtable td {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #666666;
            background-color: #ffffff;
        }
        h2{
            font-size: 12px;
            color: #ffa500;
        }
        body{
            font-size: 12px;
        }

    </style>



    <title>Account manage</title>
</head>
<body>
    <h3>账号管理</h3>

    <div class="1t"></div>


    <table id="tb1" border="1" class="imagetable">
        <tr>
            <th>id</th>
            <th>accountName</th>
            <th>name</th>
            <th>password</th>
            <th>tips</th>
            <th>createdTime</th>
            <th>lastmodifiedTime</th>
        </tr>
    </table>



    <h2>#register</h2>

    <form action="${pageContext.request.contextPath}/account/insert" method="get">
        请输入id:<br><input type="text" name="id"/><br>
        请输入accountName:<br><input type="text" name="accountName" /><br>
        请输入name:<br><input type="text" name="name" /><br>
        请输入password:<br><input type="text" name="password" /><br>
        附注:<br><textarea rows="10" cols="30" name="tips" >附: </textarea><br>

        <input type="submit" value="注册" />
    </form>

    <h2>#query</h2>

    <button type="button" onclick="func1()">根据id查询</button>
    <input id="3s" type="text" name="id">

    <h2>#query all</h2>

    <button type="button" onclick="func2()">点我查询所有</button>

    <h2>#delete</h2>

    <button type="button" onclick="func3()">根据id删除</button>
    <input id="4s" type="text" name="id">


    <h2>#modify</h2>
    <form action="${pageContext.request.contextPath}/account/modify" method="post">
        请输入id:<br><input type="text" name="id"/><br>
        请输入accountName:<br><input type="text" name="accountName" /><br>
        请输入name:<br><input type="text" name="name" /><br>
        请输入password:<br><input type="text" name="password" /><br>
        附注:<br><textarea rows="10" cols="30" name="tips" >附: </textarea><br>
        <input type="submit" value="修改" />
    </form>

</body>
</html>
