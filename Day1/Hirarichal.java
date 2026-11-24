class Parent{
    void name(){
        System.out.println("Printing Parent");
    }
}
class Child extends Parent{

}
class Child2 extends Parent{

}
class Hirarichal{
   public static void main(String[]args){
    Child ch = new Child();
    ch.name();
   }
}

