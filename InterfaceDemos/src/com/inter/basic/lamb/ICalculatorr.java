package com.inter.basic.lamb;

public interface ICalculatorr {
	void calculate(int x, int y);
}

interface IPrinter{
	String printMsg(String message);
}

interface IBonus{
	double printBonus(double amount, int year);
}

interface IMovies{
	  String[] showMovies();
}


interface IFactory{
	  String[] showProducts(String type);
}







