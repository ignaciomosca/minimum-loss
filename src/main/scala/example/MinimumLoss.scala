package example

object MinimumLoss {

  // Time: O(nlogn) Space: O(n)
  def minimumLoss(prices: Array[Long]): Int = {
    val valueToIndex = prices.zipWithIndex.map { case (value, index) => value -> index }.toMap
    val sortedPrices = prices.sorted
    var minLoss = Long.MaxValue
    for {
      i <- 1 until sortedPrices.length
      if valueToIndex(sortedPrices(i-1)) > valueToIndex(sortedPrices(i))
    } {
      minLoss = Math.min(minLoss, sortedPrices(i) - sortedPrices(i-1))
    }
    minLoss.toInt
  }

  // Time: O(2^n) Space: O(n) - Exceeds Time Limit
  def minimumLossRecursive(prices: Array[Long]): Int = minimumLossAux(prices, 0, prices.length - 1, Long.MaxValue)
  def minimumLossAux(prices: Array[Long], left: Int, right: Int, minLoss: Long): Int = if (left < right) {
    if (prices(left) - prices(right) > 0 && prices(left) - prices(right) < minLoss) {
      Math.min(minimumLossAux(prices, left + 1, right, prices(left) - prices(right)), minimumLossAux(prices, left, right - 1, prices(left) - prices(right)))
    } else {
      Math.min(minimumLossAux(prices, left + 1, right, minLoss), minimumLossAux(prices, left, right - 1, minLoss))
    }
  } else {
    minLoss.toInt
  }

}