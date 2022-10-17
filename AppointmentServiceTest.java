import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class AppointmentServiceTest {
    private Date FDate;
    private Date PDate;
    private Date today;
    private String id;
    private String desc;


    @BeforeEach
    public void newSetup(){
        id = "123456789";
        desc = "New description";
        today = new Date();
    }

    @Test
    public void testNewApp(){
        AppointmentService appSer = new AppointmentService();
        List<Appointment> appList;

        appSer.addAppointment(FDate, "description of the appointment service ");

        assertNotNull(appSer.appList.getA
                //getAppointmentList().get(0).getAppointmentId());


    }

}
