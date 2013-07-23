package euler3

import stopwatch.Stopwatch
import scala.collection.parallel.mutable.ParArray
import scala.math._
import scala.collection.immutable.Nil

object Problem3 extends App {
	var prime = 600851475143.0; 
	var wurzelN = sqrt(prime).toInt
	var latestPrime = 0
	var stop = Stopwatch.time("Problem3")({
		var net = createListOfNumbers()
		markNotPrimeNumbers(2, net, 0)
		net.foreach(V =>  {
		  if (V.prime) {
			while(prime % V.pNumber == 0) {
			  prime /= V.pNumber
			  latestPrime = V.pNumber
			}
		  }
		})
	})
	assert(6857 == latestPrime)
	println(latestPrime)
	println(stop)
	
	
	def markNotPrimeNumbers(prime: Int, net: Array[PotentialPrime], index: Int) {
	  var notAlreadyRemembered = true
	  var nextIndex = index
	  var size = net.size
	  var counter = 0
	  var nextPrime = prime
	  while(nextPrime != 0) {
		  var prime = nextPrime
		  var actualIndex = nextIndex
		  nextPrime = 0
		  for (counter <- actualIndex to size-1) {
			  var e =  net.apply(counter)
			  if (e.pNumber != prime && e.pNumber % prime== 0) {
		    		e.prime = false
				} else if (notAlreadyRemembered && !e.visited && e.prime) {
				  nextPrime = e.pNumber
				  nextIndex = e.index
				  e.visited = true
				  notAlreadyRemembered = false
			}
		  }
	  }
	}
  
	def createListOfNumbers(): Array[PotentialPrime] = {
		var possibleNumbers = new Array[PotentialPrime](wurzelN/2);
		var a = 0
		var index = 1
		possibleNumbers.update(0, new PotentialPrime(2, 0))
		for (a <- 3 to wurzelN - 1) {
			if (a%2 != 0) {
				possibleNumbers.update(index, new PotentialPrime(a, index));
				index += 1
			}
		}
		possibleNumbers
	}
	
	class PotentialPrime(number: Int, indexC: Int) {
	  var pNumber = number
	  var prime = true
	  var visited = false
	  var index = indexC
	}
  
}