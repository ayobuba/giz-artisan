package com.infocell.giz.gizart.service;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Sid {

	char[] characters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
			't', 'u', 'v', 'w', 'x', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
			'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9',
			'0' };

	String sidString;

	public String generateSid() {
		StringBuilder sidObj = new StringBuilder();

		Random r = new Random();

		for (int i = 0; i <= 59; i++) {

			int generatedNumber = r.nextInt(characters.length);
			sidObj.append(characters[generatedNumber]);

		}
		sidString = sidObj.toString();
		return sidString;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sidString == null) ? 0 : sidString.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sid other = (Sid) obj;
		if (sidString == null) {
			if (other.sidString != null)
				return false;
		} else if (!sidString.equals(other.sidString))
			return false;
		return true;
	}

}
