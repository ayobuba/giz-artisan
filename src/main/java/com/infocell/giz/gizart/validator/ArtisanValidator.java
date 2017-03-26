/**
 * 
 */
package com.infocell.giz.gizart.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.infocell.giz.gizart.model.Artisan;

/**
 * @author throne
 *
 */
public class ArtisanValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return Artisan.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		Artisan artisan = (Artisan) obj;
	}

}
