package mall.Comtroller;

import mall.vo.CommonResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ApiPublic {
    @GetMapping("/public/jsconfig/getcrmebchatconfig")
    public CommonResult getcrmebchatconfig(){
        return CommonResult.success();
    }
}
