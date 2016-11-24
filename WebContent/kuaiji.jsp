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
#right1{
	height:100%;
	width:100%;
	}
#right2{
	width:100%;
	height:100%;
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
            <a href=''>ϵͳ����1</a>
            <a href=''>ϵͳ����2</a>
            <a href=''>ϵͳ����3</a>
            <a href=''>ϵͳ����4</a>
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
            <a href=''>������Ϣ</a>
            <a href="#gongzibiaotijiao">�ύ���ʱ�</a>
            <a href=''>���Ź���</a>
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
								<li>></li>
								<li><a href="#">��</a></li>
						</ul>
			</div>
			
<div class="main"  style="overflow:hidden; width: 100%; height: 100%">
	<div id="right0" ></div>

	<div id="gongzibiaotijiao" >
						<form action="insertOneGongzi" method="post" >
						<table border="1" >
							<tr>
								<td>���</td>
								<td>Ա�����</td>
								<td>ȱ��</td>
								<td>�Ӱ�ʱ��</td>
								<td>���ʼ���</td>
								<td>Ӧ������</td>
								<td>����״̬</td>
							</tr>
						<c:forEach items="${sessionScope.gongzibiaos }" var="gongzi" varStatus="vs" >
							<tr>
								<td>${vs.index+1 }</td>
								<td><input type="text" value=${gongzi.userId } /> </td>
								<td><input type="text" value=${gongzi.chuqinQue } /> </td>
								<td><input type="text" value=${gongzi.jiaban }/></td>
								<td><input type="text" value=${gongzi.gongziJiBie }/></td>
								<td><input type="text" value=${gongzi.gongziYing }/></td>
								<td><input type="text" value=${gongzi.zhuangtai }/></td>
								
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