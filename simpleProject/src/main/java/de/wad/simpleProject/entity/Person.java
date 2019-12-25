package de.wad.simpleProject.entity;

import java.util.List;

public class Person {

    private String vornamen;
    private String nachnamen;
    private List<String> skill;

    public Person(String vornamen, String nachnamen, List<String> skill) {
        this.vornamen = vornamen;
        this.nachnamen = nachnamen;
        this.skill = skill;
    }

    public String getVornamen() {
        return vornamen;
    }

    public void setVornamen(String vornamen) {
        this.vornamen = vornamen;
    }

    public String getNachnamen() {
        return nachnamen;
    }

    public void setNachnamen(String nachnamen) {
        this.nachnamen = nachnamen;
    }

    public List<String> getSkill() {
        return skill;
    }

    public void setSkill(List<String> skill) {
        this.skill = skill;
    }
}
