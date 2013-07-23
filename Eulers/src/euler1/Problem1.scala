package euler1

import stopwatch.Stopwatch

object Problem1 extends App {
  var a = 0
  var sum = 0
  val stop = Stopwatch.time("Problem1")({
	  for (a <- 1 until 1000) {
	  if (a % 3 == 0 || a % 5 == 0) {
    	sum += a
	  }
  	}
  })
  assert(sum == 233168)
  println(sum)
  println(stop)
}