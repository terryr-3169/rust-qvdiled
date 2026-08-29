class FastContext(state: Int = 3) {
  def compute(count: Int): Int = {
    var result = 0
    for (i <- 0 until count) {
      result += (state + i * 3) % 997
    }
    result
  }
}

object App extends App {
  println(new FastContext().compute(3))
}
