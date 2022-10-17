import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class AppointmentService {
    List<Appointment> appList = new ArrayList<>();

    AppointmentService serv = new AppointmentService();

    private String newUniqueId(){
        return UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
    }

    public void deleteAppointment(String id)
        throws Exception {appList.remove(searchForAppointment(id));
    }

    private Appointment searchForAppointment(String id) throws Exception{
        int index = 0;

        while(index < appList.size()){
            if(id.equals(appList.get(index))){
                return appList.get(index);
            }
            index++;
        }
        throw new Exception("The appointment does not exists.");
    }

    public void addAppointment(Date date, String descr){
        Appointment appt = new Appointment(newUniqueId(), date, descr);
        appList.add(appt);
    }

    public void appointmentList(){

    }





}
