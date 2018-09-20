public class Television {

    //Bellabaci Nazim
    //9/11/2017

    private String manufacturer;
    private int screenSize;
    private boolean powerOn;
    private boolean muteOn;
    private int channel,volume;

    public Television(String b,int size){

        this.manufacturer=b;
        this.screenSize=size;
        this.channel=2;
        this.volume=20;
        this.powerOn=false;
        this.muteOn=false;

    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {

        return volume;
    }

    public int getScreenSize() {
        return screenSize;
    }
    public void tooglePower(){
        this.powerOn=!this.powerOn;
    }
    public void toggleMute(){
        this.muteOn=!this.muteOn;
    }
    public void increaseVolume(){
        if(this.volume<100)this.volume+=1;
    }
    public void decreaseVolume(){
        if(this.volume>0)this.volume-=1;
    }

    @Override
    public String toString() {
        String output = "********************************\n";
        output += "manufacturer : " + this.manufacturer + " \n";
        output += "screen Size : " + screenSize + " \n";
        if (powerOn) output += "is powered on\n";
        else output += "is powered off \n";

        if (muteOn) output += "mute : Yes \n";
        else  output += "mute : No \n";

        output += "channel : " + channel + " \n";
        output += "volume : " + volume + " \n";
        output += "********************************\n";

        return output;

    }




}
