package org;

import java.util.ArrayList;
import java.util.List;

public class Family {

    private List<People> familyList;

    public Family() {
        this.familyList = new ArrayList<>();
    }

    public void addMember(People person) {
        familyList.add(person);
    }

    public boolean removeMember(String name) {
        return familyList.removeIf(person -> person.getName().equals(name));
    }

    public int countMembers() {
        return familyList.size();
    }

    public List<People> getFamilyMembers() {
        return new ArrayList<>(familyList);
    }

    public People findMember(String name) {
        for (People person : familyList) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Family Members:\n");
        for (People person : familyList) {
            sb.append(person).append("\n");
        }
        return sb.toString();
    }
}