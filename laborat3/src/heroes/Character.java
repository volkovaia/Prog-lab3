package heroes;

import java.util.Objects;

public class Character {
    String name = "NoName";
    String type = "Персонаж";
    double x = 0;
    double y = 0;
    int force;
    int height;



    @Override
    public boolean equals(Object s) {
        if (s == null) {
            return false;
        }
        if (this == s) {
            return true;
        }
        if (!(getClass() == s.getClass())){
            return false;
        }
        else {
            Character tmp = (Character) s;
            return (tmp.name.equals(name) && force == tmp.force && tmp.type.equals(type));
        }
    }


    @Override
    public int hashCode(){
        final int power = 239;
        int hash = 0;
        for (int i = 0; i < name.length(); ++i) {
            hash = hash * power + (int)name.charAt(i);
        }

        for (int i = 0; i < type.length(); ++i) {
            hash = hash * power + (int)type.charAt(i);
        }


        /*if (see == See.Normal) {
            hash *= 2;
        } else if (see == see.Watch) {
            hash *= 3;
        } else if (see == see.ExpectToSee) {
            hash *= 4;
        }*/

        hash *= force * x * y * height;
        return hash;
    }

    @Override
    public String toString(){
        return type + " " + name;
    }


}