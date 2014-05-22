package it.aco.mandragora.bo;

import java.io.Serializable;
import java.util.List;

public class Graph implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7927269559231804987L;

	
	private Object root;
	private List<String> paths;
	public Graph(Object root, List<String> paths) {
		super();
		this.root = root;
		this.paths = paths;
	}
	public Object getRoot() {
		return root;
	}
	public List<String> getPaths() {
		return paths;
	}
	
	
	
}
