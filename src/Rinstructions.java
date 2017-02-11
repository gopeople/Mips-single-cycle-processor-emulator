
public class Rinstructions implements instruction {
	//OP $rd, $rs, $rt
	
	String opCode;
	Register sourceRegister; //rs
	Register sourceRegister2; //rt
	Register destinationRegister; //rd
	
	public Rinstructions(String opcode, Register rd, Register rs, Register rt) {
		this.opCode = opcode;
		this.destinationRegister = rd;
		this.sourceRegister = rs;
		this.destinationRegister = rt;
	}
	
	public void process() {
		
	}

} 
