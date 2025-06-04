/**
 * main
 */
public class TODO {
    public static void main(String[] args) {
        Task Task1 = new Task("finish homework", 3, 120);

        System.out.println(Task1);

        Task1.setEstMinsComplete(140);
        System.out.println(Task1);

        Task1.decreasePriority(1);
        System.out.println(Task1);
        Task1.decreasePriority(10);
        System.out.println(Task1);

        Task1.increasePriority(3);
        System.out.println(Task1);

        
    }
}