class XYZ{
    int a=10;
    int b=20;
    int show(){
        int c=a+b;
        return c;
    }
    int anotherShow(int f,int g,int h){
        int value1=f;
        int value2=g;
        int value3=h;
        int final_result=value1+value2+value3;
        return final_result;

    }
}

public class Another {
    public static void main(String[] args){
        XYZ last=new XYZ();
        int value=last.show();
        int final_results=last.anotherShow(10, 20, 30);
        System.out.println(final_results);
    }
}