



import java.util.Scanner;

public class Patt_star_v_f {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        //  --method 1 (not much optimized)


        // for(int i = 1 ; i<=n;i++ ){
        //     for(int j =1;j<=n; j++){
        //         if(i+j >n )
        //         System.out.print("* ");
                
        //         else System.out.print("  ");
                
        //     }
        //     System.out.println();
        // }




        // method 2 

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



