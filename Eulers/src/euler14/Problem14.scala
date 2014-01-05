package euler14

import scala.annotation.tailrec
import stopwatch.Stopwatch

object Problem14 extends App {

  var highest = (0,0)
  var time = Stopwatch.time("Problem14")({
	Stream.from(1).takeWhile(_ < 1000000).foreach(N => {
				  var rounds = collatz(N, 0)
				  save(N, rounds)
	 })
	println("Number: " + highest._2 + " Rounds: " + highest._1)
  })
  println(time)
  
  
  @tailrec
  def collatz(number: Long, round:Int): Int = {
    number match {
      case 1 => round
      case x if (x%2 == 0) => collatz(number/2, round+1)
      case _ => collatz(number*3+1, round+1) 
    }
  }
  
  def save(number: Int, rounds: Int) {
    if (highest._1 < rounds) {
      highest = (rounds, number)
    }
  }
  
}