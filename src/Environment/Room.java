package Environment;

public class Room {
    public static String name;


    public void room() {
        name = "комнат";
    }


    public void room(String name) {
        this.name = name;
    }


    public void lightOff() {
        System.out.print(name + "е" + " cтало темно");
    }


}
