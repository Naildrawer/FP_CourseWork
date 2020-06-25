import org.scalatest.{FunSuite, Matchers}
import program.Typeclasses

class TypeclassesTest extends FunSuite with Matchers{

  test("test 1"){
    Typeclasses.reverse("test":String)(Typeclasses.Reversable.ReversableString) shouldBe "tset"
  }

  test("test 2"){
    Typeclasses.testReversableString("test message") shouldBe "egassem tset"
  }

  test("test 3"){
    Typeclasses.smash(20.3, 0.7)(Typeclasses.Smash.SmashDouble) shouldBe 21
  }

  test("test 4"){
    Typeclasses.testSmashInt(20, 3) shouldBe 23
  }

  test("test 5"){
    Typeclasses.testSmashDouble(3, 3) shouldBe 6
  }

  test("test 6"){
    Typeclasses.testSmashString("te", "st") shouldBe "test"
  }

  test("test 7"){
    Typeclasses.Reversable.ReversableString.reverse("message") shouldBe "egassem"
  }

  test("test 8"){
    Typeclasses.Smash.SmashInt.smash(10, 1) shouldBe 11
  }

  test("test 9"){
    Typeclasses.Smash.SmashDouble.smash(2, 9.1) shouldBe(11.1)
  }

  test("test 10"){
    Typeclasses.Smash.SmashString.smash("test ", "line") shouldBe "test line"
  }

}
