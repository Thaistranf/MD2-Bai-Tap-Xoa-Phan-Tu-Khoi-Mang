import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int valueDelete;
        int index = 0;


            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập phần tử cần xóa: ");
            valueDelete = sc.nextInt();

            boolean checkInput = false;
            for (int i = 0; i < arr.length; i++) {
                if (valueDelete == arr[i]) {
                    System.out.println("Phần tử " + valueDelete + " tại vị trí " + i);
                    index = i;
                    checkInput = true;
                    break;
                }
            }
            if (!checkInput){
                System.out.printf("Phần tử " + valueDelete + " không có trong mảng");
            }
        if (checkInput){
            int[] newArray = new int[arr.length -1];
            for (int i = 0; i < index; i++) {
                newArray[i] = arr[i];
            }
            for (int i = index; i < newArray.length; i++) {
                newArray[i] = arr[i+1];
            }
            arr = newArray;
            System.out.print("Result: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
        }
    }
}