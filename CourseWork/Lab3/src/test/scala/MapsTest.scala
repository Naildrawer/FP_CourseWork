import org.scalatest.{FunSuite, Matchers}

import scala.collection.mutable

class MapsTest extends FunSuite with Matchers{

  test("test 1"){
    val t = new Maps.User("Kirill", 20)
    t.name shouldBe "Kirill"
    t.age shouldBe(20)
  }

  test("test 2"){
    Maps.testGroupUsers(Seq(Maps.User("Kir", 20), Maps.User("ill", 19))) shouldBe mutable.HashMap("ill" -> 19, "Kir" -> 20)
  }

  test("test 3"){
    Maps.testNumberFrodos(Map("a" -> Maps.User("Adam", 1), "b" -> Maps.User("Kir", 20), "c" -> Maps.User("ill", 19))) shouldBe 1
  }

  test("test 4") {
    Maps.testUnderaged(Map("a" -> Maps.User("Adam", 40), "b" -> Maps.User("Kir", 20), "c" -> Maps.User("ill", 19))) should not be empty
  }
}
