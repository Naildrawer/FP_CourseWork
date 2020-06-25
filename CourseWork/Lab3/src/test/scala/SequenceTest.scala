import org.scalatest.{FunSuite, Matchers}

class SequenceTest extends FunSuite with Matchers{

  test("test 1"){
    Sequence.testLastElement(Seq(1, 2, 3, 4, 5, 6)) shouldBe Some(6)
  }

  test("test 2"){
    Sequence.testZip(Seq(1, 3, 5), Seq(2, 4, 6)) shouldBe List((1, 2), (3, 4), (5, 6))
  }

  test("test 3"){
    Sequence.testForAll(Seq(2, 4, 6, 8, 10))((i: Int) => i % 2 == 0) shouldBe true
  }

  test("test 4"){
    Sequence.testPalindrom(Seq(1, 2, 3, 4, 5, 4, 3, 2, 1)) shouldBe true
  }
}
