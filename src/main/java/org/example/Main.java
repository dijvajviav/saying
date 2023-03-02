package org.example;

import javax.swing.plaf.SpinnerUI;
import java.sql.SQLOutput;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String[]> saylist = new ArrayList<String[]>(); // 실질적인 명언리스트
        String[] cmd_1 = new String[2]; // 혹시 삭제가 들어올까?
        
        int number = 0;
        System.out.println("== 명언 앱 ==");
        while(true) {
            String[] array = new String[3];
            System.out.printf("명령) ");
            String cmd = scanner.nextLine();
            cmd_1 = cmd.split("=");
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
                Collections.reverse(saylist); //  saylist안의 순서를 다시 뒤집어준다.
            } else if (cmd_1.length ==2 && cmd_1[0].equals("삭제?id")) {

                ///cmd_1[1]
                int k = saylist.size()-1;
                for (int i = (saylist.size() - 1); i > -1; i--){
                    String[] fake_list = saylist.get(i);
                    for(int j = (fake_list.length -1); j>-1;j--){
                        String fake = fake_list[j];
                        if(fake.equals(cmd_1[1])){
                            saylist.remove(k);
                        }
                    }
                    k--;
                }
                System.out.println(cmd_1[1]+"번 명언이 삭제되었습니다.");
                remove_saylist.add(cmd_1[1]);
            } else{
                System.out.println("올바른 명령어를 입력하세요.");
            }

        }
        scanner.close();
    }
}