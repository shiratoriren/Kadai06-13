package jp.te4a.spring.boot.myapp13;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class WritterValidator implements ConstraintValidator<Writter,String> {
	String ok;
	@Override
	public void initialize(Writter nv){ ok =  nv.ok(); }
	@Override
	public boolean isValid(String in,ConstraintValidatorContext cxt){
		if(in == null){
			return false;
		}
		System.out.println(in.equals(ok));
		return in.equals(ok);
	}
}
