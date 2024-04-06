object pattern3 {
    def main(args: Array[String]): Unit = {
      var num =5
      for(i <- 5 to 1 by -1) {
        for (j <- i to 1 by -1) {
          print(j)
          //num = num-1

        }
        println()

      }
    }
  }


