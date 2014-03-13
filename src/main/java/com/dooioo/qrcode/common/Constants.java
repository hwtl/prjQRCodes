package com.dooioo.qrcode.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Author: Jerry.hu
 * Create: Jerry.hu (14-3-12 17:21)
 * Description:
 * To change this template use File | Settings | File Templates.
 */
public class Constants {

    private static Map<String,Integer> qrcodeSizeMap = new HashMap<String,Integer>(){{
        put("S",80);
        put("L",120);
        put("M",200);
    }};

}
