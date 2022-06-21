package SERVICE;

import ENTITIES.SPID;
import ENTITIES.Status;
import ENTITIES.User;

import java.util.Date;

public class SPIDCommands extends SPID{

    public SPID createSPID() {
       setId(1);
       setDescription("This is a description");
       setUser(new User());
       setCreatedAt(new Date());
       setStatus(Status.PENDING);
       setModifiedAt(new Date());

        return null;
    }



}
