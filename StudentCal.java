

import java.util.Scanner;

public class StudentCal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many subjects in your college");
        int sub=sc.nextInt();
        int arr[]=new int[sub];

        for(int i=0;i<sub;i++){
            arr[i]=sc.nextInt();
        }   
        int totalMarks=0;
        for(int i=0;i<sub;i++){
            totalMarks+=arr[i];
        }   
        int percentage=totalMarks/sub;
        if(percentage>=90){
            System.out.println("Obtained total marks:- "+totalMarks);
            System.out.println("Obtained percentage:- "+percentage+"%");
            System.out.println("Grade O");
        }
        else if(percentage>80){
            System.out.println("Obtained total marks:- "+totalMarks);
            System.out.println("Obtained percentage:- "+percentage+"%");
            System.out.println("Grade A");
        }
        else if(percentage>70){
            System.out.println("Obtained total marks:- "+totalMarks);
            System.out.println("Obtained percentage:- "+percentage+"%");
            System.out.println("Grade B");
        }
        else if(percentage>60){
            System.out.println("Obtained total marks:- "+totalMarks);
            System.out.println("Obtained percentage:- "+percentage+"%");
            System.out.println("Grade C");
        }
        else if(percentage>50){
            System.out.println("Obtained total marks:- "+totalMarks);
            System.out.println("Obtained percentage:- "+percentage+"%");
            System.out.println("Grade D");
        }
        else{
            System.out.println("Obtained total marks:- "+totalMarks);
            System.out.println("Obtained percentage:- "+percentage+"%");
            System.out.println("Fail");
        }
    }
}