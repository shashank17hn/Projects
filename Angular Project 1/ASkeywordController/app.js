/**
 * Created by shash on 10/23/2016.
 */

var mod = angular.module("mod",[]);
mod.controller("cont1", func1);

function func1() {

    this.val = "First";
}

mod.controller("cont2", func2);

function func2() {


    this.val = "Second"
}