package com.noobCoder.impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

ad
import java.util.List;

import com.noobCoder.Connection.DBconn;
import com.noobCoder.Dao.JDBC_MANAGER;
import com.noobCoder.Passenger.Passenger;

//User_Data(Person_Name varchar(255),Person_Id int,Train_Number int,Origin_City varchar(255) ,Destintion_City varchar(255));
public class DaoImplementation implements JDBC_MANAGER {

	@Override
	public void createPassenger(Passenger passenger) {
		
		String Query = "INSERT INTO User_Data (Person_Name,Person_Id,Train_Number,Origin_City,Destintion_City)"+" VALUES (?,?,?,?,?)";
		try (Connection conn = DBconn.getConn(); PreparedStatement statement = conn.prepareStatement(Query)) {
			statement.setString(1, passenger.getPerson_Name());
			statement.setInt(2, passenger.getPerson_Id());
			statement.setInt(3, passenger.getTrain_Number());
			statement.setString(4, passenger.getOrigin_City());
			statement.setString(5, passenger.getDestintion_City());
		int	output = statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	@Override
	public Passenger getPassenger(Integer Person_Id) {
		Passenger p1 = new Passenger();
		String Query = "SELECT * FROM User_Data WHERE Person_Id=?";
		try (Connection conn = DBconn.getConn(); PreparedStatement statement = conn.prepareStatement(Query)) {
			statement.setLong(1, Person_Id);

			ResultSet executeQuery = statement.executeQuery();

			while (executeQuery.next()) {
				p1.setPerson_Name(executeQuery.getString(1));
				p1.setPerson_Id(executeQuery.getInt(2));
				p1.setTrain_Number(executeQuery.getInt(3));
				p1.setOrigin_City(executeQuery.getString(4));
				p1.setDestintion_City(executeQuery.getString(5));

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return p1;
	}

	@Override
	public void updatePassenegrData(Passenger passenger, int Person_Id) {
		String Query = "UPDATE User_Data SET Destintion_City=? WHERE Person_Id=?";
		try (Connection conn = DBconn.getConn(); PreparedStatement statement = conn.prepareStatement(Query)) {
			statement.setString(1, passenger.getDestintion_City());
			statement.setInt(2, Person_Id);

			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void DeleteData(Integer Person_id) {

		String Query = "DELETE FROM User_Data  WHERE Person_Id=?";
		try (Connection conn = DBconn.getConn(); PreparedStatement statement = conn.prepareStatement(Query)) {
			statement.setInt(1, Person_id);

			int val = statement.executeUpdate();
			if (val == 1) {

				System.out.println("Passenger Removed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void addInGroup(List<Passenger> passenger1) {
		// TODO Auto-generated method stub
		
		String Query = "INSERT INTO User_Data (Person_Name,Person_Id,Train_Number,Origin_City,Destintion_City)"+" VALUES (?,?,?,?,?)";
		try (Connection conn = DBconn.getConn(); PreparedStatement statement = conn.prepareStatement(Query)) {
			for(Passenger passenger:passenger1) {
			statement.setString(1, passenger.getPerson_Name());
			statement.setInt(2, passenger.getPerson_Id());
			statement.setInt(3, passenger.getTrain_Number());
			statement.setString(4, passenger.getOrigin_City());
			statement.setString(5, passenger.getDestintion_City());
			statement.addBatch();}
		int[]	output = statement.executeBatch();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	

	
	
	
}
