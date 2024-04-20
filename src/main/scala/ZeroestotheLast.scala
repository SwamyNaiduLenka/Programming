object ZeroestotheLast extends App{
    var arr = Array(21,0,1,25,0,22,100,0,0,0,21,1,1,1,0,200)
    var i = 0
    var j = 1
    while (j < arr.length) {
      if (arr(j) != 0) {
        val temp = arr(i)
        arr(i) = arr(j)
        arr(j) = temp
        i += 1
      }
      j += 1
    }

    for (k <- arr) {
      print(k + " ")
    }
  }
