package it.aco.mandragora.common;

import java.io.Serializable;

public class Cursor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2391376099930849134L;
	
	
	public Cursor(){
		setValue(0);
	}
	
	public Cursor(int value){
		setValue(value);
	}
	
	private int value;
	
	


	
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Integer increment(){
		value++;
		return value;
	}
	
	public String toString() {
		return String.valueOf(value);
		
	}
	
	

}
