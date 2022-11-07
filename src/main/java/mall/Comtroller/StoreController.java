package mall.Comtroller;

import mall.mapper.EbStoreProductMapper;
import mall.pojo.EbStoreProduct;
import mall.pojo.EbStoreProductExample;
import mall.vo.CommonResult;
import mall.vo.Page;
import mall.vo.StoreList;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("api/admin")
public class StoreController {
    private EbStoreProductExample ebStoreProductExample = new EbStoreProductExample();
    @Autowired
    private EbStoreProductMapper ebStoreProductMapper;
    @GetMapping("store/product/list")
    public CommonResult StoreList(Page page){
        int index = ( page.getPage() - 1 ) * page.getLimit();
        RowBounds rowBounds = new RowBounds(index,page.getLimit());
        ebStoreProductExample.clear();
        List<EbStoreProduct> size = ebStoreProductMapper.selectByExample(ebStoreProductExample);
        List<EbStoreProduct> ebStoreProducts = ebStoreProductMapper.selectByExampleWithRowbounds(ebStoreProductExample, rowBounds);
        StoreList storeList = new StoreList();
        storeList.setTotal(size.size());
        storeList.setList(ebStoreProducts);
        return CommonResult.success(storeList);
    }
    @GetMapping("store/product/tabs/headers")
    public CommonResult GetHanders (){
        return CommonResult.success(200);
    }
}
