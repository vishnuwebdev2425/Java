import java.util.Arrays;

class MergingArray{
    static int [] gettingfinalresult(int []a,int [] b){
        int finalsize=a.length+b.length;
        int []c=new int [finalsize];
        int index=0;
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                c[index]=a[i];
                i++;
                index++;
                c[index]=b[j];
                index++;
                j++;
            }else if(a[i]>b[j]){
                c[index]=b[j];
                index++;
                j++;
            }else{
                c[index]=a[i];
                index++;
                i++;
            }
        }
        if(a.length>b.length){
            for(int z=index;z<finalsize;z++){
                c[index]=a[i];
                index++;
                i++;
            }
        }else{
            
            for(int x=index;x<finalsize;x++){
                c[index]=b[j];
                index++;
                j++;
            }

        }
        return c;

    }
    public static void main(String[] args){
        int [] a={3,5,7,9,13};
        int [] b={1,2,3,4,9,15,17,19};
        int [] v=gettingfinalresult(a,b);
        System.out.println("The Final Merging result is  "+ Arrays.toString(v));

    }
}