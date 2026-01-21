import java.util.Scanner;

class Vishnu {
    public static void main(String[] args){
        int [] arr={3,1,2,4,5};
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            int count=0;
            for(int j=0;j<=arr.length-1;j++){
                if(i==j){
                    continue;
                }else{
                    count+=arr[j];

                }
            }
            if(min>count){
                min=count;
            }else if (count >max) {
                max=count;     
            }
        }


    }
}


class Problem2{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Length of Array");
        int a =scan.nextInt();
        System.out.println();
        int  [] intial=new int [a];
        int [] finalarray =new int [a];
        for (int i=0;i<a;i++){
            System.out.print("Enter the Value : ");
            int value=scan.nextInt();
            intial[i]=value;
            
        }
        for(int i=0;i<a;i++){
            int prod=1;
            for(int j=0;j<a;j++){
                if(i==j){
                    continue;
                }else{
                    prod=prod*intial[j];
                }
            }
            System.out.println(prod);
            finalarray[i]=prod;
        }

        for(int i=0;i<a;i++){
            System.out.print(finalarray[i] + " ");
        }

    }
}