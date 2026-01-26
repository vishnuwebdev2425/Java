import java.util.Arrays;
import java.util.Scanner;

class Twoarray {
    static int gettingmaximum(int []a){
        int min=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>min){
                min=a[i];
            }
        }
        return min;

    }
    static int gettingminimum(int []a){
        int max=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<max){
                max=a[i];
            }
        }
        return max;

    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the length of an Array : ");
        int length=scan.nextInt();
        int [] a=new int [length];
        System.out.println("Enter the Values : ");
        for(int i=0;i<length;i++){
            int values=scan.nextInt();
            a[i]=values;
        }
        int maximumvalue=gettingmaximum(a);
        int minimumvalue=gettingminimum(a);
        System.out.println("The Maximum Value in an Array is :" +maximumvalue);
        System.out.println("The Minimum Value in an Array is :" +minimumvalue);


    }
    
}

class Common{
    public static void main(String[] args){
        int a[]={3,5,6,8,8,9};
        int b[]={2,3,4,6,7,8,8};
        int i=0;
        int j=0;
        System.out.print("The Common Elements are : ");
        while(i<a.length-1){
            if(a[i]==b[j]){
                System.out.print(a[i]+" ");
                i++;
                j++;
            }else if(a[i]>b[j]){
                j++;
            }else if(b[j]>a[i]){
                i++;
            }
        }
    }
}

class Common2{
    public static void main(String[] args){
        int a[]={3,5,6,8,8,9};
        int b[]={8,8,7,6,3,2,1};
        int i=0;
        int j=b.length-1;
        System.out.print("The Common Elements are : ");
        while(i<a.length-1 && j>0){
            if(a[i]==b[j]){
                System.out.print(a[i]+" ");
                i++;
                j--;
            }else if(a[i]>b[j]){
                j--;
            }else if(b[j]>a[i]){
                i++;
            }
        }
    }
}