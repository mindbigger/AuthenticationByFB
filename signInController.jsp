<%@page import="com.bean.UserProfile"%>
<%@page import="com.demo.FBLogInUserDetails"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String access_token= request.getParameter("access_token");
FBLogInUserDetails fBLogInUserDetails=new FBLogInUserDetails();
UserProfile userProfile=fBLogInUserDetails.getUserProfileInfo(access_token);
%>
User Name: <%=userProfile.getUserName()%>
</body>
</html>