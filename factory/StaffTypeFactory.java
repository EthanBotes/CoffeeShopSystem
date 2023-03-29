package za.ac.cput.factory;

/*
StaffTypeFactory.java
Class for factory.StaffTypeFactory
Author: Ethan Andrew Botes 220101299
 */


import za.ac.cput.domain.Staff;
import za.ac.cput.domain.StaffType;
import za.ac.cput.util.StaffHelper;
import za.ac.cput.util.StaffTypeHelper;

public class StaffTypeFactory {

    public static StaffType buildStaffType(String positionType){
        if(StaffTypeHelper.isNullOrEmpty(positionType)){
            return null;
        }

        String positionId = StaffTypeHelper.generateId();

        if (!StaffTypeHelper.isValidPositionType(positionType)){
        return null;
    }

        return new StaffType.Builder().setPositionType(positionType)
                .setPositionId(positionId)
                .build();

    }


}
