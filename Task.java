import java.io.Serializable;

public class Task implements Serializable {
    private String description;
    private boolean isCompleted;
    private String priority;

    public Task(String description, String priority) {
        this.description = description;
        this.priority = priority;
        this.isCompleted = false;
    }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public boolean isCompleted() { return isCompleted; }
    public void setCompleted(boolean isCompleted) { this.isCompleted = isCompleted; }
    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }

    @Override
    public String toString() {
        return (isCompleted ? "[Completed] " : "[Pending] ") + description + " (Priority: " + priority + ")";
    }
}
