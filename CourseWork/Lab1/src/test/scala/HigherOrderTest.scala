import org.scalatest.{FunSuite, Matchers}

class HigherOrderTest extends FunSuite with Matchers{

  test("test 1"){
    HigherOrder.plus(5, 1) shouldBe 6
  }

  test("test 2"){
    HigherOrder.multiply(2, 3) shouldBe 6
  }

  test("test 3"){
    HigherOrder.nTimes(HigherOrder.plus, 5, 6, 7) shouldBe 77
  }

  test("test 4"){
    HigherOrder.testNTimes(HigherOrder.multiply, 1, 1, 1) shouldBe 1
  }

  test("test 5"){
    HigherOrder.testAnonymousNTimes(7, 8, 9) shouldBe 72
  }

}
