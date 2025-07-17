public class Print {
    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello " + name);
        } else {
            System.out.println("Enter a name in the command line argument");
        }
    }
    public static void printName(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello " + name);
        } else {
            System.out.println("Enter a name in the command line argument");
        }
    }
}
