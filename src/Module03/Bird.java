package Module03;

/**
 * Created by user on 15.01.2017.
 */
public class Bird {
    public String sing(String s) {
        return s + "ing";
    }

    private String sing() {
        return "Bird";
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println("I am " + bird.sing("walk"));
        System.out.println("I am " + bird.sing("fly"));
        System.out.println("I am " + bird.sing("sing"));
        System.out.println("I am " + bird.sing());
    }

}
