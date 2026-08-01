import java.util.Arrays;

public class Question1 {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (s1, s2) -> Integer.compare(s2[k], s1[k]));
        return score;
    }
} {
    
}
