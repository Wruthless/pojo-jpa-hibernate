import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

public class Item {
    @NotNull
    @Size (
            min = 2,
            max = 255,
            message = "Name must be between 2 and 255 characters"
    )
    private String name;

    @Future
    private Date auctionEnd;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAuctionEnd() {
        return auctionEnd;
    }

    public void setAuctionEnd(Date auctionEnd) {
        this.auctionEnd = auctionEnd;
    }

    //    private Set<Bid> bids = new HashSet<>();
//
//    public Set<Bid> getBids() {
//        return Collections.unmodifiableSet(bids);
//    }
//
//    public void addBid(Bid bid) {
//        if (bid == null)
//            throw new NullPointerException("Can't add null Bid");
//        if (bid.getItem() != null)
//            throw new IllegalStateException("Bid is already assigned to an Item");
//        bids.add(bid);
//        bid.setItem(this);
//    }


}// end Item{}
