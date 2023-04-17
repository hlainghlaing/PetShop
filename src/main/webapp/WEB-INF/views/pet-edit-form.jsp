<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pet | Edit</title>
<style>
<%@include file="/WEB-INF/css/reset.css"%>
<%@include file="/WEB-INF/css/style.css"%>
</style>
</head>
<body>
  <div class="first-div">
    <div class="cmn-inner">
      <h1>Update Pet Information</h1>
      <form:form action="update" method="post" modelAttribute="petObj">
        <div class="input-form">
           <div>
            <input  id="id" type="hidden" name="id" value="<%= request.getParameter("id") %>"/>
          </div>
          <div class="clearfix">
           <span>Name:</span>
            <form:input path="name"/>
          </div>
          <div class="clearfix">
           <span>Sex:</span>
           <form:input path="sex"/>
         </div>
         <div class="clearfix">
           <span>Age:</span>
           <form:input path="age"/>
         </div>
         <div class="clearfix">
           <span>Type:</span>
           <form:input path="type"/>
         </div>
         <div class="clearfix">
           <span>Hobby:</span>
           <form:input path="hobby"/>
         </div>
         <div>
          <input type="submit" value="Update">
         </div>
        </div>
      </form:form>
     </div>
  </div>
</body>
</html>