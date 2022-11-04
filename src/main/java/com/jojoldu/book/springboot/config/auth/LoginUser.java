package com.jojoldu.book.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/*
@Target(ElementType.PARAMETER):
이 어노테이션이 생성될 수 있는 위치를 지정.
PARAMETER로 지정시에, 메소드의 파라미터로 선언된 객체에서만 사용가능.

@interface
이 파일을 어노테이션 클래스로 지정.
LoginUser라는 어노테이션이 생성된다는 의미.

메서드가 없이 선언하면 [마커 어노테이션]이 되며 표시만 해두는 역할이 됨.
@SingleValueAnnotation(id = 1) 같이 하나의 값을 입력받는 어노테이션이나
@MultiValueAnnotation(id = 2, name = "Hello", roles = {"admin", "users"})과 같이 여러 값을 입력받게 만들 수도 있음.


어노테이션은 클래스, 필드 변수, 메서드 인자, 로컬변수위에 선언할 수 있음.

 */

@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {


}
