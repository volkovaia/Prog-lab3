package heroes;
//нестатический вложенный класс
public class FloatingBear {
    private String name, constellationtype;
    //public InfAboutConstellation infAboutConstellation = new InfAboutConstellation("60", "альфа");
    public FloatingBear (String name, String contellationtype){
        this.name = name;
        this.constellationtype = constellationtype;

    }
    public class InfAboutConstellation {
    //private class InfAboutConstellation {
        private String amountOfStars, mainStar;

        public InfAboutConstellation(String amountOfStars, String mainStar){
            this.amountOfStars = amountOfStars;
            this.mainStar = mainStar;
        }
    }
}
