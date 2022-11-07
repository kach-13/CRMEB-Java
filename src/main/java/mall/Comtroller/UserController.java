package mall.Comtroller;

import mall.Config.JwtUnit;
import mall.mapper.*;
import mall.pojo.*;
import mall.vo.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/admin")
@CrossOrigin
public class UserController {
    @Autowired
    private RedisTemplate redisTemplate;
    private EbSystemRoleExample ebSystemRoleExample = new EbSystemRoleExample();
    @Autowired
    private EbSystemRoleMapper ebSystemRoleMapper ;
    private EbUserExample ebUserExample = new EbUserExample();
    @Autowired
    private EbUserMapper ebUserMapper;

    private EbSystemAdminExample ebSystemAdminExample = new EbSystemAdminExample();
    @Autowired
    private EbSystemAdminMapper ebSystemAdminMapper;
    @PostMapping("/login")
    public CommonResult<SystemLoginResponse> login(@RequestBody EbUser ebUser, HttpServletResponse response){
        ebSystemAdminExample.clear();
        ebSystemAdminExample.createCriteria().andAccountEqualTo(ebUser.getAccount()).andPwdEqualTo(ebUser.getPwd());
        List<EbSystemAdmin> ebUsers = ebSystemAdminMapper.selectByExample(ebSystemAdminExample);
        if(ebUsers.size() != 0){
            SystemLoginResponse systemLoginResponse = new SystemLoginResponse();
            systemLoginResponse.setAccount(ebUsers.get(0).getAccount());
            int id = ebUsers.get(0).getId();
            systemLoginResponse.setId(id);
            systemLoginResponse.setRealName(ebUsers.get(0).getRealName());
            systemLoginResponse.setSms(false);
            String token = JwtUnit.SetToken(ebUsers.get(0).getAccount(),id);
            systemLoginResponse.setToken(token);
           //登录·成功把token返回前端并将信息写入Redis
            //redisTemplate.opsForValue().set(ebUsers.get(0).getAccount(),ebUsers.get(0));
            return  CommonResult.success(systemLoginResponse,"login success");
        }
        return null;
    }
    @GetMapping("/getAdminInfoByToken")
    public CommonResult getUserInfo(HttpServletRequest request){
        String token = request.getParameter("token");//获取token校验
      if(token == ""){
          return CommonResult.failed("未登录");
        }
        String s = JwtUnit.parseToken(token);
      if(s == null){
          return CommonResult.failed("未登录");
      }
        ebSystemAdminExample.clear();
        ebSystemAdminExample.createCriteria().andAccountEqualTo(s);
        List<EbSystemAdmin> ebUsers = ebSystemAdminMapper.selectByExample(ebSystemAdminExample);
        SystemLoginResponse systemLoginResponse = new SystemLoginResponse();
        systemLoginResponse.setToken(token);
        systemLoginResponse.setSms(false);
        systemLoginResponse.setRealName(ebUsers.get(0).getRealName());
        int id = ebUsers.get(0).getId();
        systemLoginResponse.setId(id);
        systemLoginResponse.setAccount(ebUsers.get(0).getAccount());

        EbSystemRole ebSystemRole = ebSystemRoleMapper.selectByPrimaryKey(Integer.valueOf(ebUsers.get(0).getRoles()));
        systemLoginResponse.setRoles(ebSystemRole.getRoleName());
        return CommonResult.success(systemLoginResponse);
    }
    @GetMapping("/system/store/staff/list")
    public CommonResult GwetList(){
        return CommonResult.success();
    }
    private EbSystemMenuExample ebSystemMenuExample = new EbSystemMenuExample();
    @Autowired
    private EbSystemMenuMapper ebSystemMenuMapper ;
    @GetMapping("/getMenus")
    public  CommonResult getMenu (){
        ebSystemMenuExample.clear();
        ebSystemMenuExample.clear();
        ebSystemMenuExample.createCriteria().andPidEqualTo(0);
        List<EbSystemMenu> menusBase = ebSystemMenuMapper.selectByExample(ebSystemMenuExample);
        ebSystemMenuExample.clear();
        ebSystemMenuExample.createCriteria().andPidNotEqualTo(0);
        List<EbSystemMenu> menuLNotBase = ebSystemMenuMapper.selectByExample(ebSystemMenuExample);
        for (EbSystemMenu menu : menusBase) {
            List<EbSystemMenu> menus = iterateMenus(menuLNotBase, String.valueOf(menu.getId()));
            menu.setChildList(menus);
        }
        return CommonResult.success(menusBase);
    }

    /**
     * 多级菜单查询方法
     *
     * @param menuVoList 不包含最高层次菜单的菜单集合
     * @param pid        父类id
     * @return
     */
    public List<EbSystemMenu> iterateMenus(List<EbSystemMenu> menuVoList, String pid) {
        List<EbSystemMenu> result = new ArrayList<>();
        for (EbSystemMenu menu : menuVoList) {
            //获取菜单的id
            Integer menuid = menu.getId();
            //获取菜单的父id
            String  parentid =String.valueOf(menu.getPid());
            if (StringUtils.isNotBlank(parentid)) {
                if (parentid.equals(pid)) {
                    //递归查询当前子菜单的子菜单
                    List<EbSystemMenu> iterateMenu = iterateMenus(menuVoList, String.valueOf(menuid));
                    menu.setChildList(iterateMenu);
                    result.add(menu);
                }
            }
        }
        return result;
    }
    //--

    @GetMapping("/logout")
    public CommonResult LogOut(HttpServletRequest request,HttpServletResponse response){
        String header = request.getHeader("Authori-zation");
        String name = JwtUnit.parseToken(header);
        if(name != ""){
            // 清空用户信息
            response.setHeader("Authori-zation",null);
        }
        return CommonResult.success();
    }
    @GetMapping("getLoginPic")//进入登录页面获取图片
    public CommonResult getPic(HttpServletResponse response) throws  Exception {
//        File backgroundImage = new File("C:\\Users\\Hasee\\Pictures\\Saved Pictures\\xiao.jpg");
//        FileInputStream fileInputStream = new FileInputStream(backgroundImage);
//        ServletOutputStream out=null;
//        BufferedInputStream buf=null;
//        fileInputStream.close();
//        //使用字节流读取本地图片
//        try {
//            //使用输入读取缓冲流读取一个文件输入流
//            buf=new BufferedInputStream(new FileInputStream(backgroundImage));
//            //利用response获取一个字节流输出对象
//            out=response.getOutputStream();
//            //定义个数组，由于读取缓冲流中的内容
//            byte[] buffer=new byte[1024];
//            //while循环一直读取缓冲流中的内容到输出的对象中
//            while(buf.read(buffer)!=-1) {
//                out.write(buffer);
//            }
//            //写出到请求的地方
//            out.flush();
//            Map<String, Object> map = new HashMap<>();
//            //背景图
//            map.put("backgroundImage",buffer);
//            return CommonResult.success(map);
//        }catch (Exception e) {
//            // TODO: handle exception
//            e.printStackTrace();
//        }finally {
//            if(buf!=null) buf.close();
//            if(out!=null) out.close();
//        }
//
//        //logo
//       // map.put("logo", );
//        //map.put("loginLogo", );
//        //轮播图
//        //List<SystemGroupDataAdminLoginBannerResponse> bannerList = systemGroupDataService.getListByGid(SysGroupDataConstants.GROUP_DATA_ID_ADMIN_LOGIN_BANNER_IMAGE_LIST, SystemGroupDataAdminLoginBannerResponse.class);
//        //map.put("banner", bannerList);
//      return null;
//    }
        return null;
    }

    @PostMapping("system/admin/update")
    public CommonResult UpDataUser(@RequestBody EbSystemAdmin  ebSystemAdmin ,HttpServletRequest request,HttpServletResponse response){
        EbSystemAdmin ebSystemAdmin1 = new EbSystemAdmin();
        ebSystemAdmin1 = ebSystemAdminMapper.selectByPrimaryKey(ebSystemAdmin.getId());
        if(ebSystemAdmin != null){
            ebSystemAdmin1.setAccount(ebSystemAdmin.getAccount());
            ebSystemAdmin1.setPwd(ebSystemAdmin.getPwd());
            ebSystemAdmin1.setRealName(ebSystemAdmin.getRealName());
            ebSystemAdmin1.setId(ebSystemAdmin.getId());
            int i = ebSystemAdminMapper.updateByPrimaryKey(ebSystemAdmin1);
            if(i == 1){
                LogOut(request,response);//修改完成后退出登录
                return CommonResult.success();
            }
            else {
                return CommonResult.failed();
            }
        }
        return CommonResult.failed();
    }
    private EbSystemConfigExample ebSystemConfigExample = new EbSystemConfigExample();
    @Autowired
    private EbSystemConfigMapper ebSystemConfigMapper;

    private EbSystemFormTempExample ebSystemFormTempExample = new EbSystemFormTempExample();
    @Autowired
    private EbSystemFormTempMapper ebSystemFormTempMapper;
    @GetMapping("system/config/getuniq")
    public CommonResult GetUnid(HttpServletRequest request){
        String key = request.getParameter("key");
        ebSystemConfigExample.clear();
        ebSystemConfigExample.createCriteria().andNameEqualTo(key);
        List<EbSystemConfig> ebSystemConfigs = ebSystemConfigMapper.selectByExample(ebSystemConfigExample);
        if(ebSystemConfigs.size() != 0){
            for(int i = 0 ; i < ebSystemConfigs.size() ; i ++){
                EbSystemFormTemp ebSystemFormTemp = ebSystemFormTempMapper.selectByPrimaryKey(ebSystemConfigs.get(i).getFormId());
                ebSystemConfigs.get(i).setFromList(ebSystemFormTemp);
                return CommonResult.success(ebSystemConfigs);
            }
        }
        return CommonResult.failed();
    }
 @GetMapping("/user/list")
 @ResponseBody
    public CommonResult GtUserList(Page page){
    ebUserExample.clear();
    UserList userList = new UserList();
     List<EbUser> ebUsers = ebUserMapper.selectByExample(ebUserExample);
     userList.setTotal(ebUsers.size());
     userList.setList(ebUsers);
     return CommonResult.success(userList);
 }
}



