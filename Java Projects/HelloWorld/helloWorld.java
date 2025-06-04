/**
 * helloWorld
 */
import java.util.Random;

public class helloWorld {

    public static void main(String[] args) throws InterruptedException {
        String targetWord = "Hello World";
        String output = "";
        Random rand = new Random();

        
        for(int i=0; i<targetWord.length(); i++){
            if(targetWord.charAt(i) == ' '){
                output = output + " ";
                System.out.println(output);
                Thread.sleep(20);
            }else{
                char x = (char)(rand.nextInt(26) + 'a');
                int c = 0;
                while(x != targetWord.charAt(i) && c < 10){
                    c++;
                    System.out.println(output + x);
                    Thread.sleep(20);
                    x = (char)(rand.nextInt(26) + 'a');
                }
                output = output+targetWord.charAt(i);
                System.out.println(output);
            }
        }
        
    }
}