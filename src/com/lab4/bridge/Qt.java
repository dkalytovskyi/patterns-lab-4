package com.lab4.bridge;

public class Qt implements GUILibrary {

	@Override
	public void drawComponent(String details) {
		System.out.println("Drawn with Qt library: ");
		System.out.println(details);
	}

}
