package com.grigor.picsart;

import com.grigor.picsart.dao.PhoneDao;
import com.grigor.picsart.dao.TvDao;
import com.grigor.picsart.model.electronic.phone.MobilePhone;
import com.grigor.picsart.model.electronic.tv.SmartTV;
import com.grigor.picsart.service.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Login");
        System.out.println("2-> Register");
        System.out.println("3-> Exit");
        outer:
        while (true) {
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    if (LoginService.login(ConsoleReader.readCredentials())) {
                        System.out.println("Login successful");
                        showMenu(scanner);
                    } else {
                        System.out.println("The entered username or password is incorrect.");
                    }
                    break;
                case 2:
                    if (UserRegisterService.registerUser(ConsoleReader.createUser())) {
                        System.out.println("Register successfully!");
                        showMenu(scanner);
                    } else {
                        System.out.println("Your entered data does not match the registration requirements, please try again.\n");
                        ConsoleReader.createUser();
                    }
                    break;
                case 3:
                    break outer;
                default:
                    System.out.println("Incorrect command number.");
                    break;
            }
        }

    }

    private static void showMenu(Scanner scanner) {
        try {
            outer:
            while (true) {

                System.out.println("\n Menu");
                System.out.println("Input command number");
                System.out.println("1 -> Add mobile phone");
                System.out.println("2 -> Print all mobile phones");
                System.out.println("3 -> Print newest phone");
                System.out.println("4 -> Add smart tv");
                System.out.println("5 -> Print all smart tv's ");
                System.out.println("6 -> Exit");

                int input = scanner.nextInt();

                switch (input) {
                    case 1:
                        PhoneDao.addMobilePhone(ConsoleReader.createMobilePhone());
                        break;
                    case 2:
                        for (MobilePhone mobilePhone : PhoneDao.getPhoneList()) {
                            System.out.print(mobilePhone + " ");
                        }
                        break;
                    case 3:
                        System.out.println(PhoneService.getNewestPhone(PhoneDao.getPhoneList()));
                        break;
                    case 4:
                        TvDao.addSmartTv(ConsoleReader.createSmartTv());
                        break;
                    case 5:
                        for (SmartTV smartTV : TvDao.getSmartTvList()) {
                            System.out.print(smartTV + " ");
                        }
                        break;
                    case 6:
                        System.out.println("Bye!");
                        break outer;
                    default:
                        System.out.println("Input correct command please");
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}