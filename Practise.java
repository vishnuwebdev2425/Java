class Vishnu{
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