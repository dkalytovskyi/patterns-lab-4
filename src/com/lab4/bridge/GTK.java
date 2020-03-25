package com.lab4.bridge;

public class GTK implements GUILibrary {

	@Override
	public void drawComponent(String details) {
		System.out.println("Drawn with GTK library: ");
		System.out.println(details);
	}

}
