package JsonTree;

import java.util.ArrayList;

public class JKeyPair extends JNode {
	
	protected JType type = JType.JKeyPair; 
	
	private JString key;
	
	private JNode value;
	
	public JKeyPair(JString key, JNode value){
		this.key = key;
		this.value = value;
	}
	
	@Override
	public JType getType(){
		return this.type;
	}
	
	public JString getKey(){
		return this.key;
	}
	
	public JNode getValue(){
		return this.value;
	}
	
	@Override
	public String toString(){
		return key.toString() + ":" + value.toString();
	}

	@Override
	public boolean hasChild() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<JNode> getChild() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
