package euler7

import scala.math.BigInt

object Problem7 extends App {
	lazy val prims : Stream[Int] =   2 #:: Stream.from(3).
									 filter(i => prims.takeWhile{j => j*j <= i}.
									 forall{k => i % k > 0});

	var toosend = prims.apply(10000)
	assert(104743 == toosend)
	println(toosend)
}