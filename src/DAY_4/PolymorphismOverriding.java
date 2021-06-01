package DAY_4;
class Nokia{
    public void run(){
        System.out.println("Nokia is running.");
    }
}
 
class Oneplus extends Nokia{
    public void run(){
        System.out.println("Oneplus is running.");
    }
}
 
public class PolymorphismOverriding{
    public static void main(String[] args) {
        Nokia n = new Oneplus();
        n.run();
    }
}
