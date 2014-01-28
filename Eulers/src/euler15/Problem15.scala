package euler15

import stopwatch.Stopwatch


object Problem15 extends App {

  
  val GRIDSIZE = 20
  var grid = Array.ofDim[Long](GRIDSIZE+1, GRIDSIZE+1)
  var time =  Stopwatch.time("Problem15")({
    
    // Init the Grid
    for (i <- 0 until grid.length) {
      grid.apply(i).update(GRIDSIZE, 1)
      grid.apply(GRIDSIZE).update(i,1)
    }
    for (i <- GRIDSIZE-1 to 0 by -1) {
      for (j <- GRIDSIZE -1 to 0 by -1) {
        grid.apply(i).update(j, grid.apply(i).apply(j+1) + grid.apply(i+1).apply(j))
      }
    } 
  })
  println(grid.apply(0).apply(0))
  println(time)
}
