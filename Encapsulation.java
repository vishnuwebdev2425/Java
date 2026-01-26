class VishnuTeja{
    private int a;
    private int b;
    private String name;
    void show(int a,int b){
       System.out.println(a+b);
    } 
    void name(String name){
        System.out.println("My Name is :" + name);
    }
}


class Encapsulation {
    public static void main(String[] args){
        VishnuTeja obj1=new VishnuTeja();
        obj1.show(10,20);
        obj1.name(" Vishnu Teja");
    }
    
}

//Encapsulation is a Process of Providing Security to the Most Important Component in The Object which is called as Data
//We can Provide Security Using Two things prevent data and controllable acess we can prevent it by providing variable with Private
//and we can access it in by setters and getters
