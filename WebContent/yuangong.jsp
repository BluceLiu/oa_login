<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>后台模板管理系统</title>
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="js/menu.js"></script>
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
          <h4 class="M1"><span></span>打卡</h4>
          <div class="list-item none">
            <a href="">系统公告1</a>
            <a href="">系统公告2</a>
            <a href=''>系统公告3</a>
            <a href=''>系统公告4</a>
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
            <a href=''>基础教学1</a>
            <a href=''>基础教学2</a>
            <a href=''>基础教学3</a>
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
			<div class="main" name="right"  >
					
			</div>
		</div>
</div>
<div class="bottom"></div>
<div id="footer"><p>Copyright©  2015 版权所有 京ICP备05019125号-10  来源:<a href="http://h2design.taobao.com/" target="_blank">氢设计</a></p></div>
<script>navList(12);</script>
</body>
</html>