

object casear_cipher extends App {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  
  val Encrypt=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)
  
  val Decrypt=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toUpper)-key)%a.size)

  
val cipher=(algo:(Char,Int,String)=>
Char,s:String,key:Int,a:String)=>
s.map(algo(_,key,a))

val inputText = scala.io.StdIn.readLine("Secret Message: ")

val ct=cipher(Encrypt,inputText,5,alphabet)
val pt=cipher(Decrypt,ct,5,alphabet)


println("Encrypted message is : " + ct)
println("Decrypted message is : " + pt)

}
