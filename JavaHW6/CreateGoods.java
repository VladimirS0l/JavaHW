package JavaHW6;

public class CreateGoods {

    Goods temp;
    public CreateGoods() {
        temp = new Goods();
        temp.count = 0;
        temp.name = "no_name";
        temp.price = 0.0;
        temp.description = "no_descript";
    }

    public CreateGoods setCount(int count) {
        temp.count = count;
        return this;
    }

    public CreateGoods setName(String name) {
        temp.name = name;
        return this;
    }

    public CreateGoods setPrice(Double price) {
        temp.price = price;
        return this;
    }

    public CreateGoods setDescriptoin(String description) {
        temp.description = description;
        return this;
    }

    public Goods Create() {
        return temp;
    }

}
