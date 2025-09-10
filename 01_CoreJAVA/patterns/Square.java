import java.util.Scanner;

class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square:");

        int i,j;
        int n = sc.nextInt();
        // for (i = 0; i < n; i++) {
        //     for (j = 0; j < n; j++) {
        //         System.out.print("s ");
        //     }
        //     System.out.println();
        // }


        // printing square 

        for( i = 0; i<n; i++) {
            for( j=0; j<n; j++){
                if ( i+1 < 10) {
                    System.out.print("0");
                }
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }
}