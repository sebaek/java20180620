package com.starbuz.pos;

import java.util.Scanner;

public class PosApp {
    private static int numOfcardCompany = 1;
    private CardBroker cardFactory = new CardBroker();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int menu;
            int cardNo;
            Card card;
            int price;
            
            System.out.println("주문 1.아아 2.라떼>");
            menu = scanner.nextInt();
            card = getCard(getCardNo());
            price = calcPrice(getPrice(menu), card);
            
        }
    }
    
    private static int calcPrice(int price, Card card) {
        return price * (1 - card.getDiscount());
    }

    private static Card getCard(int cardNo) {
        return CardBroker.getCard(cardNo);
    }
    
    private static int getCardNo() {
        return (int) (Math.random() * numOfcardCompany) + 1;
    }
    
    private static int getPrice(int menu) {
        if (menu == 1) {
            return 2000;
        } else if (menu == 2) {
            return 3000;
        }
        
        return 0;
    }
}
