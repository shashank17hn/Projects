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
$name1 = $_GET['name'];

{
?>	
                     <table width="80%">
				 </tr>
                      <tr>
					  <form action="update2.php?change=1& name2=<?php echo $name1;?>" method="post">
                        <td width="145" align="left" valign="top" class="body" id="business_name"><strong>Business Name:</strong></td>
                        <td width="280" align="left" valign="top"><input name="business_name" type="text" size="40" /></td>
						<td><input type="submit" name="submit" value="update" /><td>
						</form>
                      </tr>
                      <tr>
					  <form action="update2.php?change=2& name2=<?php echo $name1;?>" method="post">
                        <td align="left" valign="top" class="body" id="owner_name"><strong>Owner Name:</strong></td>
                        <td align="left" valign="top"><input name="owner_name" type="text" size="40" /></td>
						<td><input type="submit" name="submit" value="update" /><td>
						</form>
                      </tr>
                      <tr>
					  <form action="update2.php?change=3& name2=<?php echo $name1;?>" method="post">
                        <td align="left" valign="top" class="body" id="address"><strong>Address: </strong></td>
                        <td align="left" valign="top"><input name="address" type="text" size="40" /></td>
						<td><input type="submit" name="submit" value="update" /><td>
						</form>
                      </tr>
                      <tr>
					  <form action="update2.php?change=4& name2=<?php echo $name1;?>" method="post">
                        <td align="left" valign="top" class="body" id="phone"><strong> Phone: </strong></td>
                        <td align="left" valign="top"><input name="phone" type="text" size="40" /></td>
						<td><input type="submit" name="submit" value="update" /><td>
						</form>
                      </tr>
					   <tr>
					   <form action="update2.php?change=5& name2=<?php echo $name1;?>" method="post">
                        <td align="left" valign="top" class="body" id="mobile_no"><strong> Mobile No.: </strong></td>
                        <td align="left" valign="top"><input name="mobile_no" type="digit" size="40" /></td>
						<td><input type="submit" name="submit" value="update" /><td>
						</form>
                      </tr>
                      <tr>
					  <form action="update2.php?change=6& name2=<?php echo $name1;?>" method="post">
                        <td align="left" valign="top" class="body" id="email"><strong> Email: </strong></td>
                        <td align="left" valign="top"><input name="email" type="text" size="40" /></td>
						<td><input type="submit" name="submit" value="update" /><td>
						</form>
                      </tr>
					  <tr>
					    <form action="update2.php?change=7& name2=<?php echo $name1;?>" method="post">
                        <td align="left" valign="top" class="body" id="offer"><strong> Offer:</strong></td>
						<td><select name="is_offer">
						<option value="Yes">Yes</option>
						<option value="No">No</option>
						</select><td>
						</tr>
						<tr>
						<td align="left" valign="top" class="body" id="define_offer"><strong> If yes,Define Offer:</strong></td>
                        <td align="left" valign="top"><textarea name="define_offer" cols="32" rows="3"></textarea></td>
						<td><input type="submit" name="submit" value="update" /><td>
						</form>
                      </tr>
                      <tr>
					  <form action="update2.php?change=8& name2=<?php echo $name1;?>" method="post">
                        <td align="left" valign="top" class="body" id="about_business"><strong> About business:</strong></td>
                        <td align="left" valign="top"><textarea name="about_business" cols="32" rows="6"></textarea></td>
						<td><input type="submit" name="submit" value="update" /><td>
						</form>
                      </tr>
					  <form action="update2.php?change=9& name2=<?php echo $name1;?>" method="post">
					  <td align="left" valign="top" class="body" id="about_business"><strong>Home Services:</strong></td>
						<td><select name="service">
						<option value="Yes">Yes</option>
						<option value="Around">Yes,around the business area</option>
						<option value="No">No</option>
						</select></td>
						<td><input type="submit" name="submit" value="update" /><td>
						</form>
					</table>
					<a href="index.html"><h4>Home</h4></a>
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
