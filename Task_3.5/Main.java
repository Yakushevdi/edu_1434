 /*
Задание: Дан массив с числами. Выведите последовательно его элементы используя рекурсию и не используя цикл.
*/

public class Main {
    public static void main(String[] args) {

        int num[] = {4, 2, 6, 2, 65};
        showItems(num, 0);
    }
    public static void showItems(int nums[], int index){
        if (index< nums.length){
            System.out.println(nums[index]);
            index++;
            showItems(nums, index);

        }
    }
}
