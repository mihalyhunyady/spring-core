package com.epam.botor.propertyeditor;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;

public class MyStringTrimmerEditor extends StringTrimmerEditor {

	public MyStringTrimmerEditor() {
		super(false);
	}

}
