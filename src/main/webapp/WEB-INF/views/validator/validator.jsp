<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Java验证框架测试</title>
</head>

<body>

	<form:form modelAttribute="validatorBean" method="post">     
        登录用户名:<form:input path="username" />
		<br />
		<span style="color: red;"><form:errors path="username" /></span>
		<br />

        登录密码: <form:input path="password" />
		<br />
		<span style="color: red;"><form:errors path="password" /></span>
		<br />

        用户姓名: <form:input path="firstName" />
		<br />
		<span style="color: red;"><form:errors path="firstName" /></span>
		<br />

        出生日期: <form:input path="brithDay" />
		<br />
		<span style="color: red;"><form:errors path="brithDay" /></span>
		<br />

        必须是False: <form:input path="isFalse" />
		<br />
		<span style="color: red;"><form:errors path="isFalse" /></span>
		<br />

        必须是True: <form:input path="isTrue" />
		<br />
		<span style="color: red;"><form:errors path="isTrue" /></span>
		<br />

        Email: <form:input path="email" />
		<br />
		<span style="color: red;"><form:errors path="email" /></span>
		<br />

        部门名称: <form:input path="section" />
		<br />
		<span style="color: red;"><form:errors path="section" /></span>
		<br />

        年龄: <form:input path="age" />
		<br />
		<span style="color: red;"><form:errors path="age" /></span>
		<br />

        最大值: <form:input path="intMax" />
		<br />
		<span style="color: red;"><form:errors path="intMax" /></span>
		<br />

        最小值: <form:input path="intMin" />
		<br />
		<span style="color: red;"><form:errors path="intMin" /></span>
		<br />

        未来日期: <form:input path="futureDate" />
		<br />
		<span style="color: red;"><form:errors path="futureDate" /></span>
		<br />       

        整数小数位验证: <form:input path="floatValue" />
		<br />
		<span style="color: red;"><form:errors path="floatValue" /></span>
		<br /> 

        最大值: <form:input path="longMax" />
		<br />
		<span style="color: red;"><form:errors path="longMax" /></span>
		<br />

        最小值: <form:input path="longMin" />
		<br />
		<span style="color: red;"><form:errors path="longMin" /></span>
		<br />   

        必须为null值: <form:input path="strNull" />
		<br />
		<span style="color: red;"><form:errors path="strNull" /></span>
		<br />

        必须不为null值: <form:input path="strNotNull" />
		<br />
		<span style="color: red;"><form:errors path="strNotNull" /></span>
		<br />

		<input type="submit" value="提交" />
	</form:form>
</body>
</html>