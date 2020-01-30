/* --todo--
- fix clear
- clear display on next number
- functions

*/

function display(val) {
  document.getElementById("result").value += val;
  console.log("displayed number " + val);
}

function clearDis() {
  console.log("cleared display");
  document.getElementById("result").value = " ";
}

function storeNum1() {
  var num1 = document.getElementById("result").value;
  console.log("stored " + num1 + " as 'num1'");
  clearDis();
  return num1;
}

function storeNum2() {
  var num2 = document.getElementById("result").value;
  console.log("2nd stored " + num2);
  return num2;
}

function operation(op) {
  const num1 = storeNum1();
  if (num1) {
    const num2 = storeNum2();
  }
  var ans;
  switch (op) {
    case "+":
      ans = num1 + num2;
      console.log(op + " stored, " + num1 + " stored");
      break;
    case "-":
      ans = num1 - num2;
      console.log(op + " stored, + " + num1 + " stored");
      break;
    case "*":
      ans = num1 * num2;
      console.log(op + " stored, + " + num1 + " stored");
      break;
    case "/":
      ans = num1 / num2;
      console.log(op + " stored, + " + num1 + " stored");
      break;
  }

  return ans;
}

function equals() {
  document.getElementById("result").value = operation("-");
  console.log(operation("-"));
}
