import java.util.Scanner;
public class task_two {
    static void func(String n){
        int vow = 0;
        int cons = 0;
        for(int i = 0;i<n.length();i++){
            char ch = n.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vow++;
            }
            else{
                cons++;
            }
        }
            // Printing
            if(vow>1){
                System.out.println("Number of vowels are :"+vow);
            }
            else{
                System.out.println("Number of vowel is :"+vow);
            }

            if(cons>1){
                System.out.println("Number of consonants are :"+cons);
            }
            else{
                System.out.println("Number of consonant is :"+cons);
            }
        
    }
    // Nooting..
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        System.out.print("Enter a string: ");
        s = input.nextLine();
        func(s);
    }
}
