
public class TestMain {
	public static void main(String[] args) {
		MainPipe pipe = new MainPipe();
		pipe.SetRegister("a0", 5);
		System.out.println(pipe.GetRegisterValue("a0"));
		pipe.ClearRegister("a0");
		System.out.println(pipe.GetRegisterValue("a0"));
	}
}