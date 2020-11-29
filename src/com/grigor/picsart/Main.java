package com.grigor.picsart;

import com.grigor.picsart.model.electronic.phone.MobilePhone;
import com.grigor.picsart.model.electronic.tv.SmartTV;
import com.grigor.picsart.service.PhoneService;
import com.grigor.picsart.service.TvService;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isMenuActive = true;

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
                        PhoneService.addMobilePhone(PhoneService.createMobilePhone());
                        break;
                    case 2:
                        for (MobilePhone mobilePhone : PhoneService.getPhoneList()) {
                            System.out.print(mobilePhone + " ");
                        }
                        break;
                    case 3:
                        PhoneService.printNewestPhone(PhoneService.getPhoneList());
                        break;
                    case 4:
                        TvService.addSmartTv(TvService.createSmartTv());
                        break;
                    case 5:
                        for (SmartTV smartTV : TvService.getSmartTvList()) {
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