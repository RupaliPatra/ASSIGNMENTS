package DAY_4;

public class PolymorphismOverloading {
	public static void main(String[] args) {
		PolymorphismOverloading messenger = new PolymorphismOverloading();
        messenger.printer("Bring me a pizza.", "Room-mate");
        messenger.printer("STAY HOME,STAY SAFE!");
    }
     
    public void printer(String message,String sender){
        System.out.println(sender + "         : " + message);
    }
     
    public void printer(String message){
        System.out.println("Broadcast message : " + message);
    }
}

