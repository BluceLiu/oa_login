<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>��̨��¼</title>
<link rel="stylesheet" type="text/css" href="css/style1.css" />
<style>
body{height:100%;background:#16a085;overflow:hidden;}
canvas{z-index:-1;position:absolute;}
</style>
<script src="js/jquery.js"></script>
<script src="js/verificationNumbers.js"></script>
<script src="js/Particleground.js"></script>
<script>
$(document).ready(function() {
  //���ӱ�����Ч
  $('body').particleground({
    dotColor: '#5cbdaa',
    lineColor: '#5cbdaa'
  });

});
</script>
</head>
<body>
<form action="loginAction" method="post">
<dl class="admin_login">
 <dt>
  <strong>��̨����ϵͳ</strong>
  <em>Management System</em>
 </dt>
 <dd class="user_icon">
  <input type="text" id="userId" name="userId" class="login_txtbx"/>
 </dd>
 <dd class="pwd_icon">
  <input type="password" id="loginInfoPwd" name="loginInfoPwd"  class="login_txtbx"/>
 </dd>

 <dd>
  <input type="submit" id="tijiao" name="tijiao" value="������½" class="submit_btn"/>
 </dd>
 <dd>
  <p> 2016-2017 �������� ��Ȩ����</p>
 </dd>
</dl>
</form>
</body>
</html>