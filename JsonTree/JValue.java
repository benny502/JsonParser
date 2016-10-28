package JsonTree;

import java.util.ArrayList;

public abstract class JValue extends JNode {

	protected JType type = JType.JValue; 
	
	@Override
	public JType getType(){
		return this.type;
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

	@Override
	public abstract String toString();
	

}
