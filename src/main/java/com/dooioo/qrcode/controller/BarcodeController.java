package com.dooioo.qrcode.controller;

import com.dooioo.qrcode.helper.SizeHelper;
import com.dooioo.qrcode.model.QRCode;
import com.dooioo.qrcode.util.BarcodeUtil;
import com.dooioo.qrcode.util.WebPathUtils;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Author: Jerry.hu
 * Create: Jerry.hu (14-3-12 16:21)
 * Description:
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/qr/")
public class BarcodeController {

    public static final String ATTACH = "/attach";
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/generate")
    public String success(QRCode qrCode,Model model,HttpServletRequest request) throws IOException, WriterException {
        SizeHelper.setSize(qrCode);
        String prefix = new SimpleDateFormat("yyyyMMddHHmmSSS").format(new Date());
        File file = new File(WebPathUtils.getServerPath(request)+ATTACH+File.separator+prefix+".png");
        BarcodeUtil.writeToFile(BarcodeFormat.QR_CODE, qrCode.getContents(),qrCode.getWidth(),qrCode.getHeight(), file);
        model.addAttribute("filePath",ATTACH+File.separator+file.getName());
        return "success";
    }

    @RequestMapping(value = "/chart")
    public @ResponseBody void generateFilePath(QRCode qrCode,HttpServletRequest request,HttpServletResponse response) throws IOException, WriterException {
        SizeHelper.setSize(qrCode);
        String prefix = new SimpleDateFormat("yyyyMMddHHmmSSS").format(new Date());
        File file = new File(WebPathUtils.getServerPath(request)+ATTACH+File.separator+prefix+".png");
        BarcodeUtil.writeToFile(BarcodeFormat.QR_CODE, qrCode.getContents(), qrCode.getWidth(), qrCode.getHeight(), file);
        qrCode.setFilePath(ATTACH + File.separator + file.getName());
        response.setContentType("text/json; charset=UTF-8");
        JSONObject jsonObject = JSONObject.fromObject(qrCode);
        response.getWriter().write(jsonObject.toString());
    }

    @RequestMapping(value = "/getQRCode")
    public String showQRCode(QRCode qrCode,HttpServletRequest request,Model model) throws IOException, WriterException {
        SizeHelper.setSize(qrCode);
        String prefix = new SimpleDateFormat("yyyyMMddHHmmSSS").format(new Date());
        File file = new File(WebPathUtils.getServerPath(request)+ATTACH+File.separator+prefix+".png");
        BarcodeUtil.writeToFile(BarcodeFormat.QR_CODE, qrCode.getContents(), qrCode.getWidth(), qrCode.getHeight(), file);
        model.addAttribute("filePath",ATTACH+File.separator+file.getName());
        return  "success";
    }
}
