package service;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import Entity.User;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{

	private static final Logger log=LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Autowired
	private UserDaoService userDaoService;
	
	@Override
	public void run(String... args) throws Exception {
		User user =new User("jack","admin");
		long insert=userDaoService.insert(user);
		log.info("New user is created"+user);
		
	}

}
