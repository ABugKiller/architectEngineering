package com.ad.proxy;

import com.ad.proxy.cglib.YunZhongYu;
import com.ad.proxy.jdk.ADMeipo;
import com.ad.proxy.jdk.Person;
import com.ad.proxy.jdk.XiaoXingxing;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProxyApplicationTests {

	@Test
	public void testJDK() {
		try {
			Person obj = (Person)new ADMeipo().getInstance(new XiaoXingxing());
			System.out.println(obj.getClass());
			obj.findFriend();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testCGLib() {
		//JDK的动态代理是通过接口来进行强制转换的
		//生成以后的代理对象，可以强制转换为接口

		//CGLib的动态代理是通过生成一个被代理对象的子类，然后重写父类的方法
		//生成以后的对象，可以强制转换为被代理对象（也就是用自己写的类）
		//子类引用赋值给父类

		try {
			YunZhongYu obj = (YunZhongYu)new com.ad.proxy.cglib.ADMeipo().getInstance(YunZhongYu.class);
			obj.findFriend();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
