<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="js/jquery-1.js"></script>
<script src="js/bootstrap.js"></script>
<script src="js/confirm.js"></script>
<script src="js/jquery.js"></script>
<script src="js/message_cn.js"></script>
<script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<link href="http://libs.baidu.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" />
</head>
<body>
	<div class="jumbotron" style="padding-top: 15px; padding-bottom: 15px;">
		<div class="container">
			<h2>视频管理</h2>
		</div>
	</div>
	
	<table class="table table-bordered">
	<tr>
		<td>序号</td>
		<td>ID</td>
		<td>名称</td>
		<td>详情</td>
		<td>时间</td>
		<td>讲师名字</td>
		<td>课程名字</td>
		<td>视频url</td>
		<td>封面url</td>
		<td>播放次数</td>
		<td>操作</td>
	</tr>
	<c:forEach begin="0" end="${list.size()-1}" var = "i">
	<tr>
		<td>${i }</td>
		<td>${list[i].video_id }</td>
		<td>${list[i].title }</td>
		<td>${list[i].detail }</td>
		<td>${list[i].time }</td>
		<td>${list[i].speaker_id }</td>
		<td>${list[i].course_id }</td>
		<td>${list[i].video_url}</td>
		<td>${list[i].image_url }</td>
		<td>${list[i].play_num }</td>
		<td>
			<a class="btn btn-success" href="Uvideo?id=${list[i].video_id }">（编辑）</a>
			<a  class="btn btn-danger" href="Dvideo?id=${list[i].video_id }">（删除）</a>
		</td>
	</tr>
	</c:forEach>
</table>
	
<div style="float: left;width:100%;margin-top: 70px; ">



<div style="float:left;width:210px;height:80px;">
		
		<c:if test="${count%2==0}">
			<c:set value = "${count/2}" var="page"></c:set>
			<fmt:parseNumber var="page" value="${page}" integerOnly="true" />
			总共${count}条记录,共${page}页
		</c:if>
		<c:if test="${count%2!=0}">
			<c:set value = "${count/2 +1 }" var="page"></c:set>
			<fmt:parseNumber var="page" value="${page}" integerOnly="true" />
			总共${count}条记录,共${page}页
		</c:if>
		
		<c:if test="${pagee > 1}">
			<a href="voidShow?page=${pagee-1}">上一页</a>
		</c:if>
</div>
		<div style="float: left">
			<c:forEach var="i" begin="1" end="${page}">
				<a href="voidShow?page=${i}">第${i}页</a>&nbsp;&nbsp;
			</c:forEach>
		</div>
		<div style="float: left; width: 50px">
			<c:if test="${pagee < page}">
				<a href="voidShow?page=${pagee+1}">下一页</a>
			</c:if>
		</div>

<a class="btn btn-success" href="updateSpeaker">（添加）Add</a>
</div>	
	
	
	
	
	
</body>
</html>