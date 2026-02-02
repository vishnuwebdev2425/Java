import java.util.Arrays;
import java.util.Scanner;

public class Exx {
    
    static int [] gettingresult(int [] a,int []b,int [] c){
      int final_length=a.length+b.length+c.length;
      int [] finalarray=new int [final_length];
      int count=0;
      int index=0;
      while(count <a.length && count <b.length && count <c.length){
        finalarray[index]=a[count];
        index++;
        finalarray[index]=b[count];
        index++;
        finalarray[index]=c[count];
        index++;
        count++;

      }
  
      while(count <b.length){
          finalarray[index]=b[count];
          index++;
          finalarray[index]=c[count];
          index++;
          count++;

      }
      while(count < c.length){
        finalarray[index]=c[count];
        count++;
        index++;
      }

      return finalarray;
      
        

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

        int []finalintarray=gettingresult(a,b,c);
        System.out.println(Arrays.toString(finalintarray));

    }
   
    
}




import java.util.*;
public class Merging {
	static int [] gettingfinaloutput(int [] firstarray,int [] Secondarray,int [] Thirdarray) {
		System.out.print("Everything Work Fine ");
		int finalcount=firstarray.length +Secondarray.length+Thirdarray.length;
		int [] finalarray=new int[finalcount];
		int index=0;
		int pos=0;
		while(index < finalcount) {
			if(firstarray.length > pos) {
				finalarray[index]=firstarray[pos];
				index++;
				
			}
			if(Secondarray.length >pos) {
				finalarray[index]=Secondarray[pos];
				index++;
			}
			if(Thirdarray.length >pos) {
				finalarray[index]=Thirdarray[pos];
				index++;
			}
			pos++;
		}
		
		return finalarray;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Length OF the First Array : ");
		int firstvalue=scan.nextInt();
		int [] firstarray=new int [firstvalue];
		for(int i=0;i<firstvalue;i++) {
			int value=scan.nextInt();
			firstarray[i]=value;	
		}
		System.out.print("Enter the Length OF the Second Array : ");
		int Secondvalue=scan.nextInt();
		int [] Secondarray=new int [Secondvalue];
		for(int i=0;i<Secondvalue;i++) {
			int value=scan.nextInt();
			Secondarray[i]=value;	
		}
		System.out.print("Enter the Length OF the Third Array : ");
		int Thirdvalue=scan.nextInt();
		int [] Thirdarray=new int [Thirdvalue];
		for(int i=0;i<Thirdvalue;i++) {
			int value=scan.nextInt();
			Thirdarray[i]=value;	
		}
		
		 int [] lastarray=gettingfinaloutput(firstarray,Secondarray,Thirdarray);
		 System.out.println("The Final Got Printed is :" +Arrays.toString(lastarray));
	}

}
