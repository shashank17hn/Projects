<!DOCTYPE html>
<html>
<head>

<title>Jabalpur Bazar</title>
<link href="style/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="wrapper">
  <div class="headerzone">
    <div class="header">
      <div class="headerText"></div>
      <div class="phone"> 
        <div class="email"> </div>
      </div>
    </div>
    <div class="clear"></div>
    <div class="topmenu">
    </div>
    <div class="clear"></div>
  </div>
  <div class="banner">
    <div class="features">
     
      <div class="featuresText">
        
      </div>
	  <div class="buybutton">
	  	
	  </div>
    </div>
    <div class="clear"></div>
    <div class="bannerText">
	

	  
      <div class="clear"></div>
    </div>
    <div class="clear"></div>
  </div>
  <div class="workZone">
    <div class="midBox">
      <div class="topBox">
        <div class="bottomBox">
          <div class="leftBox">
            <div class="box1">
		
				<div>
				
				</div>
				
				
		
		<div id="side_ad">
		<a href="ad_show.php?name=spl1">
				<img src="images/ad.jpg" width="200" height="200"></a>
		</div>
		<div id="side_ad">
		<a href="ad_show.php?name=spl2">
				<img src="images/ad.jpg" width="200" height="200"></a>
		</div>
				</div>
	
            <div class="clear"></div>
          </div>
          <div class="workZoneRight">
            <div class="rightBox1">
			<?php   
			
				$f_usr= $_POST["userid"];
				$f_pswd= $_POST["user_password"];
				$f_pswd1= $_POST["user_password1"];
				$a=0;
				$con=mysql_connect("localhost","shashank","hanuman");
				if(! $con)
				{
				die('Connection Failed'.mysql_error());
				}
				mysql_select_db("jabalpur_bazar",$con);
				$result=mysql_query("select * from bazar_main");
				while($row=mysql_fetch_array($result))
				{
					if($row["user_name"]==$f_usr && $row["user_password"]==$f_pswd)
					{
						$a=1;
						if($a==1)
						{
							mysql_select_db("jabalpur_bazar",$con);

							mysql_query("UPDATE `bazar_main` SET 
                         `user_password` = '$f_pswd1'      
                         WHERE `user_name` = '$f_usr'"); 
			
							echo "<h1>Password changed successfully </h1><br>";
						}		
									
					}
			
				}
				if($a!=1)
					{
						echo "<h1>Invalid Login Id or Password</h1>";
									
					}
						
									
?>		
				<a href="index.html"><h4>Home</h4></a>
			
			
			
			
          </div>
          <div class="clear"></div>
        </div>
      </div>
    </div>
    <div class="clear"></div>
  </div>
 
</div>
</body>
</html>
