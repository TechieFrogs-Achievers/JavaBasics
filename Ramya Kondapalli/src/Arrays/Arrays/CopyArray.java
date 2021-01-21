package Arrays;

public class CopyArray {
    public static void main(String[] args) {

        //copying character array
        char[] arr = {'R','a','m','y','a'};
        
        char[] newArray = new char[3];  //new array for copying 

        //copying one array to another array
        //System.arrayCopy(src, srcpos, des,destpos,length)
        System.arraycopy(arr, 2, newArray, 0, 3); 

        System.out.println(String.valueOf(newArray));  //printing valueOf array


        //String copying array
        String[] strArr = {"satya","Ramya","kondapalli","Techiefrogs","hyd"};

        String[] newStrArr = new String[3];  //new string array

        //System.arrayCopy(src, srcpos, des,destpos,length)
        System.arraycopy(strArr, 1, newStrArr, 0, 3);  //

        for (String i: newStrArr){
            System.out.print(i + " ");  //printing new string array after copy
        }

        System.out.println();


        //copying int array
        int[] intarr = {11,22,33,44,55};

        int[] newIntArr = new int[3]; //new int array

        System.arraycopy(intarr, 2, newIntArr, 0, 3); //copying int array

        for (int i: newIntArr){
            System.out.print(i + " ");
        }

        System.out.println();

        //copying float array
        float[] floarArr = {1.1f,2.2f,3.3f,4.4f,5.5f,6.6f};

        float[] newFloatArr = new float[4]; //new float array

        System.arraycopy(floarArr, 1, newFloatArr, 0, 4); //copying float array 

        for (float i: newFloatArr){
            System.out.print(i + " ");
        }

    }
}
