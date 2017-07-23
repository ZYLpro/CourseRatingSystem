<%@page import="com.courseratingsystem.web.vo.CoursePage"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>课程列表-大众点评课</title>
<head>
<!-- Standard Meta -->
<meta charset="utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0">
<link rel="stylesheet prefech"
	href="css/semantic.css">
<script	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.11/semantic.js"></script>


<style type="text/css">
body {
	background-color: #FFFFFF;
}

.ui.menu .item img.logo {
	margin-right: 1.5em;
}

.main.container {
	margin-top: 7em;
}

.wireframe {
	margin-top: 2em;
}

.ui.footer.segment {
	margin: 5em 0em 0em;
	padding: 5em 0em;
}
</style>

</head>

<body>
	<div class="ui fixed borderless inverted menu">
		<div class="ui container">
			<a href="homepage.jsp" class="header item">
				<img class="logo" src="images/testPic.jpg"> 大众点评课
			</a>
			<a href="course_findAll.action" class="item">全部课程</a>
			<div class="ui simple dropdown item">
				课程搜索 <i class="dropdown icon"></i>
				<div class="menu">
					<a class="item" href="courseSearchByCname.jsp">按课程名称</a> <a
						class="item" href="courseSearchByTname.jsp">按授课教师</a>
				</div>
			</div>
			<div class="right menu">
				<!-- 如果未登录，显示登录注册 -->
				<c:if test="${empty sessionScope.user}">
					<a href="login.jsp" class="item">登录</a> 
					<a href="register.jsp" class="item">注册</a>
				</c:if>
				<!-- 如果已经登录，显示个人中心链接 -->
				<c:if test="${!empty sessionScope.user}">
					<a href="user.jsp" class="item">${sessionScope.user.nickname}</a>
					<a href="logout.action" class="item">注销</a>
				</c:if>
			</div>
		</div>
         <%-- <div style="margin-right:50px;margin-top:5px">
			<a href="user.jsp" class="item">${sessionScope.user.nickname}</a>
          </div> --%>
	</div>

	<div class="ui main text container">
		<h1 class="ui header">课程信息</h1>
		<br>
	</div>

	<div class="ui container"  style="text-align:center">
		<div class="ui special doubling cards" style="width:80%;text-align:center;margin:auto">
			<c:forEach items="${requestScope.coursepage.list}" var="course">
				<div class="card" style="width:220px;margin-bottom:50px;margin:auto">
					<a class="ui top attached label" style="text-size:20px">${course.coursename}</a>
					<div class="blurring dimmable image">
						<div class="ui inverted dimmer">
							<div class="content">
								<div class="center">
									<div class="ui inverted button">
										<a href="course_getPage.action?courseid=${course.courseid}">“戳”</a>
									</div>
								</div>
							</div>
						</div>
						<img src="images/elliot.jpg">
					</div>
					<div class="content">
						<pre>
							<h3><a style="color:black" href="course_getPage.action?courseid=${course.courseid}">${course.coursename}</a>
							<br><c:forEach items="${course.teacherList }" var="teacher"><a class="ui label" href="teacher_getPage.action?teacherid=${teacher.teacherid}">${teacher.teachername }</a></c:forEach></h3>
						</pre>
						<div class="meta">
							<span class="date"><h4>推荐星级</h4>
								<div class="ui star rating" data-rating="${course.recommendationScore }" data-max-rating="5"></div>
							</span>
						</div>
					</div>
					<div class="extra content">
						<i class="smile icon"></i><a href="comment_getPage.action?courseid=${course.courseid}">老司机想说几句，嗯？</a>
					</div>
				</div>
			</c:forEach>

		</div>
	</div>



	<div class="ui inverted vertical footer segment">
		<div class="ui left aligned container">
			<div class="ui stackable inverted divided grid">
				<div class="three wide column">
					<h4 class="ui inverted header">关于</h4>
					<div class="ui inverted link list">
						<a href="homepage.jsp" class="item">网站介绍</a> 
						<a href="about.jsp" class="item">联系我们 </a>
					</div>
				</div>
				<div class="seven wide column">
					<h4 class="ui inverted header">大众点评课</h4>
					<p>只做给你看的选课攻略。</p>
				</div>
			</div>
			<div class="ui inverted section divider"></div>
		</div>
	</div>
</body>
<script>
	$('.special.cards .image').dimmer({
		on : 'hover'
	});
	$('.ui .rating').rating('disable');
</script>
</html>
