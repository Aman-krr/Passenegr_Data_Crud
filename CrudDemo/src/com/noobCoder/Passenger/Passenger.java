package com.noobCoder.Passenger;

public class Passenger {
// User_Data(Person_Name varchar(255),Person_Id int,Train_Number int,Origin_City varchar(255) ,Destintion_City varchar(255));
	
	private String Person_Name;
	private Integer Person_Id;
	public Passenger() {
		super();
	}
	public Passenger(String person_Name, Integer person_Id, Integer train_Number, String origin_City,
			String destintion_City) {
		super();
		Person_Name = person_Name;
		Person_Id = person_Id;
		Train_Number = train_Number;
		Origin_City = origin_City;
		Destintion_City = destintion_City;
	}
	private Integer Train_Number;
	private String Origin_City;
	private String Destintion_City;
	/**
	 * @return the person_Name
	 */
	public String getPerson_Name() {
		return Person_Name;
	}
	/**
	 * @param person_Name the person_Name to set
	 */
	public void setPerson_Name(String person_Name) {
		Person_Name = person_Name;
	}
	/**
	 * @return the person_Id
	 */
	public Integer getPerson_Id() {
		return Person_Id;
	}
	/**
	 * @param person_Id the person_Id to set
	 */
	public void setPerson_Id(Integer person_Id) {
		Person_Id = person_Id;
	}
	/**
	 * @return the train_Number
	 */
	public Integer getTrain_Number() {
		return Train_Number;
	}
	/**
	 * @param train_Number the train_Number to set
	 */
	public void setTrain_Number(Integer train_Number) {
		Train_Number = train_Number;
	}
	@Override
	public String toString() {
		return "Passenger [Person_Name=" + Person_Name + ", Person_Id=" + Person_Id + ", Train_Number=" + Train_Number
				+ ", Origin_City=" + Origin_City + ", Destintion_City=" + Destintion_City + "]";
	}
	/**
	 * @return the origin_City
	 */
	public String getOrigin_City() {
		return Origin_City;
	}
	/**
	 * @param origin_City the origin_City to set
	 */
	public void setOrigin_City(String origin_City) {
		Origin_City = origin_City;
	}
	/**
	 * @return the destintion_City
	 */
	public String getDestintion_City() {
		return Destintion_City;
	}
	/**
	 * @param destintion_City the destintion_City to set
	 */
	public void setDestintion_City(String destintion_City) {
		Destintion_City = destintion_City;
	}
	
	
	
}
