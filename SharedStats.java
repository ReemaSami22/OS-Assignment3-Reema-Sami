import java.util.concurrent.locks.ReentrantLock;

class SharedStats {
    static int totalProcesses = 0;
    static int totalCPUs = 0;
    static int contextSwitchCount = 0;
    static int completedProcessCount = 0;
    static long totalServiceTime = 0L;

    // Feature 2: declare the lock
    private static final ReentrantLock statsLock = new ReentrantLock();

    public static void incrementContextSwitch() {
        statsLock.lock();
        try {
            int tmp = contextSwitchCount;
            RaceWindow.pause();
            contextSwitchCount = tmp + 1;
        } finally {
            statsLock.unlock();
        }
    }

    public static void incrementCompletedProcess() {
        statsLock.lock();
        try {
            int tmp = completedProcessCount;
            RaceWindow.pause();
            completedProcessCount = tmp + 1;
        } finally {
            statsLock.unlock();
        }
    }

    public static void addServiceTime(int ms) {
        statsLock.lock();
        try {
            long tmp = totalServiceTime;
            RaceWindow.pause();
            totalServiceTime = tmp + (long)ms;
        } finally {
            statsLock.unlock();
        }
    }

    public static int getCompletedProcessCount() {
        return completedProcessCount;
    }

    public static int getContextSwitchCount() {
        return contextSwitchCount;
    }

    public static long getTotalServiceTime() {
        return totalServiceTime;
    }
}