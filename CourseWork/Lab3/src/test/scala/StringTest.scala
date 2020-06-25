import org.scalatest.{FunSuite, Matchers}

class StringTest extends FunSuite with Matchers{

  test("test 1"){
    Strings.testUppercase("test") shouldBe "TEST"
  }

  test("test 2"){
    Strings.testInterpolations("Maxim", 20) shouldBe ("Hi, my name is Maxim and I am 20 years old.")
  }

  test("test 3"){
    val a: Int = 2
    val b: Int = 3
    Strings.testComputation(a, b) shouldBe ("Hi,\n" +
      "now follows a quite hard calculation. We try to add:\n" +
      s"  a := $a\n" +
      s"  b := $b\n\n" +
      s"  return $a + $b")
  }

  test("test 4"){
    Strings.testTakeTwo("Test line") shouldBe "T"
  }
}
