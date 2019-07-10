package com.ludata.luDataTest.test;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.util.Date;

public class HutoolTest {


    public static void main(String[] args) {
        asymmetricCrypto();
    }
    //使用Hutool转换日期
    private static void dateTest(){
        Date date3 = DateUtil.date(System.currentTimeMillis());
        //当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
        String now = DateUtil.now();
        //当前日期字符串，格式：yyyy-MM-dd
        String today= DateUtil.today();
        System.out.println(now);
        System.out.println(today);
    }

    //文件拷贝方式
    private static void fileCpoyTest(){
        BufferedInputStream in = FileUtil.getInputStream("D:\\上海路达\\切图\\船舶辅机拆装操作技能实训\\切图\\Lesson010201Panel\\Lesson010201Panel_res\\img1.png");
        BufferedOutputStream out = FileUtil.getOutputStream("d:/kkk.png");
        long copySize = IoUtil.copy(in, out, IoUtil.DEFAULT_BUFFER_SIZE);
    }

    //加密测试
    private static void asymmetricCrypto(){

        //创建RSA非对称加密对象
        RSA rsa = new RSA();

        //获得私钥
        rsa.getPrivateKey();

        //获得公钥
        rsa.getPublicKey();

        byte[] encrypt1 = rsa.encrypt(StrUtil.bytes("liuzijiang1314", CharsetUtil.CHARSET_UTF_8), KeyType.PublicKey);  //公钥加密后的内容、
        byte[] decrypt = rsa.decrypt(encrypt1, KeyType.PrivateKey);      //获取密匙取反解密公钥加密后的内容
        System.out.println(StrUtil.str(encrypt1, CharsetUtil.CHARSET_UTF_8)+"===="); //加密结果
        System.out.println(StrUtil.str(decrypt, CharsetUtil.CHARSET_UTF_8)); //加密结果
    }
}
