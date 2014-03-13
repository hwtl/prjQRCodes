package com.dooioo.qrcode.model;

import com.dooioo.qrcode.util.BarcodeUtil;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Author: Jerry.hu
 * Create: Jerry.hu (14-3-12 16:32)
 * Description:
 * To change this template use File | Settings | File Templates.
 */
public class QRCode implements Serializable {

    private static final long serialVersionUID = -2165747988751535051L;
    private String contents ;
    private int width = BarcodeUtil.MIDDLE;
    private int height = BarcodeUtil.MIDDLE;
    private String size; //图片大小规格  S,M,L  小，中,大
    private String filePath;  //二维码路径

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String toString() {
        return "QRCode{" +
                "contents='" + contents + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", size='" + size + '\'' +
                ", filePath='" + filePath + '\'' +
                '}';
    }
}
