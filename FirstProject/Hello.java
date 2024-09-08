package FirstProject;

public class Hello { 
    public void display(){
        System.out.println("this is display method");
    } 
    //public is a modifier//

    public void sir(){
        System.out.println("yo thik xa ni sir");
    }
    
    public static void Killer (){
        System.out.println("this is static method");
    }

    public int sum(){
        int a = 4;
        int b = 5;
        int c = a + b;
        return c;
    }


    public static void main(String[] args) {
        Hello.Killer();
        System.out.println("Hello World");
        Hello obj = new Hello();
        int result = obj.sum();
        System.out.println(result);
        obj.display();
        obj.sir();
    }
}

      


        
        
   