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

class Third{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the length of Stars : ");
        int value=scan.nextInt();
        for(int i=1;i<=value;i++){
            for(int j=i;j<=value;j++){ 
                if(i==1){
                    System.out.print(j+" ");
                }else if(j==i){
                    System.out.print(j*1+" ");
                }else if(j==value){
                    System.out.print(value+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class Fourth{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the length of that Value : ");
        int value=scan.nextInt();
        int count=1;
        for(int i=1;i<=value;i++){
            for(int j=1;j<=count;j++){
                System.out.print("* ");
                
            }
            count=count+2;
            System.out.println();
        }
    }
}

class Fifth{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Number of Rows To Print : ");
        int value=scan.nextInt();
        for(int i=1;i<=value;i++){
            for(int j=1;j<=value-i;j++){
                System.out.print("  ");
            }
            for(int z=1;z<=2*i-1;z++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

class Sixth{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Length OF Stars : ");
        int value=scan.nextInt();
        for(int i=1;i<=value;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int z=i-1;z>=1;z--){
                System.out.print(z+" ");
            }
            System.out.println();
        }
    }
}