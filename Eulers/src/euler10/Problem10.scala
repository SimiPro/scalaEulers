package euler10

import scala.collection.immutable.Stream
import scala.math._
import stopwatch.Stopwatch._

object Problem10 extends App {

	var endSum = 0L;
	var stop =	time("Problem10")({
	    lazy val prims: Stream[Int] = 2 #:: Stream.from(3).filter(
			  p => prims.takeWhile{fp => fp*fp <= p }.forall(A => p%A !=0))
	    val sum = prims.takeWhile(_ < 2000000).foldLeft(0L)(_ + _)
	    endSum = sum
	})
	assert(142913828922L == endSum)
	println(endSum)
	println(stop)

  

  
}