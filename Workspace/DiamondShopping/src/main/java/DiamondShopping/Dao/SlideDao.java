package DiamondShopping.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import DiamondShopping.Entity.Slide;

@Repository
public class SlideDao extends BaseDao {

	private class SlideMapper implements RowMapper<Slide> {

		public Slide mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			
			Slide slide = new Slide();
			
			slide.setId(resultSet.getInt("id"));
			slide.setImage(resultSet.getString("image"));
			slide.setCaption(resultSet.getString("caption"));
			slide.setContent(resultSet.getString("content"));
			
			return slide;
		}
		
	}
	
	public List<Slide> getDataSlideList() {
		
		List<Slide> slideList = new ArrayList<Slide>();
		
		String sqlQuery = "SELECT * FROM Slide";
		
		slideList = JDBCTemplate.query(sqlQuery, new SlideMapper());
		
		return slideList;
	}
	
}
