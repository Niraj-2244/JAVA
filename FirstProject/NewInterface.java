//package FirstProject;
interface Parent{
    void display();

}

class Child implements Parent{
    public void display(){
        System.out.println("this is child class");
    }

}


public class NewInterface {
    public static void main(String args[]){
        Parent obj = new Child();
        obj.display();
    }
}
