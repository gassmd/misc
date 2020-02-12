var randNum;

function display(val) {
  document.getElementById("guess").value += val;
}

function clearDisplay(){
  document.getElementById("guess").value = "";
}


var newRandom; 
var count = 1;
var userGuesses = []; 

function randNumGen() {
  newRandom = Math.floor(Math.random() * 100);
  console.log(newRandom);
  return newRandom;
}

function guess() {
  var userGuess = document.getElementById("guess").value;
  console.log("guess hit, user guess: " + userGuess);
  console.log("current answer: " + newRandom);
  clearDisplay(); 
  var resultString;
  if (newRandom == userGuess) {
    resultString = "Good Job You Win! the answer is " + newRandom;
    highlightAnswer();
    console.log("good job");
  } else if (newRandom > userGuess) {
    resultString = "No it is higher! Guesses: " + count;
    console.log("The answer is higher! Guesses: " + count);
  } else if (newRandom < userGuess) {
    resultString = "The answer is lower! Guesses: " + count;
    console.log("The answer is lower! Guesses: " + count);
  }
  count++; 
  userGuesses.push(" " + userGuess);
  userGuesses.sort();
  document.getElementById("result").innerHTML = resultString;
  document.getElementById("userGuesses").innerHTML = userGuesses;
  console.log(userGuesses);
}

function highlightAnswer(){
  for (var i = 0; i < userGuesses.length; i++){
    if (userGuesses[i] = newRandom){
      console.log("TEST HIGHLIGHT");
    }
  }
}