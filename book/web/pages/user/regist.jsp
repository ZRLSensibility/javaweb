<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<title>尚硅谷会员注册页面</title>
	<%@ include file="/pages/common/head.jsp"%>
	<script type="text/javascript">

		$(function () {
			$("#sub_btn").click(function () {
				//验证用户名
				var usernameText = $("#username").val();
				var usernamePatt = /^\w{5,12}$/;
				if (!usernamePatt.test(usernameText)){
					$("span.errorMsg").text("用户名不合法!");
					return false;
				}

				//验证密码
				var passwordText = $("#password").val();
				var passwordPatt = /^\w{5,12}$/;
				if (!passwordPatt.test(passwordText)){
					$("span.errorMsg").text("密码不合法!");
					return false;
				}

				//验证确定密码
				var repwdText = $("#repwd").val();
				if(repwdText != passwordText){
					$("span.errorMsg").text("确认密码和密码不一致！");
					return false;
				}

				//邮箱验证
				var emailText = $("#email").val();
				var emailPatt = /^[a-z\d]+(\.[a-z\d]+)*@([\da-z](-[\da-z])?)+(\.{1,2}[a-z]+)+$/;

				if(!emailPatt.test(emailText) ){
					$("span.errorMsg").text("邮箱格式不合法！");
					return false;
				}

				//验证码
				var codeText = $("#code").val();

				//去掉验证码前后空格
				// alert("去空格前:[" + codeText + "]");
				codeText = $.trim(codeText);
				// alert("去空格后:[" + codeText + "]");

				if (codeText == null || codeText == ""){

					$("span.errorMsg").text("验证码不能为空！");
					return false;
				}
				$("span.errorMsg").text("");
			});
		});
	</script>
<style type="text/css">
	.login_form{
		height:420px;
		margin-top: 25px;
	}
	
</style>
</head>
<body>
		<div id="login_header">
			<img class="logo_img" alt="" src="static/img/logo.gif" >
		</div>
		
			<div class="login_banner">
			
				<div id="l_content">
					<span class="login_word">欢迎注册</span>
				</div>
				
				<div id="content">
					<div class="login_form">
						<div class="login_box">
							<div class="tit">
								<h1>注册尚硅谷会员</h1>
								<span class="errorMsg">
<%--									<%=request.getAttribute("msg")==null?"":request.getAttribute("msg")%>--%>
									${requestScope.msg}
								</span>
							</div>
							<div class="form">
								<form action="userServlet" method="post">
									<input type="hidden" name="action" value="regist">
									<label>用户名称：</label>
									<input class="itxt" type="text" placeholder="请输入用户名"
										   autocomplete="off" tabindex="1" name="username" id="username"
<%--									   value="<%=request.getAttribute("username")==null?"":request.getAttribute("username")%>"--%>
											${requestScope.username}
									/>
									<br />
									<br />
									<label>用户密码：</label>
									<input class="itxt" type="password" placeholder="请输入密码"
										   autocomplete="off" tabindex="1" name="password" id="password" />
									<br />
									<br />
									<label>确认密码：</label>
									<input class="itxt" type="password" placeholder="确认密码"
										   autocomplete="off" tabindex="1" name="repwd" id="repwd" />
									<br />
									<br />
									<label>电子邮件：</label>
									<input class="itxt" type="text" placeholder="请输入邮箱地址"
										   autocomplete="off" tabindex="1" name="email" id="email"
<%--									       value="<%=request.getAttribute("email")==null?"":request.getAttribute("email")%> "/>--%>
									           ${requestScope.email}
									<br />
									<br />
									<label>验证码：</label>
									<input class="itxt" type="text" style="width: 150px;" name="code" id="code" />
									<img alt="" src="static/img/code.bmp" style="float: right; margin-right: 40px">
									<br />
									<br />
									<input type="submit" value="注册" id="sub_btn" />
									
								</form>
							</div>
							
						</div>
					</div>
				</div>
			</div>
		<%@ include file="/pages/common/footer.jsp"%>
</body>
</html>