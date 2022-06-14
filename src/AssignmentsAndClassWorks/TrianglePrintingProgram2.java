package AssignmentsAndClassWorks;

public class TrianglePrintingProgram2 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = 1, c = 1; i <= n; i++, c++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            int b = c;
            for (int j = 1; j < i; j++) {
                System.out.print(b--);
            }
            for (int j = 1,k = 1; j <= i; j++, k++) {
                System.out.print(k);
            }

            System.out.println();
        }
        for (int i = 1, c = 1; i <= n; i++, c++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j < i; j++) {
                System.out.print(c);
            }
            for (int j = 1,k = 1; j <=i; j++, k++) {
                System.out.print(c);
            }

            System.out.println();
        }
    }
}