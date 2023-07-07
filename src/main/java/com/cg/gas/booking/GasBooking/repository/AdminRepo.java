
 package com.cg.gas.booking.GasBooking.repository;
  
  import org.springframework.data.jpa.repository.JpaRepository; import
  org.springframework.stereotype.Repository;
  
  import com.cg.gas.booking.GasBooking.model.Admin;
  
  @Repository public interface AdminRepo extends JpaRepository<Admin, Integer>
  {
  
  }
 