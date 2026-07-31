@FunctionalInterface
interface I1 {
    void abc();
}
class DemoL1 {
    public static void main(String[] args) {
        I1 a = () -> {
            System.out.println("Hello Lambda");
        };
        a.abc();
    }
}