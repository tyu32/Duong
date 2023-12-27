package POJO;

public class Washer {
    boolean charging;
    int water;
    int clothesCount;
    boolean running;
    boolean haveWashPowder;

    String status;

    public Washer() {
        charging = false;
        water = 0;
        clothesCount = 0;
        running = false;
        haveWashPowder = false;
    }

    public Washer(boolean charging, int water, int clothesCount, boolean running, boolean haveWashPowder) {
        this.charging = charging;
        this.water = water;
        this.clothesCount = clothesCount;
        this.running = running;
        this.haveWashPowder = haveWashPowder;
    }

    public void addWater(){}

    public void removeWater(){}

    public void addColth(){}

    public void removeColth(){}

    public void addWashingPowder() {
        System.out.println("Adding Wash Powder");
        this.haveWashPowder = true;
    }

    public void plugIn() {
        /*
            Condition: charging == true
            -----------------
            charging = true;
            true == true ? true == charging

            charging = false:
            false == true ? false
         */

        if (charging) {
            System.out.println("我已经通电了美女！！！");
        }
        else {
            System.out.println("正在插电源....");
            charging = true;
        }
    }

    public void dry(){}

    public void wash(){}

    public void showStatus(){
        status = "Status: \nCharging ? " + charging + ";\nwater level: "
                + water + ";\nhow many clothes do I have ? " + clothesCount
                + ";\nAm I running ? " + running
        + ";\nhave wash powder ? " + haveWashPowder;
        System.out.println(status);
    }
}
