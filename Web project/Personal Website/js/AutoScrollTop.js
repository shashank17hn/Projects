/**
 * Created by shashank on 6/23/2016.
 */



var scrollY = 0;
var distance = 40;
var speed = 24;

function resetScroller(el){
    var currentY = window.pageYOffset;
    var targetY = document.getElementById(el).offsetTop;
    var animator = setTimeout('resetScroller(\''+el+'\')',speed);
    if(currentY > targetY){
        scrollY = currentY-distance;
        window.scroll(0, scrollY);
    } else {
        clearTimeout(animator);
    }
}
