import java.util.Date;

public class Appointment {

    final private int APPOINTMENT_ID_LENGTH = 10;
    final private int APPOINTMENT_DESCRIPTION_LENGTH = 50;

    public String  apptId;
    public String descr;
    public Date apptDate;

    public Appointment(){
        Date today = new Date();
        apptDate = today;
    }

    public Appointment(String id){
        Date today = new Date();
        this.apptId = id;
        apptDate = today;
        updateApptId(id);
    }

    public Appointment(String id, Date date, String descr){
        updateApptId(id);
        updateDate(date);
        updateDescr(descr);
    }

    public Appointment(String id, Date date) {
        updateApptId(id);
        updateDate(date);
    }

    public void updateApptId(String id){
        if(id == null) {
            throw new IllegalArgumentException("Appointment error, can not be null");
        }
        else{
            if(id.length() > APPOINTMENT_ID_LENGTH){
                throw new IllegalArgumentException("Appointment Id value over excess of : " + APPOINTMENT_ID_LENGTH );
            }else{
                apptId = id;
            }
        }
    }

    public void setAppID(){

    }

    public String getApptDate(String id){
        return apptId;
    }

    public String getApptId(String id){
        return id;
    }

    public Date getApptDate(){
        return apptDate;
    }

    public void updateDescr(String descr){
        if(descr == null) {
            throw new IllegalArgumentException("Appointment description can not be null");
        }
        else{
            if(descr.length() > APPOINTMENT_DESCRIPTION_LENGTH){
                throw new IllegalArgumentException("Appointment Id value over excess of : " + APPOINTMENT_DESCRIPTION_LENGTH );
            }else{
                descr = descr;
            }
        }
    }

    public void updateDate(Date date){
        Date today = new Date();
        if(today == null) {
            throw new IllegalArgumentException("Appointment date can not be null");
        }
        else if
            (today.before(new Date())){
                throw new IllegalArgumentException("Appointment date not available.");
            }else{
                apptDate = date;
            }
        }

        public String getDescr(){
        return descr;
        }
    }




