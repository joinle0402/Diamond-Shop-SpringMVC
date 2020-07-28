package DiamondShopping.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import DiamondShopping.Entity.NavigationBar;

@Repository
public class NavigationBarDao extends BaseDao {

	private class NavigationBarMapper implements RowMapper<NavigationBar> {

		public NavigationBar mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			
			NavigationBar navigationBar = new NavigationBar();
			
			navigationBar.setId(resultSet.getInt("id"));
			navigationBar.setName(resultSet.getString("name"));
			navigationBar.setUrl(resultSet.getString("url"));
			
			return navigationBar;
		}
		
	}
	
	public List<NavigationBar> getDataNavigationBarList() {
		
		List<NavigationBar> navigationBarList = new ArrayList<NavigationBar>();
		
		String sqlQuery = "SELECT * FROM NavigationBar";
		
		navigationBarList = JDBCTemplate.query(sqlQuery, new NavigationBarMapper());
		
		return navigationBarList;
	}

}
