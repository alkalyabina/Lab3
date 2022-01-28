package Environment;

public abstract class TimeOfTheDayAbstract implements TimeOfTheDayInterface {

    public boolean time;

    public void TimeOfTheDayAbstract(boolean time) {
        this.time = time;
    }

    @Override
    public boolean istime() {
        return time;
    }
}
