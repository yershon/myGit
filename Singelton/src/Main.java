
public class Main {
	
	public static void main(String[] args) {
		
		
		Instance inst1 = Instance.getInstance();
		Instance inst2 = Instance.getInstance();
		
		if (inst1 == inst2) {
			System.out.println("inst1 == inst2 ");
		}else {
			System.out.println("inst1 != inst2");
		}
		
		if (inst1.equals(inst2)) {
			System.out.println("inst1 equals inst2 ");
		}else {
			System.out.println("inst1 !equals inst2");
		}
		
		System.out.println(inst1.hashCode());
		System.out.println(inst2.hashCode());
		
		
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		System.out.println( System.identityHashCode(sb1) +
		                    " " + sb1.hashCode() ); // z.  B. 7439041 7439041
		System.out.println( System.identityHashCode(sb2) +
		                    " " + sb2.hashCode() ); // z.  B. 4152583 4152583
	}

}
