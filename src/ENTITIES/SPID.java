package ENTITIES;

import java.util.Date;

public class SPID extends Base {

    public String description;
    private User user;
    Status status = Status.PENDING;


    public SPID() {

    }


    public SPID(int id,Date createdAt, Date modifiedAt,String description, User user, Status status) {
        super(id, createdAt, modifiedAt);
        this.description = description;
        this.user = user;
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
