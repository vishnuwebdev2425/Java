class Checking{
    int a;
    int b;
    Checking(){
        a=10;
        b=20;
    }
    Checking(int a,int b){
        this();
    }
    void print(){
        System.out.print(a);
    }
}

class Constructor {

    public static void main(String[] args) {
        Checking c=new Checking();
        c.print();

    }   
}
