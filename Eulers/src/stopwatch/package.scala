package object stopwatch {

  class StopWatch {
    var startTime = System.currentTimeMillis();
    var elapsedTime: Long = 0;
    
    def start = {
      startTime = System.currentTimeMillis(); 
      elapsedTime = 0;
    }
    
    def stop = {
      elapsedTime = System.currentTimeMillis() - startTime;
    }

    override def toString = "elapsed time: " + elapsedTime + " milliseconds";
  }
  
  object Stopwatch {
    def apply() : StopWatch = new StopWatch();
    
    def time(tag: String) (f: => Unit): StopWatch = {
      val sw = Stopwatch()
      f
      sw.stop
      sw
    }
  }
  
}