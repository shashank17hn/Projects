/**
 * Created by shash on 10/23/2016.
 */


var mod2 = angular.module("mod2",[]);
mod2.controller("con",disp1);

function disp1() {

 console.log("hello from 2")
 this.va = " value from second module ";

}