package com.matrix.problems;

public class TurnMatrix90Degree {
 
public static void main(String[] args)
{
int image[][] = {{1,2,3,4},
{5,6,7,8},
{9,10,11,12}};

int m = 3, n = 4;
int[][] dest = new int[n][m];

displayMatrix(image, m, n);
System.out.println();
System.out.println();

rotate(image, dest, m, n);

displayMatrix(dest, n, m);
}

private static void displayMatrix(int arr[][],int r,int c)
{
for (int row = 0; row < r; row++)
{
for (int col = 0; col < c; col++)
{
System.out.print(arr[row][col]+" ");
}
System.out.println();
}
}

private static void rotate(int[][] arr, int[][] dest, int row, int col)
{
for (int r = 0; r < row; r++)
{
for (int c = 0; c < col; c++)
{
dest[c][row-r-1] = arr[r][c];
}
}
}
}