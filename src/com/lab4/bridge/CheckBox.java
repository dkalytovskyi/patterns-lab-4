package com.lab4.bridge;

public class CheckBox extends GUIComponent {
	private int id;
	private boolean isChecked;
	
	public CheckBox(GUILibrary library, int id, boolean isChecked) {
		super(library);
		this.id = id;
		this.isChecked = isChecked;
	}

	@Override
	public void buildComponent() {
		this.library.drawComponent(toString());
	}

	public int getId() {
		return id;
	}

	public boolean isChecked() {
		return isChecked;
	}

	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}

	@Override
	public String toString() {
		return "CheckBox [ id = " + id + ", isChecked = " + isChecked + " ]";
	}
	
	
}
