import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        int ranNum=(int)(Math.random()*50);
        //System.out.println("RandomNumber :"+ranNum);

        Scanner sc=new Scanner(System.in);
        System.out.println("Guess the num");
        int guess=sc.nextInt();

       while (ranNum!=guess){
          if(guess>ranNum){
                System.out.println("Try smaller");
                guess=sc.nextInt();
          }
          else {
              System.out.println("Try greater ");
              guess=sc.nextInt();
           }
       }
       System.out.println("Congrats!");
    }
}
