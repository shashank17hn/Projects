/**
 * Created by shashank on 9/6/16.
 */



function showFooter() {
    var flag3 = document.getElementById("foot1");
    var flag4 = document.getElementById("foot");

    flag4.style.transition = "opacity 2s ease-in-out 0s";
    flag4.style.opacity=1;

    flag3.style.transition = "width 3s ease-in-out 0s";
    flag3.style.width ="920px"

}

window.onscroll = showFooter;