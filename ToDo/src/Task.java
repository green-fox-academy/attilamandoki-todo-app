public class Task {

  private String task;
  private Boolean isDone;

  public Task(String task, Boolean isDone) {
    this.task = task;
    this.isDone = isDone;
  }

  public String getTask() {
    return task;
  }

  public void setTask(String task) {
    this.task = task;
  }

  public Boolean getDone() {
    return isDone;
  }

  public void setDone(Boolean done) {
    isDone = done;
  }
}
