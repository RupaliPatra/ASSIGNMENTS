package DAY_4;
class name {

	  // method in the superclass
	  public void name() {
	    System.out.println("My name is Rupali.");
	  }
	}

	
	class mood extends name {

	  
	  @Override
	  public void name() {

	    
	    super.name();
	    System.out.println("I am bored.");
	  }

	 
	  public void mood() {
	    System.out.println("I need a vacation.");
	  }
	}

	class InheritanceMain {
	  public static void main(String[] args) {

	   
	    mood labrador = new mood();

	    
	    labrador.name();
	    labrador.mood();
	  }
	}