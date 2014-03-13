package com.dooioo.qrcode.qrcodeEnum;

/**
 * Created with IntelliJ IDEA.
 * Author: Jerry.hu
 * Create: Jerry.hu (14-3-12 17:37)
 * Description:
 * To change this template use File | Settings | File Templates.
 */
public enum SizeEnum {

    S(80), M(140), L(200);

    private int value;

    private SizeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
