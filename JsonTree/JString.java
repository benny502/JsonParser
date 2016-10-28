package JsonTree;

public class JString extends JValue {
	
	private String value = "";
	
	protected JType type = JType.JString; 
	
	@Override
	public JType getType(){
		return this.type;
	}
	
	public JString(String value){
		this.value = value;
	}
	
	@Override
	public String toString(){
		return this.value;
	}
	
}
