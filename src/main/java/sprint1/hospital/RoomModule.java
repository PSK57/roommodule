package sprint1.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RoomModule {

	public static void main(String[] args) {
		SpringApplication.run(RoomModule.class, args);
		System.out.println("Room Module Started...");
	}
}