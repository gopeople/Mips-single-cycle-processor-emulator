//TODO only using integers right now, code to be generic later
public class Register {

	private String registerName;
	private int storedValue;
	
	public Register (String registerName) {
		this.registerName = registerName;
		this.storedValue = 0;
	}
	
	public String GetName() {
		return this.registerName;
	}
	
	public String ToString() {
		return Integer.toString(this.GetValue());
	}
	
	public int GetValue() {
		return this.storedValue;
	}
	
	//TODO add in limits
	public boolean SetValue(int value) {
		this.storedValue = value;
		
		return true;
	}
	
	
}
