package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int damage;

    public Monster(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    @Override
    public List<String> write() {
        ArrayList<String> values = new ArrayList<String >();
        values.add(0, this.name);
        values.add(1,""+this.damage);
        return values;

    }

    @Override
    public void read(List<String> savedValues) {
        if (savedValues!=null && savedValues.size()>0){
            this.name= savedValues.get(0);
            this.damage= Integer.parseInt(savedValues.get(1));
        }




    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                '}';
    }
}
