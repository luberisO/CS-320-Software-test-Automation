import java.util.List;
import java.util.UUID;
import java.util.ArrayList;

public class ContactService {
    private List<Contact> contactL = new ArrayList<>();

    public Boolean newContact(Contact newContact) {
        boolean exists = false;
        for (Contact i : contactL) {
            if (i.getContactID().equalsIgnoreCase(newContact.getContactID())) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            contactL.add(newContact);
            return true;
        } else {
            return false;
        }
    }

    public boolean delContact(String id){
        boolean del = false;

        for(Contact i: contactL){
            if(i.getContactID().equalsIgnoreCase(id)){
                contactL.remove(i);
                del = true;
                break;
            }
        }
        return del;
    }

    public boolean updateFName(String id, String newFName){
        boolean update = false;

        for(Contact i: contactL){
            if(i.getContactID().equalsIgnoreCase(id)){
                i.setFName(newFName);
                update = true;
                break;
            }
        }
        return update;
    }

    public boolean updatePNumber(String id, String newPNumber){
        boolean update = false;

        for(Contact i: contactL){
            if(i.getContactID().equalsIgnoreCase(id)){
                i.setPNumber(newPNumber);
                update = true;
                break;
            }
        }
        return update;
    }

    public boolean updateLName(String id, String newLName){
        boolean update = false;

        for(Contact i: contactL){
            if(i.getContactID().equalsIgnoreCase(id)){
                i.setLName(newLName);
                update = true;
                break;
            }
        }
        return update;
    }

    public boolean updateAddress(String id, String newAddress){
        boolean update = false;

        for(Contact i: contactL){
            if(i.getContactID().equalsIgnoreCase(id)){
                i.setAddress(newAddress);
                update = true;
                break;
            }
        }
        return update;
    }

    public boolean updateContact(String id, String FName, String LName, String PNumber, String address){
        //Contact NewCon = Contact(id,FName,LName,PNumber,address);
        boolean isPresent = false;

        for(Contact contactList : contactL){
            if(contactList.equals(contactL)){
                isPresent = true;
            }
        }
        //contactL.add(Contact());

        return true;
    }

    public void showAll(){
        for(Contact i: contactL){
            System.out.println(i.toString());
        }
    }

}
