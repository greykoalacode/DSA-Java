public class StudentScore implements Comparable<StudentScore> {
    private int maths;
    private int physics;

    public StudentScore(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }

    public int getMaths() {
        return maths;
    }

    public int getPhysics() {
        return physics;
    }

    @Override
    public String toString() {
        return "StudentScore{" +
                "maths=" + maths +
                ", physics=" + physics +
                '}';
    }

    @Override
    public int compareTo(StudentScore o) {
        return o.maths - this.maths;
    }
}
