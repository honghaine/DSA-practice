import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        BasicDSA basicDSA = new BasicDSA();
        int[] a = basicDSA.twoSum(nums, target);
        for (int b:a) {
            System.out.println(b);
        }
    }
}
