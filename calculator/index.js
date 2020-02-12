/* --todo--
- fix clear
- clear display on next number
- functions

*/

var num1, op, num2, ans;
var eqnString;
var testEquation = new Array();

function display(val) {
  document.getElementById("result").value += val;
  document.getElementById("equation").value += val;
  console.log("displayed number " + val);
}

function clearDis() {
  document.getElementById("result").value = "";
  console.log("cleared display");
}

function clearAll(){
  testEquation.splice(0, testEquation.length);
  clearDis();
  document.getElementById("equation").value = "";

}

function storeNum() {
  num1 = document.getElementById("result").value;
  console.log("stored " + num1 + " as 'num1'");
  return num1;
}

function storeOperation(op) {
    storeNum(); 
    document.getElementById("equation").value += op;
    console.log("stored operation: " + op);
    console.log(num1 + "    " + op)
    clearDis();
    testEquation.push(num1);
    testEquation.push(op);
    console.log(testEquation);
}


  


function displayEquation(){
  console.log(testEquation);
  for (i = 0; i < testEquation.length; i++)
   document.getElementById("equation").innerHtml = ((i+1) + ": " + testEquation[i]);

}

function equals() {
  storeNum();
  testEquation.push(num1);
  displayEquation();
  testEquals();
}

function testEquals(){
  console.log(testEquation.join(""));
  var newAns = eval(testEquation.join("")); 
  console.log(newAns); 
  document.getElementById("result").value = newAns;
  displayAnswer();
}

function displayAnswer(){
  console.log("display answer");
  document.getElementById("result").innerHTML = "Hello World";
}


 /* var testOp, testNum1, testNum2, testAns;
  for (i = 0; i < testEquation.length; i++){
    if (testEquation[i] == "*" || testEquation[i] == "/"){
      testOp = testEquation[i];
      console.log(testOp + " at position " + i);
      testNum1 = testEquation[i-1];
      testNum2 = testEquation[i+1];
      console.log(testEquation);
      console.log("stored numbers: " + testNum1 + "," + testNum2);
      testAns = eval(testNum1+testOp+testNum2); 
      document.getElementById("result").value = testAns;
      console.log(testAns); 
      console.log(testEquation);
      //testEquation[i] == testAns;
      
    }
    else if (testEquation[i] == "+" || testEquation[i] == "-"){
      testOp = testEquation[i];
      console.log(testOp + " at position " + i);
      testNum1 = testEquation[i-1];
      testNum2 = testEquation[i+1];
      console.log("stored numbers: " + testNum1 + "," + testNum2);
      testAns = eval(testNum1+testOp+testNum2); 
      document.getElementById("result").value = testAns;
      console.log(testAns); 
    }
  }
}*/
