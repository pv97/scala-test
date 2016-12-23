package funsets

object Main extends App {
  import FunSets._
  println(contains(diff(union(singletonSet(1),singletonSet(2)),singletonSet(2)), 2))
}
