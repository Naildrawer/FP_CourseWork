import org.scalatest.{FunSuite, Matchers}

class CompositionsTest extends FunSuite with Matchers{

  test("test 1"){
    Compositions.testCompose((i:Int) => "Comp" * i)((i: String) => i * 2)((i:String) => i.dropRight(3))(2) should be ("CompCompCompC")
  }

  test("test 2"){
    Compositions.testMapFlatMap((i:Int) => if (i > 0) Some(i) else None)((i:Int) => if (i > 10) Some(i) else None)((i:Int) => i + 2)(Some(11)) shouldBe Some(13)
  }

  test("test 3"){
    Compositions.testForComprehension((i:Int) => if (i > 0) Some(i) else None)((i:Int) => if (i > 10) Some(i) else None)((i:Int) => i - 2)(Some(9)) shouldBe empty
  }

}
