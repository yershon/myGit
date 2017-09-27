import java.util.Scanner;

public class ReadStaticVariable {
	
	public int readStaticFromScanner() {
		return Scannner.x;
	}
	
	public int incr(int x) {
		Scannner.x = Scannner.x + 1;
		return ++x;
	}

}
