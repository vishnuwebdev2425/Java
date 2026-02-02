class Calculator{
    static int z=10;
    static{
        System.out.println(z);
    }
    int a;
    int b;
    int c;
    public Calculator(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("Everything Work Fine");

    }

    public void Show(){
        System.out.println(a);
    }

}

public class fork {
    public static void main(String args[]){
        System.out.println("Everything Work Fine ");
        Calculator cal=new Calculator(10,10,39);
        cal.Show();
    }
    
}
