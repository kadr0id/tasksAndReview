package oop.comparing;

public class Cup {

    private String whoIsCup;

    public Cup (String whoIsCup){
        this.whoIsCup = whoIsCup;
        result();
    }

    public boolean equals(Object o){
        if(o.equals(this))
            return true;
        if (o == null)
            return false;

        if(!(getClass() == o.getClass()))
            return false;
        else {
            Cup x = (Cup)o;
            if(x.whoIsCup.equals(this.whoIsCup))
                return true;
            else
                return false;

        }

    }

    public void result(){

        Cup cup1 = new Cup("my");
        Cup cup2 = new Cup("your");
        if (cup1.equals(cup2))
            System.out.println("It`s same cup");
        else
            System.out.println("Is's different cup");

    }
}
