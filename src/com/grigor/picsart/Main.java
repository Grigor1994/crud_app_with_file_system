package com.grigor.picsart;

import com.grigor.picsart.dao.PhoneDao;
import com.grigor.picsart.dao.TvDao;
import com.grigor.picsart.model.electronic.phone.MobilePhone;
import com.grigor.picsart.model.electronic.tv.SmartTV;
import com.grigor.picsart.service.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        boolean isMenuActive = true;
        System.out.println("1 - Login");
        System.out.println("2-> Register");
        System.out.println("3-> Exit");
        try {
            while (isMenuActive) {
                int input = scanner.nextInt();
                switch (input) {
                    case 1:
                        if (LoginService.isLoginSuccessful()) {
                            System.out.println("Login successful");
                            extracted(scanner, true);
                        } else {
                            System.out.println("The entered username or password is incorrect.");
                        }
                        break;
                    case 2:
                        if (RegisterService.registerUser(UserService.createUser())) {
                            System.out.println("Register successfully!");
                            extracted(scanner, true);
                        }
                        break;
                    case 3:
                        isMenuActive = false;
                    default:
                        System.out.println("Incorrect command number.");
                        break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void extracted(Scanner scanner, boolean isMenuActive) {
        try {
            while (isMenuActive) {

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
                        PhoneDao.addMobilePhone(ScannerService.createMobilePhone());
                        break;
                    case 2:
                        for (MobilePhone mobilePhone : PhoneDao.getPhoneList()) {
                            System.out.print(mobilePhone + " ");
                        }
                        break;
                    case 3:
                        PhoneService.printNewestPhone(PhoneDao.getPhoneList());
                        break;
                    case 4:
                        TvDao.addSmartTv(ScannerService.createSmartTv());
                        break;
                    case 5:
                        for (SmartTV smartTV : TvDao.getSmartTvList()) {
                            System.out.print(smartTV + " ");
                        }
                        break;
                    case 6:
                        isMenuActive = false;
                        System.out.println("Bye!");
                        break;
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