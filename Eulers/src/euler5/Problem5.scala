package euler5

import stopwatch.Stopwatch

object Problem5 extends App {
  var max = List(11, 12, 13, 14, 15, 16, 17, 18, 19 ,20)
  var smallestNumber = 0
  var stop = Stopwatch.time("Problem5")({
	  var counter = 0
	  for (counter <- 1 to 1000000000
	      if smallestNumber == 0) {
	    var found = true
	    
	    max.foreach(V => {
	      if (counter%V != 0){
	        found = false
	      } 
	    })
	    if (found) {
	      smallestNumber = counter
	    }
	  }
  })
  assert(232792560 == smallestNumber)
  println(smallestNumber)
  println(stop)
  
}