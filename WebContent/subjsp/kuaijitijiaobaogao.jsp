<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Insert title here</title>
</head>
<body>

<form action="insertOne" method="post" >
<table border="1" >
	<tr>
	
		<td>标题</td>
		<td><input type="text" name="huibaoTitle" id="huibaoTitle"  size="50"/></td>
	
	</tr>
	
	<tr>
		<td>内容</td>
		<td>
			<textarea name="huibaoNeirong" id="huibaoNeirong" rows="10" cols="50"></textarea>
		</td>
	</tr>
	
	
</table>
<input type="submit" name="tijiao"   value="提交" />
</form>
</body>
</html>