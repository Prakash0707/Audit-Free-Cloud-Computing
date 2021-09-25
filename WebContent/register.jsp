<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
    <head>
        <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title>Login and Registration Form with HTML5 and CSS3</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Login and Registration Form with HTML5 and CSS3" />
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style2.css" />
		<link rel="stylesheet" type="text/css" href="css/animate-custom.css" />
    </head>
    
    <script type="text/javascript">

function validateForm() {
    var x = document.forms["myForm"]["Uname"].value;
    if (x == null || x == "") {
        alert("Name must be filled out");
        return false;
    }
    var x1 = document.forms["myForm"]["Emailid"].value;
    if (x1 == null || x1 == "") {
        alert("emailid must be filled out");
        return false;
    }
    var x2 = document.forms["myForm"]["Passwd"].value;
    if (x2 == null || x2 == "") {
        alert("password must be filled out");
        return false;
    }
    var x3 = document.forms["myForm"]["Confirm"].value;
    if (x3 == null || x3 == "") {
        alert("confirmpassword must be filled out");
        return false;
    }
    var x4 = document.forms["myForm"]["Address"].value;
    if (x4 == null || x4 == "") {
        alert("Address must be filled out");
        return false;
    }
    var x5 = document.forms["myForm"]["Mobno"].value;
    if (x5 == null || x5 == "") 
    {
        alert("Mobile Number must be filled out");
        return false;
    }
//     else if(x5>11)
//     {
//         alert("Mobile Number must be 10 Digit Only");
//         return false;
        
//     }
    
}
    
    </script>
    
    
    
    
    
    
    <body>
        <div class="container">
            <!-- Codrops top bar -->
            <div class="codrops-top">
                <a href="">
                    <strong>&laquo; Previous Demo: </strong>Responsive Content Navigator
                </a>
                <span class="right">
                    <a href=" http://tympanus.net/codrops/2012/03/27/login-and-registration-form-with-html5-and-css3/">
                        <strong>Back to the Codrops Article</strong>
                    </a>
                </span>
                <div class="clr"></div>
            </div><!--/ Codrops top bar -->
            <header>
                <h1>Registration Here<span></span></h1>
				<nav class="codrops-demos">
					<span>Click <strong>"Join us"</strong> to see the form switch</span>
					<a href="index.jsp">Home</a>
					<a href="register.jsp" class="current-demo">register</a>
					<a href="login.jsp">login</a>
				</nav>
            </header>
            <section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form  action="RegisterPage" autocomplete="on" method="post" name="myForm"> 
                                <h1> Sign up </h1> 
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your username</label>
                                    <input id="usernamesignup" name="Uname" required="required" type="text" placeholder="mysuperusername690" />
                                </p>
                                <p> 
                                    <label for="emailsignup" class="youmail" data-icon="e" > Your email</label>
                                    <input id="emailsignup" name="Emailid" required="required" type="email" placeholder="mysupermail@mail.com"/> 
                                </p>
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" data-icon="p">Your password </label>
                                    <input id="passwordsignup" name="Passwd" required="required" type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                                <p> 
                                    <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Please confirm your password </label>
                                    <input id="passwordsignup_confirm" name="Confirm" required="required" type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your Address</label>
                                    <input id="usernamesignup" name="Address" required="required" type="text" placeholder="mysuperusername690" />
                                </p>
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your Mobile Number</label>
                                    <input id="usernamesignup" name="Mobno" required="required" type="text" placeholder="mysuperusername690" />
                                </p>
                                <p class="signin button"> 
									<input type="submit" value="Sign up"  onclick="return validateForm()"/> 
								</p>
                                <p class="change_link">  
									Already a member ?
									<a href="login.jsp" class="to_register"> Go and log in </a>
								</p>
                            </form>
                            

                        
                    </div>
                </div>  
            </section>
        </div>
    </body>
</html>