package kr.or.dgit.bigdata.swmng.util;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import kr.or.dgit.bigdata.swmng.dto.Company;

public class CoNameTypeHandler extends BaseTypeHandler<Company> {

	@Override
	public void setNonNullParameter(PreparedStatement ps, int i, Company parameter, JdbcType jdbcType)
			throws SQLException {
		ps.setString(i, parameter.toString());
	}

	@Override
	public Company getNullableResult(ResultSet rs, String columnName) throws SQLException {
		return new Company(rs.getInt("no"), rs.getString("coName"), rs.getString("address"), rs.getString("tel"));
		/*return new Company(rs.getString("coName"));*/
	}

	@Override
	public Company getNullableResult(ResultSet rs, int columnIndex) throws SQLException {

		return new Company(rs.getString(columnIndex));
	}

	@Override
	public Company getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {

		return new Company(cs.getString(columnIndex));
	}

}
