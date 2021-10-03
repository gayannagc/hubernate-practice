
@org.hibernate.annotations.NamedQueries({
        @org.hibernate.annotations.NamedQuery(
                name = "findItemsOrderByName",
                query = "select i from Item i order by i.name asc"
        )
        ,
        @org.hibernate.annotations.NamedQuery(
                name = "findItemBuyNowPriceGreaterThan",
                query = "select i from Item i where i.buyNowPrice > :price",
                timeout = 60,
                comment = "Custom SQL comment"
        )
})
public class packageInfo {


}
