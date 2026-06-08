public class LibraryInterfaceDemo {
    public static void main(String[] args) {

        System.out.println("===== Test Case #1 : Kid User =====");
        KidUsers kid = new KidUsers();

        kid.age = 10;
        kid.registerAccount();

        kid.age = 18;
        kid.registerAccount();

        kid.bookType = "Kids";
        kid.requestBook();

        kid.bookType = "Fiction";
        kid.requestBook();

        System.out.println("\n===== Test Case #2 : Adult User =====");

        AdultUser adult = new AdultUser();

        adult.age = 5;
        adult.registerAccount();

        adult.age = 23;
        adult.registerAccount();

        adult.bookType = "Kids";
        adult.requestBook();

        adult.bookType = "Fiction";
        adult.requestBook();
    }
}