package heroes;

public abstract class General {
    private String name;
    /*public General(String name){
        //setName(name);
    }*/


    /*protected void setName(String name){
        this.name = name;
    }
    public String getName(){
        //return name;
        System.out.println(name);
        return name;
    }*/
    public String toString(){
        return name;
    }
    public abstract String getDescription();

}


