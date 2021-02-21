import pkg.*;

public class Referee {

    Picture solution;
    Picture problem;

    public Referee() {
        this.solution = new Picture();
        this.problem = new Picture();
    }

    public Referee(Picture solution) {
        this.solution = solution;
        this.problem = shuffle();

    }

    public Boolean validate() {
        return (solution == problem);
    }

    public Picture shuffle() {
        Picture temp = solution;
        problem = temp;
        return temp;
    }

}
