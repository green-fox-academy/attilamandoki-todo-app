import java.util.List;

public class Main {
  List<Task>tasks;

  public static void main(String[] args) {

    if (args.length == 0) {
      System.out.println(
              "Command Line Todo application\n" +
                      "=============================\n" +
                      "\n" +
                      "Command line arguments:\n" +
                      " -l   Lists all the tasks\n" +
                      " -a   Adds a new task\n" +
                      " -r   Removes a task\n" +
                      " -c   Completes a task");
      System.exit(0);

    }
    else if (args[0].equals("-l")) {
      System.out.println("Your tasks are: ");
      
    }
  }
}