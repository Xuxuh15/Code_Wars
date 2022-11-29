function squareDigits(num){
  const solution = []; //array to store solution to answer
  const length = `${num}`.length; //get length of integer for the for loop
  let temp = 0;
  for(let i = 0; i < length; i++){
    temp = num % 10;  //grab the rightmost digit
    solution[length - 1 - i] = (temp*temp);  //square rightmost digit and add it to the front of array
    num = Math.floor(num/10);   //remaining digits of the integer
    
  }
  num = Number(solution.join(""));  //converst solution array into a integer
  return num;
}
