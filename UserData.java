public abstract class UserData{

    private final String name;

    public String getName(){

        return name;
    }

    protected UserData (String name){
            this.name = name;
        }
    }
