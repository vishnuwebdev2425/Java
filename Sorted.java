import java.util.Scanner;

public class Sorted {
    static void gettingresult(int [] a){
        int count=1;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                count+=1;
            }else{
                System.out.println(a[i]+"-"+count);
                count=1;
            }
        }
        if(a[a.length-1]!=a[a.length-2]){
            System.out.println(a[a.length-1]+" - "+"1");
        }

    }
    public static void main(String[] args){
        int [] a={2,2,3,4,4,4,23};
        gettingresult(a);
    }
    
}


class AnotherClass{
    static void getttingoutput(int [] a){
        int count=1;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                count+=1;
            }else{
                System.out.print(a[i]+ " ");
            }
        }
        System.out.print(a[a.length-1]);
    }
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Length of Array : ");
        int length=scan.nextInt();
        int []a=new int [length];
        System.out.println("Enter the values");
        for(int i=0;i<length;i++){
            int finalvalue=scan.nextInt();
            a[i]=finalvalue;
        };
        getttingoutput(a);
    }
}

class InnerSorted {
    static void gettinglastresponse(int [] a){
        int count=1;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                count+=1;
            }else{
                if(count==1){
                    System.out.print(a[i]+" ");
                }else{
                    count=1;
                }
            }

        }
        if(count==1){
            System.out.print(a[a.length-1]);
        }

    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Length of Array : ");
        int length=scan.nextInt();
        int []a=new int [length];
        System.out.println("Enter the values");
        for(int i=0;i<length;i++){
            int finalvalue=scan.nextInt();
            a[i]=finalvalue;
        };
        gettinglastresponse(a);

    }

    
}