package cn.tedu;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodeTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String string = "达内";
		//进行url编码
		String string2 = URLEncoder.encode(string, "utf-8");
		System.out.println(string2);
		//进行url解码
		String string3 = URLDecoder.decode(string2, "iso8859-1");
		System.out.println(string3);
		//为了得到真正内容需要对解错码的数据 重新解码
		String string4  = 
				new String(string3.getBytes("iso8859-1"), "utf-8");
		System.out.println(string4);
		
	}
}
