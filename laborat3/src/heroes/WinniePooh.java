package heroes;

import action.WinnieMoovies;
import exceptions.PoohQualitiesException;

public class WinniePooh extends Bear implements WinnieMoovies {
    /*public Winnie_Pooh(){
            //super("Винни Пух");

        }*/
    /*public String toString(){
        return "Винни Пух";
    }*/

        public String toString(){
            return "это медведь";
        }


    public void winnieModestReaction(){
            System.out.println("тем скромнее");
        }public void lookedIntoTheGround(){
        System.out.println("глядел Пух в землю");
    }
    public void triedToPretend(){
        System.out.println("стараясь сделать вид, что это не он");
    }

        public boolean isStillBrave;
        public boolean isNotBrave;

    public void stillBrave() {
        //System.out.println("Винни Пух всё ещё храбрый и умный");
        isStillBrave = true;
    }

    public void notBrave() {
        //System.out.println("Сегодня Винни Пух трусливый");
        isNotBrave = false;
    }

    public void winnieQualities() throws PoohQualitiesException {
        System.out.println("Какой сегодня Винни Пух?");
        if (isStillBrave) {
            System.out.println("Храбрый и умный медведь Винни Пух");
        } else {
            throw new PoohQualitiesException("Сегодня Винни не отличается храбростью");
        }
    }
    public void forgotToCreateClass() throws RuntimeException {
        System.out.println("Вы забыли создать класс");
    }
}






