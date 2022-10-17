import java.util.Comparator;

public class Task {

    private String id;
    private String desc;
    private String name;

    private int index;

    public Task(String id, String desc, String name){
        if(id.length() <= 10 && id != null) {
            this.id = id;
        }
            this.desc = desc;
            this.name = name;
    }

    public String getId(){
        return id;
    }

    public String getDesc(){
        return desc;
    }

    public String getName(){
        return name;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setDescription(String desc){
        if(desc.length() <= 50 && desc != null) {
            this.desc = desc;
        }
    }

    public void setName(String name){
        if(name.length() <= 20 && name != null) {
            this.name = name;
        }
    }

    @Override
    public String toString(){
        return "Task ID is : " + getId() + "\n Name: " + getName() + "\n Description: "  +getDesc() + "\n";
    }



    public static Comparator<Task> compByID = new Comparator<Task>() {
        @Override
        public int compare(Task Tas1, Task Tas2) {
            return Tas1.getId().compareTo(Tas2.getId());
        }
    };



}
