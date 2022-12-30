package ds2;

import java.util.Arrays;


public class finalDigraphProblem {

    public static void main(String[] args) {
        String[] arr = {
                "Depaul",
                "dEpaul",
                "dePaul",
                "depAul",
                "depaUl",
                "depauL",
                "depaul",
                "Loyola",
                "lOyola",
                "loYola",
                "loyOla",
                "loyoLa",
                "loyolA",
                "loyola"};
        int[] hashArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
           hashArr[i] = hash(arr[i]);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(hashArr));
        int x =hash("loyola");
        String s = arr[x];
        if (s.equals("loyola")) {
           System.out.print("String is found");

        }
        else {
            System.out.print("String is not found");
        }

    }

    public static int hash(String key) {
        return (key.hashCode() & 0x7fffffff) % 31;
    }
}