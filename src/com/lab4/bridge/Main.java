package com.lab4.bridge;

/*
 *  №7
 *  Визначити специфікації класів, які подають елементи графічного інтерфейсу 
 *  користувача (GUI) – кнопка, вікно, тощо. 
 *  Забезпечити розділення абстракції і реалізації таким чином, щоб елементи інтерфейсу 
 *  могли мати реалізації для різних бібліотек (наприклад Qt та GTK) прозорі для користувача. 
 */

public class Main {

	public static void main(String[] args) {
		Button btn1 = new Button(new Qt(), 1, "Press Me", true);
        btn1.buildComponent();
        
        Button btn2 = new Button(new GTK(), 2, "Don't Press Me", false);
        btn2.buildComponent();
        
        Label label = new Label(new Qt(), "Don't Press THAT Button", "Arials", 14);
        label.buildComponent();
        
        TextField field = new TextField(new Qt(), 17, "0");
        field.buildComponent();
        
        CheckBox box = new CheckBox(new GTK(), 5, true);
        box.buildComponent();
	}

}
