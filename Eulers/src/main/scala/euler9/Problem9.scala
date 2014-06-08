package euler9

import scala.math._
import stopwatch.Stopwatch


object Problem9 extends App {
  
  var number = 0
  var rightU = 0
  var rightV = 0
  var stop = Stopwatch.time("Problem9")({
    var v = 0;
    for(v <- 1 to 1000
        if number != 1000) {
      var u = 0
      rightV = v
      for (u<- v+1 to 1000
          if number != 1000) {
    	  number = (pow(u, 2) - pow(v, 2) + (2*u*v) + (pow(u, 2) + pow(v, 2))).toInt
    	  rightU = u
      }
    }
  })
  println("Product of xyz: "+  ((pow(rightU, 2) - pow(rightV, 2)) * (2*rightU*rightV) * (pow(rightU, 2) + pow(rightV, 2))).toInt)
  println(stop)
}