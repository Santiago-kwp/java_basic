package java_advanced_01.day14.collection;

public class Int3dArrayEx {
    public static void main(String[] args) {

        Integer[][][] data_list = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 11, 12}
                }
        };

        for (int i = 0; i < data_list.length; i++) {
            for (int j =0; j < data_list[i].length; j++) {
                for (int k =0; k < data_list[i][j].length; k++) {
                    if (data_list[i][j][k] == 5)
                        System.out.printf("5의 인덱스는: (%d, %d, %d)",i,j,k);
                }
            }
        }
    }
}
