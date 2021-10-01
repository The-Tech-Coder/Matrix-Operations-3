import java.util.Scanner;
class GFG{

    static int mean(int a[][], int n){
        
        int sum = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                sum = sum + a[i][j];
        
        return sum / (n * n);
    }

    static int variance(int a[][], int n, int m){
        int sum = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                a[i][j] = a[i][j] - m;

                a[i][j] = a[i][j] * a[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
            }
        }
        
        return sum / (n * n);
    }

    public static void main (String[] args) {

    int mat[][] = new int[3][3];
    Scanner x = new Scanner(System.in);
    System.out.println("Enter the elements for 1st matrix row-wise:");
    for(int i=0;i<3;i++){    
    for(int j=0;j<3;j++){    
            mat[i][j] = x.nextInt(); 
        }    
            System.out.println();
    }    
    x.close();  

    // for mean
    int m = mean(mat, 3);

    // for variance
    int var = variance(mat, 3, m);

    // for standard deviation
    double dev = (int)Math.sqrt(var);

    // displaying variance deviation
    System.out.println("Mean: " + m);
    System.out.println("Variance: " + var);
    System.out.println("Deviation: " + (int)dev);
    }
}

