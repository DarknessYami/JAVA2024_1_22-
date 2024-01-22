import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C22012_Kadai1 {
    public static void main(String[] args) throws IOException {
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("一番目の数値を入力してください:");
        String suti_br1 = BR.readLine();
        int suti_1 = Integer.parseInt(suti_br1);

        System.out.println("二番目の数値を入力してください:");
        String suti_br2 = BR.readLine();
        int suti_2 = Integer.parseInt(suti_br2);

        if (suti_1 > suti_2) {
            System.out.println(suti_2 + "より" + suti_1 + "の方が大きい値です。");
        }
        else if(suti_2 > suti_1){
            System.out.println(suti_1 + "より" + suti_2 + "の方が大きい値です。");
        }
        else if(suti_2 == suti_1){
            System.out.println("2つの数は同じ値です。");
        }
    }
}

