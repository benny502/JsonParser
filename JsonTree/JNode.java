package JsonTree;

import java.util.*;

public abstract class JNode {
	
	
	protected JType type; 
	
	public JNode(){
		
		this.type = JType.JNode;
		
	};
	
	public abstract boolean hasChild();
	
	public abstract ArrayList<JNode> getChild();
	
	@Override
	public abstract String toString();
	
	public JType getType(){
		return this.type;
	}
	
	public String dump(int deep){
		StringBuffer buf = new StringBuffer();
		JNode node = this;
		if(node.getType()==JType.JNode){}
		if(node.getType()==JType.JArray){
			for(int i=0;i<deep;i++){
				buf.append("  ");
			}
			buf.append("[\r\n");
			if(node.hasChild()){
				ArrayList<JNode> list = node.getChild();
				for(JNode item : list){
					if(list.indexOf(item)>0){
						buf.append(",\r\n");
					}
					buf.append(item.dump(deep+1));
				}
			}
			buf.append("\r\n");
			for(int i=0;i<deep;i++){
				buf.append("  ");
			}
			buf.append("]");
		}
		if(node.getType()==JType.JTerm){
			for(int i=0;i<deep;i++){
				buf.append("  ");
			}
			buf.append("{\r\n");
			if(node.hasChild()){
				ArrayList<JNode> list = node.getChild();
				for(JNode item : list){
					if(list.indexOf(item)>0){
						buf.append(",\r\n");
					}
					buf.append(item.dump(deep+1));
				}
			}
			buf.append("\r\n");
			for(int i=0;i<deep;i++){
				buf.append("  ");
			}
			buf.append("}");
		}
		if(node.getType()==JType.JString){
			buf.append(node.toString());
		}
		if(node.getType()==JType.JDigital){
			buf.append(node.toString());
		}
		if(node.getType()==JType.JKeyPair){
			for(int i=0;i<deep;i++){
				buf.append("  ");
			}
			JString key = ((JKeyPair)node).getKey();
			JNode value = ((JKeyPair)node).getValue();
			buf.append(key.toString());
			buf.append(":");
			buf.append(value.dump(deep+1));
		}
		if(node.getType()==JType.JArrayItem){
			for(int i=0;i<deep;i++){
				buf.append("  ");
			}
			JArrayItem item = (JArrayItem) node;
			buf.append(item.getItem().dump(deep+1));
		}
		return buf.toString();
	}
	
	public String dump(){
		int deep=0;
		return dump(deep);
	}
	
}
