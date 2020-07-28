package DiamondShopping.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import DiamondShopping.Dto.Product;

@Repository
public class ProductDao extends BaseDao {
	
	private String getSqlQuery() {
		
		StringBuffer sqlQuery = new StringBuffer();
		
		sqlQuery.append("SELECT ");
		sqlQuery.append("    p.id AS idProduct, ");
		sqlQuery.append("    p.id_category as idCategory, ");
		sqlQuery.append("    p.sizes, ");
		sqlQuery.append("    p.name, ");
		sqlQuery.append("    p.price, ");
		sqlQuery.append("    p.sale, ");
		sqlQuery.append("    p.title, ");
		sqlQuery.append("    p.featured_product as featuredProduct, ");
		sqlQuery.append("    p.new_product as newProduct, ");
		sqlQuery.append("    p.detail, ");
		sqlQuery.append("    c.id as idColor, ");
		sqlQuery.append("    c.name as nameColor, ");
		sqlQuery.append("    c.code as codeColor, ");
		sqlQuery.append("    c.image, ");
		sqlQuery.append("    p.created_at as createdAt, ");
		sqlQuery.append("    p.updated_at as updatedAt ");
		sqlQuery.append("FROM ");
		sqlQuery.append("    product AS p ");
		sqlQuery.append("INNER JOIN ");
		sqlQuery.append("    color AS c ");
		sqlQuery.append("ON ");
		sqlQuery.append("    p.id = c.id_product ");
		sqlQuery.append("GROUP BY ");
		sqlQuery.append("    p.id, ");
		sqlQuery.append("    c.id_product ");
		sqlQuery.append("ORDER BY RAND() ");
		sqlQuery.append("LIMIT 9 ");
		
		return sqlQuery.toString();
	}

	private class ProductMapper implements RowMapper<Product> {

		public Product mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			
			Product product = new Product();
			
			product.setIdProduct(resultSet.getLong("idProduct"));
			product.setIdCategory(resultSet.getInt("idCategory"));
			product.setSizes(resultSet.getString("sizes"));
			product.setName(resultSet.getString("name"));
			product.setPrice(resultSet.getDouble("price"));
			product.setSale(resultSet.getInt("sale"));
			product.setTitle(resultSet.getString("title"));
			product.setFeaturedProduct(resultSet.getBoolean("featuredProduct"));
			product.setNewProduct(resultSet.getBoolean("newProduct"));
			product.setDetail(resultSet.getString("detail"));
			product.setIdColor(resultSet.getInt("idColor"));
			product.setNameColor(resultSet.getString("nameColor"));
			product.setCodeColor(resultSet.getString("codeColor"));
			product.setImage(resultSet.getString("image"));
			product.setCreatedAt(resultSet.getDate("createdAt"));
			product.setUpdatedAt(resultSet.getDate("updatedAt"));
			
			return product;
		}
		
	}
	
	public List<Product> getDataProductList() {
		
		List<Product> productList = new ArrayList<Product>();
		
		String sqlQuery = getSqlQuery();
		
		productList = JDBCTemplate.query(sqlQuery, new ProductMapper());
		
		return productList;
	}
	
}
