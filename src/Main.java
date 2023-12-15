
class Bank{
  public float getRateOfInterest(){
    System.out.prinln("youre intrest rate is " + 4.75)
  }
}
class Sab extends Bank{
  public float getRateOfInterest(){
   System.out.prinln(4)
}}

git config --global user.email "you@example.com"
git config --global user.name "Your Name"
class Main {
  public static void main(String[] args) {
     Bank obj1 = new Bank()
     obj1.getRateOfInterest()
     System.out.prinln(obj1)

     Sab obj2 = new Sab()
     System.out.prinln(obj1)

  }
}
