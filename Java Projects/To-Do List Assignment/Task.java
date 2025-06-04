public class Task {
    private String name;
    private int priority;
    private int estMinsComplete;

    public Task(String nameInit, int priorityInit, int estMinsCompleteInit){
        name = nameInit;
        priority = priorityInit;
        estMinsComplete = estMinsCompleteInit;
    }

    public String getName(){
        return name;
    }
    public int getPriority(){
        return priority;
    }
    public int getEstMinsComplete(){
        return estMinsComplete;
    }

    public void setName(String newName){
        name = newName;
    }
    public void setEstMinsComplete(int newTime){
        estMinsComplete = newTime;
    }

    public String toString(){
        return name + ": " + priority + ": " + estMinsComplete;
    }

    public void increasePriority(int amount){
        if(amount > 0){
            priority += amount;
        }
    }
    public void decreasePriority(int amount){
        if(priority-amount < 0){
            priority = 0;
        }else{
            priority -= amount;
        }
    }

    



    

}
