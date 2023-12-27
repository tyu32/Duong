import POJO.Dryer;
import POJO.Washer;

public class Main {
    public static void main(String[] args) {
        Washer duongWasher = new Washer();
        System.out.println("Duong washer: ");
        duongWasher.showStatus();
        duongWasher.plugIn();
        duongWasher.showStatus();

        //duongWasher.addWashingPowder();

        Washer thongWasher = new Washer(true, 0, 0, false, false);
        thongWasher.showStatus();
        thongWasher.plugIn();
        thongWasher.showStatus();
        System.out.println("Thong washer:");
        thongWasher.showStatus();
    }
}