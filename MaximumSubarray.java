import java.util.Scanner;

public class MaximumSubarray {
    static int gettinglongestsubarray(int [] a){
        System.out.print("Enter the Targeted Value : ");
        Scanner scan=new Scanner(System.in);
        int targetdvalue=scan.nextInt();
        int maxcount=0;
        for(int i=0;i<a.length-1;i++){
            int checksum=a[i];
            int max_count=0;
            for(int j=i;j<a.length;j++){
                if(i==j){
                    max_count+=1;
                }
                else if (checksum +a[j] == targetdvalue){
                    checksum+=a[j];
                    max_count+=1;

                }
                else if (checksum + a[j]>targetdvalue) {
                    break; 
                }
                else if(checksum + a[j] <targetdvalue ){
                    checksum+=a[j];
                    max_count+=1;

                }

            }
            if(max_count >maxcount){
                maxcount=max_count;
            }
        }
        return maxcount;
        

    }
    public static void main(String[] args){
        System.out.println("Getting Maximum Subarray  ");
        System.out.print("Enter the Length of array  : ");
        Scanner scan=new Scanner(System.in);
        byte value=scan.nextByte();
        int []a=new int [value];
        System.out.println("Enter The Values Inside the Array: ");
        for(int i=0;i<value;i++){
            int nextvalue=scan.nextInt();
            a[i]=nextvalue;
        }
        int finalresult=gettinglongestsubarray(a);
        System.out.print("The Final Results is :" + finalresult);
    }
}
