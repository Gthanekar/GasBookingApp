//package com.cg.gas.booking.GasBooking.security.service;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.cg.gas.booking.GasBooking.model.AbstractUser;
//import com.cg.gas.booking.GasBooking.security.repository.AbstractUserRepository;
//

//
//@Service
//public class AbstractUserService {
//
//	private final static Logger log = LoggerFactory.getLogger(AbstractUserService.class);
//
//	@Autowired(required = true)
//	private AbstractUserRepository repository;
//
//	private AbstractUser currentAppUser; // access control to APIs
//
//	public AbstractUser login(AbstractUserService abstractUser) { /// usermem , pass
//		log.info("loginService");
//		currentAppUser = repository.findByUsername(abstractUser.getClass().getName());
//		return currentAppUser;
//	}
//
//	public AbstractUser register(AbstractUserService appUser) { ///// username= "abc" ,pasword="abc" , role="ADMIN"
//		log.info("registerService");
//		return repository.save(currentAppUser);
//	}
//
//	public String logout() {
//		log.info("logoutService");
//		currentAppUser = null;
//		return "User logged out successfully";
//	}
//
//	public AbstractUser loginStatus() {
//		log.info("loginStatusService");
//		return currentAppUser;
//	}
//
//}
