package sarahguarneri.U2W1L1.MENU;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U2W1L1MenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(U2W1L1MenuApplication.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2W1L1MenuApplication.class);
		System.out.println(ctx.getBean("menu"));
	}

}
