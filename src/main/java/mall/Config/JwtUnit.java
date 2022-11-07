package mall.Config;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import javax.xml.bind.DatatypeConverter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUnit {
    private static final long MAX_TIME = 15 * 60 * 1000;//設置過期時間
    //token秘钥
    private static final String TOKEN_SECRET = "ZCEQIUBFKSJBFJH2020BQWE";
    public static String SetToken(String username , Integer userid) {//登录成功写入token返回前台
    String token = "";
    try{
        Date date = new Date(System.currentTimeMillis() +MAX_TIME );
        //秘钥及加密算法
        Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
        //设置头部信息
        Map<String,Object> header = new HashMap<>();
        header.put("typ","JWT");
        header.put("alg","HS256");
        //携带username，password信息，生成签名
        token = JWT.create().withHeader(header)
                          .withClaim("uesrname",username)
                          .withClaim("userid",userid).withExpiresAt(date)
                          .sign(algorithm);

    }catch (Exception e)
    { e.printStackTrace();
    return  null;
    }
    return token;
    }
    public static String parseToken(String token) {//获取token指定名称的数据
        DecodedJWT jwt = JWT.decode(token);
        return jwt.getClaim("uesrname").asString();
    }

}
