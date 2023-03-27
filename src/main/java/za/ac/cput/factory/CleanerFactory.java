package za.ac.cput.factory;

import za.ac.cput.domain.Cleaner;
import za.ac.cput.util.CleanerHelper;

public class CleanerFactory {
    public static Cleaner buildCustomer(String firstName, String lastName, String phoneNumber, String email){
        if(CleanerHelper.isNullOrEmpty(firstName) == true || CleanerHelper.isValidEmail(lastName) == true) {
            return null;
        }

        if(!CleanerHelper.isValidEmail(email)){
            return null;
        }

        if(!CleanerHelper.isValidPhoneNumber(phoneNumber)){
            return null;
        }

        String CleanerStaffNumber = CleanerHelper.generateId();

        return new Cleaner.Builder().setStaffNumber(CleanerStaffNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
    }
}
