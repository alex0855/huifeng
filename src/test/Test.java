package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        HashMap<String, String[]> buttom = new HashMap<>();
        buttom.put("0", new String[]{""});
        buttom.put("1", new String[]{""});
        buttom.put("2",new String[]{"a", "b","c"});
        buttom.put("3",new String[]{"d", "e","f"});
        buttom.put("4",new String[]{"g", "h","i"});
        buttom.put("5",new String[]{"j", "k","l"});
        buttom.put("6",new String[]{"m", "n","o"});
        buttom.put("7",new String[]{"p", "q","r","s"});
        buttom.put("8",new String[]{"t", "u","v"});
        buttom.put("9",new String[]{"w", "x","y","z"});
        String pattern = "\\d";

        Scanner input = new Scanner(System.in);
        String str = "-1";

        while (!"exit".equals(str)){
            str = input.next();

            if(str.length()>3||str.length()<1){
                System.out.println("请输入正确格式");
                continue;
            }

            String[] numAtr = str.split(",");
            boolean flag = false;
            for (String num : numAtr) {
                if(!Pattern.matches(pattern,num)){
                    System.out.println("请输入数字");
                    flag = true;
                    continue;
                };
            }
            if (flag)
                continue;

            if (numAtr.length == 1) {
                String[] letterAtr = buttom.get(numAtr[0]);
                for (String letter : letterAtr) {
                    System.out.print(letter+" ");
                }
            }

            if (numAtr.length == 2) {
                String[] letterAtr1 = buttom.get(numAtr[0]);
                String[] letterAtr2 = buttom.get(numAtr[1]);
                ArrayList<String> list = new ArrayList<>();
                for(String letter1 : letterAtr1){
                    for(String letter2 : letterAtr2){
                        list.add(letter1+letter2);
                    }
                }
                System.out.println(list.toString());
            }
            System.out.println("");
        }
    }
}
