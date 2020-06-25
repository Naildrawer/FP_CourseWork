import org.scalatest.{FunSuite, Matchers}

class AnimalTest extends FunSuite with Matchers{

  test("test 1"){
    Animal.knownAnimal("cat") should be (true)
  }

  test("test 2"){
    Animal.apply("dog") shouldBe empty
  }

  test("test 3"){
    Animal.apply("cat").get.eats("meat") shouldBe (true)
  }

}
