package com.noobCoder.Dao;



// just checking git 
//import java.util.List;

import com.noobCoder.Passenger.Passenger;

public interface JDBC_MANAGER {

	public abstract void createPassenger(Passenger passenger);
	
	public abstract void addInGroup(List<Passenger>passenegr);

	public abstract Passenger getPassenger(Integer Person_Id);

	public abstract void updatePassenegrData(Passenger passenger, int Person_Id);

	public abstract void DeleteData(Integer Person_id);
	
	 default void deleteInGroup(List<Integer> id) {
		
	}

}
