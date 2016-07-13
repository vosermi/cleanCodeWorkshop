package com.zuehlke.cleancodeworkshop.person;

import java.util.ArrayList;
import java.util.List;

public class PersonNameStrategy {

    static List<String> surnameFirst = new ArrayList<String>();
    static {
        surnameFirst.add("CHN");
        surnameFirst.add("KOR");
        // etc...
    }

    private String nationality;
    private boolean capitalizeSurname;
    private boolean olympicMode;

    private PersonNameStrategy(String nationality, boolean capitalizeSurname, boolean olympicMode) {
        this.nationality = nationality;
        this.capitalizeSurname = capitalizeSurname;
        this.olympicMode = olympicMode;
    }

    public PersonNameStrategy() {
    }

    public static PersonNameStrategy create(String nationality, boolean capitalizeSurname, boolean olympicMode) {
        if(olympicMode)
            return new PersonNameStrategy(nationality, capitalizeSurname, olympicMode);

        return new PersonNameStrategy(nationality, capitalizeSurname, olympicMode);
    }

    boolean surnameFirst() {
        if (!olympicMode)
            return false;
        return surnameFirst.contains(nationality);
    }

    String nameString(String familyName, String givenName) {
        String surname = familyName;
        if (capitalizeSurname) {
            surname = familyName.toUpperCase();
        }
        if (surnameFirst())
            return surname + " " + givenName;
        else
            return givenName + " " + surname;
    }
}