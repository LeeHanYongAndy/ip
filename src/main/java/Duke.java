public class Duke {
    public static void introduction() {
        String logo = " ____        _        \n"
                + "|  _ \\ _   _| | _____ \n"
                + "| | | | | | | |/ / _ \\\n"
                + "| |_| | |_| |   <  __/\n"
                + "|____/ \\__,_|_|\\_\\___|\n";
        System.out.println("____________________________________________________________");
        System.out.println(logo);
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?");
        // Actions - To be added
        System.out.println("____________________________________________________________");

    }
    public static void ending() {
        // Completion & Exiting - To be added
        System.out.println("Bye. Hope to see you again soon!");
        System.out.print("____________________________________________________________");
    }
    public static void main(String[] args) {
        introduction();
        ending();
    }
}
