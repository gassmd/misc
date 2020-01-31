function display(val) {
  document.getElementById("guess").value += val;
}

function newRandomGenerate() {
  const rand = Math.floor(Math.random() * 100);
  return new newRandomNumberGenerate();
  console.log(rand);
}

function guess() {
  userGuess = document.getElementById("guess").value;
  var rand;
  if (rand < userGuess) {
    console.log("no its lower!");
  } else if (rand > userGuess) {
    console.log("no its higher!");
  } else if (rand == userGuess) {
    console.log("good job ");
  }
}

function gameLoop() {
  var random = newRandomGenerate();
  var userNumber, score;
}
