package newDAOImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import newCombinationDatabase.CombinationStore;

public class CombinationRowMapper implements RowMapper<CombinationStore> {

	
	public CombinationStore mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		CombinationStore comb=new CombinationStore();
		comb.setId(rs.getInt("id"));
		comb.setStoreName(rs.getString("store_name"));
		comb.setZipcode(rs.getInt("zip_code"));
		comb.setStorecount(rs.getInt("store_count"));
				return comb;
			}
}
