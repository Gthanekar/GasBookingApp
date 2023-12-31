
package com.cg.gas.booking.GasBooking.repository;

import com.cg.gas.booking.GasBooking.model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepo extends JpaRepository<Bank, Integer> {

}
