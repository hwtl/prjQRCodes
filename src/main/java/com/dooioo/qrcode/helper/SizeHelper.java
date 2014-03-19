package com.dooioo.qrcode.helper;

import com.dooioo.qrcode.model.QRCode;
import com.dooioo.qrcode.qrcodeEnum.SizeEnum;

/**
 * Created with IntelliJ IDEA.
 * Author: Jerry.hu
 * Create: Jerry.hu (14-3-12 17:49)
 * Description:
 * To change this template use File | Settings | File Templates.
 */
public class SizeHelper {

    public static QRCode setSize(QRCode qrCode){
        switch (SizeEnum.valueOf(qrCode.getSize().toUpperCase())){
            case  S:
                qrCode.setHeight(SizeEnum.S.getValue());
                qrCode.setWidth(SizeEnum.S.getValue());
                break;
            case M:
                qrCode.setHeight(SizeEnum.M.getValue());
                qrCode.setWidth(SizeEnum.M.getValue());
                break;
            case L:
                qrCode.setHeight(SizeEnum.L.getValue());
                qrCode.setWidth(SizeEnum.L.getValue());
                break;
            default:
                qrCode.setHeight(SizeEnum.M.getValue());
                qrCode.setWidth(SizeEnum.M.getValue());
        }
        return qrCode;
    }
}
