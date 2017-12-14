import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ModifyElements {
  ArrayList<Task> task;

  public ModifyElements() {
    this.task = new ArrayList<>();
  }

  public void addToList() {
    task.toString();
    return;
  }

  public void writeToFile(List<String> task) {
    try {
      Path filePath = Paths.get("ToDo.txt");
      Files.write(filePath, task, StandardOpenOption.APPEND);
    } catch (Exception e) {
      System.out.println("Unable to write file: my-file.txt");
    }
  }
}


