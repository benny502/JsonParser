package JsonTree;

import java.util.ArrayList;

public class JTerm extends JNode {

	private ArrayList<JNode> list;
	
	protected JType type; 
	
	public JTerm(){
		this.type = JType.JTerm;
		list = new ArrayList<JNode>();
	}
	
	public void Add(JKeyPair pair){
		list.add(pair);
	}
	
	@Override
	public boolean hasChild() {
		// TODO Auto-generated method stub
		return !list.isEmpty();
	}
	
	@Override
	public JType getType(){
		return this.type;
	}

	@Override
	public ArrayList<JNode> getChild() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
