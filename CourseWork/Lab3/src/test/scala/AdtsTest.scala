import org.scalatest.{FunSuite, Matchers}

import scala.util.Success


class AdtsTest extends FunSuite with Matchers{

  test("test 1"){
    Adts.testGetNth(List(1, 2, 3, 4, 5, 6), 5) shouldBe Some(6)
  }

  test(" test 2"){
    Adts.Double(Option(1)) shouldBe Some(2)
  }

  test(" test 3"){
    Adts.testDouble(Option(30)) shouldBe Some(60)
  }

  test("test 4"){
    Adts.IsEven(10) shouldBe Right(10)
  }

  test("test 5"){
    Adts.IsEven(-2) shouldBe Right(-2)
  }

  test("test 6"){
    Adts.SafeDivide(15, 5) shouldBe Right(3)
  }

  test("test 7"){
    Adts.testSafeDivide(15, 0) shouldBe Left("Вы не можете делить на ноль")
  }

  test("test 8"){
    Adts.GoodOldJava((i: String) => if(i.equals("done")) 1 else -1, "done") shouldBe Success(1)
  }

}
