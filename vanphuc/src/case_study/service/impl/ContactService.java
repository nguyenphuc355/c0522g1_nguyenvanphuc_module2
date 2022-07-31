package case_study.service.impl;

import case_study.model.Contract;
import case_study.service.IContactService;
import case_study.utils.ReadContract;
import case_study.utils.WriteContract;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactService implements IContactService {
    public static final String PATH = "vanphuc/src/case_study/contract.csv";
    private static final List<Contract> CONTRACT_LIST = new ArrayList<>();
    private static final Scanner SCANNER = new Scanner(System.in);

    private void writeContact() {
        WriteContract.writeContracts(PATH, CONTRACT_LIST);

    }

    public void readContact() {
        List<Contract> list = ReadContract.readContracts(PATH);
        CONTRACT_LIST.clear();
        CONTRACT_LIST.addAll(list);
    }

    @Override
    public void displayContract() {
        readContact();
        for (Contract contract : CONTRACT_LIST) {
            System.out.println(contract);
        }
    }

    @Override
    public void edit() {
        readContact();
        System.out.print("nhap ma hop dong can chinh sua: ");
        String contractNumberEdit = SCANNER.nextLine();
        for (Contract contract : CONTRACT_LIST) {
            if (contractNumberEdit.equals(contract.getContractNumber())) {
                System.out.print("Nhap so hop dong moi: ");
                contract.setContractNumber(SCANNER.nextLine());

                System.out.print("Nhap ma booking moi: ");
                contract.setCodeBooking(SCANNER.nextLine());

                System.out.print("Nhap so tien coc truoc: ");
                contract.setAdvanceDepositAmount(Double.parseDouble(SCANNER.nextLine()));

                System.out.print("Nhap tong so tien thanh toan: ");
                contract.setPayments(Double.parseDouble(SCANNER.nextLine()));

                System.out.print("Nhap ma khach hang: ");
                contract.setCustomerCode(SCANNER.nextLine());
                System.out.println("=====chinh sua thanh cong=====");
            }
        }
        writeContact();
    }

    @Override
    public void addContract() {
        readContact();
        System.out.print("Nhap so hop dong: ");
        String contractNumber = SCANNER.nextLine();

        System.out.print("Nhap ma booking: ");
        String codeBooking =SCANNER.nextLine();

        System.out.print("Nhap so tien coc truoc: ");
        double advanceDepositAmount = Double.parseDouble(SCANNER.nextLine());

        System.out.print("Nhap tong so tien thanh toan: ");
        double payments = Double.parseDouble(SCANNER.nextLine());

        System.out.print("Nhap ma khach hang: ");
        String customerCode = SCANNER.nextLine();

        CONTRACT_LIST.add(new Contract(contractNumber, codeBooking, advanceDepositAmount, payments, customerCode));
        System.out.println("THEM MOI THANH CONG");
        writeContact();
    }
}
