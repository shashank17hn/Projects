/**
 * Created by shash on 10/24/2016.
 */

var mod = angular.module("mod",[]);
mod.controller("cont", create);

function create()
{
    this.arr = ["nothing"];
    this.flag = true;

    this.add = function()
    {
        this.arr.push(this.TextValue);
        this.TextValue ="";   // this is added so that after adding value ro list textbox becomes empty

    }


    this.delete = function (index) {

        this.arr.splice(index,1);  // for deleting value

    }

    this.toggle = function ()
    {
        this.flag = !this.flag;  // for toggling value of flag used for ng hide and ng show
    }
}