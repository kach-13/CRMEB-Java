package mall.vo;

import lombok.Data;
import mall.pojo.EbUser;

import java.util.List;

@Data
public class UserList {
    private Integer total;
    private List<EbUser> list;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<EbUser> getList() {
        return list;
    }

    public void setList(List<EbUser> list) {
        this.list = list;
    }
}
