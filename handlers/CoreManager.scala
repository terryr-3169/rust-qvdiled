class LocalClient(state: Int = 97) {
  def compute(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 97) % 997
    }
    value
  }
}

object App extends App {
  println(new LocalClient().compute(97))
}
