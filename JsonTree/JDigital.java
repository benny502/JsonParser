package JsonTree;

public class JDigital extends JValue {
	
	private long value;
	
	protected JType type = JType.JDigital; 
	
	@Override
	public JType getType(){
		return this.type;
	}
	
	public JDigital(int value){
		this.value = value;
	}
	
	public JDigital(long value){
		this.value = value;
	}
	
	@Override
	public String toString(){
		return Long.toString(this.value);
	}
	
}
