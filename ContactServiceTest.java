import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactServiceTest {

    @Test
    public void testAddContact(){
        ContactService contServ = new ContactService();

        Contact t1 = new Contact("1111", "Oleo", "Luberis", "123456789", "1234 wrong address st");

        assertEquals(true, contServ.newContact(t1));
    }

    @Test
    public void testDel(){
        ContactService contServ = new ContactService();

        Contact t1 = new Contact("1111", "Oleo", "Luberis", "123456789", "1234 wrong address st");
        Contact t2 = new Contact("1112", "Oleo", "Luberis", "123456789", "1234 wrong address st");
        Contact t3 = new Contact("1113", "Oleo", "Luberis", "123456789", "1234 wrong address st");

        contServ.newContact(t1);
        contServ.newContact(t2);
        contServ.newContact(t3);

        assertEquals(true, contServ.delContact("1111"));
        assertEquals(true, contServ.delContact("1112"));
        assertEquals(true, contServ.delContact("1113"));
    }

    @Test
    public void testUpdate(){
        ContactService contServ = new ContactService();

        Contact t1 = new Contact("1111", "Oleo", "Luberis", "123456789", "1234 wrong address st");
        Contact t2 = new Contact("1112", "Oleo", "Luberis", "123456789", "1234 wrong address st");
        Contact t3 = new Contact("1113", "Oleo", "Luberis", "123456789", "1234 wrong address st");

        contServ.newContact(t1);
        contServ.newContact(t2);
        contServ.newContact(t3);

        assertEquals(true, contServ.updateContact("1113", "Oleo", "Luberis", "123456789", "1234 wrong address st"));
        assertEquals(true, contServ.updateContact("1114", "Oleo", "Luberis", "123456789", "1234 wrong address st"));

    }
    }

