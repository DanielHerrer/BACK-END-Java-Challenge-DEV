import java.util.Arrays;
import java.util.Vector;

public class OrdenamientoLetras {
    public static void main(String[] args){
        String array[] = {"coder", "devplace", "personas", "curso", "alumnado" };
        int caractA, caractB;

        for(int i=0;i<array.length;i++){
            for(int j=0;j< array.length;j++){
                caractA = array[i].length();
                caractB = array[j].length();
                if(caractA<caractB){
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("Show odd numbers: " + Arrays.toString(array));
    }
}

//{"coder", "devplace", "personas", "curso", "alumnado"}