object NumAdd extends App {
  var a=311
  var rev =0
  var sum=0
  var rem=0
  while(a!=0){
    rem=a%10;
    rev=rev+rem;
    a=a/10

  }
  println(rev)
}

