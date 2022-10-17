import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContactTest {
    Contact contact = new Contact("1111", "firstName", "lastName","123456789","123 new address" );

    @Test
    public void getFName(){
        assertEquals("firstName", contact.getFName());
    }

    @Test
    public void getLName(){
        assertEquals("lastName", contact.getLName());
    }

    @Test
    public void getPNumber(){
        assertEquals("123456789", contact.getPNumber());
    }

    @Test
    public void getAddress(){
        assertEquals("123 new address", contact.getAddress());
    }
}
