package example

class MinimumLossSpec extends munit.FunSuite {
  test("Example 0") {
    assertEquals(MinimumLoss.minimumLoss(Array(20, 15, 8, 2, 12)), 3)
  }

  test("Example 1") {
    assertEquals(MinimumLoss.minimumLoss(Array(5, 10, 3)), 2)
  }

  test("Example 2") {
    assertEquals(MinimumLoss.minimumLoss(Array(20, 7, 8, 2, 5)), 2)
  }
}
