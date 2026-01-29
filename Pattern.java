import java.util.Scanner;

public class Pattern {

    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int value=5;
        for(int i=1;i<=value;i++){
            for(int j=1;j<value-i;j++){
                System.out.print(" ");
            }
            if(i!=1 || i!=value){
                System.out.print("*");
                for(int x=1;x<=i;x++){
                    System.out.print(" ");
                }
                System.out.print("*");

            }
            else if(i==1){
                System.out.print("*");
            }else{
                for(int y=1;j<=value;y++){
                    System.out.print("* ");
                }
            }

            System.out.println();
        }
    }
}


class Second{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Length of Printing Star : ");
        int value=scan.nextInt();
        for(int i=1;i<=value;i++){
            for(int j=1;j<=i;j++){
                if(j==1||j==i||i==value){
                    System.out.print(j+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        
    }
}
