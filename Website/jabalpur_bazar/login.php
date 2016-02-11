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
								if($row["user_name"]==$f_usr)
								{   
								
									echo"<h1>Welcome<h1/>";
									echo "<h2>" . $row['owner_name'] . "</h2><br />";
									$con = mysql_connect("localhost","shashank","hanuman");
			if (!$con)
			{
				die('Could not connect: ' . mysql_error());
			}
			mysql_select_db ("jabalpur_bazar",$con);
			@$sql="select * from bazar_image where user_name='$f_usr'";
			@$query=mysql_query($sql);
			while(@$row3=mysql_fetch_array($query))
			{
				@$image=$row3 ['photo'];
				 echo "<img src=\"profile_pic/$image \"width=360 height=250>";
			
			}						
									echo "<h3><b>Business Name :" . $row['business_name'] . "</h3><br />";
									echo "Address :" . $row['address'] . "<br />";
									echo "Phone No. :" . $row['phone_no'] . "<br />";
									echo "Mobile No. :" . $row['mobile_no'] . "<br />";
									echo "Email id. :" . $row['email_id'] . "<br />";
									echo "Offer available :" . $row['offer_available'] . "<br />";
									echo "Offer :" . $row['define_offer'] . "<br />";
									echo "About Business :" . $row['about_business'] . "<br />";
									echo "Home Services :" . $row['home_services'] . "<br />";
									echo "</b>";
									}
									?>
									<a href="update1.php?name=<?php echo $f_usr;?>"><h4>Update Profile</h4></a>
									<a href="change_password1.html"><h4>Change Password</h4></a>
									<a href="index.html"><h4>Logout</h4></a>
									<?php
								
							
						}
					}
				}
				if($a!=1)
					{
						echo "<h1>Invalid Login Id or Password</h1>";
						?>
									<a href="index.html"><h4>Back</h4></a>
									<?php
					}
?>		
			
			
			
			
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
