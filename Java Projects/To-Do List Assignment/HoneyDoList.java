public class HoneyDoList {
    Task tasks[];
    int numTasks;
    int INITIAL_CAPACITY = 10;

    public HoneyDoList(){
        tasks = new Task[INITIAL_CAPACITY];
        numTasks = 0;
    }

    public String toString(){
        if(numTasks == 0){
            return "";
        }
        String returnString = "";
        for(int i=0; i<numTasks; i++){
            returnString+= " " + tasks[i];
        }
        return returnString;
    }

    public int find(String name){
        for(int i=0; i<numTasks; i++){
            if(tasks[i].getName() == name){
                return i;
            }
        }
        return -1;
    }

    public void addTask(Task inputTask){
        tasks[numTasks+1] = inputTask;
        numTasks++;
    }

    public int totalTime(){
        int time = 0;
        for(int i=0; i<numTasks; i++){
            time+= tasks[i].getEstMinsComplete();
        }
        return time;
    }

    public int shortestTime(){
        int lowest = -1;
        int index = -1;
        for(int i=0; i<numTasks; i++){
            if(tasks[i].getEstMinsComplete() < lowest){
                lowest = tasks[i].getEstMinsComplete();
                index = i;
            }
        }
        return index;
    }

    public Task completeTask(int index){
        if(index <0 || index > numTasks){
            return null;
        }
        tasks[numTasks+1] = tasks[index];
        for(int i=index; i<numTasks; i++){
            tasks[i] = tasks[i+1];
        }
        return tasks[numTasks];
    }

    public Task getTask(int index){
        if(index < 0 || index > numTasks){
            return null;
        }
        return tasks[index];
    }


}
