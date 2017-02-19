
public class Iinstruction implements instruction {
	//OP rt, rs, imm
	
	String opCode;
	Register sourceRegister; //rs
	Register sourceRegister2; //rt
	Register destinationRegister; //rd
	int immediateValue;
	
	//addi
	public Iinstruction(String opcode, Register rd, Register rs, int i) {
		this.opCode = opcode;
		this.destinationRegister = rd;
		this.sourceRegister = rs;
		this.immediateValue = i;
	}
	
	public void Process() {
		if (this.opCode == "addi") {
			this.destinationRegister.SetValue(this.sourceRegister.GetValue() + this.immediateValue);
		}
	}
}
