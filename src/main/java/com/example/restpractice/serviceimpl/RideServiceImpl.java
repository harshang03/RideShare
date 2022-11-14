package com.example.restpractice.serviceimpl;

import com.example.restpractice.dao.AvailableForRideDao;
import com.example.restpractice.dao.ConformRideDao;
import com.example.restpractice.dbTables.AvailableForRide;
import com.example.restpractice.dbTables.ConformRide;
import com.example.restpractice.services.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RideServiceImpl implements RideService {

	 @Autowired
	 private AvailableForRideDao availableForRideDao;
	 @Autowired
	 private ConformRideDao conformRideDao;

	 @Override
	 public List<AvailableForRide> getAllAvailableRide() {
		  return availableForRideDao.findAll();
	 }

	 @Override
	 public boolean addRide(AvailableForRide availableForRide) {
		  System.out.println(availableForRide.getAvailableSeats());
		  try {
				this.availableForRideDao.save(availableForRide);
				return true;
		  } catch (Exception e) {
				System.out.println("problem at add ride!\n");
				e.printStackTrace();
				return false;
		  }
	 }

	 @Override
	 public boolean conformRide(String rideId, String driverId, String pillionId /*,LocalDateTime dateTime*/) {
		  try {
				ConformRide conformRide = new ConformRide();
				conformRide.setRideId(rideId);
				conformRide.setDriver(driverId);
				conformRide.setPillion(pillionId);
				conformRideDao.save(conformRide);
				try {
					 Optional<AvailableForRide> availableForRide = availableForRideDao.findById(rideId);
					 if(availableForRide.isPresent()){
						  availableForRideDao.delete(availableForRide.get());
						  System.out.println("DELETED!");
					 }
				} catch (Exception e) {
					 e.printStackTrace();
					 System.out.println("problem at delete record from available ride!");
				}
				//localhost:8080/conformRide?rideId=3&driverId=ddw&pillionId=xxd
				return true;
		  } catch (Exception e) {
				e.printStackTrace();
				System.out.println("problem at Conform ride!!");
				return false;
		  }
	 }
}
