package chapter06.excercise20;

import java.util.Scanner;

public class BankApplication {
    private static Account[] accountArray = new Account[100];
    private static Scanner scanner = new Scanner(System.in);
    private static int accountSize = 0;
    
    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("----------------------------------------------------");
            System.out.print("선택>");
            
            int selectNo = scanner.nextInt();
            
            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }
        }
        System.out.println("프로그램 종료");
        scanner.close();
    }

    private static void createAccount() {
        String ano;
        String owner;
        int balance;
        
        System.out.println("--------");
        System.out.println("계좌생성");
        System.out.println("--------");
        
        System.out.print("계좌번호>");
        ano = scanner.next();
        System.out.print("계좌주>");
        owner = scanner.next();
        System.out.print("초기입금액>");
        balance = scanner.nextInt();
        
        accountArray[accountSize] = new Account(ano, owner, balance);
        accountSize++;
        
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    private static void accountList() {
        System.out.println("--------");
        System.out.println("계좌목록");
        System.out.println("--------");
        for (int i = 0; i < accountSize; i++) {
            System.out.println(accountArray[i].getAno() + "     "
                             + accountArray[i].getOwner() + "     "
                             + accountArray[i].getBalance());
        }
    }

    private static void deposit() {
        String ano;
        int deposit;
        Account account;
        
        System.out.println("--------");
        System.out.println("입금");
        System.out.println("--------");
        
        System.out.print("계좌번호>");
        ano = scanner.next();
        
        account = findAccount(ano);
        
        System.out.print("예금액>");
        deposit = scanner.nextInt();

        account.setBalance(account.getBalance() + deposit);
        
        System.out.println("결과: 예금이 성공되었습니다.");

    }

    private static void withdraw() {
        String ano;
        int withdraw;
        Account account;
        
        System.out.println("--------");
        System.out.println("출금");
        System.out.println("--------");
        
        System.out.print("계좌번호>");
        ano = scanner.next();
        
        account = findAccount(ano);
        
        System.out.print("출금액>");
        withdraw = scanner.nextInt();

        account.setBalance(account.getBalance() - withdraw);
        
        System.out.println("결과: 출금이 성공되었습니다.");
    }
    
    private static Account findAccount(String ano) {
        for (int i = 0; i < accountSize; i++) {
            if (accountArray[i].getAno().equals(ano)) {
                return accountArray[i];
            }
        }
        
        return null;
    }
}
