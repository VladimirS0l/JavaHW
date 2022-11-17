package JavaHW6;

public class Task1 {
    public static void main(String[] args) {
        Goods goods1 = new Goods();
        goods1.print();

        goods1 = new CreateGoods()
        .setCount(5)
        .setName("Робот")
        .setPrice(15.15)
        .setDescriptoin("Синий цвет, высота-30см")
        .Create();

        goods1.print();

        Goods good2 = new Goods();
        good2 = new CreateGoods()
        .setCount(3)
        .setName("Машинка")
        .Create();

        good2.print();


    }
}
