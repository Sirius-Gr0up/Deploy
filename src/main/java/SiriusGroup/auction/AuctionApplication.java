package SiriusGroup.auction;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//@SpringBootApplication
//public class AuctionApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(AuctionApplication.class, args);
//	}
//
//}


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

//@Controller
@SpringBootApplication
public class AuctionApplication {

	@RequestMapping("/e")
	@ResponseBody
	String home() {
		return "Hello World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(AuctionApplication.class, args);
	}
}