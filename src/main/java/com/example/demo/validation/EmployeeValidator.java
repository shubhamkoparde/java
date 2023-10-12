package com.example.demo.validation;


import java.util.regex.Pattern;
public class EmployeeValidator{
	private final String firstNameRegex = "^[a-zA-Z]{2,25}$";

	private final String lastNameRegex = "^[a-zA-Z]{1,25}$";
	private final String cityRegex = "^[a-zA-Z]{1,25}$";
	private final String countryRegex = "^[a-zA-Z]{2,25}$";
	private final String emailidRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

	public void validateFirstName(String first_name) {

		if (first_name == null || first_name.isEmpty()) {

			throw new IllegalArgumentException("First name cannot be empty.");

		}

		else if (!Pattern.matches(firstNameRegex, first_name)) {

			throw new IllegalArgumentException("First name must contain only letters and have minimum 3 and maximum 25 characters.");

		}

	}
	public void validateDepartment(String department) {

		if (department == null || department.isEmpty()) {

			throw new IllegalArgumentException("First name cannot be empty.");

		}

		else if (!Pattern.matches(firstNameRegex, department)) {

			throw new IllegalArgumentException("First name must contain only letters and have minimum 3 and maximum 25 characters.");

		}

	}
	
	public void validateLastName(String last_name) {

		if (last_name == null || last_name.isEmpty()) {

			throw new IllegalArgumentException("Last name cannot be empty.");

		}

		else if (!Pattern.matches(lastNameRegex, last_name)) {

			throw new IllegalArgumentException("Last name must contain only letters and have minimum 1 and maximum 25 characters.");

		}
	}

	public void validatecityName(String city) {

		if (city == null || city.isEmpty()) {

			throw new IllegalArgumentException("city name cannot be empty.");

		}

		else if (!Pattern.matches(cityRegex, city)) {

			throw new IllegalArgumentException("cityname must contain only letters and have minimum 1 and maximum 25 characters.");

		}

	}
	public void validatecountryName(String country) {

		if (country == null || country.isEmpty()) {

			throw new IllegalArgumentException("country name cannot be empty.");

		}

		else if (!Pattern.matches(countryRegex, country)) {

			throw new IllegalArgumentException("country must contain only letters and have minimum 1 and maximum 25 characters.");

		}

	}

	public void validateEmailID(String email_address) {
		System.out.println(email_address);
		if (email_address == null || email_address.isEmpty()) {

			throw new IllegalArgumentException("emailid name cannot be empty.");

		}

		else if (!Pattern.matches(emailidRegex, email_address)) {

			throw new IllegalArgumentException("emailid must contain only letters and have minimum 3 and @ and com also");

		}

	}







}







