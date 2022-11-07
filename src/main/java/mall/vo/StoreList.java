package mall.vo;

import mall.pojo.EbStoreProduct;

import java.util.List;

public class StoreList {
    private Integer total;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<EbStoreProduct> getList() {
        return list;
    }

    public void setList(List<EbStoreProduct> list) {
        this.list = list;
    }

    private List<EbStoreProduct> list;
}
