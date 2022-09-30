package BaiTap2;

public class StopWatch {
    private long startTime;
    private long endTime;

    public long getStartTime() {
        return startTime;
    }

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return endTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        long time = this.endTime - this.startTime;
        return time;
    }

}
