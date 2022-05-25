package jp.te4a.spring.boot.myapp12;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;

public @interface Writter {
    String ok();
    String message() default  "input {ok}.";
    // Classオブジェクトを得る（戻り値とする）メソッドgroups()
    // デフォルト値は空のクラス
    Class<?>[] groups() default {};
    // Payloadクラスを継承したClassオブジェクトを得る
    // （戻り値とする）メソッドpayload()、デフォルト値は空のクラス
    Class<? extends Payload>[] payload() default{};
}
