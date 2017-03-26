package com.infocell.giz.gizart.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.infocell.giz.gizart.model.Admin;

public class AdminValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Admin.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		Admin user = (Admin) target;

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "NotEmpty.userForm.name");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "NotEmpty.userForm.email");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "address", "NotEmpty.userForm.address");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty.userForm.password");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "NotEmpty.userForm.confirmPassword");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sex", "NotEmpty.userForm.sex");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "country", "NotEmpty.userForm.country");

		/*
		 * if(!emailValidator.valid(user.getEmail())){
		 * errors.rejectValue("email", "Pattern.userForm.email"); }
		 * 
		 * 
		 * if(user.getCountry().equalsIgnoreCase("none")){
		 * errors.rejectValue("country", "NotEmpty.userForm.country"); }
		 * 
		 * if (!user.getPassword().equals(user.getConfirmPassword())) {
		 * errors.rejectValue("confirmPassword",
		 * "Diff.userform.confirmPassword"); }
		 * 
		 * if (user.getFramework() == null || user.getFramework().size() < 2) {
		 * errors.rejectValue("framework", "Valid.userForm.framework"); }
		 * 
		 * if (user.getSkill() == null || user.getSkill().size() < 3) {
		 * errors.rejectValue("skill", "Valid.userForm.skill"); }
		 */

	}

}
