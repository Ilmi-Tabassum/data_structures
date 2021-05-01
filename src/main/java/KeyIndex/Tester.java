package KeyIndex;


public class Tester {

    public static  void main(String[] args) {

        int[] Array = {0, 4, 1, 8, 4, 1, 10, 9};
        int min = Array[0];
        for (int i = 1; i < Array.length; i++) {
            if (min > Array[i]) {
                min = Array[i];
            }
        }
        int lon = min * (-1);
        keyIndexSearch key = new keyIndexSearch(Array, lon);
        System.out.println(key.searchElem(lon));
        System.out.println("Arrange in Ascending Order");
        key.sort(lon);
    }
}



