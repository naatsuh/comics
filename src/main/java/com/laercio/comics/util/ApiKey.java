package com.laercio.comics.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;

public class ApiKey {

    private Calendar calendar = Calendar.getInstance();
    private String publickey = "f8b683e8ba42ba9401b061f16392532f";
    private String privatekey = "ec5e53f96188353864764719022e3b07c08a201b";
    private String md5 = createMd5();


    private Long getTimeStamp() {
        return this.calendar.getTimeInMillis();
    }

    public String urlApi () {
        String uri =  "http://gateway.marvel.com/v1/public/comics?ts="+getTimeStamp()+"&apikey="+this.publickey+"&hash="+this.md5;
        return uri;
    }

    private String createMd5 () {
        String conj = getTimeStamp()+privatekey+publickey;
        MessageDigest m = null;
        try {
            m = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        m.update(conj.getBytes(),0,conj.length());
        String md5 = new BigInteger(1,m.digest()).toString(16);
        return md5;
    }

}
