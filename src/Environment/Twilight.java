package Environment;


public abstract class Twilight extends TimeOfTheDayAbstract {
    private String name;
    private final TimeType TYPE = TimeType.TWILIGHT;

    public Twilight() {
        name = "cумерки";
    }

    public Twilight(String name) {
        this.name = name;
    }


    public Twilight(String name, boolean time) {
        this.name = name;
    }


    public void condition(){
        System.out.print(name + " сгущались");
    }

}



