/*
    The job of this program is to perform Matrix calculations...
    like.
        Addition,substraction,multiplication,Transpose etc...
*/
package FirstRepo;
import java.util.Arrays;
import java.util.Scanner;

public class MatrixCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Press 1 for Addition");
            System.out.println("Press 2 for Substraction");
            System.out.println("Press 3 for Multiplication");
            System.out.println("Press 4 for Transpose");
            System.out.println("Press 5 for Determinant of 2x2 matrix");
            System.out.println("Press 6 to Exit the program");
            System.out.print("Which calculation do you want to perform:- ");
            int choice = sc.nextInt();
            if(choice==6){
                break;
            }
            else{
                if(choice==1){
                    addition();
                }else if(choice==2){
                    substraction();
                }else if(choice==3){
                    multiplication();
                }else if(choice==4){
                    transpose();  
                }else if(choice==5){
                    determinant();
                }else if(choice==6){
                    break;
                }
                else{
                    System.out.println("Invali choice!!");
                }

            }
        }
        sc.close();

    }

    public static void addition(){
        Scanner sc = new Scanner(System.in);
        int rows,cols;
        System.out.print("Enter row's number:- ");
        rows = sc.nextInt();
        System.out.print("Enter col's number:- ");
        cols = sc.nextInt();
        int[][] matA = new int[rows][cols];        
        int[][] matB = new int[rows][cols];
        int[][] add = new int[rows][cols];

        System.out.println("Enter matrix element's for matA:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter matrix element's for matB:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matB[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                add[i][j] = matA[i][j]+matB[i][j];
            }
        }
        System.out.println();
        System.out.println("The result of addition matrix is:");
        for(int i=0;i<rows;i++){
            System.out.println(Arrays.toString(add[i]));
        }
        sc.close();
        return;
    }
    public static void substraction(){
        Scanner sc = new Scanner(System.in);
        int rows,cols;
        System.out.print("Enter row's number:- ");
        rows = sc.nextInt();
        System.out.print("Enter col's number:- ");
        cols = sc.nextInt();
        int[][] matA = new int[rows][cols];        
        int[][] matB = new int[rows][cols];
        int[][] sub = new int[rows][cols];
        
        System.out.println("Enter matrix element's for matA:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter matrix element's for matB:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matB[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sub[i][j] = matA[i][j]+matB[i][j];
            }
        }
        System.out.println();
        System.out.println("The result of addition matrix is:");
        for(int i=0;i<rows;i++){
            System.out.println(Arrays.toString(sub[i]));
        }
        sc.close();
        return;
    }
    public static void multiplication(){
        Scanner sc = new Scanner(System.in);
        int rowA,rowB,colA,colB;
        do{
            System.out.print("Enter rowA number:- ");
            rowA = sc.nextInt();
            System.out.print("Enter colA number:- ");
            colA = sc.nextInt();
            System.out.print("Enter rowB number:- ");
            rowB = sc.nextInt();
            System.out.print("Enter colB number:- ");
            colB = sc.nextInt();
        }while(colA!=rowB);
        int[][] matA = new int[rowA][colA];        
        int[][] matB = new int[rowB][colB];
        int[][] mul = new int[rowA][colB];
        System.out.println("Enter matrix element's for matA:");
        for(int i=0;i<rowA;i++){
            for(int j=0;j<colA;j++){
                matA[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter matrix element's for matB:");
        for(int i=0;i<rowB;i++){
            for(int j=0;j<colB;j++){
                matB[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0;i<rowA;i++){
            for(int j=0;j<colB;j++){
                mul[i][j] = 0;
                for(int k=0;k<colA;k++){
                    mul[i][j]+=matA[i][k]*matB[k][j];
                }
            }
        }
        System.out.println();
        System.out.println("The result of addition matrix is:");
        for(int i=0;i<rowA;i++){
            System.out.println(Arrays.toString(mul[i]));
        }
        sc.close();
        return;
    }
    public static void transpose(){
        Scanner sc = new Scanner(System.in);
        int rows,cols;
        System.out.print("Enter row's number:- ");
        rows = sc.nextInt();
        System.out.print("Enter col's number:- ");
        cols = sc.nextInt();
        int[][] mat = new int[rows][cols];  
        int[][] trans = new int[cols][rows];      
        System.out.println("Enter matrix element's for matA:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int temp = mat[i][j];
                trans[j][i] = temp;
            }           
        }
        System.out.println("Transpose matrix is:");
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
        return;
    }
    public static void determinant(){
        Scanner sc = new Scanner(System.in);
        int rows,cols,det;
        System.out.print("Enter row's number:- ");
        rows = sc.nextInt();
        System.out.print("Enter col's number:- ");
        cols = sc.nextInt();
        int[][] mat = new int[rows][cols];        
        System.out.println("Enter matrix element's for matA:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j] = sc.nextInt();
            }
        }
        det = (mat[0][0]*mat[1][1])-(mat[1][0]*mat[0][1]);
        System.out.println("The determinant of matrix is "+det);
        sc.close();
        return;
    }

}
