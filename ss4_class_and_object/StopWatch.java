package ss4_class_and_object;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
    public long getElapsedTime() {
        return endTime - startTime;
    }

    /*
            +----------------------------------------+
            |                StopWatch               |
            +----------------------------------------+
            | - startTime: long                      |
            | - endTime: long                        |
            +----------------------------------------+
            | + StopWatch()                          |
            | + start(): void                        |
            | + stop(): void                         |
            | + getStartTime(): long                 |
            | + getEndTime(): long                   |
            | + getElapsedTime(): long               |
            +----------------------------------------+

     */

}
