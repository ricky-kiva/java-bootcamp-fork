import java.util.Arrays;

public class FixedArrays {
    public static void main(String[] args) {
        String[] group = new String[] {"Sam", "Noah", "Liam"};
        String[] newGroup = new String[group.length+1];
        for (int i = 0; i < newGroup.length; i++) {
            if (i == newGroup.length-1) {
                newGroup[i] = "Sarah";
            } else {
                newGroup[i] = group[i];
            }
        }
        System.out.println(Arrays.toString(newGroup));
    }
}
