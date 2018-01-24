package oop.comparing;

public class Cup {

    private int whoIsCup;

    public Cup(int whoIsCup) {
        this.whoIsCup = whoIsCup;

    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + whoIsCup;

        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (o == (this))
            return true;
        if (o == null)
            return false;

        if (!(getClass() == o.getClass()))
            return false;
        else {
            Cup x = (Cup) o;
            if (x.whoIsCup == (this.whoIsCup))
                return true;
            else
                return false;
        }

    }

    public static void result() {

        Cup cup1 = new Cup(1);
        Cup cup2 = new Cup(1);
        if (cup1.equals(cup2))
            System.out.println("It`s same cup");
        else
            System.out.println("Is's different cup");

    }
}