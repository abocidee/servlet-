package cn.tedu;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodeTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String string = "����";
		//����url����
		String string2 = URLEncoder.encode(string, "utf-8");
		System.out.println(string2);
		//����url����
		String string3 = URLDecoder.decode(string2, "iso8859-1");
		System.out.println(string3);
		//Ϊ�˵õ�����������Ҫ�Խ��������� ���½���
		String string4  = 
				new String(string3.getBytes("iso8859-1"), "utf-8");
		System.out.println(string4);
		
	}
}
