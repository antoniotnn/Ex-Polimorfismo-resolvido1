package entities;

public class OutsourcedEmployee extends Employee {

	
	protected Double additionalCharge;
	
	public OutsourcedEmployee() {
		
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Double payment() {
		return (valuePerHour*hours)+additionalCharge+(additionalCharge*0.1);	
	}	
}
