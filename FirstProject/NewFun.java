package FirstProject;

class Fun {
    public void function(){
        System.out.println("Hello there its me Niraj Kumar Sah");
    }
    public void hello(){
        System.out.println("Good morning Sir");
    }

    public int add(int num1, int num2){
        return num1 + num2;
    }

    public static void Niraj(){
        System.out.println("Yesari nai ho ni sir");
    }  
}



public class NewFun{
    public static void main(String[] args) {
        Fun obj1 = new Fun();
        obj1.function();
        obj1.hello();
        int result = obj1.add(2, 5);
        System.out.println(result);
        Fun.Niraj();
        //throw new Error("fffff");
        
        
    }
}