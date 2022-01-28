package Environment;

public class Nature implements NatureInterface {
    @Override
    public void cold() {
        System.out.print("было холодно");
    }
    @Override
    public void autumn() {
        System.out.print("видно, что пришла осень");
    }
}


