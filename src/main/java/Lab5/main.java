package Lab5;

public class main {
    public static void main(String[] args) {
        Cash  cash= new Cash();
        cash.check.addGoods(new Goods("AAA", 5,5));
        cash.check.addGoods(new Goods("LLL", 12,10));
        cash.check.addGoods(new Goods("LLL", 7.5,6));
        cash.check.addGoods(new Goods("DDD", 5,10));
        cash.check.addGoods(new Goods("SSDFGG", 8,3));
        cash.check.addGoods(new Goods("SSAAF", 6.6,12));
        cash.check.addGoods(new Goods("SSAAF", 6.6,15));
        cash.check.addGoods(new Goods("LLL", 7.5,15));
        cash.check.addGoods(new Goods("rrr", 6.6,15));
        cash.check.addGoods(new Goods("LLL", 7.5,15));
        cash.check.addGoods(new Goods("rrr", 6.6,15));
        cash.check.addGoods(new Goods("aaa", 6.6,15));
        cash.check.addGoods(new Goods("aaa", 6.6,15));

        cash.printCheck();
    }
}
