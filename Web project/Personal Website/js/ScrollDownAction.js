/**
 * Created by shashank on 6/22/2016.
 */


function ScrollDown() {
    var flag1 = document.getElementById("rightDiv");
    var flag2 = document.getElementById("leftDiv");
    var flag3 = document.getElementById("foot1");
    var flag4 = document.getElementById("foot");

    if((2*window.pageYOffset + 2*window.innerHeight)> document.body.offsetHeight )
    {

        flag1.style.transition = "margin-right 0.9s ease-in-out 0.9s";
        flag1.style.marginLeft="20px";
        flag2.style.transition = "margin-left 0.9s ease-in-out 0.9s";
        flag2.style.marginLeft="0px";
        flag4.style.transition = "opacity 2s ease-in-out 0s";
        flag4.style.opacity=1;

        flag3.style.transition = "width 3s ease-in-out 0s";
        flag3.style.width ="920px"

    }
   

}





window.onscroll = ScrollDown;