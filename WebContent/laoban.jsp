<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台模板管理系统</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/menu.js"></script>
<style type="text/css">
#right1{
height: 100%;
width: 100%;
background-color: red;
}
#right2,#right3{
height: 100%;
width: 100%;
background-color: green;
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
			<li><a href="">张山</a></li>
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
          <h4 class="M1"><span></span>查看账目</h4>
          <div class="list-item none">
            <a href="right1">系统公告1</a>
            <a href="zhangmuAction">查看账目</a>
            <a href=''>系统公告3</a>
            <a href=''>系统公告4</a>
          </div>
        </li>
        <li>
          <h4 class="M2"><span></span>查看出勤信息</h4>
          <div class="list-item none">
            <a href="#right2"></a>
            <a href="kaoqinAllAction">查看考勤</a>
                     
           </div>
        </li>
        <li>
          <h4 class="M3"><span></span>查看工作报告</h4>
          <div class="list-item none">
              <a href="#right3">工单处理1</a>
           
            
          </div>
        </li>
				<li>
          <h4 class="M4"><span></span>查看工资信息</h4>
          <div class="list-item none">
            <a href="#right4">评论管理1</a>
            <a href="gongziAction">审批工资</a>
          </div>
        </li>
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
								<li>></li>
								<li><a href="#">打卡</a></li>
						</ul>
			</div>
			<div class="main"   style="overflow:hidden; height: 100%;width: 100%;">
						<div id="right1">
					
<table width="400" border="1" align="center" >
  <tr>
    <td>账目编号</td>
    <td>员工编号</td>
    <td>时间</td>
    <td>钱的操作</td>  
    <td>金额</td>
     <td>结余</td>
  </tr>
  <c:forEach items="${sessionScope.zs }" var="g" varStatus="vs" >
  <tr>
    <td>${g.zhangmuId }</td>
    <td>${g.userId }</td>
    <td>${g.time }</td>
    <td>${g.caozuo }</td>
   <td>${g.jine }</td>
    <td>${g.jieyu }</td>
  </tr>
  </c:forEach>	
</table>
						</div>
						
						<div id="right4">
					
<table width="400" border="1" align="center" >
  <tr>
    <td>员工编号</td>
    <td>缺席天数</td>
    <td>工资级别</td>
    <td>加班天数</td>  
    <td>应发工资</td>
     <td>状态</td>
  </tr>
  <c:forEach items="${sessionScope.gs }" var="g" varStatus="vs" >
  <tr>
    <td>${g.userId }</td>
    <td>${g.chuqinQue }</td>
    <td>${g.gongziJiBie }</td>
    <td>${g.jiaban }</td>
   <td>${g.gongziYing }</td>
    <td>${g.zhuangtai }</td>
  </tr>
  </c:forEach>	
</table>

					</div>
					<div id="right5">
					
					</div>
					<div id="right3">
					
					</div>
					<div id="right2">
					
<table width="400" border="1" align="center" >
  <tr>
    <td>考勤编号</td>
    <td>员工编号</td>
    <td>部门编号</td>
    <td>月份</td>  
    <td>应出勤数</td>
     <td>实际出勤数</td>
     <td>缺勤数</td>
     <td>加班</td>
  </tr>
  <c:forEach items="${sessionScope.ks }" var="g" varStatus="vs" >
  <tr>
    <td>${g.kaoqinAllId }</td>
    <td>${g.yue }</td>
    <td>${g.bumenId }</td>
    <td>${g.userId }</td>
   <td>${g.chuqinYing }</td>
    <td>${g.chuqinShi }</td>
    <td>${g.chuqinQue }</td>
     <td>${g.jiaban }</td>
  </tr>
  
  </c:forEach>	
</table>
					
					</div>
					
				<div>
			
	</div>
				
			</div>
		</div>
</div>
<div class="bottom"></div>
<div id="footer"><p>Copyright©  2015 版权所有 京ICP备05019125号-10  来源:<a href="http://h2design.taobao.com/" target="_blank">氢设计</a></p></div>
<script>navList(12);</script>
</body>
</html>