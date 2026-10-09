package za.ac.cput.vehiclesystem.factory;

import za.ac.cput.vehiclesystem.domain.Name;
import za.ac.cput.vehiclesystem.util.Helper;

public class NameFactory {

    public static Name createName(
            String firstName,
            String middleName,
            String lastName){

        if(Helper.isNullOrEmpty(firstName) || Helper.isNullOrEmpty(lastName)){
            return null;
        }

        Name.Builder b = new Name.Builder()
                .setFirstName(firstName)
                .setLastName(lastName);

        if(!Helper.isNullOrEmpty(middleName)){
            b.setMiddleName(middleName);
        }

        return new Name.Builder()
                .setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .build();
    }
}
