package isi.dan.laboratorios.danmscuenta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class DanMsCuentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DanMsCuentaApplication.class, args);
	}

}
