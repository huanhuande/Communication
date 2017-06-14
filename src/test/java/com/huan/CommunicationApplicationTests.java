package com.huan;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CommunicationApplicationTests {
/*

	@Autowired
	private JavaMailSender mailSender;

	*/
/**
	 * 修改application.properties的用户，才能发送。
	 *//*

	@Test
	public void sendSimpleEmail(){
		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom("765329611@qq.com");//发送者.
		message.setTo("2787863127@qq.com");//接收者.
		message.setSubject("测试邮件（邮件主题）");//邮件主题.
		message.setText("这是邮件内容");//邮件内容.

		mailSender.send(message);//发送邮件
	}
*/

}
