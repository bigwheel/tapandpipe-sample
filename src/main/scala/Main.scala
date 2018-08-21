import com.github.bigwheel.util.chaining._

object Main {

  def main(args: Array[String]): Unit = {
    val a = 1
    a.tap(println)

    println(a.pipe(_ + 1))
  }
}
