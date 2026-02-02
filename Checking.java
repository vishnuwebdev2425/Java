import java.util.Scanner;

class Checking {
    static void gettingresult(int [] a,int []b,int [] c){
        System.out.println("Everything Working ");

    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the  Lenght of First Array :  ");
        int firstarray_length=scan.nextInt();
        int [] a=new int [firstarray_length];
        for(int i=0;i<firstarray_length;i++){
            int value=scan.nextInt();
            a[i]=value;
        }
        System.out.print("Enter the Length of Second Array : ");
        int Secondarray_length=scan.nextInt();
        int [] b=new int[Secondarray_length];
        for(int j=0;j<Secondarray_length;j++){
            int value=scan.nextInt();
            b[j]=value;
        }
        System.out.print("Enter the Length of Third Array : ");
        int ThirdLength=scan.nextInt();
        int [] c=new int [ThirdLength];
        for(int z=0;z<ThirdLength;z++){
            int value=scan.nextInt();
            c[z]=value;
        }

        gettingresult(a,b,c);

    }
}



