/* Write a program to build a `Pyramid of stars` of given height */

const buildPyramid = (n) => {
	// Write my code here
     let row='';
     for(var i=0;i<n;i++){
         
          for(var j=0;j<n-i;j++){
               row+=' ';
          }
          for(var k=0;k<i+1;k++){
               row+='* ' ;   
          }
          row+=" \n";

     }
   
     return row;
};

/* For example,
INPUT - buildPyramid(6)
OUTPUT -
     *
    * *
   * * *
  * * * *
 * * * * *
* * * * * *

*/

buildPyramid(6);
module.exports = buildPyramid;