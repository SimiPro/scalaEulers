package euler12

import scala.annotation.tailrec


object Problem122 extends App {
 
	@tailrec
	def countDivisors(i: Int, n: Int, count:Int = 0):Int = {
	  val end = math.sqrt(n).toInt
	  (n % i) match {
	    case x if n == 1 => 1
	    case x if i >= end  && end * end == n => count + 2
	    case x if i >= end =>  count
	    case 0 => countDivisors(i + 1, n, count + 2)
	    case _ => countDivisors(i + 1, n, count)
	  }
	}
	 
	@tailrec
	def loop(n:Int, limit:Int, i:Int = 1):Int = {
	  countDivisors(1, n) match {
	    case x if x > limit => n
	    case _ => loop(n + i + 1, limit, i + 1)
	  }
	}
 
 	var i =  loop(1, 4) // 76576500
    println(i)
}