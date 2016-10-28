package JsonTree;
import java.util.*;

public class JArray extends JNode {
	
	protected JType type = JType.JArray; 
	
	public ArrayList<JNode> list;
	
	public JArray(){
		this.list  = new ArrayList<JNode>();
	}
	
	@Override
	public JType getType(){
		return this.type;
	}
	
	public void Add(JValue item){
		this.list.add(item);
	}
	
	public void Add(JNode item){
		this.list.add(item);
	}
	
	public void Add(JArray item){
		this.list.add(item);
	}
	
	public void Add(JTerm item){
		this.list.add(item);
	}
	
	@Override
	public boolean hasChild(){
		return !this.list.isEmpty();
	}
	
	@Override
	public ArrayList<JNode> getChild(){
		return this.list;
	}
	
	@Override
	public String toString(){
		StringBuffer buf = new StringBuffer();
		buf.append("{\n");
		for(JNode item : list){
			if(list.indexOf(item)>0){
				buf.append(",\n");
			}
			buf.append(item.toString());
		}
		buf.append("\n");
		buf.append("}");
		return buf.toString();
	};

}
