package niuke.search;


public class Find {

    public boolean Find(int target, int [][] array) {
        int row = 0, column = array[0].length - 1;
        while (row < array.length && column >= 0) {
            if (target == array[row][column]) {
                return Boolean.TRUE;
            }else if (target > array[row][column]){
                row++;
            }else {
                column--;
            }
        }
        return Boolean.FALSE;
    }
}
