package com.epam.botor.converters;

import org.springframework.core.convert.converter.Converter;

import com.epam.botor.domain.LightSabre;

public class LightSabreConverter implements Converter<String, LightSabre> {

	@Override
	public LightSabre convert(String text) {
		String[] textParts = text.split(",");

		String name = textParts[0] + " converted by Spring";
		int damage = Integer.parseInt(textParts[1].trim());

		return new LightSabre(name, damage);
	}

}
