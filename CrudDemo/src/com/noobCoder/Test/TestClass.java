package com.noobCoder.Test;

import java.util.ArrayList;
import java.util.List;

import com.noobCoder.Dao.JDBC_MANAGER;
import com.noobCoder.Passenger.Passenger;
import com.noobCoder.impl.DaoImplementation;

public class TestClass {

	/*
	 * private static Passenger getPassenger() { Passenger passenger= new
	 * Passenger(); passenger.setPerson_Name("Rahul");
	 * passenger.setTrain_Number(14); passenger.setPerson_Id(20);
	 * 
	 * passenger.setOrigin_City("DELHI") ; passenger.setDestintion_City("PUNJAB");
	 * 
	 * return passenger; }
	 */
	private static List<Passenger> getPassenger() {
		List<Passenger> passenger= new ArrayList();
		Passenger p1= new Passenger("Aman",12345,54321,"Delhi","KOLKATA");
		Passenger p2= new Passenger("Aman2",12340,54322,"AMRITSAR","KOLKATA");
		Passenger p3= new Passenger("Aman3",12349,54323,"HYDERABAD","KOLKATA");
		Passenger p4= new Passenger("Aman4",12343,54327,"Delhi","PATNA");
		 {
			passenger.add(p1);
			passenger.add(p2);
			passenger.add(p3);
			passenger.add(p4);
		}
		return passenger;
	}
	
	public static void main(String[] args) {
		JDBC_MANAGER Passenger= new DaoImplementation();
		List<Passenger> p=getPassenger();
Passenger.addInGroup(p);
//		com.noobCoder.Passenger.Passenger pas2 = Passenger.getPassenger(12345);
//		Passenger.updatePassenegrData(p, 12345);
//		System.out.println(pas2);
//		Passenger.DeleteData(12345);

	}

	
	
}
