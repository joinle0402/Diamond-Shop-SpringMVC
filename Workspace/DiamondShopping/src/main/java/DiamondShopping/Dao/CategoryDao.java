package DiamondShopping.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import DiamondShopping.Entity.Category;

@Repository
public class CategoryDao extends BaseDao {

	private class CategoryMapper implements RowMapper<Category> {

		public Category mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			
			Category category = new Category();
			
			category.setId(resultSet.getInt("id"));
			category.setName(resultSet.getString("name"));
			category.setDescription(resultSet.getString("description"));
			
			return category;
		}
		
	}
	
	public List<Category> getDataCategoryList() {
		
		List<Category> categoryList = new ArrayList<Category>();
		
		String sqlQuery = "SELECT * FROM Category";
		
		categoryList = JDBCTemplate.query(sqlQuery, new CategoryMapper());
		
		return categoryList;
	}
	
}
