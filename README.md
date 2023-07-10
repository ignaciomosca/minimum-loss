# Minimum Loss

* First I wrote the recursive solution since it was easier to implement using a functional language such as Scala.
* Since the execution time wasn't great (2^n) and it exceeded the time limit, I decided to optimize it by putting all the values in a map that established a relationship between value and index. Once that was done I iterated over the array checking if the time in which a buy operation was to be executed was smaller than the time to sell. And if that were the case I would update the minimumLoss value.