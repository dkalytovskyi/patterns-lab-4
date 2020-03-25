package com.lab4.bridge;

public class Button extends GUIComponent {
	private String name;
	private boolean isEnabled;
	private int id;
	
	public Button(GUILibrary library,  int id, String name, boolean isEnabled) {
		super(library);
		this.name = name;
		this.isEnabled = isEnabled;
		this.id = id;
	}

	@Override
	public void buildComponent() {
		this.library.drawComponent(toString());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEnabled() {
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {
		this.isEnabled = isEnabled;
	}
	
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Button [ name = " + name + ", isEnabled = " + isEnabled + ", id = " + id + " ]";
	}
}
