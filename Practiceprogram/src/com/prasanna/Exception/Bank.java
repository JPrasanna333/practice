package com.prasanna.Exception;


public class Bank {
	public void withDraw() throws InvalidInputException  {

		ATM a=new ATM();
		a.acceptInput();
    	a.verify();
	}


}
