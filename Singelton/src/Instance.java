
public class Instance {
	
	private static Instance instance = null;
	
	
	private Instance() {

	}
	
	public static Instance getInstance(){
		
		if (instance == null) {
			instance = new Instance();
		}
		return instance;
	}

}
