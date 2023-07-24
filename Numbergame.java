import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {

        System.out.println("This is NumberGame");
        int option, scoreCount=0;
        do {
            System.out.println("Choose your option"+"\n"+"Play :1 Score :2 Exit :3");
            Scanner sc=new Scanner(System.in);
            option=sc.nextInt();

            switch (option){
                case 1:
                    scoreCount=0;int j=8;
                    Random ran=new Random();


                      do {
                          int i = 8;
                          int genNumber = ran.nextInt(1, 100);
                          System.out.println("guess the number b/w 1-100 ");

                          while (i != 0) {

                              System.out.println("you have " + i + " chance left");
                              i--;j--;
                              int guessNumber = sc.nextInt();
                              if (guessNumber > genNumber) {
                                  System.out.println("guessed number is too high");
                              } else if (guessNumber < genNumber) {
                                  System.out.println("guessed number is too low");
                              } else if (guessNumber == genNumber) {
                                  System.out.println("!correct number!" + "\n" + "your current score is:" + ++scoreCount);
                                  j=8;
                                  break;
                              }
                          }

                      }while (j!=0);
                    System.out.println("GAME OVER"+"\n"+"your final score is:"+scoreCount);
                    break;

                case 2:
                    System.out.println("your score is :"+scoreCount);
                    break;

                case 3:
                    System.out.println("Exit game");
                    break;


                default:
                    System.out.println("wrong input");
                    break;
            }


        }while (option!=3);








    }
}

