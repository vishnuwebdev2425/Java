class Mobile{
    int price;
    float rating;
    int ram;
    void show(){
        System.out.print("This is a Moile ");
    }
    public Mobile(){
        System.out.println("It is Printed First ");
              
    }
    public Mobile(int price,float rating,int ram){
        this();
        this.price=price;
        this.rating=rating;
        this.ram=ram;

    }
    public void showResults(){
        System.out.println("The Results is " +price);
    }
}

class Main{
    public static void main(String[] args){
        Mobile mobile=new Mobile(12000,4.8f,12);
        mobile.showResults();


    }
}