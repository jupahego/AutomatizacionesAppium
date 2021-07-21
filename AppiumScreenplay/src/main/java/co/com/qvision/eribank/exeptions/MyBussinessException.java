package co.com.qvision.eribank.exeptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class MyBussinessException extends SerenityManagedException {
    public MyBussinessException(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }
}
