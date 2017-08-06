package es.amartinm.cassandra;

import es.amartinm.cassandra.domain.User;
import es.amartinm.cassandra.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CassandraApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(CassandraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		userRepository.insert(new User("Alvaro","Martin","amartinm@mail.es","empresa"));

		Iterable<User> users = userRepository.findAll();
		for(User user: users)
			System.out.println(user);
	}

}
