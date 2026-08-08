public class Demo {
    public static void main(String[] args) {
        String s1 = new String();
        String s2 = new String("Demostring");
        String s3 = new String("Demostring");
        String s4 = new String("Demostring");
        String s5 = new String("Demo"); 
        System.out.println(s3.concat("RRRRR").hashCode());
    }
}