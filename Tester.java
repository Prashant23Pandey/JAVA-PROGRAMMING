public class Tester {
public static void main(String[] args) {
String stmt = "Java is a programming language. Java is a platform. Java is an Island.";
for(String token: stmt.split("\\s")) {
System.out.println(token+"");
}
}