public public class AppendCapitalLetters { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a string: "); 
        String str = sc.nextLine(); 
        String capitals = ""; 
        for (int i = 0; i < str.length(); i++) { 
            char ch = str.charAt(i); 
            if (Character.isUpperCase(ch)) { 
                capitals = capitals + ch; } } 
                System.out.println("Capital letters appended: " + capitals); } } {

}