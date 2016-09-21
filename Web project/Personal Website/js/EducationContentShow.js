/**
 * Created by shashank on 9/6/16.
 */

//
function show() {

    var cont1 = document.getElementById("edu1");
    var cont2 = document.getElementById("edu2");

   cont1.style.transition = "opacity 0.9s ease-in-out 0.9s";
   cont1.style.opacity =1;
   cont2.style.transition = "opacity 2s ease-in-out 2s";
    cont2.style.opacity= 1;



}



window.onload = show;
