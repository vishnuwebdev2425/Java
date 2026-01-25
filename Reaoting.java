import java.util.Scanner;

class Reaoting {
    static int gettingfinalresults(int[] a){
        // int max=0;
        // int count=0;
        // for(int i=0;i<a.length-1;i++){
        //     if(a[i]==a[i+1]){
        //         count+=1;
        //         if(max<a[i]){
        //             max=a[i];
        //             count=0;
        //         }
        //     }

        // }
        // if(count!=0){
        //     max=a[a.length-1];
        // }
        // return max;
        int max=0;
        for(int i=a.length-2;i>=0;i--){
            if(a[i]==a[i+1]){
                max=a[i];
                return max;
            }
        }
        return max;
    }

    static int gettingsmallestrepeatingnumber(int[] a){
        int max=-1;
        for(int i=0;i<a.length-2;i++){
            if(a[i]==a[i+1]){
                max=a[i];
                return max;
            }
        }
        if(max==-1){
            if(a[a.length-2]==a[a.length-1]){
                max=a[a.length-1];
                return max;
            }
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
       int finalresult=gettingsmallestrepeatingnumber(a);
       System.out.println(finalresult);
    }
    
}

class Missing{
    static int gettingmissingvalue(int []a){
        int diff=a[1]-a[0];
        for(int i=0;i<a.length-1;i++){
            int distance=a[i+1]-a[i];
            if(diff>=distance){
                diff=distance;
            }
        }
        for(int j=0;j<a.length-1;j++){
            int checking_value=a[j+1]-a[j];
            if(checking_value!=diff){
                return a[j]+diff;
            }
        }
        return -1;
      
    }
    public static void main(String[] args){
        System.out.print("Enter the lenght of an Array : ");
        Scanner scan=new Scanner(System.in);
        int length=scan.nextInt();
        int []a=new int [length];
        System.out.print("enter the Values of an array : ");
        for(int i=0;i<a.length;i++){
            int value=scan.nextInt();
            a[i]=value;
        }
        int missingvalue=gettingmissingvalue(a);
        System.out.println("The Missingvalue in that array is : "+ missingvalue);
    }
}


