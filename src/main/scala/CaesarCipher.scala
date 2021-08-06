object CaesarCipher extends App{
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val s = "GANG"
  val ds = "HOLY DAY"
  // To encrypt the code
  val Encrypt=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)
  // To decrypt the code
  val Decrypt=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)-key)%a.size)

  val cipher=(algo:(Char,Int,String)=> Char,s:String,key:Int,a:String)=> s.map(algo(_,key,a))
  //Print first encryption and decryption
  //cipher text
  val ct=cipher(Encrypt,s,5,alphabet)
  //plain text
  val pt=cipher(Decrypt,ct,5,alphabet)
  println("Secret Word: " +s)
  println("First Encryption: "+ct)
  println("First Decryption: "+pt)

  println("-----------------------------------------------")
  //Print second encryption and decryption
  //cipher text
  val ct1=cipher(Encrypt,ds,10,alphabet)
  //plain text
  val pt1=cipher(Decrypt,ct1,5,alphabet)
  println("Secret Word: "+ds)
  println("Second Encryption: "+ct1)
  println("Second Decryption: "+pt1)

}
