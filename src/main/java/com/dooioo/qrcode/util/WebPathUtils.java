package com.dooioo.qrcode.util;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: hw
 * Date: 13-1-18
 * Time: 下午5:02
 * 获取当前项目的路径
 */
public class WebPathUtils {
    /**
     * 获取服务器地址
     * @param request 客户端请求
     * @return  String
     */
    public static String getServerPath(HttpServletRequest request){
       String prjPath = request.getSession().getServletContext().getRealPath("/");
      return  new File(prjPath).getParent();
    }

}
