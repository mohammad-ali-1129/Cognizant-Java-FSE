public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        if (nums.length == 0) {
            System.out.println(0);
            return;
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        int k = i + 1;

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");
        for (int x = 0; x < k; x++) {
            System.out.print(nums[x] + " ");
        }
    }
}