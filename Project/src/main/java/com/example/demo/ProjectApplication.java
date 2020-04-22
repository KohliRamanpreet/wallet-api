package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/*import com.wallet.model.User;
import com.wallet.repository.UserRepository;

@SpringBootApplication(scanBasePackages= {"com.wallet.controller"})
@EnableJpaRepositories("com.wallet.repository")
@EntityScan("com.wallet.model")*/
@SpringBootApplication(scanBasePackages = {"com.wallet.controller"})
@EnableJpaRepositories("com.wallet.repository")
@EntityScan("com.wallet.model")

public class ProjectApplication  {
 
	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

	
		
	

}
