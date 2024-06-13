//This program displays Reverse Array Traversal in Java  

public class ArrayReverseTraversal {
    public static void main(String args[])
    {
        int arr[] = {100, 200, 300, 400, 500};
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}