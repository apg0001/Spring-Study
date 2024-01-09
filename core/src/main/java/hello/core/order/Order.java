package hello.core.order;

public class Order {

    private Long memberId;
    private String itemNemae;
    private int itemPrice;
    private int discountPrice;

    public Order(Long memberId, String itemNemae, int itemPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemNemae = itemNemae;
        this.itemPrice = itemPrice;
        this.discountPrice = discountPrice;
    }

    public int calculatorPrice(){
        return itemPrice - discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemNemae() {
        return itemNemae;
    }

    public void setItemNemae(String itemNemae) {
        this.itemNemae = itemNemae;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemNemae='" + itemNemae + '\'' +
                ", itemPrice=" + itemPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
