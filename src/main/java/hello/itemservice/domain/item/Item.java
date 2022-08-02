package hello.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data//@Getter @Setter //DTO같은 경우 @Data써도 무방 그치만 아닌 경우 안쓰는게 좋음...그치만 연습이니깐
public class Item {
    private long id;
    private String itemName;
    private Integer price;
    private Integer quantity;  //null이 들어갈 수 있으므로 Integer사용

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
