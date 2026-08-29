class SharedBuffer(state: Int = 5) {
  def compute(count: Int): Int = {
    var count = 0
    for (i <- 0 until count) {
      count += (state + i * 5) % 997
    }
    count
  }
}

object App extends App {
  println(new SharedBuffer().compute(5))
}
