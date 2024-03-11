import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        int score=0;
        Scanner sc=new Scanner(System.in);
        boolean t;
        do{
            System.out.println("Do you want to play Yes --> true  No-->false");
            t=sc.nextBoolean();
            if(t){
                int userNum;
                double num=  Math.floor(Math.random()*100);
                int chance=5;
                do{
                    System.out.println("Number lo");
                      userNum=sc.nextInt();
                    if(userNum>num){
                        System.out.println("take low");
                        chance--;
                    }
                    else if(userNum==(int) num){
                        System.out.println("You got it");
                        score+=chance;
                    }
                    else{
                        System.out.println("take high");
                        chance--;
                    }
                }while(userNum!=(int)num && chance!=0);
                if(chance==0){
                    System.out.println("Chance khtm bete");
                }
            }
        }while(t==true);
     
        sc.close();
      System.out.println(score);
    }
}