import java.util.Scanner;

class Reaoting {
    static int gettingfinalresults(int[] a){
        int max=0;
        int count=0;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                count+=1;
                if(max<a[i]){
                    max=a[i];
                    count=0;
                }
            }

        }
        if(count!=0){
            max=a[a.length-1];
        }
        return max;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Length Of an Array : ");
        int value=scan.nextInt();
        int length=new Integer(value);
        int [] a=new int [length];
        System.out.print("enter the values : ");
       for(int i=0;i<length;i++){
        int input=scan.nextInt();
        a[i]=input;
       }
       int result =gettingfinalresults(a);
       System.out.println("The Maximum Element is : " + result);
    }
    
}
