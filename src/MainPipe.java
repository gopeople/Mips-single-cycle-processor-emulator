import java.util.ArrayList;

public class MainPipe {
	
	private int programCounter; //
	private ArrayList instructionMemory = new ArrayList();
	private Register[][] registers = new Register[32][2];
	
	
	
	/* gets operation, 
	 * 0 next instruction
	 * 1 update for jump
	 * 
	 * returns true/false based on return.
	 */
	boolean UpdatePC (int op) {
		
		if (op == 0) {
			programCounter++;
			return true;
		} else if (op == 1) {
			//implement jump code
			return true;
		} else {
			//implement an exception to throw
			return false;
		}
	}
	
	Register GetRegister(String regToGet) {
		
		return new Register(""); //to make it compile
	}
	
	boolean PopulateRegisterArray() {
		
		registers[0][0] = new Register("a0");
		registers[0][1] = new Register("a1");
		registers[0][2] = new Register("a2");
		registers[0][3] = new Register("a3");
		registers[0][4] = new Register("t0");
		registers[0][5] = new Register("t1");
		registers[0][6] = new Register("t2");
		registers[0][7] = new Register("t3");
		registers[0][8] = new Register("t4");
		registers[0][9] = new Register("t5");
		registers[0][10] = new Register("t6");
		registers[0][11] = new Register("t7");
		registers[0][12] = new Register("t8");
		registers[0][13] = new Register("t9");
		
		
		return true;
	}

}
