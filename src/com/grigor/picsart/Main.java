package com.grigor.picsart;

import com.grigor.picsart.dao.LaptopDao;
import com.grigor.picsart.dao.PhoneDao;
import com.grigor.picsart.dao.TvDao;
import com.grigor.picsart.exception.EntityException;
import com.grigor.picsart.model.electronic.laptop.Laptop;
import com.grigor.picsart.model.electronic.phone.MobilePhone;
import com.grigor.picsart.model.electronic.tv.SmartTV;
import com.grigor.picsart.service.ConsoleReader;
import com.grigor.picsart.service.LoginService;
import com.grigor.picsart.service.PhoneService;
import com.grigor.picsart.service.UserRegisterService;

public class Main {

    public static void main(String[] args) {
        System.out.println("1 - Login");
        System.out.println("2-> Register");
        System.out.println("3-> Exit");
        outer:
        while (true) {
            int input = ConsoleReader.validateAndGet("command number", UserRegisterService::isNumericInteger, Integer.class);
            switch (input) {
                case 1:
                    if (LoginService.login(ConsoleReader.readCredentials())) {
                        System.out.println("Login successful");
                        showMenu();
                    } else {
                        System.out.println("The entered username or password is incorrect.");
                    }
                    break;
                case 2:
                    if (UserRegisterService.registerUser(ConsoleReader.createUser())) {
                        System.out.println("Register successfully!");
                        showMenu();
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

    private static void showMenu() {
        try {
            outer:
            while (true) {

                System.out.println("\n Menu");
                System.out.println("1 -> Add mobile phone");
                System.out.println("2 -> Print all mobile phones");
                System.out.println("3 -> Print newest phone");
                System.out.println("4 -> Add smart tv");
                System.out.println("5 -> Print all smart tv's ");
                System.out.println("6 -> Add laptop");
                System.out.println("7 -> Print all laptops");
                System.out.println("8 -> Exit");

                int input = ConsoleReader.validateAndGet("Input command number", UserRegisterService::isNumericInteger, Integer.class);

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
                        LaptopDao.addLaptop(ConsoleReader.createLaptop());
                        break;
                    case 7:
                        for (Laptop laptop : LaptopDao.getLaptopList()) {
                            System.out.print(laptop + " ");
                        }
                        break;
                    case 8:
                        System.out.println("Bye!");
                        break outer;
                    default:
                        System.out.println("Input correct command please");
                        break;
                }
            }
        } catch (EntityException e) {
            System.err.println("Your activity is suspended");
            e.printStackTrace();
        }
    }
}