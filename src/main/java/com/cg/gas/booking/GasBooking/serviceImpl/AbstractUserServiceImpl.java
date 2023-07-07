//package com.cg.gas.booking.GasBooking.serviceImpl;
//
//import org.apache.catalina.users.AbstractUser;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.cg.gas.booking.GasBooking.repository.AbstractUserRepo;
//import com.cg.gas.booking.GasBooking.serviceInterface.AbstractUserInterface;
//
//public class AbstractUserServiceImpl implements AbstractUserInterface {
//
//	@Autowired
//	AbstractUserRepo abstractUserRepo;
//
//	AbstractUser abstractUser;
//
//	@Override
//	public AbstractUser login(AbstractUser abstractUser) {
//		abstractUser = abstractUserRepo.findByUsername(String username)
//		return abstractUser;
//	}
//
//	@Override
//	public AbstractUser register(AbstractUser abstractUser) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public String logout() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
