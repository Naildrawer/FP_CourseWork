import org.scalatest.{FunSuite, Matchers}

class PatternMatchingTest extends FunSuite with Matchers {

  test("test 1") {
    PatternMatching.intToString(2) shouldBe "it is two"
  }

  test("test 2") {
    PatternMatching.testIntToString(3) shouldBe "it is three"
  }

  test("test 3") {
    PatternMatching.isMaxAndMoritz("Maxz") shouldBe false
  }

  test("test 4") {
    PatternMatching.testIsMaxAndMoritz("max") shouldBe true
  }

  test("test 5") {
    PatternMatching.isEven(7) shouldBe false
  }

  test("test 6") {
    PatternMatching.testIsEven(6) shouldBe true
  }

  test("test 7") {
    PatternMatching.winsA(PatternMatching.Scissor, PatternMatching.Rock) shouldBe PatternMatching.Lose
  }

  test("test 8"){
    PatternMatching.testWinsA(PatternMatching.Scissor, PatternMatching.Rock) shouldBe PatternMatching.Lose
  }

  test("test 9"){
    PatternMatching.extractMammalWeight(PatternMatching.Mammal("cat", PatternMatching.Meat, 5)) shouldBe 5
  }

  test("test 10"){
    PatternMatching.testExtractMammalWeight(PatternMatching.Mammal("cat", PatternMatching.Meat, 5)) shouldBe 5
  }

  test("test 11"){
    PatternMatching.updateFood(PatternMatching.Fish("fish", PatternMatching.Plants)) shouldBe PatternMatching.Fish("fish", PatternMatching.Plants)
  }

  test("test 12"){
    PatternMatching.testUpdateFood(PatternMatching.Fish("fish", PatternMatching.Plants)) shouldBe PatternMatching.Fish("fish", PatternMatching.Plants)
  }
}
