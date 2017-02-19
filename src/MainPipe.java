import java.util.ArrayList;
import Exceptions.RegisterNotFoundException;

public class MainPipe {
	
	private int programCounter; //
	private ArrayList<instruction> instructionMemory = new ArrayList<instruction>();
	private Register[] registers = new Register[32];
	
	public MainPipe() {
		this.programCounter = 0;
		this.PopulateRegisterArray();
		this.SetRegister("a1", 5);
		this.SetRegister("a2", 6);
		instructionMemory.add(new Rinstruction("add", this.GetRegister("a0"), this.GetRegister("a1"), this.GetRegister("a2")));
		instructionMemory.add(new Iinstruction("addi", this.GetRegister("a0"), this.GetRegister("a0"), 20));
		this.process();
	}
	
	/* gets operation, 
	 * "next" next instruction
	 * "jump" update for jump
	 * 
	 * returns true/false based on return.
	 */
	private boolean UpdatePC (String op) {
		
		if (op.equals("next")) {
			programCounter+=4;
			return true;
		} else if (op.equals("jump")) {
			//implement jump code
			return true;
		} else {
			//implement an exception to throw
			return false;
		}
	}
	
	private void process() {
		for (instruction i : instructionMemory) {
			i.Process();
			String instructionType = i.getClass().getName();
			if (instructionType == "Rinstruction" || instructionType == "Iinstruction") {
				this.UpdatePC("next");
			}
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

	//for testing purposes.
	private void SetRegister(String name, int value) {
		this.GetRegister(name).SetValue(value);
	}
	
	private void ClearRegister (String name) {
		this.GetRegister(name).SetValue(0);
	}
	
	public int GetRegisterValue(String name) {
		return this.GetRegister(name).GetValue();
	}
}
