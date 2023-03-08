import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter width: ");
                    int width = scanner.nextInt();
                    System.out.print("Enter height: ");
                    int height = scanner.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.print("Enter size: ");
                    int sizeTGV = scanner.nextInt();
                    for (int i = 0; i < sizeTGV; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = sizeTGV - 1; i > 0; i--) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Enter size: ");
                    int sizeTamGiac = scanner.nextInt();
                    for (int i = 0; i < sizeTamGiac; i++) {
                        for (int j = sizeTamGiac - i; j > 1; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < 2 * i + 1; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exit...");
                    break;
                default:
                    System.out.println("Không có ");
                    break;
            }
        } while (choice != 4);

        scanner.close();
    }
}
