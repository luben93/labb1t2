<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="BO.*"%>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>web shop</title>
</head>
 <body>
   
   <h5>already an addict</h5>
     <form name="main1"  method="get" action="login.jsp">
        <input type="submit" name="ter" value="Login" >
    </form>
      
    
    <h1>Sign up for an amazing ride</h1>
    <form name="main1"  method="get" action="newUser.jsp">
        <input type="submit" name="ter" value="new user" >
    </form>
    
  
 
 <h2>Get your high</h2>
 <img src="drugs.jpg" alt="Problem loading picture" style="width:300px;height:228px">

  
 <%
         String newN = "";
         newN = request.getParameter( "newusername" );
         session.setAttribute( "newusername", newN );
         String newP = request.getParameter( "newpassword" );
         session.setAttribute( "newpassword", newP );
         
         //provide user interaction when trying to login
         String message = "";
         session.setAttribute( "message", message);
		 session.setAttribute("already","");
         if(newN==null)
         {
        	 newN="";
         }
       
         if(!newN.equals(""))
         {  
         
        try{
         BO.CreateUser CU = new BO.CreateUser(newN, newP); 
        	 
        	 session.setAttribute( "already", "");
        	 request.getRequestDispatcher("newUser.jsp").forward(request, response);
         
         }
         catch(com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException e)
         {
        	 String m = "User already exists";
             session.setAttribute( "already", m);
        	 request.getRequestDispatcher("newUser.jsp").forward(request, response);
         }
        // System.out.print(newN);
         }
        
               
  %>

 </body>
</html>