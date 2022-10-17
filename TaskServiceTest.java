import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

public class TaskServiceTest {
    public static List<Task> tasks1 = new ArrayList<>();

    public boolean addT(Task task){
        int index = tasks1.indexOf(task);

        if(index < 0 && validateID(task.getId()) && validateName(task.getName()) && validateDesc(task.getDesc())){
            return true;
        }
        return false;
    }

    @Test
    public void validTaskData(){
        Task task2 = new Task("00001","Reading", "Read Scientific Book");

        addT(task2);
        System.out.print("New Task : " + task2);
    }

    @Test
    public void invalidID(){
        Task task2 = new Task("00002","Playing", "Xbox 1");
        addT(task2);
        System.out.println("size : " + task2);
    }

    public boolean validateID(String id){
        if(id != null && id.length() <= 10){
            return true;
        }
        return false;
    }

    public boolean validateName(String name){
        if(name != null && name.length() <= 20){
            return true;
        }
        return false;
    }

    public boolean validateDesc(String desc){
        if(desc != null && desc.length() <= 50){
            return true;
        }
        return false;
    }
}
