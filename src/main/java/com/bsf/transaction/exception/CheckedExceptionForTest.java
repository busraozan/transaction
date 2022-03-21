package com.bsf.transaction.exception;

public class CheckedExceptionForTest extends Exception{

    public CheckedExceptionForTest(String message){
        System.out.println("Error Text:" + message);
    }
}
