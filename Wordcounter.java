package Codesoft;



import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Wordcounter{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        String str = "";

        do {
            System.out.println("this is word counter" + "\n" +
                    "1 for enter words" + "\n" + "2 for input file path"+"\n"+"3 exit code");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("enter the words");
                    str = new String();
                    str = sc.nextLine();

                    break;
                case 2:
                    System.out.println("enter file path");
                    String path = sc.nextLine();
                    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                        str = br.readLine();
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }

                    break;
                case 3:System.exit(1);
                     break;
                default:
                    System.out.println("wrong input");
                    break;


            }

       }while (choice!=1|choice!=2);

        sc.close();

       StringTokenizer stk = new StringTokenizer(str, " ,.;:/\\><");
        int count = stk.countTokens();
        System.out.println("total words will be:" + count);
    }
}
