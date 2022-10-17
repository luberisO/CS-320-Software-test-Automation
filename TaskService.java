import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TaskService {
    private String name, desc, id;

    public static List<String> taskL = new ArrayList<String>();
     ArrayList<Task> arrayL;

    public boolean addTask(Task newTask){
        boolean fTask = false;

        for(Task taskL : arrayL){
            if(taskL.getId().equalsIgnoreCase(newTask.getId())){
                fTask = true;
                break;
            }
        }
        if(!fTask){
            arrayL.add(newTask);
            return true;
        }else{
            return false;
        }
    }

    public boolean delTask(String id){
        boolean del = false;

        for(Task taskL : arrayL){
            if(taskL.getId().equalsIgnoreCase(id)){
                arrayL.remove(taskL);
                del = true;
                break;
            }
        }
        return del;
    }

    public boolean updateName(String id, String newName){
        boolean uName = false;

        for(Task taskL : arrayL){
            if(taskL.getId().equalsIgnoreCase(id)){
                taskL.setName(newName);
                uName = true;
                break;
            }
        }
        return uName;
    }


}
