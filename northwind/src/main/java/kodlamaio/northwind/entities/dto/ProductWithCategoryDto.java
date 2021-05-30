package kodlamaio.northwind.entities.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductWithCategoryDto {
	
	private int Id;
	private String productName;
	private String CategoryName;

}
