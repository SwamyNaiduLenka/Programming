//Given a list of n-1 integers, and these integers are in the range of 1 to n.
// There are no duplicates in the list. One of the integers is missing in the list.
// Can you write an efficient code to find the missing integer?


object MissingNumInSequence extends App {

  def search_missing_number(list_num: List[Int]): Integer = {
    val n = list_num.length
    //checks
    if (list_num(0) != 1)
    return 1
    if (list_num(n - 1) != (n + 1))
    return n + 1

    var total = (n + 1) * (n + 2) / 2
    var sum_of_L = list_num.sum
    return total - sum_of_L

  }

  val num_list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13)
  print("The missing number is", search_missing_number(num_list))

}

