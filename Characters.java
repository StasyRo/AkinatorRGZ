package com.company;
import java.util.Scanner;


public class Characters {
    public String[] Aladin = {"1", "0", "0", "0", "Aladin"}; //woman - 0 man - 1; unreal - 0, real - 1; tale - 0, film - 1; inlove - 0, not - 1
    public String[] Shapokliak = {"0", "0", "0", "1", "Shapokliak"}; //woman - 0 man - 1; unreal - 0, real - 1; tale - 0, film - 1; inlove - 0, not - 1
    public String[] Alise = {"0", "0", "1", "1", "Alise"}; //woman - 0 man - 1; unreal - 0, real - 1; tale - 0, film - 1; inlove - 0, not - 1
    public String[] Getsby = {"1", "1", "1", "0", "Getsby"}; //woman - 0 man - 1; unreal - 0, real - 1; tale - 0, film - 1; inlove - 0, not - 1
    public String [] Buratino = {"1", "0", "0", "0", "Buratino"};

    public void StrangeCharacter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Man-1, Woman-0");
        String a = sc.nextLine();
        System.out.println(a);
        System.out.println("Real-1, Unreal-0");
        String b = sc.nextLine();
        System.out.println("Film-1, Tale-0");
        String c = sc.nextLine();
        System.out.println("Not inlove-1, Inlove-0");
        String d = sc.nextLine();
        String[] A = {a, b, c, d};
        int flagA = 0, flagB=0, flagC=0, flagD=0, flagBr = 0;
        for (int m = 0; m < 4; m++) {
            if (A[m].equals(Buratino[m])) {
                flagBr += 1;
            }
            if (A[m].equals(Aladin[m])) {
                flagA += 1;
            }
            if (A[m].equals(Shapokliak[m])) {
                flagB += 1;
            }
            if (A[m].equals(Alise[m])) {
                flagC += 1;
            }
            if (A[m].equals(Getsby[m])) {
                flagD += 1;
            }
        }
        if (flagA > 3) System.out.println("It's " + Aladin[4] + " :))");
        else if(flagB > 3) System.out.println("It's " + Shapokliak[4] + " :))");
        else if(flagC > 3) System.out.println("It's " + Alise[4] + " :))");
        else if(flagD > 3) System.out.println("It's " + Getsby[4] + " :))");
        else if(flagBr > 3) System.out.println("It's " + Buratino[4] + " :))");
        else{ System.out.println("I don't know :((");
            System.out.println("Who is it? Told me name, I'll remember it!");
            Scanner sc2 = new Scanner(System.in);
            String newCharacter = sc2.nextLine();
            System.out.println("Ohh, it's " + newCharacter);
        }
    }
}
