import org.scalatest.concurrent.Eventually
import org.scalatest.{FunSuite, Matchers}

class RecursiveDataTest extends FunSuite with Matchers with Eventually{

  test("test 1"){
    RecursiveData.testListIntEmpty(List()) shouldBe false
  }

  test("test 2"){
    RecursiveData.ListIntHead(List()) shouldBe -1
  }

  test("test 3"){
    RecursiveData.testListIntHead(List(1, 2, 3)) shouldBe 1
  }

  test("test 4"){
    RecursiveData.ListNotEmpty(1, Nil) should not be empty
  }

  test("test 5"){
    RecursiveData.ListNotEmpty(1, List(1, 2, 3)) shouldBe List(1, 2, 3)
  }

  test("test 6"){
    val a = new RecursiveData.Tree[Int](new RecursiveData.Tree[Int](null, null, 2), null, 1)
    a.getClass.toString shouldBe "class RecursiveData$Tree"
  }

}
