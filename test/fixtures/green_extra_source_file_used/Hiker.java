public class Hiker {

    public static int answer(int lhs, int rhs) {
        return Checksum.of(lhs * rhs);
    }
}
