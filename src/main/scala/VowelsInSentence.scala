object VowelsInSentence extends App {
  // Count the number of vowels in a given string using a "for" loop
  var sentence = "India is developing country"
  var count = 0

  for (i <- 0 until sentence.length) {
    if (sentence(i) == 'a' || sentence(i) == 'e' || sentence(i) == 'i' || sentence(i) == 'o' || sentence(i) == 'u') {
      count = count + 1
    }
  }

  println(s"The number of vowels in the sentence is: $count")
}

