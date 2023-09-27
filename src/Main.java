public class Main {
    public static void main(String[] args) {
        User admin = new User("admin","azerty");
        User tom = new User("Tom","123", 30);

        admin.displayProps();
        tom.displayProps();
       }
}
