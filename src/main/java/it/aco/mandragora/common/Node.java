package it.aco.mandragora.common;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Node implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2389822962799739651L;
	
	static private org.apache.log4j.Category log = org.apache.log4j.Logger.getLogger(Node.class.getName());
	
	
	private Map<String, Node> children;
	
	public Node() {}
	
	public Node(String path) throws Exception{
		try {
			
			children=  new HashMap<String, Node>();	
			String[] firstAttributeNameAndRemainingPath= Utils.getFirstAttributeNameAndRemainingPath(path);
				
			if(path!=null && !path.trim().equals("")){
				children.put(firstAttributeNameAndRemainingPath[0], new Node(firstAttributeNameAndRemainingPath[1]));
				
			}
		} catch (Exception e) {
            log.error("Exception caught in   Node(String path): " + e.toString());
            throw new Exception("Error in  Node(String path): " + e.toString(),e);
		}
	}
	
	public Node(String[] names) throws Exception{
		try {
			children = new HashMap<String, Node>();
			if(names!=null){
				for (String name:names){
					
					if(name!=null && !name.trim().equals("")){
						String[] firstAttributeNameAndRemainingPath= Utils.getFirstAttributeNameAndRemainingPath(name);
						String firstAttributeName=firstAttributeNameAndRemainingPath[0];
						String remainingPath = firstAttributeNameAndRemainingPath[1];
						
						Map<String, Node> recursiveChildren = children;
						while(!firstAttributeName.trim().equals("")){
							if(recursiveChildren.get(firstAttributeName)==null){
								recursiveChildren.put(firstAttributeName, new Node(remainingPath));
								break;
							}else{
								recursiveChildren=recursiveChildren.get(firstAttributeName).getChildren();
							}
							firstAttributeNameAndRemainingPath= Utils.getFirstAttributeNameAndRemainingPath(remainingPath);
							firstAttributeName=firstAttributeNameAndRemainingPath[0];
							remainingPath = firstAttributeNameAndRemainingPath[1];
						}
						
					}
					
				}
			}
		} catch (Exception e) {
            log.error("Exception caught in   Node(String[] names): " + e.toString());
            throw new Exception("Error in  Node(String[] names): " + e.toString(),e);
		}
	}
	
	public Map<String, Node> getChildren() {
		return children;
	}
	public void setChildren(Map<String, Node> children) {
		this.children = children;
	} 
	
	
	
}
