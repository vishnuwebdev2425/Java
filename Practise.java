import java.lang.reflect.Array;
import java.util.Arrays;
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

class Problem2v2{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Lenght Of Array");
        int a =scan.nextInt();
        int [] intialArray=new int [a];
        int [] finalarray=new int[a];
        for(int i=0;i<a;i++){
            System.out.print("Enter the Values : ");
            int value=scan.nextInt();
            intialArray[i]=value;

        }
        int prod=1;
        for (int i=0;i<a;i++){
            prod=prod*intialArray[i];
        }
        for(int i=0;i<a;i++){
            int finalresult=prod/intialArray[i];
            finalarray[i]=finalresult;
        }
        for(int i=0;i<a;i++){
            System.out.print(finalarray[i] +" ");
        }
    }
}

class Problem3{
    static int finaloutput(int[] intialarray){
        System.out.print("Enter the Number To count : ");
        Scanner value=new Scanner(System.in);
        int finalvalue=value.nextInt();
        int count=0;
        for (int i=0;i<intialarray.length;i++){
            if(intialarray[i]==finalvalue){
                count+=1;
            }

        }
        return count;


    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Length Of Number : ");
        int a =scan.nextInt();
        int [] intialarray=new int [a];
        for(int i=0;i<a;i++){
            System.out.print("Enter the Value That need to add : ");
            int number=scan.nextInt();
            intialarray[i]=number;
        }
        int finalresult=finaloutput(intialarray);
        System.out.println("The Count of That Number is : "+ finalresult);



    }
}

class Problem4{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Length of Number : ");
        int length=scan.nextInt();
        int []intialArray=new int [length];
        for(int i=0;i<length;i++){
            System.out.print("Enter the Array Values :  ");
            int addingValue=scan.nextInt();
            intialArray[i]=addingValue;
        }
        int max=0;
        int SecondMax=0;
        for(int i=0;i<length;i++){
            if(intialArray[i] > max){
                SecondMax=max;
                max=intialArray[i];
            }
            else if(intialArray[i]<max && intialArray[i]>SecondMax){
                SecondMax=intialArray[i];

            }
        }
        int finalresult=max+SecondMax;

        System.out.println("The Sum of Two Largest Number is : " + finalresult + " ");
    }
}

class Problem5{
    static int CheckingTwoPairProductMax(int [] intialArray){
       int Firstmax=intialArray[0];
       int SecondMax=Integer.MIN_VALUE;
       for(int i=1;i<intialArray.length;i++){
        if(intialArray[i]>Firstmax){
            SecondMax=Firstmax;
            Firstmax=intialArray[i];
        }
        else if(intialArray[i]<Firstmax && intialArray[i]>SecondMax){
            SecondMax=intialArray[i];
        }
       }
       int SumPair=Firstmax*SecondMax;
       return SumPair;

        
    }

    static int CheckingProductOfTwoMin(int [] intialArray){
        int FirstMin=intialArray[0];
        int SecondMin=Integer.MIN_VALUE;
        for(int i=1;i<intialArray.length;i++){
            if(intialArray[i]<FirstMin){
                SecondMin=FirstMin;
                FirstMin=intialArray[i];
            }
            else if(intialArray[i]<FirstMin && intialArray[i]<SecondMin){
                SecondMin=intialArray[i];
            }
        }
        int SumPair=FirstMin*SecondMin;
        return SumPair;

    }
    static int CheckingProductofMaxAndMin(int [] intialArray){
        int FirstMax=Integer.MIN_VALUE;
        int FirstMin=Integer.MAX_VALUE;
        for(int i=0;i<intialArray.length;i++){
            if(intialArray[i]>FirstMax){
                FirstMax=intialArray[i];
            }
        }
        for(int i=0;i<intialArray.length;i++){
            if(intialArray[i]<FirstMin){
                FirstMin=intialArray[i];
            }
        }
       
        int value=FirstMax * FirstMin;
        return value;
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Lenght Of an Array : ");
        int value=scan.nextInt();
        int []intialArray=new int [value];
        for(int i=0;i<value;i++){
            int adddingvalue=scan.nextInt();
            intialArray[i]=adddingvalue;

        }
        int FirstResult=CheckingTwoPairProductMax(intialArray);
        int SecondResult=CheckingProductOfTwoMin(intialArray);
        int ThirdResult=CheckingProductofMaxAndMin(intialArray);
        if(FirstResult<SecondResult && FirstResult<ThirdResult){
            System.out.println("The Total Sum of Highest Profit is : " + FirstResult);
        }
        else if(SecondResult<ThirdResult){
            System.out.println("The Total Sum of Highest Profit is : " + SecondResult);
        }else{
            System.out.println("The Total Sum of Highest Profit is : " + ThirdResult);
        }
        
    }
}


class Problem6{
    static int gettingresult(int [] a ){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Element to find : ");
        int element =scan.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==element){
                return i;
            }


        }
        return -1;

       

    }
    public static void main(String[] args) {
        int [] a={5,3,1,4,0,5};
        int result=gettingresult(a);
        System.out.println(result);
        
      
    }
}


class Problem7{
    static void gettingpairvalues( int [] a){
        System.out.println("The Array Pair are : ");
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                System.out.println(a[i]+" " +a[j]);

                
            }
        }
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Length of An Array : ");
        int value=scan.nextInt();
        int [] a= new int [value];
        for(int i=0;i<value;i++){
            int addingvalue=scan.nextInt();
            a[i]=addingvalue; 
        }
        gettingpairvalues(a);


    }
}