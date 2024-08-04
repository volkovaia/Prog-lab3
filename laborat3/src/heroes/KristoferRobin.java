package heroes;
//вложенные статические классы

public class KristoferRobin extends General {

    public String toString() {
        return "Кристофер Робин";
    }

    @Override
    public String getDescription() {
        return "мальчик";
    }

    //public class RobinMooviesDescription implements KristoferMoovies {
    public static class RobinThinksAboutWinnie {
        String name;

        public void setNameOfAction(String name) {
            this.name = name;
            System.out.println("тем больше он думал о том");

        }
    }

    public static class ThinkMore {
        String name;

        //public String setNameOfAction(String name) {
        public void setNameOfAction(String name) {
            this.name = name;
            System.out.println("но чем больше Кристофер Робин думал об этом");

        }

        public void thinkMore(){
            System.out.println(name);
        }
    }

    public void thinkAboutWinnie() {
        System.out.println("тем больше он думал о том");
    }

    public void moreThink() {
        System.out.println("но чем больше Кристофер Робин думал об этом");
    }

    public void thinkMoreAboutWinnie(ThinkMore thinkMore){
        thinkAboutWinnie();
        thinkMore.thinkMore();
    }


}

