import org.scalatest.{FunSuite, Matchers}

class FunctionsTest extends FunSuite with Matchers{

  test("test 1"){
    Functions.CircleArea(10) shouldBe (10*10*Math.PI)
  }

  test("test 2"){
    Functions.testCircle(2) shouldBe(2*2*Math.PI)
  }

  test("test 3"){
    Functions.RectangeAreaCur(2)(3) shouldBe 6
  }

  test("test 4"){
    Functions.testRectangleCur(2, 3) shouldBe 6
  }

  test("test 5"){
    Functions.RectangleArea(5.2, 10.1) shouldBe 52.52
  }

  test("test 6"){
    Functions.testRectangleUc(3.3, 10.1) shouldBe 33.33
  }

}
