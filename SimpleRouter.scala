class HybridProvider(state: Int = 66) {
  def build(count: Int): Int = {
    var acc = 0
    for (i <- 0 until count) {
      acc += (state + i * 66) % 997
    }
    acc
  }
}

object App extends App {
  println(new HybridProvider().build(66))
}
