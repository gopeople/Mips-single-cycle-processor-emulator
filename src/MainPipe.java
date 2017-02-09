import java.util.ArrayList;
import Exceptions.RegisterNotFoundException;

public class MainPipe {
	
	private int programCounter; //
	private ArrayList instructionMemory = new ArrayList();
	private Register[] registers = new Register[32];
	
	public MainPipe() {
		this.PopulateRegisterArray();
	}
	
	/* gets operation, 
	 * "next" next instruction
	 * "jump" update for jump
	 * 
	 * returns true/false based on return.
	 */
	boolean UpdatePC (String op) {
		
		if (op.equals("next")) {
			programCounter++;
			return true;
		} else if (op.equals("jump")) {
			//implement jump code
			return true;
		} else {
			//implement an exception to throw
			return false;
		}
	}
	
	private Register GetRegister(String regToGet) {
		int registerValue = 0;
		
		for (int i = 0; i < 14; i++) {
			if (registers[i].GetName().equals(regToGet)) {
				registerValue = i;
				break;
			}
			
			if (i == 31) {//register now found
				try {
					throw new RegisterNotFoundException("Invalid register name.");
				} catch (RegisterNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return registers[registerValue];
	}
	
	boolean PopulateRegisterArray() {
		
		registers[0] = new Register("a0");
		registers[1] = new Register("a1");
		registers[2] = new Register("a2");
		registers[3] = new Register("a3");
		registers[4] = new Register("t0");
		registers[5] = new Register("t1");
		registers[6] = new Register("t2");
		registers[7] = new Register("t3");
		registers[8] = new Register("t4");
		registers[9] = new Register("t5");
		registers[10] = new Register("t6");
		registers[11] = new Register("t7");
		registers[12] = new Register("t8");
		registers[13] = new Register("t9");
		
		return true;
	}

	public void SetRegister(String name, int value) {
		this.GetRegister(name).SetValue(value);
	}
	
	public void ClearRegister (String name) {
		this.GetRegister(name).SetValue(0);
	}
	
	public int GetRegisterValue(String name) {
		return this.GetRegister(name).GetValue();
	}
}
