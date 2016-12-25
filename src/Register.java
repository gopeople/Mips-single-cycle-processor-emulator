
public class Register {
	
	//0 = empty register, 1 = int, 2 = string
	int controllerValue;
	int intValue;
	String strValue;
	private String registerName;
	
	public Register (String registerName) {
		this.registerName = registerName;
	}
	
	String GetName() {
		return this.registerName;
	}
	
	String ToString() {
		return (String)getValue();
	}
	
	boolean addValue(String value) {
		controllerValue = 2;
		strValue = value;
		if (strValue != value) {
			return false;
		} else {
			return true;
		}
	}
	
	boolean addValue(int value) {
		controllerValue = 1;
		intValue = value;
		if (intValue != value) {
			return false;
		} else {
			return true;
		}
	}
	
	Object getValue() {
		if (controllerValue == 2) {
			return strValue;
		} else if (controllerValue == 1) {
			return intValue;
		}
		
		return null;
	}
 
	
}
