package SERVICE;

import ENTITIES.SPID;
import ENTITIES.User;

import java.util.Date;

public class UserCommands extends User {

    public User createUser() {
        setId(1);
        setName("Dean");
        setSurname("Meko");
        setCreatedAt(new Date());
        setModifiedAt(new Date());
        setUsername("Dean Meko");
        return null;
    }

}
