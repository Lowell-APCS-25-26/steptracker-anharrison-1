package org.APCSLowell;

public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int totalDays;
    private int activeDays;

    public StepTracker(int activityThreshold) {
        this.minSteps = activityThreshold;
        this.totalSteps = 0;
        this.totalDays = 0;
        this.activeDays = 0;  
    }
    void addDailySteps(int stepCount) {
        totalSteps += stepCount;
        totalDays++;
        if (stepCount >= minSteps) {
            activeDays++;
        }      //commit!!!!//
    }
    int activeDays() {
        return activeDays;
    }
    double averageSteps() {
        if (totalDays ==0){
            return 0.0;
        }
        return (double) totalSteps/totalDays;
    }
}
