package euler21

import stopwatch.Stopwatch


object Problem21 extends App {
	var sum = 0
	var time = Stopwatch.time("Problem21")({
	  
	  Stream.from(1).takeWhile(A => A < 10000).foreach(N => {
	    var num = sumOfDivs(N)
	    if (num < 10000) {
	      if (sumOfDivs(num) == N && N != num) sum = sum + num + N
	    }
	  })
	  
	  def sumOfDivs(V:Int):Int = {
	    Stream.from(1).takeWhile(A => A <= V/2).filter(V%_ == 0).sum
	  }
	})
	
	assert(sum/2 == 31626)
	println(sum/2)
	println(time)
}