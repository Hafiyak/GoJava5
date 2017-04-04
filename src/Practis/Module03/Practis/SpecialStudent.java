package Practis.Module03.Practis;

/**
 * Created by user on 14.03.2017.
 */
public class SpecialStudent extends ColledgStudent {

    private long secretKey;
    private String email;

    SpecialStudent(String firstName, String lastName, int group){
        super(firstName, lastName, group);
    }

    SpecialStudent(String lastName, Course[] coursesTaken){
        super(lastName, coursesTaken);
    }

    public SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id, long secretKey, String email) {
        super(firstName, lastName, group, collegeName, rating, id);
        this.secretKey = secretKey;
        this.email = email;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
