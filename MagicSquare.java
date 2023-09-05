/*
Name : Sundareshwaran J
Roll Number : 20UIT037
Program Name : Magic Square Checking
*/
import java.util.*;
class Series
{
    Scanner scan = new Scanner(System.in);
    int i,j,row,col,mat[][],rowsum,colsum,dia1,dia2;
    
    int check()
    {
        row = scan.nextInt();
        col = scan.nextInt();
        return row;
    }
    void getInput()
    {
        mat = new int[row][col];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                mat[i][j] = scan.nextInt();
            }
        }
    }
    int rowSum()
    {
        for(i=0;i<row;i++)
        {
            rowsum = 0;
            for(j=0;j<col;j++)
            {
                rowsum += mat[i][j];
            }
        }
        return rowsum;
    }
    int colSum()
    {
        for(i=0;i<row;i++)
        {
            colsum = 0;
            for(j=0;j<col;j++)
            {
                colsum += mat[j][i];
            }
        }
        return colsum;
    }
    int primeDiagonalSum()
    {
        dia1 = 0;
        for(i=0;i<row;i++)
        {
            dia1 += mat[i][i];
        }
        return dia1;
    }
    int secondaryDiagonalSum()
    {
        dia2=0;
        for(i=0;i<row;i++)
        {
            dia2+=mat[i][row-1-i];
        }
        return dia2;
    }
    void magicSquare(int rowsum,int colsum,int dia1, int dia2)
    {
        if((rowsum == colsum)&&(dia1 == dia2))
        {
            System.out.println("Magic Square");
        }
        else
            System.out.println("The given square is not a Magic Square");
    }
}
class MagicSquare
{
    public static void main(String a[])
    {
        Series s = new Series();
        int res = s.check();
        if(res>=0)
        {
            if(res>2)
            {
                s.getInput();
                int rowsum = s.rowSum();
                int colsum = s.colSum();
                int dia1 = s.primeDiagonalSum();
                int dia2 = s.secondaryDiagonalSum();
                s.magicSquare(rowsum,colsum,dia1,dia2);
            }
            else
                System.out.println("Magic Square not Possible");
        }
        else 
            System.out.println("Please give a valid number");
    }
}

