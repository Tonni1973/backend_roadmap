package toni.Encapsulation;

public class Category {
    private String id;
    private int price;


    public String getId(){
        return this.id;
    }

    public void setId(String id){
        if(id != null){
            this.id = id;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        if(price != 0){
            this.price = price;
        }
    }
}
