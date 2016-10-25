/**
 * Created by shash on 10/23/2016.
 */
var mod = angular.module("mod",[]);
mod.controller("cont", calculation);

function calculation() {

    this.result =0;
   this.operation = function(oper)
    {
        this.opt = oper;
    }

    this.calculate = function()
    {
        var num1 = parseFloat(this.val1);
        var num2 = parseFloat(this.val2);

      if(this.opt === '+')
      {
          this.result = num1 +num2;
      }

      else if(this.opt === '-')
      {
          this.result = num1 -num2;;
      }

      else if(this.opt === '*')
      {
          this.result = num1 *num2;
      }

      else if(this.opt === '/')
      {
          this.result = num1 /num2;;
      }
      else
      {
          this.result = "Select operation ";
      }
    }

}
