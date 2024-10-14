import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        BasicDSA basicDSA = new BasicDSA();
        int[] a = basicDSA.twoSum(nums, target);
        for (int b : a) {
            System.out.println(b);
        }

        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);


        System.out.println(basicDSA.reverseList(node1));
    }
}
