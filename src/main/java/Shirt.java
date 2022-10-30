public class Shirt {
    public static void main(String[] args) {
        int shirtPrice = 1990; // цена одной рубашки без скидки
        int cart = 2; // количество товара в корзине
        int discountCondition = 3; // необходимое количество товара для скидки

        int needToAdd = (discountCondition - cart);
        System.out.println("Для получения скидки необходимо добавить " + needToAdd + " шт.");

        int currentAmount = (shirtPrice * cart);
        System.out.println("Текущая стоимость товаров в корзине " + currentAmount + " руб.");

        int addedAmount = (shirtPrice * needToAdd);
        System.out.println("Необходимо добавить товаров на сумму " + addedAmount + " руб.");

        double discount = 0.3; // процент скидки
        double totalDiscountPrice = ((cart + needToAdd) * shirtPrice - ((cart + needToAdd) * shirtPrice * discount));
        System.out.println("Стоимость товаров со скидкой " + totalDiscountPrice + " руб.");

        double discountPrice = (shirtPrice - (shirtPrice * discount));
        System.out.println("Стоимость одной рубашки со скидкой " + discountPrice + " руб.");

        double savingMoney = ((shirtPrice * discountCondition) - totalDiscountPrice);
        System.out.println("Вы сэкономили " + savingMoney + " руб.");

        double freeShirts = (savingMoney / shirtPrice);
        System.out.println("Получено бесплатно рубашек " + freeShirts + " шт.");

    }
}