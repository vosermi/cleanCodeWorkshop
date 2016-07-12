package com.zuehlke.cleancodeworkshop.person;

public class Person {

	//

	private final PersonNameStrategy personNameStrategy;
	private String familyName;
	private String givenName;

	public Person(String familyName, String givenName, String nationality) {
		this(familyName, givenName, nationality, false, false);
	}

	public Person(String familyName, String givenName, String nationality,
			boolean olympicMode, boolean capitalizeSurname) {
		this.familyName = familyName;
		this.givenName = givenName;
		this.personNameStrategy = new PersonNameStrategy(nationality,capitalizeSurname,olympicMode);
	}

	@Override
	public String toString() {
		return personNameStrategy.nameString(familyName,givenName);
	}


}
