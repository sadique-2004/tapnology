import java.util.Scanner;

class tranglrMirrer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the triangle:");

        int i,j,k, n= sc.nextInt();

        for (i=1; i<=n; i++) {
            // Print spaces
            for( j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for( k=1; k<=i; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}