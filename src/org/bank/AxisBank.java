package org.bank;

public class AxisBank extends BankInfo {
	@Override
	public void saving(int id) {
		// TODO Auto-generated method stub
		System.out.println("Emplyee savings is:"+ id);
	}
	
@Override
public void fixed(String name) {
	// TODO Auto-generated method stub
	System.out.println("employee has fixed deposit name:"+ name);
	System.out.println("employee has fixed deposit name:"+ name);

}



@Override
public void Deposit(long number) {
	// TODO Auto-generated method stub
	System.out.println("employee has good package deposit:"+ number);
}
public static void main(String[] args) {
	AxisBank a = new AxisBank();
	a.saving(96);
	a.fixed("poojitha");
	a.Deposit(9652);
	System.out.println("s");
}
	

}
