package heroes;

public class Bear extends General{
    //private String
    public String getDescription(){
        //System.out.println("");
        return "Вид медведя";
    }

    @Override
    public String toString() {
        return "это медведь";
    }
}
