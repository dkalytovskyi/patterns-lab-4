package com.lab4.bridge;

public class Label extends GUIComponent {
	private String text;
	private String font;
	private int fontSize;
	
	public Label(GUILibrary library, String text, String font, int fontSize) {
		super(library);
		this.text = text;
		this.font = font;
		this.fontSize = fontSize;
	}

	@Override
	public void buildComponent() {
		this.library.drawComponent(toString());
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setFont(String font) {
		this.font = font;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	public String getFont() {
		return font;
	}

	public int getFontSize() {
		return fontSize;
	}

	@Override
	public String toString() {
		return "Label [ text = " + text + ", font = " + font + ", fontSize = " + fontSize + " ]";
	}
}
