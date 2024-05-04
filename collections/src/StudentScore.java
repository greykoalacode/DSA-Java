import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentScore that = (StudentScore) o;
        return maths == that.maths && physics == that.physics;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maths, physics);
    }
}
