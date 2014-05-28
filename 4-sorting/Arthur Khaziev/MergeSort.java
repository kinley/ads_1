
public class MergeSort {
    static void mergeSort(int[] array, int begin, int end) {
        if (end > 1) {
            int n1 = end / 2;                      //���������� ������� ��������
            int n2 = end - n1;                     //���������� �������� �����
            mergeSort(array, begin, n1);           //���������� ��������
            mergeSort(array, begin + n1, n2);      //� ������ 2 �������� �����
            merge(array, begin , n1, n2);          //����� �������
        }
    }

    private static void merge(int[] array, int begin, int n1, int n2) {    //������� ����� �������
        int[] temp = new int[n1 + n2];
        int count = 0;
        int index1 = 0;
        int index2 = 0;
        while (index1 < n1 && index2 < n2) {
            if (array[begin + index1] < array[begin + n1 + index2]) {  //���������� ��� ��������� ��������
                temp[count++] = array[begin + (index1++)];
            } else {
                temp[count++] = array[begin + n1 + (index2++)];
            }
        }
        while (index1 < n1) {
            temp[count++] = array[begin + (index1++)];
        }
        while (index2 < n2) {
            temp[count++] = array[begin + n1 + (index2++)];
        }
        for (int i = 0; i < n1 + n2; i++){                    //���� �������� �������������� ��������� � ������
            array[begin + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] x = { 9, 8, 7, 6, 5, 4, 3 };
        mergeSort(x, 0, x.length);
        for(int i = 0; i < x.length; i++){
            System.out.print(x[i]+" ");
        }
    }
}

