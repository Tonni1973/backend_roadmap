package StringTokenizerClass;

import java.util.StringTokenizer;

public class StringTokenizerApp {
    public static void main(String[] args) {
        String name = "Nazwa Azzahra Nuna Nuna";

        StringTokenizer tokenizer = new StringTokenizer(name, " ");

        while(tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            System.out.println(token);
        }


        String nama = "Tom Holand";
        StringTokenizer tokenizer1 = new StringTokenizer(nama, " ");

        while(tokenizer1.hasMoreTokens()){
            String text = tokenizer1.nextToken();
            System.out.println(text);
        }
    }
}
