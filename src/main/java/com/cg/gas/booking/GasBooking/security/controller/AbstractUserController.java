//package com.cg.gas.booking.GasBooking.security.controller;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.cg.gas.booking.GasBooking.model.AbstractUser;
//import com.cg.gas.booking.GasBooking.security.service.AbstractUserService;
//
//@RestController
//public class AbstractUserController {
//
//	private final Logger log = LoggerFactory.getLogger(AbstractUserController.class);
//
//	@Autowired(required = true)
//	private AbstractUserService userService;
//
//	@PostMapping("/authenticationRegister")
//	public AbstractUser register(@RequestBody AbstractUser appUser) {
//		log.info("registerController");
//		return userService.register(userService);
//	}
//
//	@PostMapping("/login")
//	public AbstractUser login(@RequestBody AbstractUser appUser) {
//		log.info("loginController");
//		log.info(appUser.getUserName());
//		log.info(appUser.getPassword());
//
//		AbstractUser appUser2 = userService.login(userService);
//		if ((appUser.getUserName().equals(appUser2.getUserName())
//				&& (appUser.getPassword().equals(appUser2.getPassword())))) {
//			return appUser2;
//		}
//		return null;
//	}
//
//	@GetMapping("/logout")
//	public String logout() {
//		log.info("logoutController");
//		return userService.logout();
//	}
//}