package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class lol {
    public static void main(String[] args) {
        //ArrayList<int> removeindex = new ArrayList<int>();
        Scanner scc = new Scanner(System.in);
        ArrayList<String[]> list = new ArrayList<String[]>();
        for (int j = 0; j < 5; j++) {
            String[] inlist = new String[3];
            for (int i = 0; i < 3; i++) {
                System.out.printf("입력해봐: ");
                inlist[i] = scc.nextLine();
            }
            list.add(inlist);
        }
        System.out.printf("명령) ");
        String a = scc.nextLine();
        String[] c = new String[2];
        c = a.split("=");
        int k = list.size()-1;
        for (int i = (list.size() - 1); i > -1; i--){
            String[] fake_list = list.get(i);
            for(int j = (fake_list.length -1); j>-1;j--){
                String fake = fake_list[j];
                if(fake.equals(c[1])){
                    list.remove(k);
                }
            }
            k--;
        }
        for(String[] rere : list){
            System.out.println(Arrays.toString(rere));
        }

        //String[] fake_1;
        //Iterator<String[]> fake = list.iterator();

/*
        for (String[] ccc : list) {

            for (String aaa : ccc) {
                if (aaa.equals(c[1])) {
                    list.remove(k);
                }
            }
            k++;
        }

                for (String[] ddd : list) {

                    for (String eee : ddd) {
                        System.out.println(eee);
                    }
                }

        System.out.printf("명령) ");
        String a = scc.nextLine();
        String[] c = new String[2];
        c = a.split("=");
        System.out.println(c.length);
        for(int i=0; i<c.length;i++){
            System.out.println(c[i]+"아휴");
        }
        if(c.length == 2 && c[0].equals("삭제?id")){
            System.out.println("야 삭제하자");
        } else if (c.length ==1) {
            System.out.println("야 길이가 1이라는데");
        }
        for(String[] bb : list){
            System.out.println(bb);
        }

         */
        scc.close();
            }
        }
