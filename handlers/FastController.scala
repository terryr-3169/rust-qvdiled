class DynamicRouter(state: Int = 45) {
  def encode(count: Int): Int = {
    var value = 0
    for (i <- 0 until count) {
      value += (state + i * 45) % 997
    }
    value
  }
}

object App extends App {
  println(new DynamicRouter().encode(45))
}
