package za.ac.cput.util;

import java.util.UUID;

/*
StaffTypeHelper.java
Class for util.StaffTypeHelper
Author: Ethan Andrew Botes 220101299
 */


public class StaffTypeHelper {

    public static boolean isNullOrEmpty(String str){
        if(str == null || str.isEmpty()){
            return true;
        }
        return false;
    }

    public static boolean isValidPositionType(String positionType){
        if(positionType == "Waiter" || positionType == "Manager" || positionType == "Owner" || positionType == "Barista" ||
                positionType == "Chef" || positionType == "Chef"){
            return true;
        }
        return false;
    }


    public static String generateId(){
        return UUID.randomUUID().toString();
    }


}
