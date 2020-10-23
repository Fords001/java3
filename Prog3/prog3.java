package Prog3;

public class prog3 {

    public static void main(String[] args) {

        int rowss = 5, kk = 0;

        for(int i = 1; i <= rowss; ++i,kk=0) {
            for(int space = 1; space <= rowss - i; ++space) {
                System.out.print("  ");//4,3,2,1 последнняя строка не пустая
            }

            while(kk != 2 * i - 1) {//1i=1,2i=3,3i=5,4i=7,5i=9
                System.out.print("+ ");
                kk++;//пока while не сравняется с правой частью не закончится цикл
            }

            System.out.println();//при завершении 2-х циклов while и for эта строка переносит на новую строку
            // и верхний цикл for начинается с нуля

        }



        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            for (int space = 1; space <= rows - i; space++) {// выводит только со 2 строки 1,2,3,4
                System.out.print("  ");
            }

            for (int j = i; j <= 2 * i - 1; j++) { //5.4.3.2.1
                System.out.print("+ ");
            }
            for (int j = 0; j < i - 1; j++) {//4.3.2.1.0
                System.out.print("+ ");
            }
            System.out.println();
        }
    }
}




