public class Main {

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

      for (int i = 0; i < args.length; i++) {
        System.out.println("Argument " + i + ": " + args[i]);
      }

      if (args[0].equals("-a")) {
        System.out.println("Here should be a function that adds " + args[1] + " todo to your list.");
      }
    }
  }
}