import java.util.TimeZone;

public class StopWatch {
    public double getEndTime() {
        return endTime;
    }

    public double getStartTime() {

        return startTime;
    }

    private double startTime,endTime;

    public StopWatch(){
        this.startTime=System.currentTimeMillis();
    }
    public void start(){
        this.startTime=System.currentTimeMillis();
    }
    public void stop(){
        this.endTime=System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return this.endTime-this.startTime;
    }
}
