<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
     <div align="center">
        <h3>信息</h3>
       <table align="center">
         <tr>
         <td>序号</td>
         <td>账号</td>
         <td>密码</td>
         <td>邮箱</td>
         <td>权限</td>
         <td>状态</td>
         <td>日期</td>
         <td>操作</td>
         </tr>
         <c:forEach items="${list}" var="user">
           <tr>
           <td>${user.userid}</td>
           <td>${user.userAccount}</td>
            <td>************</td>
             <td>${user.email}</td>
             <td>
            <c:forEach items="${user.list}" var="list">
             ${list.rolename}
            </c:forEach>
             </td>
             
          <c:if test=" ${user.status=='0'}">
          <td>
                            禁用</td>
          </c:if>
          
            <c:if test=" ${user.status=='1'}">
        <td>              
                            启用
          </td>
          </c:if>
          
           <td>${user.workDate}</td>
            <td></td>
           </tr> 
         </c:forEach> 
         
       
       </table>
     
     
     </div>


  </body>
</html>
