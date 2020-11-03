package Section1_Basic._00Access;

public class ProtectedTest implements Cloneable{
	protected String name; 
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
