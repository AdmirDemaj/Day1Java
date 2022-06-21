package SERVICE;

import ENTITIES.SPID;
import ENTITIES.Status;
import ENTITIES.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MyProgramm {

    public static void main(String[] args) {

        List<SPID> SPIDList = new ArrayList<>();

        //Creating new User
        User user = new User(1, new Date(), new Date(), "Jeff", "Mitler", "Jeff Mitle");
        System.out.println("User created: "+ user.getUsername());
        User user1 = new User(2, new Date(), new Date(), "Scott", "Brown", "Scott Brown");
        System.out.println("User created: "+ user1.getUsername());
        User user2 = new User(3, new Date(), new Date(), "Admir", "Demaj", "Admir Demaj");
        System.out.println("User created: "+ user2.getUsername());


        //Creating new SPID and adding them into ArrayList
        SPID spid = new SPID(1 ,new Date(),new Date(), "This is SPID for user Jeff Mitler" ,user , Status.PENDING);

        SPIDList.add(spid);
        SPID spid1 = new SPID(2 , new Date() ,new Date(),"This is SPID for user Scott Brown" ,user1 , Status.PENDING);

        SPIDList.add(spid1);
        SPID spid2= new SPID(3, new Date(), new Date(),"This is SPID for user Admir Demaj", user2 , Status.PENDING);

        SPIDList.add(spid2);



        //Edit User Info
        user.setModifiedAt(new Date());
        user.setUsername("Jeff Mitler");



        //Edit SPID info
        spid.setModifiedAt(new Date());
        spid.setId(4);


        //Show List OF all SPID
        try {

            SPIDList.forEach(spid3 -> {
                System.out.println(spid3.getDescription());
            });
        }
        catch(Exception e) {
            System.out.println("Exception Caught");
        }


        // Show SPID connected to a USER and Changing the status to APPROVED if user has an SPID
        if(spid.getUser() != null){
            System.out.println("User " + spid.getUser().getUsername()  + " is connected to  SPID " + spid.getId());
            spid.setStatus(Status.APPROVED);
        }else {
            System.out.println("This user doest have any SPID");
            System.out.println(spid.getStatus());
        }

        if(spid1.getUser() != null){
            System.out.println("User " + spid1.getUser().getUsername() + " is connected to  SPID " + spid1.getId());
            spid1.setStatus(Status.APPROVED);
        }else {
            System.out.println("This user doest have any SPID");
            System.out.println(spid1.getStatus());
        }

        if(spid2.getUser() != null){
            System.out.println("User " + spid2.getUser().getUsername() + " is connected to  SPID" + spid2.getId());
            spid2.setStatus(Status.APPROVED);
        }else {
            System.out.println("This user doest have any SPID");
            System.out.println(spid2.getStatus());
        }

    }
}
