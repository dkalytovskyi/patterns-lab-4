package com.lab4.bridge;

public class TextField extends GUIComponent {
	private String value;
	private int id;
	
	public TextField(GUILibrary library, int id, String value) {
		super(library);
		this.value = value;
		this.id = id;
	}
	
	@Override
	public void buildComponent() {
		this.library.drawComponent(toString());
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "TextField [ value = " + value + ", id = " + id + " ]";
	}
}
