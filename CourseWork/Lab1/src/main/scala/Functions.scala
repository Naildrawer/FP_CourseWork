object Functions extends App {
  def CircleArea(r: Double): Double = r * r * Math.PI

  def testCircle(r: Double): Double = CircleArea(r)

  def RectangeAreaCur(a: Double)(b: Double) = a * b

  def testRectangleCur(a: Double, b: Double): Double = RectangeAreaCur(a)(b)

  def RectangleArea(a: Double, b: Double): Double = a * b

  def testRectangleUc(a: Double, b: Double): Double = RectangleArea(a, b)
}


