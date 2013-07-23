package euler2

import stopwatch.Stopwatch

object Problem2 extends App {
	var count = 0;
	
	val stop = Stopwatch.time("Problem2")({
		add(1, 2)
	})
	
	def add(a: Int, b:Int)  {
	  if (b % 2 == 0) {
		  count += b;
	  }
	  var newB = a+b;
	  var newA = b;
	  if (newB < 4000000) {
		 add(newA, newB)
	  }
	}
	assert(4613732 == count)
	println(count)
	println(stop)
}