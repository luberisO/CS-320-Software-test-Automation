import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class AppointmentTest {
    private String id;
    private String descr;
    private String lenWrongId;
    private String lenWrongDesc;
    private Date date;
    private Date oldDate;

    @BeforeEach
    public void testEach(){
        id = "123456789";
        descr = "This object will have  a description.";
        lenWrongId = "122333444455555666666777777788888888999999999";
        lenWrongDesc = "This description is the wrong length and considered to long for the variable";
        oldDate = new Date(0);
    }

    @Test
    public void testUpdateDate(){
        Date today = new Date();
        Appointment appt = new Appointment(id);

        assertThrows(IllegalArgumentException.class, () -> appt.updateDate(today));
        assertThrows(IllegalArgumentException.class, () -> appt.updateDate(oldDate));

        appt.updateDate(today);
        assertEquals(today, appt.getApptDate());
    }

    @Test
    public void testUpdApptID(){
        Appointment appt = new Appointment();

        assertThrows(IllegalArgumentException.class, () -> appt.getApptId(null));
        assertThrows(IllegalArgumentException.class, () -> appt.getApptId(lenWrongId));

        appt.updateApptId(id);
        //assertEquals(id, appt.getApptId(id));
    }

    @Test
    public void testGetDescr(){
        Appointment appt = new Appointment();

        assertNotNull(appt.getDescr());
        assertTrue(appt.getDescr().length() <= 50);
        assertEquals(descr, appt.getDescr());
    }

    @Test
    public void testGetApptDate(){
        Date today = new Date();
        Appointment appt = new Appointment(id, today);

        assertNotNull(appt.getApptDate());
        assertEquals(today, appt.getApptDate());
    }

    @Test
    public void testUpdateDescr(){
        Appointment appt = new Appointment(id, date, descr);

        assertNotNull(appt.getDescr());
        assertTrue(appt.getDescr().length() <= 50);
    }

}
