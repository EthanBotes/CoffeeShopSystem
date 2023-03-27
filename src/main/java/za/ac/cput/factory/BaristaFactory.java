package za.ac.cput.factory;

import za.ac.cput.domain.Barista;
import za.ac.cput.util.BaristaHelper;

public class BaristaFactory {
    public static Barista buildBarista(String firstName, String lastName, String phoneNumber, String email){
        if(BaristaHelper.isNullOrEmpty(firstName) == true || BaristaHelper.isValidEmail(lastName) == true) {
            return null;
        }

        if(!BaristaHelper.isValidEmail(email)){
            return null;
        }

        if(!BaristaHelper.isValidPhoneNumber(phoneNumber)){
            return null;
        }

        String BaristaStaffNumber = BaristaHelper.generateId();

        return new Barista.Builder().setStaffNumber(BaristaStaffNumber)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
    }
}
