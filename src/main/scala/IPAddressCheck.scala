//You’re given an IP address as an input in the form of a string.
// How would you find out if it is a valid IP address or not?
object IPAddressCheck extends App {

  def isValid(ip: String): Boolean = {
    val parts = ip.split("\\.")

    if (parts.length != 4) {
      return false
    }

    for (part <- parts) {
      val num = part.toInt
      if (num < 0 || num > 255 || (part.length > 1 && part.startsWith("0"))) {
        return false
      }
    }

    true
  }

  val A = "255.255.11.135"
  val B = "255.050.11.5345"

  println(s"Is A valid? ${isValid(A)}") // true
  println(s"Is B valid? ${isValid(B)}") // false
}
