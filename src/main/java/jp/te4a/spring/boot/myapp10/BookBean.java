package jp.te4a.spring.boot.myapp10;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name = "book")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookBean  {
	  @Id
	  @GeneratedValue
	  private Integer id ;
	  @Column(nullable = false)
	  private String title;
	  private String writter;
	  private String publisher;
	  private Integer price;
}
