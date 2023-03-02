package org.example;

import javax.swing.plaf.SpinnerUI;
import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<String[]> saylist = new ArrayList<String[]>();
        int number = 0;
        System.out.println("== 명언 앱 ==");
        while(true) {
            String[] array = new String[3];
            System.out.printf("명령) ");
            String cmd = scanner.nextLine();
            if (cmd.equals("등록")) {
                number++;
                array[0] = String.valueOf(number);
                System.out.printf("명언 : ");
                array[1] = scanner.nextLine();
                System.out.printf("작가 : ");
                array[2] = scanner.nextLine();
                saylist.add(array);
                System.out.println(number+"번 명언이 등록되었습니다.");

            } else if (cmd.equals("종료")) {
                break;
            }else if(cmd.equals("목록")){
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                Collections.reverse(saylist); // saylist안의 순서를 뒤집어준다.

                for(String[] str : saylist){
                    System.out.println(str[0]+" / " + str[1] + " / "+str[2]); // 실질적인 목록 출력 부분
                }
            }else{
                System.out.println("올바른 명령어를 입력하세요.");
            }

        }

        //System.out.println(saylist);
    }
}