package euler20

import stopwatch.Stopwatch

object Problem20 extends App {
  var n = 0
  var number:BigInt = 1
  var sumOfDigits = 0
  var time = Stopwatch.time("Euler Problem 20")({  
    for (n <- 100 to 1 by -1) {
      number = number*n
    }
    number.toString.foreach(digit => {
      sumOfDigits = sumOfDigits + digit.asDigit
    })
  })
  println(time)
  println(sumOfDigits)
  
}