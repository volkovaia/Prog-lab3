import exceptions.PoohQualitiesException;
import expandadVersionOfTheStory.OriginOfHeroes;
import expandadVersionOfTheStory.Place;
import floatingBear.*;
import heroes.*;
import action.*;
public class Story{
    public static void main(String[] args){
        KristoferRobin kristoferRobin = new KristoferRobin();
        WinniePooh winniePooh = new WinniePooh();
        FloatingBearExpectedToSee details = new FloatingBearExpectedToSee();
        ChangeMovement changeMovement = new ChangeMovement();


        details.thatWasNotIt();
        System.out.println(kristoferRobin.toString());
        //robin.expect_to_see();
        changeMovement.change(SeeStates.ExpectToSee);
        //robin.watch();
        changeMovement.change(SeeStates.Watch);
        details.onABear();
        //robin.thinkAboutWinnie();
        //kristoferRobin.thinkAboutWinnie();
        //KristoferRobin.ThinkMore thinkMore = new KristoferRobin.ThinkMore();


        //KristoferRobin.RobinThinksAboutWinnie robinThinks = new KristoferRobin.RobinThinksAboutWinnie();
        //robinThinks.RobinThinksAboutWinnie();
        kristoferRobin.thinkAboutWinnie();




        winniePooh.notBrave();
        winniePooh.stillBrave();
        try {
            winniePooh.winnieQualities();

        } catch (PoohQualitiesException e){
            System.out.println(e.getMessage());
            System.out.println("Какой сегодня Винни Пух? " + winniePooh.isStillBrave + "\r\n" + winniePooh.isNotBrave);

        }

        //winniePooh.winnieQualities();

        //winnieQualities.getDescription();
        //winniePooh.getDescription();
        //robin.moreThink();
        //kristoferRobin.moreThink();
        //thinkMore.ThinkMore("Кристофе Робин", 14, 12, 140);
        kristoferRobin.moreThink();



        winniePooh.winnieModestReaction();

        //Winnie_reaction.getDescription();
        //pooh.lookedIntoTheGround();
        winniePooh.lookedIntoTheGround();
        winniePooh.triedToPretend();

        //winniePooh.forgotToCreateClass();
        Place place = new Place("провёл детство в воображаемом лесу", "Стоакровый Лес");
        place.getAddress();
        OriginOfHeroes robin = new OriginOfHeroes();

        OriginOfHeroes pooh = new OriginOfHeroes(){
            @Override
            public void name() {
                System.out.println("Винни Пух");
            }

            @Override
            public void type() {
                System.out.println("Игрушка");
            }
        };
        robin.name();
        pooh.name();


        FloatingBear floatingBear = new FloatingBear("Плавучий медведь", "тип созвездия");
        FloatingBear.InfAboutConstellation infAboutConstellation = floatingBear.new InfAboutConstellation("20", "альфа");


        KristoferRobin.RobinThinksAboutWinnie robinThinksAboutWinnie = new KristoferRobin.RobinThinksAboutWinnie();
        robinThinksAboutWinnie.setNameOfAction("но чем больше Кристофер думал об этом");
        robinThinksAboutWinnie.toString();

        KristoferRobin.ThinkMore thinkMore = new KristoferRobin.ThinkMore();
        thinkMore.setNameOfAction("Но чем больше Кристофер Робин думал об этом");

        kristoferRobin.thinkMoreAboutWinnie(thinkMore);



    }

}