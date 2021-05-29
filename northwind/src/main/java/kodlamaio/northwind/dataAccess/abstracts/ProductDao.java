package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{
	//Burada JPA Repository isimlendirmelere uyduğumuz sürece 
	//bizim için sql kodlarını hazır yazıyor.
	
	//getBy dediğimizde select * from kısmından itibaren and, or, in, 
	//contains vb. anahtar kelimeler ile istediğimiz verileri çekebiliyoruz. 
	
	Product getByProductName(String productName);
	
	//Burada Category Product tablosunda catgoryId kısmı olmadığı için category olarak veriyoruz.
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	
	List<Product> getByCategory_CategoryIdIn(List<Integer> categories);
	
	List<Product> getByProductNameContains(String productName);
	
	List<Product> getByProductNameStartsWith(String productName);
	
	//Buradaki Product entitydir.
	//:productName ve :categoryId değişkendir.
	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
	List<Product> getByNameAndCategory_CategoryId(String productName, int categoryId);	
}
