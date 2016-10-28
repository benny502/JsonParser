package JsonTree;

import java.util.ArrayList;

public class JArrayItem extends JNode {
	
	private JValue value;
	
	protected JType type = JType.JArrayItem;
	
	@Override
	public JType getType(){
		return type;
	}
	
	public JArrayItem(JValue value){
		this.value = value;
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
	
	public JValue getItem(){
		return this.value;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value.toString();
	}

}
