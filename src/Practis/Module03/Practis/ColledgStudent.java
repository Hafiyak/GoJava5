package Practis.Module03.Practis;

/**
 * Created by user on 14.03.2017.
 */
public class ColledgStudent extends Student {

    private String collegeName;
    private int rating;
    private long id;

    ColledgStudent(String firstName, String lastName, int group){
        super(firstName,lastName,group);
    }

    ColledgStudent(String lastName, Course[] coursesTaken){
        super(lastName, coursesTaken);
    }

    public ColledgStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
