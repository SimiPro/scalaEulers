package euler6

import stopwatch.Stopwatch
import scala.math._

object Problem6 extends App {
	var stop = Stopwatch.time("Problem 7")({
		var n = 100;
		val sum = 0.5*n*(n+1).toInt;
		var squareOfSum = pow(sum, 2).toInt
		var squareOfDigits = 0
		var counter = 0
		for (counter <- 1 to n) {
		  squareOfDigits = squareOfDigits + pow(counter, 2).toInt
		}
		println(squareOfSum - squareOfDigits)
	})
	println(stop)
}