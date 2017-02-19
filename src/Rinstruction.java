
public class Rinstruction implements instruction {
	//OP $rd, $rs, $rt
	
	String opCode;
	Register sourceRegister; //rs
	Register sourceRegister2; //rt
	Register destinationRegister; //rd
	
	//add
	public Rinstruction(String opcode, Register rd, Register rs, Register rt) {
		this.opCode = opcode;
		this.destinationRegister = rd;
		this.sourceRegister = rs;
		this.sourceRegister2 = rt;
	}
	
	public void Process() {
		if (this.opCode == "add") {
			this.destinationRegister.SetValue(this.sourceRegister.GetValue() + this.sourceRegister2.GetValue());
		} else if (this.opCode == "sub") {
			this.destinationRegister.SetValue(this.sourceRegister.GetValue() - this.sourceRegister2.GetValue());
		}
	}

} 