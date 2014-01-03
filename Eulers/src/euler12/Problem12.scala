package euler12

import scala.math.BigInt

object Problem12 extends App {

  var before = 0
  lazy val triangles:Stream[Int] = Stream.from(1).map(B => {
    var returnz =  B + before
    before = returnz
    returnz
  })
  	var i = 0
  	var result= 0
 	triangles.takeWhile( p => i < 500  /* Till a Number from Stream has > 500 divisors */).foreach(N => {
		 i = 0
		 var end = math.sqrt(N)
	     Stream.from(1).takeWhile(_ <= end).foreach(A =>{
	       if (N%A==0) i += 2		   
	     })
	     result = N
 	})
 	assert(76576500 == result)
}