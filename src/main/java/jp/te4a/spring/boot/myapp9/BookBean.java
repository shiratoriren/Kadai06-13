package jp.te4a.spring.boot.myapp9;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBean  {
	Integer id;
	String title;
	String writter;
	String publisher;
	Integer price;
}
