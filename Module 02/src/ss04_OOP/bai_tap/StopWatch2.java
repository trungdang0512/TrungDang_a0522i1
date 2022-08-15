package ss04_OOP.bai_tap;

public class StopWatch2 {
    private long startTime;
    private long endTime;


    public StopWatch2() {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long start(){
        return this.startTime = System.currentTimeMillis();
    }

    public long end(){
         return this.endTime = System.currentTimeMillis();
    }

    public long result(){
        long result = this.endTime - this.startTime;
        return result;
    }

    @Override
    public String toString() {
        return "StopWatch2{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                "\n Result=" + result() + " milisecond" +
                '}';
    }
}
