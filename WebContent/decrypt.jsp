<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>CloudTop</title>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<link href="style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/cufon-yui.js"></script>
<script type="text/javascript" src="js/arial.js"></script>
<script type="text/javascript" src="js/cuf_run.js"></script>
</head>


    
       <script type="text/javascript">
        
        
        function validateForm() {
    var x = document.forms["myForm"]["Uname"].value;
    if (x == null || x == "") {
        alert("value must be filled out");
        return false;
    }
    
  
    
    
    
    
    var x1 = document.forms["myForm"]["Upload"].value;
    if (x1 == null || x1 == "") {
        alert("please upload the file");
        return false;
    }
   
        
        }      
    </script>    
        






















<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="logo">
        <h1><a href="index.html">Welcome to cloud computing <small></small></a></h1>
      </div>
      <div class="menu_nav">
        <ul>
          <li class="active"><a href="index.jsp">Home</a></li>
          <li><a href="homepage.jsp">upload</a></li>
          <li><a href="index.jsp">logout</a></li>
<!--           <li><a href="blog.html">Blog</a></li> -->
<!--           <li><a href="contact.html">Contact Us</a></li> -->
        </ul>
      </div>
      <div class="clr"></div>
      <div class="htext">
        <h2>Template License</h2>
        <p>This is a free CSS website template by iWebsiteTemplate.com. This work is distributed under the <a href="http://creativecommons.org/licenses/by/3.0/">Creative Commons Attribution 3.0 License</a>, which means that you are free to use it for any personal or commercial purpose provided you credit me in the form of a link back to iWebsiteTemplate.com.</p>
        <p><a href="#"><img src="images/readmore.gif" width="113" height="37" alt="" border="0" /></a></p>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="content">
    <div class="content_resize">
      <div class="mainbar">
        <div class="article">
          <form action="Decrypt" method="post" name="myForm" enctype="multipart/form-data" name="myForm">
		<h1><% out.println("welcome");%></h1>
		
	<h1>	<%=request.getSession().getAttribute("uname")%></h1>
			<h1>upload your encrypted file</h1>
			<table>
	<tr><td><h3>User Name : </h3></td><td><input type="text" placeholder="Username" name="Uname"></td></tr>
			
<!-- 	<tr><td><h3>Public Key : </h3></td><td><input type="text"  value="500" /></td></tr> -->
			
	<tr><td><h3>Upload Your File:</h3></td><td><input type="file" name="Upload"  /></td></tr>
			
	<tr><td></td><td><input type="submit" value="Save"  onclick="return validateForm()"    /></td></tr>
			</table>	
    <!-- <a href="Registrationpage.jsp">Register here ?</a> -->
			</div>
		</form>
        </div>
        <div class="article">
          <h2><span>Lorem Ipsum</span> Dolor Sit</h2>
          <div class="clr"></div>
          <p><span class="date">March 15, 2010</span> &nbsp;|&nbsp; Posted by <a href="#">Owner</a> &nbsp;|&nbsp; Filed under <a href="#">templates</a>, <a href="#">internet</a></p>
          <img src="images/img2.jpg" width="605" height="146" alt="" />
          <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec libero. Suspendisse bibendum. Cras id urna. <a href="#">Morbi tincidunt, orci ac convallis aliquam, lectus turpis varius lorem, eu posuere nunc justo tempus leo.</a> Donec mattis, purus nec placerat bibendum, dui pede condimentum odio, ac blandit ante orci ut diam. Cras fringilla magna. Phasellus suscipit, leo a pharetra condimentum, lorem tellus eleifend magna, eget fringilla velit magna id neque. Curabitur vel urna. In tristique orci porttitor ipsum. Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec libero. Suspendisse bibendum. Cras id urna. Morbi tincidunt, orci ac convallis aliquam.</p>
          <p class="spec"><a href="#" class="rm">Read more &raquo;</a> &nbsp;|&nbsp; <a href="#" class="com">Comments (7) &raquo;</a></p>
        </div>
      </div>
      <div class="sidebar">
        <div class="gadget">
          <h2 class="star"><span>Sidebar</span> Menu</h2>
          <div class="clr"></div>
          <ul class="sb_menu">
            <li><a href="#">Home</a></li>
            <li><a href="#">TemplateInfo</a></li>
            <li><a href="#">Style Demo</a></li>
            <li><a href="#">Blog</a></li>
            <li><a href="#">Archives</a></li>
          </ul>
        </div>
        <div class="gadget">
          <h2 class="star"><span>Sponsors</span></h2>
          <div class="clr"></div>
          <ul class="ex_menu">
            <li><a href="http://www.dreamtemplate.com">DreamTemplate</a><br />
              Over 6,000+ Premium Web Templates</li>
            <li><a href="http://www.templatesold.com/">TemplateSOLD</a><br />
              Premium WordPress &amp; Joomla Themes</li>
            <li><a href="http://www.imhosted.com">ImHosted.com</a><br />
              Affordable Web Hosting Provider</li>
            <li><a href="http://www.myvectorstore.com">MyVectorStore</a><br />
              Royalty Free Stock Icons</li>
            <li><a href="http://www.evrsoft.com">Evrsoft</a><br />
              Website Builder Software &amp; Tools</li>
            <li><a href="http://www.csshub.com/">CSS Hub</a><br />
              Premium CSS Templates</li>
          </ul>
        </div>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="fbg">
    <div class="fbg_resize">
      <div class="col c1">
        <h2><span>About</span></h2>
        <img src="images/white.jpg" width="56" height="56" alt="" />
        <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Donec libero. Suspendisse bibendum. Cras id urna. Morbi tincidunt, orci ac convallis aliquam, lectus turpis varius lorem, eu posuere nunc justo tempus leo. llorem, eu posuere nunc justo tempus leo. Donec mattis, purus nec placerat bibendum. <a href="#">Learn more...</a></p>
      </div>
      <div class="col c2">
        <h2><span>Lorem Ipsum</span></h2>
        <ul class="sb_menu">
          <li><a href="#">consequat molestie</a></li>
          <li><a href="#">sem justo</a></li>
          <li><a href="#">semper</a></li>
          <li><a href="#">magna sed purus</a></li>
          <li><a href="#">tincidunt</a></li>
        </ul>
      </div>
      <div class="col c3">
        <h2><span>Contact</span></h2>
        <p>Praesent dapibus, neque id cursus faucibus, tortor neque egestas augue.</p>
        <p><a href="#">support@yoursite.com</a></p>
        <p>+1 (123) 444-5677<br />
          +1 (123) 444-5678</p>
        <p>Address: 123 TemplateAccess Rd1</p>
      </div>
      <div class="clr"></div>
    </div>
  </div>
  <div class="footer">
    <div class="footer_resize">
      <p class="lf">&copy; Copyright <a href="#">MyWebSite</a>.</p>
      <p class="rf">Layout by I <a href="http://www.iwebsitetemplate.com/">Website Templates</a></p>
      <div class="clr"></div>
    </div>
  </div>
</div>
<div align=center>This template  downloaded form <a href='http://all-free-download.com/free-website-templates/'>free website templates</a></div></body>
</html>
