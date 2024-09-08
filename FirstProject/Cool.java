//package FirstProject;

class Parent {
    public void display(){
        System.out.println("this is parent class method");

    }
    
}

class Child extends Parent {
    public void ChildMethod() {
        System.out.println("this is child method");
    }
}

public class Cool{
    
    public static void main(String args[]){
        Child obj = new Child();
        obj.display();
        obj.ChildMethod();

    }
}

