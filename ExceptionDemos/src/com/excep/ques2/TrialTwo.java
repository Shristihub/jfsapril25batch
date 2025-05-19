package com.excep.ques2;


class C{
	static void meth3() throws Exception {
		System.out.println("in class C");
		System.out.println("connecting to db");
		int x=10;
		if(x<100) {
			throw new Exception("wrong value");
		}
		System.out.println("continue withdb operations");
	}}
class B{
	static void meth2()  throws Exception  {
		System.out.println("in class B");
		try {
			C.meth3();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			throw e;
		}
		System.out.println("GoodBye B");
	}}
class A{
	static void meth1()   throws Exception {
		System.out.println("in class A");
		B.meth2();
		System.out.println("Completed A");
}}

public class TrialTwo {
	
	public static void main(String[] args)  {
		System.out.println("Hello");
		try {
			A.meth1();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("All done correct");
	}

}
