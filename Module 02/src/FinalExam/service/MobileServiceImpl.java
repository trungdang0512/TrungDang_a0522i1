package FinalExam.service;

import FinalExam.models.ChinhHang;
import FinalExam.models.Mobile;
import FinalExam.models.XachTay;
import FinalExam.repository.IMobileRepository;
import FinalExam.repository.MobileRepositoryImpl;

import java.util.List;
import java.util.Scanner;

public class MobileServiceImpl implements IMobileService {
    private static Scanner scanner = new Scanner(System.in);
    private static IMobileRepository mobileRepository = new MobileRepositoryImpl();

    @Override
    public void addMobile() {
        int choice;
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Chinh hang Mobile");
            System.out.println("2. Xach tay Mobile");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    mobileRepository.addMobile(getMobileInfoCH());
                    break;
                case 2:
                    mobileRepository.addMobile(getMobileInfoXT());
                    break;
            }
        }while (choice <= 0 || choice > 2);
    }

    @Override
    public void displayList() {
        List<Mobile> mobileList = mobileRepository.findAll();
        for (Mobile mobile : mobileList){
            System.out.println(mobile);
        }
    }

    @Override
    public void removeMobile() {
        System.out.println("Enter ID to delete: ");
        int inputID = Integer.parseInt(scanner.nextLine());
        if (mobileRepository.checkMobileIDExist(inputID)){
            int choice;
            do {
                System.out.println("Are you sure: ");
                System.out.println("1. Yes");
                System.out.println("2. No");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice){
                    case 1:
                        mobileRepository.removeMobile(inputID);
                        System.out.println("Remove done!!!");
                        break;
                    case 2:
                        return;
                }
            }while (choice <= 0 || choice > 2);
        }else {
            System.out.println("ID invalid!!!");
            return;
        }
    }

    @Override
    public void searchMobile() {
    }

    @Override
    public void searchByID() {

    }

    @Override
    public void searchByName() {

    }

    @Override
    public Mobile getMobileInfoCH() {
        System.out.println("Input Mobile info: ");
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Mobile name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Mobile price: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter amount: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Producer: ");
        String producer = scanner.nextLine();
        System.out.println("Enter warranty days: ");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter warranty zone: ");
        String zone = scanner.nextLine();

        ChinhHang chinhHang = new ChinhHang(id, name,price,amount,producer,day,zone);
        return chinhHang;
    }

    @Override
    public Mobile getMobileInfoXT() {
        System.out.println("Input Mobile info: ");
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Mobile name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Mobile price: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter amount: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Producer: ");
        String producer = scanner.nextLine();
        System.out.println("Enter import country: ");
        String country = scanner.nextLine();
        System.out.println("Enter mobile status: ");
        String status = scanner.nextLine();

        XachTay xachTay = new XachTay(id,name,price,amount,producer,country,status);
        return xachTay;
    }
}
