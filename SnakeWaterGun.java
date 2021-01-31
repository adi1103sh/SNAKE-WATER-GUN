package com.company;
import java.util.*;
public class SnakeWaterGun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        char[] ch=new char[3];
        ch[0]='S';
        ch[1]='W';
        ch[2]='G';
        System.out.println("*****RULES*****");
        System.out.println("1. Choose from Snake, Water and Gun\n" +
                "2. S-Snake W-Water G-Gun\n" +
                "3. G wins over S, S wins over W and W wins over G\n" +
                "4. Whosoever(You or Computer) scores 3 points early is the winner\n" +
                "#NOTE: Use uppercase Characters only");
        int us,cs;
        us=cs=0;
        char uc,cc;
        System.out.println("Lets Begin!!!");
        while(us!=3 && cs!=3){
            System.out.print("Enter S, W or G--> ");
            uc=sc.next().charAt(0);
            cc=ch[r.nextInt(3)];
            System.out.println("User: "+uc+" Computer: "+cc);
            if((cc=='S'&&uc=='W')||(cc=='W'&&uc=='G')||(cc=='G'&&uc=='S'))
            {
                System.out.print("Computer Wins!!!     ");
                cs+=1;
            }
            else if((uc=='S'&&cc=='W')||(uc=='W'&&cc=='G')||(uc=='G'&&cc=='S'))
            {
                System.out.print("You Win!!!     ");
                us+=1;
            }
            else
                System.out.print("Draw     ");
            System.out.println("Scoreline-> Computer:You "+cs+":"+us);
        }
        if(us==3)
            System.out.println("HURRAYYYYY!!! YOU WIN");
        else
            System.out.println("BETTER LUCK NEXT TIME, COMPUTER WINS");
    }
}
