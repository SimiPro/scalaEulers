package euler1

object Problem1 extends App {
  var a = 0
  var sum = 0
  for (a <- 1 until 1000) {
    if (a % 3 == 0 || a % 5 == 0) {
      sum += a
    }
  }
  assert(sum == 233168)
  println(sum)
}