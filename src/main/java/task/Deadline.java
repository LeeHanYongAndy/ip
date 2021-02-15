package task;

public class Deadline extends Task {
    private static final String TASK_SYMBOL_D = "D";
    private String taskTiming;

    public Deadline(String taskDescrption, String taskTiming) {
        super(taskDescrption);
        this.taskTiming = taskTiming;
    }

    @Override
    public String getTaskSymbol() {
        return TASK_SYMBOL_D;
    }

    @Override
    public String getTaskTiming() {
        return this.printTaskTiming();
    }

    public String printTaskTiming() {
        return "(by: " + this.taskTiming + ")";
    }
}
