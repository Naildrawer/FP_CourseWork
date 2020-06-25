import org.scalatest.{FunSuite, Matchers}

class RecursiveFunctionsTest extends FunSuite with Matchers{

  test("test 1"){
    RecursiveFunctions.length(List("test")) shouldBe 1
  }

  test("test 2"){
    RecursiveFunctions.reverse(List(1, 2, 3, 4)) shouldBe List(4, 3, 2, 1)
  }

  test("test 3"){
    RecursiveFunctions.testReverse(List(1, 2)) shouldBe List(2, 1)
  }

  test("test 4"){
    RecursiveFunctions.Map(List(1, -2, 3, -4, 5))((i:Int) => if(i < 0) i * -1 else i ) shouldBe List(1, 2, 3, 4, 5)
  }

  test("test 5"){
    RecursiveFunctions.testMap((List(1, -2, 3, -4, 5)), ((i:Int) => if(i < 0) i * -1 else i )) shouldBe List(1, 2, 3, 4, 5)
  }

  test("test 6"){
    RecursiveFunctions.Append(List(1, 2, 3), List(4, 5, 6)) shouldBe List(1, 2, 3, 4, 5, 6)
  }

  test("test 7"){
    RecursiveFunctions.testAppend(List(), List()) shouldBe empty
  }

  test("test 8"){
    RecursiveFunctions.FlatMap(List(1, -2, 3, -4, 5))((i:Int) => List(i)) shouldBe List(List(1), List(-2), List(3), List(-4), List(5))
  }

  test("test 9"){
    RecursiveFunctions.testFlatMap(List(1, -2, 3, -4, 5),((i:Int) => List(i))).size shouldBe 5
  }
}
