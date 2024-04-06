object PalindromeNo extends App {
  var a=121
  var rev =0
  var num=a
  var rem=0
  while(a!=0){
    rem=a%10
    rev=rev*10+rem
    a=a/10

  }
 if(rev==num){
   println(s"Number $num is Palindrome")
 }
  else{
    println(s"Number $num is not a Palindrome")
  }
}
