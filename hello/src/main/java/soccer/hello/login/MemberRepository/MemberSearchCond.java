package soccer.hello.login.MemberRepository;

import lombok.Data;


@Data
public class MemberSearchCond {

    private String itemName;
    private Integer maxPrice;
    public MemberSearchCond() {
    }

    public MemberSearchCond(String itemName, Integer maxPrice) {
        this.itemName = itemName;
        this.maxPrice = maxPrice;
    }
}




