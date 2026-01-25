class Calculator{
    int add(int x,int y){
        return x+y;
    }
    float add(int x,float y){
        return x+y;
    }
    int add(int x,int y,int z){
        return x+y+z;
    }
    double add(int x,float y,double z){
        return x+y+z;
    }
}

class MethodOver {
    public static void main(String[] args){
        Calculator calc=new Calculator();
        int a=10;
        float b=10.5f;
        double c=100.6;
        System.out.println(calc.add(a, a));
        System.out.println(calc.add(a, a,a));
    }
    
}
//The Process OF Creating Multiple Methods inside a Class with the same method name is known as Method Overloading
//Method Overloading also Called as Virtual Polymorphism
//Virtual means not true polymorphism means 1:Many
//For Human its the only one Method add which is doing everything but behind the scence its have many types