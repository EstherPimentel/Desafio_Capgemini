package Questao03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        subString(scanner.next());
    }

    static void subString(String s){
        HashMap<String, Integer> map= new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                char[] valC = s.substring(i, j+1).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);
                if (map.containsKey(val))
                    map.put(val, map.get(val)+1);
                else
                    map.put(val, 1);
            }
        }
        int anagram = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            anagram += (n * (n-1))/2;
        }
        System.out.println("O número de pares de substrings que são anagramas: " + anagram);
    }
}
