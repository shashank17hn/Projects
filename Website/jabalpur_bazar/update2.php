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
      <ul>
		<li><a href="index.html">Home</a></li>
		 <li><a href="offer.php?name=Yes">offers</a></li>
        <li><a href="project1.html">Projects</a></li>
        <li><a href="ad1.php">Advertise</a></li>
      </ul>
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

			$change1= $_GET['change'];
			$username1= $_GET['name2'];
			$business_name1= $_POST['business_name'];
			$ownername1= $_POST['owner_name'];
			$address1 =$_POST['address'];
			$phone1=$_POST['phone'];
			$mobile_no1=$_POST['mobile_no'];
			$email1=$_POST['email'];
			$is_offer1=$_POST['is_offer'];
			$define_offer1=$_POST['define_offer'];
			$about_business1=$_POST['about_business'];
			$service1=$_POST['service'];
			
			$con = mysql_connect("localhost","shashank","hanuman");
			if (!$con)
			{
				die('Could not connect: ' . mysql_error());
			}
			
			
			
			if($change1==1)
			{
			
			mysql_select_db("jabalpur_bazar",$con);

             mysql_query("UPDATE `bazar_main` SET 
                         `business_name` = '$business_name1'      
                         WHERE `user_name` = '$username1'"); 
						 
				}			
			else if($change1==2)
			{		echo $username1;
					echo $ownername1;
			mysql_select_db("jabalpur_bazar",$con);

             mysql_query("UPDATE `bazar_main` SET 
                         `owner_name` = '$ownername1'      
                         WHERE `user_name` = '$username1'"); 
			}
			else if($change1==3)
			{
			mysql_select_db("jabalpur_bazar",$con);

             mysql_query("UPDATE `bazar_main` SET 
                         `address` = '$address1'      
                         WHERE `user_name` = '$username1'"); 
			}
			else if($change1==4)
			{
			mysql_select_db("jabalpur_bazar",$con);

             mysql_query("UPDATE `bazar_main` SET 
                         `phone_no` = '$phone1'      
                         WHERE `user_name` = '$username1'"); 
			}
			else if($change1==5)
			{
			mysql_select_db("jabalpur_bazar",$con);

             mysql_query("UPDATE `bazar_main` SET 
                         `mobile_no` = '$mobile_no1'      
                         WHERE `user_name` = '$username1'"); 
			}
			else if($change1==6)
			{
			mysql_select_db("jabalpur_bazar",$con);

             mysql_query("UPDATE `bazar_main` SET 
                         `email_id` = '$email1'      
                         WHERE `user_name` = '$username1'"); 
			}
			
			else if($change1==7)
			{
			mysql_select_db("jabalpur_bazar",$con);

             mysql_query("UPDATE `bazar_main` SET 
                         `offer_available` = '$is_offer1'      
                         WHERE `user_name` = '$username1'"); 
			 mysql_query("UPDATE `bazar_main` SET 
                         `define_offer` = '$define_offer1'      
                         WHERE `user_name` = '$username1'"); 
			}
			else if($change1==8)
			{
			mysql_select_db("jabalpur_bazar",$con);

             mysql_query("UPDATE `bazar_main` SET 
                         `about_business` = '$about_business1'      
                         WHERE `user_name` = '$username1'"); 
			}
			else if($change1==9)
			{
			mysql_select_db("jabalpur_bazar",$con);

             mysql_query("UPDATE `bazar_main` SET 
                         `home_services` = '$service1'      
                         WHERE `user_name` = '$username1'"); 
			}
			
				mysql_select_db("jabalpur_bazar",$con);
				$result=mysql_query("select * from bazar_main");
				while($row=mysql_fetch_array($result))
				{
					if($row["user_name"]==$username1)
					{
						$a=1;
						if($a==1)
						{
								if($row["user_name"]==$username1)
								{   
								
									echo"<h1>Welcome<h1/>";
									echo "<h2>" . $row['owner_name'] . "</h2><br />";
									$con = mysql_connect("localhost","shashank","hanuman");
			if (!$con)
			{
				die('Could not connect: ' . mysql_error());
			}
			mysql_select_db ("jabalpur_bazar",$con);
			@$sql="select * from bazar_image where user_name='$username1'";
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
