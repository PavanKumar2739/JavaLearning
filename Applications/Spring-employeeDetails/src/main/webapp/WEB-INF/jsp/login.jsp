<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="en" >
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>home page</title>
        <link rel="stylesheet" href="C:\Users\pavan\Downloads\spring-form1\spring-form1\src\main\webapp\login.css">

    </head>
    <body >
        <div class="alert-box">
            <p class="alert">msg</p>
        </div>
        <div class="backgroundImg">
        <div class="form">
<form action="/projectDetails" method="post">
<h1 class="heading" >login</h1>
<input type="email" placeholder="email" autocomplete="off" class="email" required />
<input type="password" placeholder="password"  autocomplete="off" class="password" required />
<button onclick="ok()"  class="submit-btn">log in</button>
<a href="C:\Users\91944\Desktop\cards\register.html" class="link">don't have an account? register one</a>
</form>
        </div>

</div>


















    </body>
</html>