<%@page import="edu.tsinghua.entity.Kaoqin"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=gbk"
    pageEncoding="gbk"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/menu.js"></script>
<style type="text/css">
#right0{
	height:100%;
	width:100%;
	}
#daka,#dakachenggong,#showdaka{
	height:100%;
	width:100%;
	}
#right1{
	height:100%;
	width:100%;
	}
#right2{
	width:100%;
	height:100%;
	}
#gongzibiaotijiao{
	width:100%;
	height:93%;
	overflow:scroll;
	}
</style>
</head>
<body>

<div class="top"></div>
<div id="header">
	<div class="logo">***��̨����ϵͳ</div>
	<div class="navigation">
		<ul>
		 	<li>��ӭ����</li>
			<li><a href="">${sessionScope.loginInfo.userId }</a></li>
			<li><a href="">�޸�����</a></li>
			<li><a href="">����</a></li>
			<li><a href="">�˳�</a></li>
		</ul>
	</div>
</div>
<div id="content">
	<div class="left_menu">
				<ul id="nav_dot">
      <li>
          <h4 class="M1"><span></span>��</h4>
          <div class="list-item none">
            <a href="#daka">��</a>
            <a href="showdakaAction">�鿴����</a>
          </div>
        </li>
        <li>
          <h4 class="M2"><span></span>�鿴������Ϣ</h4>
          <div class="list-item none">
            <a href=''>��������1</a>
            <a href=''>��������2</a>
            <a href=''>��������3</a>
            <a href=''>��������4</a>
            <a href=''>��������5</a>          
           </div>
        </li>
        <li>
          <h4 class="M3"><span></span>�ύ��������</h4>
          <div class="list-item none">
	          <p><a href="#right1" >�ύ��������</a></p>
		   	  <p> <a href="getAll" >�鿴��������</a> </p>
          
          </div>
        </li>
				<li>
          <h4 class="M4"><span></span>�鿴������Ϣ</h4>
          <div class="list-item none">
            <a href=''>���۹���1</a>
            <a href=''>���۹���2</a>
            <a href=''>���۹���3</a>
          </div>
        </li>
	<li>
          <h4 class="M4"><span></span>Ա�����ʴ���</h4>
          <div class="list-item none">
            <a href=''>�鿴������������Ϣ</a>
            <a href="showAllTijiaoGongziAction">�ύ���ʱ�</a>
            <a href=''>���Ź���</a>
          </div>
        </li>
	<li>
          <h4 class="M4"><span></span>��Ŀ����</h4>
          <div class="list-item none">
            <a href="">�鿴���������ʱ�</a>
            <a href="">�ύ��Ŀ��</a>
            <a href="">�鿴��������Ŀ��</a>
          </div>
        </li>
	<!-- <li>
          <h4 class="M4"><span></span><a style="color: white;" href="#right1" onclick="getAll">�ύ��������</a></h4>
         
        </li>
	<li>
          <h4 class="M4"><span></span><a style="color: white;" href="#right2" onclick="getAll">�鿴��������</a></h4>
         
        </li> -->
     
				<li>
          <h4   class="M10"><span></span>��������</h4>
          <div class="list-item none">
            <a href=''>ϵͳ����1</a>
            <a href=''>ϵͳ����2</a>
            <a href=''>ϵͳ����3</a>
          </div>
        </li>
  </ul>
		</div>
		<div class="m-right">
			<div class="right-nav">
					<ul>
							<li><img src="images/home.png"></li>
								<li style="margin-left:25px;">����ǰ��λ�ã�</li>
								<li><a href="#">��</a></li>
								<li></li>
								<li><a href="#">��</a></li>
						</ul>
			</div>
			
<div class="main"  style="overflow:hidden; width: 100%; height: 100%">
	<div id="right0" ></div>
	<!--����Ϊ�򿨰�ť -->
	<div id="daka" >
	
           <%
				Date currentTime = new Date(); 
				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				String dateString = formatter.format(currentTime);
			%>
           <p align="center"> 
	           <form action="dakaaction" method="post">
	           <input type="hidden" name="kaoqinId"/>
	           <input type="text" name="daKaTime" value="<%=(new java.util.Date()).toLocaleString().substring(10)%>"/>
	           <%-- <input type="hidden" name="daKaDate" value="<%=dateString%>"/> --%>
	           <input type="hidden" name="usersId" value="4" />
	           <input type="submit"  value="ǩ��"/>
	           </form>
           </p>   
    </div>
    <!-- �鿴���п��� -->
   
<div id="showdaka">
	<table border="1" >
			<tr>
				<td>���</td>
				<td>ǩ��ʱ��</td>
				<td>�û�Id</td>
			</tr>
			<c:forEach items="${sessionScope.daKaList }" var="kaoqin" varStatus="vs" >
				<tr>
					<td>${kaoqin.kaoqinId }</td>
					<td>${kaoqin.dakaTime }</td>
					<td>${kaoqin.userId }</td>
					
				</tr>
			</c:forEach>	
			</table>	
    
</div>
    <div id="dakachenggong">
    	<h1>�򿨳ɹ�����</h1>
    	<hr>
    </div>
	<div id="gongzibiaotijiao" >
			
			<form action="insertOneTijiaoGongzi" method="post" >
				<a href="gongziInit">��ʼ������</a>
			<table border="1" >
				<tr>
					<td>���</td>
					<td>Ա�����</td>
					<td>ȱ��</td>
					<td>�Ӱ�ʱ��</td>
					<td>���ʼ���</td>
					<td>Ӧ������</td>
					<td>����״̬</td>
					<td>�༭</td>
				</tr>
			<c:forEach items="${sessionScope.gongzibiaos }" var="gongzi" varStatus="vs" >
				<tr>
					<td ><b id="gongziId">${gongzi.gongziId }</b></td>
					<td ><input type="text" id="userId" value=${gongzi.userId } /> </td>
					<td ><input type="text" id="chuqinQue" value=${gongzi.chuqinQue } /> </td>
					<td ><input type="text" id="jiaban" value=${gongzi.jiaban }/></td>
					<td ><input type="text" id="gongziJiBie" value=${gongzi.gongziJiBie }/></td>
					<td ><input type="text" id="gongziYing" value=${gongzi.gongziYing }/></td>
					<td ><b id="gongziId">${gongzi.zhuangtai }</b></td>
					<td>
						<a href="deleteOneTijiaoGongziAction?gongziId=${gongzi.gongziId }">ɾ��</a>   
						<a href="updateOneTijiaoGongziAction">�޸�</a>
					</td>
				</tr>
				</c:forEach>
				
			</table>
			<input type="submit" name="tijiao"   value="�ύ" />
			</form>

</div>
	<div id="right1" >
						<form action="insertOne" method="post" >
						<table border="1" >
							<tr>
							
								<td>����</td>
								<td><input type="text" name="huibaoTitle" id="huibaoTitle"  size="50"/></td>
							
							</tr>
							
							<tr>
								<td>����</td>
								<td>
									<textarea name="huibaoNeirong" id="huibaoNeirong" rows="10" cols="50"></textarea>
								</td>
							</tr>
							
							
						</table>
						<input type="submit" name="tijiao"   value="�ύ" />
						</form>

</div>
      <div id="right2">
						<table border="1" >
							<tr>
								<td>�㱨���</td>
								<td>��Ʊ��</td>
								<td>����</td>
								<td>����</td>
								<td>�ظ�</td>
								<td>״̬</td>
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
						
			</div>
			
		</div>
	</div>
</div>
<div class="bottom" ></div>
<div id="footer" ><p>2016 ��Ȩ���� ��������</p></div>
<script>navList(12);</script>
</body>
</html>