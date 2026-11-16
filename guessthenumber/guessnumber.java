import java.util.Scanner;

public class guessnumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int mynumber = (int)(Math.random()*100);
        int usernumber=0;

        do{
            System.out.println("guess my number (1-100)  : ");
            usernumber = sc.nextInt();
            if(usernumber == mynumber){
                System.out.println("wahooo..... correct number");
                break;
            }
            else if(usernumber > mynumber) {
                System.out.println("your numbe is too large  ");
            }
            else{
                System.out.println(" your number is too small ");
            }

        }
        while(usernumber >= 0);

        System.out.print("my number was : ");
        System.out.println(mynumber);
        sc.close();
    }
}