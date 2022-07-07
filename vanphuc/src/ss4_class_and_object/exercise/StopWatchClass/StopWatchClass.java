package ss4_class_and_object.exercise.StopWatchClass;

import java.util.Date;

public class StopWatchClass {
    private Date startTime;
    private Date endTime;

    StopWatchClass() {
        this.startTime = new Date();
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void start() {
        this.startTime = new Date();
    }

    public void stop() {
        this.endTime = new Date();
    }

    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }


}
