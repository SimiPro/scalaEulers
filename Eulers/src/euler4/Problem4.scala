package euler4

import stopwatch.Stopwatch
import scala.math._
import scala.util.control.Breaks._

object Problem4 extends App {
  var digits = 3
  var max = pow(10, digits).toInt - 1
  var counter = 0
  var largestNumber = 0
  var stop = Stopwatch.time("Problem4")({
    breakable( {
    	for(counter <- max until 1 by -1 
    	    if largestNumber < max * counter) {
    	  var counter2 = 0
    	  for (counter2 <- max until 1 by -1) {
    	    breakable({
    	    var number = counter * counter2
    	    if (largestNumber> number) {
    	      break
    	    }
    		var col = number.toString.map(_.asDigit)
    			var numberIndex = 0
    			var found = true
    			breakable({
    			  var size = col.size -1
    			  for (numberIndex <- 0 to size/2) {
    			    if (col.apply(numberIndex) != col.apply(size  - numberIndex)){
    			      found = false
    			      break
    			    }
    			  }
    			})
    	    	if (found) {
    	    	  if (largestNumber < number) {
    	    		  largestNumber = number
    	    	  }
				}
    	    })
    	  }
    	}
    })
  })
  assert(906609 == largestNumber)
  println(largestNumber)
  println(stop)
}