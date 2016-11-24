<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html >
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Insert title here</title>
</head>
<body>

<table border="1" bordercolor="red">
	<tr>
		<td>汇报编号</td>
		<td>会计编号</td>
		<td>标题</td>
		<td>内容</td>
		<td>回复</td>
		<td>状态</td>
	</tr>
<c:forEach items="${sessionScope.huibaoKuais }" var="huibao" varStatus="vs" >
	<tr>
		<td>${huibao.huibaoKuaiId }</td>
		<td>${huibao.kuaijiId }</td>
		<td>${huibao.huibaoTitle }</td>
		<td>${huibao.huibaoNeirong }</td>
		<td>${huibao.huibaoHuifu }</td>
		<td>${huibao.zhuangtai }</td>
		
	</tr>
</c:forEach>	
</table>
</body>
</html>