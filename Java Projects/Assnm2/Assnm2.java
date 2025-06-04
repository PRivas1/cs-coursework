import javax.swing.plaf.synth.SynthEditorPaneUI;

/**
 * Assnm2
 */
public class Assnm2 {
    public static void main(String[] args) {
        firstLines(1);
        cat();

        firstLines(2);
        hen();
        cat();

        firstLines(3);
        duck();
        hen();
        cat();

        firstLines(4);
        goose();
        duck();
        hen();
        cat();

        firstLines(5);
        sheep();
        goose();
        duck();
        hen();
        cat();

        firstLines(6);
        pig();
        sheep();
        goose();
        duck();
        hen();
        cat();

    }
    public static void firstLines(int animal) {
        if (animal == 1) {
            System.out.println("Bought me a cat and the cat pleased me,\nI fed my cat under yonder tree.");
        } else if (animal == 2) {
            System.out.println("Bought me a hen and the hen pleased me,\nI fed my hen under yonder tree.");
        } else if (animal == 3) {
            System.out.println("Bought me a duck and the duck pleased me,\nI fed my duck under yonder tree.");
        } else if (animal == 4) {
            System.out.println("Bought me a goose and the goose pleased me,\nI fed my goose under yonder tree.");
        } else if (animal == 5) {
            System.out.println("Bought me a sheep and the sheep pleased me,\nI fed my sheep under yonder tree.");
        } else if (animal == 6) {
            System.out.println("Bought me a pig and the pig pleased me,\nI fed my pig under yonder tree.");
        }
    }

     public static void cat() {
        System.out.println("Cat goes fiddle-i-fee.\n");
    }

    public static void hen() {
        System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
    }

    public static void duck() {
        System.out.println("Duck goes quack, quack,");
    }

    public static void goose() {
        System.out.println("Goose goes hissy, hissy,");
    }

    public static void sheep() {
        System.out.println("Sheep goes baa, baa,");
    }

    public static void pig() {
        System.out.println("Pig goes oink, oink,");
    }
    
}