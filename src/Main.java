public class Main {
    public static void main(String[] args) {
        int amountCredited = 1100;    //сумма пополнения
        int invoiceAmount = 100;      //сумма счета клиента
        int conditionAmount = 1000;   //минимальная сумма пополнения для начисления бонусов
        int rubBonus = 100;           //1 бонус за rubBonus рублей

        /* if (amountCredited > conditionAmount){
            bonusQuantity = amountCredited / rubBonus;
        } else {
            bonusQuantity = 0;
    }*/
        int bonusQuantity = (amountCredited > conditionAmount) ? (amountCredited / rubBonus) : 0; //количество бонусов
        invoiceAmount += amountCredited + bonusQuantity;
        System.out.println("Количество бонусов:" + bonusQuantity);
        System.out.println("Итоговая сумма счета клиента:" + invoiceAmount);
    }
}
