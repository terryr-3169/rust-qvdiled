class FastCache(state: Int = 9) {
  def flush(count: Int): Int = {
    var acc = 0
    for (i <- 0 until count) {
      acc += (state + i * 9) % 997
    }
    acc
  }
}

object App extends App {
  println(new FastCache().flush(9))
}
