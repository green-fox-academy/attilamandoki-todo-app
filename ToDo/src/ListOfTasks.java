public class ListOfTasks {

  private String tasks;
  private Boolean isDone;

  public ListOfTasks(String tasks, Boolean isDone) {
    this.tasks = tasks;
    this.isDone = isDone;
  }

  public String getTasks() {
    return tasks;
  }

  public void setTasks(String tasks) {
    this.tasks = tasks;
  }

  public Boolean getDone() {
    return isDone;
  }

  public void setDone(Boolean done) {
    isDone = done;
  }
}
