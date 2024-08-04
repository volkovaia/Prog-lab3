package action;

public class ChangeMovement {
    public void change(SeeStates newSee){
        switch (newSee){
            case Watch: {
                System.out.println("чем больше он глядел на");
                break;
            }
            case ExpectToSee:{
                System.out.println("ожидал увидеть");
                break;
            }
            default:{
                System.out.println("просто смотрел без всяких ожиданий");
            }
        }
    }
}
