package com.qhit.t2.dept;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import com.qhit.t2.bean.Dept;
import com.qhit.t2.utils.DBUtils;

public class DeptText {

	/**
	 * 通过oracle数据库，链接scott账户查询dept部门数据
	 * @throws SQLException
	 */
	@Test
	public void test() throws SQLException {
		String sql = "select * from dept";
		Connection con = DBUtils.getConnection();
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Dept dept = new Dept();
			dept.setDid(rs.getInt(1));
			dept.setDname(rs.getString(2));
			dept.setManager(rs.getInt(3));
			dept.setTel(rs.getString(4));
			dept.setMaster(rs.getInt(5));
			System.out.println(dept.toString());
		}
	}

}
