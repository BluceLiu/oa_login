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
	<div class="logo">***后台管理系统</div>
	<div class="navigation">
		<ul>
		 	<li>欢迎您！</li>
			<li><a href="">${sessionScope.loginInfo.userId }</a></li>
			<li><a href="">修改密码</a></li>
			<li><a href="">设置</a></li>
			<li><a href="">退出</a></li>
		</ul>
	</div>
</div>
<div id="content">
	<div class="left_menu">
				<ul id="nav_dot">
      <li>
          <h4 class="M1"><span></span>打卡</h4>
          <div class="list-item none">
            <a href="#daka">打卡</a>
            <a href="showdakaAction">查看考勤</a>
          </div>
        </li>
        <li>
          <h4 class="M2"><span></span>查看出勤信息</h4>
          <div class="list-item none">
            <a href=''>工单处理1</a>
            <a href=''>工单处理2</a>
            <a href=''>工单处理3</a>
            <a href=''>工单处理4</a>
            <a href=''>工单处理5</a>          
           </div>
        </li>
        <li>
          <h4 class="M3"><span></span>提交工作报告</h4>
          <div class="list-item none">
	          <p><a href="#right1" >提交工作报告</a></p>
		   	  <p> <a href="getAll" >查看工作报告</a> </p>
          
          </div>
        </li>
				<li>
          <h4 class="M4"><span></span>查看工资信息</h4>
          <div class="list-item none">
            <a href=''>评论管理1</a>
            <a href=''>评论管理2</a>
            <a href=''>评论管理3</a>
          </div>
        </li>
	<li>
          <h4 class="M4"><span></span>员工工资处理</h4>
          <div class="list-item none">
            <a href=''>查看已审批考勤信息</a>
            <a href="showAllTijiaoGongziAction">提交工资表</a>
            <a href=''>发放工资</a>
          </div>
        </li>
	<li>
          <h4 class="M4"><span></span>账目处理</h4>
          <div class="list-item none">
            <a href="">查看已审批工资表</a>
            <a href="">提交账目表</a>
            <a href="">查看已审批账目表</a>
          </div>
        </li>
	<!-- <li>
          <h4 class="M4"><span></span><a style="color: white;" href="#right1" onclick="getAll">提交工作报告</a></h4>
         
        </li>
	<li>
          <h4 class="M4"><span></span><a style="color: white;" href="#right2" onclick="getAll">查看工作报告</a></h4>
         
        </li> -->
     
				<li>
          <h4   class="M10"><span></span>个人设置</h4>
          <div class="list-item none">
            <a href=''>系统管理1</a>
            <a href=''>系统管理2</a>
            <a href=''>系统管理3</a>
          </div>
        </li>
  </ul>
		</div>
		<div class="m-right">
			<div class="right-nav">
					<ul>
							<li><img src="images/home.png"></li>
								<li style="margin-left:25px;">您当前的位置：</li>
								<li><a href="#">打卡</a></li>
								<li></li>
								<li><a href="#">打卡</a></li>
						</ul>
			</div>
			
<div class="main"  style="overflow:hidden; width: 100%; height: 100%">
	<div id="right0" ></div>
	<!--以下为打卡按钮 -->
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
	           <input type="submit"  value="签到"/>
	           </form>
           </p>   
    </div>
    <!-- 查看所有考勤 -->
   
<div id="showdaka">
	<table border="1" >
			<tr>
				<td>编号</td>
				<td>签到时间</td>
				<td>用户Id</td>
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
    	<h1>打卡成功界面</h1>
    	<hr>
    </div>
	<div id="gongzibiaotijiao" >
			
			<form action="insertOneTijiaoGongzi" method="post" >
				<a href="gongziInit">初始化数据</a>
			<table border="1" >
				<tr>
					<td>编号</td>
					<td>员工编号</td>
					<td>缺勤</td>
					<td>加班时长</td>
					<td>工资级别</td>
					<td>应发工资</td>
					<td>审批状态</td>
					<td>编辑</td>
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
						<a href="deleteOneTijiaoGongziAction?gongziId=${gongzi.gongziId }">删除</a>   
						<a href="updateOneTijiaoGongziAction">修改</a>
					</td>
				</tr>
				</c:forEach>
				
			</table>
			<input type="submit" name="tijiao"   value="提交" />
			</form>

</div>
	<div id="right1" >
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

</div>
      <div id="right2">
						<table border="1" >
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
						
			</div>
			
		</div>
	</div>
</div>
<div class="bottom" ></div>
<div id="footer" ><p>2016 版权所有 天天向上</p></div>
<script>navList(12);</script>
</body>
</html>