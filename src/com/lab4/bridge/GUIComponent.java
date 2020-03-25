package com.lab4.bridge;

public abstract class GUIComponent {
	protected GUILibrary library;
	
	public GUIComponent() {}
	
	public GUIComponent(GUILibrary library) {
		this.library = library;
	}
	
	public abstract void buildComponent();

	public GUILibrary getLibrary() {
		return library;
	}

	public void setLibrary(GUILibrary library) {
		this.library = library;
	}
}
