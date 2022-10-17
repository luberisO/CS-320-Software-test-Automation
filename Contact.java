import static java.lang.constant.ConstantDescs.NULL;

public class Contact {

        //create length limited var's
        private static final int CONTACT_ID_LENGTH = 10;
        private static final byte CONTACT_FNAME_LENGTH = 10;
        private static final byte CONTACT_LNAME_LENGTH = 10;
        private static final byte CONTACT_PNUMBER_LENGTH = 10;
        private static final byte CONTACT_ADDRESS_LENGTH = 30;

        //define contact var's
        private String contactID;
        private String FName;
        private String LName;
        private String PNumber;
        private String Address;

        //Instantiate contact object
        public Contact(String contactID, String fName, String lName, String PNumber, String address) {
            this.contactID = contactID;
            this.FName = fName;
            this.LName = lName;
            this.PNumber = PNumber;
            this.Address = address;

        }

        //create getters
        public String getContactID() {
            return contactID;
        }

        public String getFName() {
            return FName;
        }

        public String getLName() {
            return LName;
        }

        public String getPNumber() {
            return PNumber;
        }

        public String getAddress() {
            return Address;
        }

        //create setters
        public void setContactID(String contactID) {
            if (contactID == NULL) {
                throw new IllegalArgumentException("First name cannot be NULL");
            } else if (contactID.length() > CONTACT_FNAME_LENGTH) {
                throw new IllegalArgumentException("First name must not pass " + CONTACT_ID_LENGTH + " Length");
            } else {
                this.contactID = contactID;
            }
        }

        public void setFName(String fName) {
            if (fName == NULL) {
                throw new IllegalArgumentException("First name cannot be NULL");
            } else if (fName.length() > CONTACT_FNAME_LENGTH) {
                throw new IllegalArgumentException("First name must not pass " + CONTACT_FNAME_LENGTH + " Length");
            } else {
                this.FName = fName;
            }

        }

        public void setLName(String LName) {
            if (LName == NULL) {
                throw new IllegalArgumentException("Last name cannot be NULL");
            } else if (LName.length() > CONTACT_LNAME_LENGTH) {
                throw new IllegalArgumentException("Last name must not pass " + CONTACT_LNAME_LENGTH + " Length");
            } else {
                this.LName = LName;
            }
        }

        public void setPNumber(String PNumber) {
            if (PNumber == NULL) {
                throw new IllegalArgumentException("Phone number cannot be NULL");
            } else if (PNumber.length() > CONTACT_PNUMBER_LENGTH) {
                throw new IllegalArgumentException("Phone number length must be: " + CONTACT_PNUMBER_LENGTH + " digits only");
            } else {
                this.PNumber = PNumber;
            }
        }

        public void setAddress(String Address) {
            if (Address == NULL) {
                throw new IllegalArgumentException("Address cannot be NULL");
            } else if (Address.length() > CONTACT_ADDRESS_LENGTH) {
                throw new IllegalArgumentException("Address cannot be longer than " + CONTACT_ADDRESS_LENGTH);
            } else {
                this.Address = Address;
            }

        }


}




