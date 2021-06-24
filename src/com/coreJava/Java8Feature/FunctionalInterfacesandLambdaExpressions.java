package com.coreJava.Java8Feature;
@FunctionalInterface
interface Interface1 {
 
    void method1();
     
    default void log(String str){
        System.out.println("I1 logging::"+str);
    }
     
    static void print(String str){
        System.out.println("Printing "+str);
    }
}
public class FunctionalInterfacesandLambdaExpressions {
	
	
	Runnable r = new Runnable(){
        @Override
        public void run() {
            System.out.println("My Runnable");
        }};
        
        
        Runnable r1 = () -> {
            System.out.println("My Runnable");
        };

		Interface1 i= () ->{
			System.out.println("My method1");
		};
}