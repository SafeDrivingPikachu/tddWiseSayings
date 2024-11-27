package com.ll;

import java.io.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //lab1();
        //lab2();
        //lab3();
        lab4();
        }

    private static void lab1() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("명령) ");
        String cmd = scanner.nextLine().trim();

        System.out.println("입력한 명령 : " + cmd);
    }

    private static void lab2() {
        // 스캐너에 스트림을 넣을 수 있다...
        InputStream input = new ByteArrayInputStream("메롱\n잘가".getBytes());
        Scanner scanner = new Scanner(input);

        System.out.println("명령) ");

        String cmd = scanner.nextLine().trim();
        System.out.println("입력한 명령 첫번째 줄: " + cmd);

        cmd = scanner.nextLine().trim();
        System.out.println("입력한 명령 두번째 줄 : " + cmd);

    }

    private static void lab3() {
        // 기본 out 출력은 모니터에 출력된다.
        System.out.println("안녕하세요");
    }

    private static void lab4() {
        // out 출력을 바꾸기
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output)); // setOut이 PrintStream을 받는데 PrintStream 공부 필요
        // 원래 out 이 PrintStream의 객체였던 것 같다..

        System.out.println("안녕하세요"); // 이 출력이 output으로 들어가는 것 같다. 모니터에 출력은 안된다.
        System.out.println("반갑습니다.");

        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out))); // 표준 출력 경로 복구

        System.out.println("표준 출력 경로 복구");
        System.out.println(output.toString());

        try {
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
