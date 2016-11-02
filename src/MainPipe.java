
public class MainPipe {
	
	private int programCounter;
	
	
	
	/* gets operation, 
	 * 0 next instruction
	 * 1 update for jump
	 * 
	 * returns true/false based on return.
	 */
	boolean UpdatePC (int op) {
		
		if (op == 1) {
			programCounter +=4;
			return true;
		} else if (op == 2) {
			//implement jump code
		} else {
			//implement an exception to throw
			return false;
		}
	}

}
