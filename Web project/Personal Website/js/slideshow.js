
var element1 = document.getElementById("show1");
var element2 = document.getElementById("show1");
var element3 = document.getElementById("show1");
var element4 = document.getElementById("show1");
var element5 = document.getElementById("show1");
var element6 = document.getElementById("show1");
var element7 = document.getElementById("show1");

var flag1 =0; var flag2=0
var array1 = ["PHP","JavaScript","HTML5","CSS3","JSP",".NET"];
var array2 = ["C++","Java","C","C#","PHP","C#"];
var array3 = ["SQL","PostgreSQL","MySQL","SQLServer","SQLite","Oracle"];
var array4 = ["Unix","Linux","Windows","IOS","Android","Ubuntu"];
var array5 = ["Apache","JBoss","NetBeans","VisualStudio","Webstorm","CodeBlock"];
var array6 = ["Hibernate","Spring","Struts","Servlet","Add-in","MVC"];
var array7 = ["C++","Java","C","C#","PHP","C#"];
var element1,element2,element3,element4,element5,element6,element7;
function slideNext1()
{
	flag1 ++;
	element1.style.opacity =0;
	element3.style.opacity =0;
	element5.style.opacity =0;
	element7.style.opacity =0;

	if(flag1 > (array1.length -1))
	{
		flag1 =0;
	}

	setTimeout('slideNow1()',2000);

}
function slideNext2()
{
	flag2 ++;
	element2.style.opacity =0;
	element4.style.opacity =0;
	element6.style.opacity =0;

	if(flag2 > (array2.length -1))
	{
		flag2 =0;
	}

	setTimeout('slideNow2()',4000);
}


function slideNow1()
{

	element1.innerHTML = array1[flag1];
	element3.innerHTML = array3[flag1];
	element5.innerHTML = array5[flag1];
	element7.innerHTML = array7[flag1];

	element1.style.opacity =1;
	element3.style.opacity =1;
	element5.style.opacity =1;
	element7.style.opacity =1;

	setTimeout('slideNext1()',2000);

}
function slideNow2()
{


	element2.innerHTML = array2[flag2];
	element4.innerHTML = array4[flag2];
	element6.innerHTML = array6[flag2];


	element2.style.opacity =1;
	element4.style.opacity =1;
	element6.style.opacity =1;


	setTimeout('slideNext2()',4000);

}

