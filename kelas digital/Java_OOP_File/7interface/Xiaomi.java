import interfaces.Phone;

public class Xiaomi implements Phone{
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        // initial volume
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala ....");
        System.out.println("Selemat datang di xiaomi");
        System.out.println("Androiod version 10");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("mematikan handphone");
    }
    //override semua method abstract yang ada di interface phone
    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("volume sekarang = "+ this.volume +"%");
            }
        } else {
            System.out.println("handphone mati, silahkan nyalakan dahulu!");
        }
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("volume sudah maksimal!");
                System.out.println("volume = "+this.volume + "%");
            } else {
                this.volume += 10;
                System.out.println("volume sekarang "+ this.volume + "%");
            }
        } else {
            System.out.println("handphone mati, silahkan nyalakan dahulu!");
        }
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isPowerOn() {
        return this.isPowerOn;
    }

    public void setPowerOn(boolean isPowerOn) {
        this.isPowerOn = isPowerOn;
    }
}