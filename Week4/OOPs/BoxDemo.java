public class BoxDemo {

    public static void main(String[] args) {

        Box b = new Box(10, 5);

        b.displayArea();

        Box3D b3 = new Box3D(10, 5, 8);

        b3.displayArea();

        b3.displayVolume();

    }
}
