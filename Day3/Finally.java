public class Finally{
  public static void main(String[]args){

       try {
         String num = "abc";
         int number = Integer.parseInt(num);
         System.out.println(number);

      } catch (NumberFormatException var3) {
         System.out.println("Number is out");
      }
      finally{
        System.out.println("sandy is my bestie");
      }
    }
  }
  

   



