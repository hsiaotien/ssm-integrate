package com.dev.mapper;

import java.io.InputStream;

import com.dev.pojo.MyUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;


public class MyUserMapperTest {
	
	private MyUserMapper myUserMapper;
	@Before
	public void setUp() throws Exception {
		String resource = "mybatis/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource );
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession(true);
		myUserMapper = sqlSession.getMapper(com.dev.mapper.MyUserMapper.class);
	}

	@Test
	public void test() {
		MyUser myUser = myUserMapper.selectUserById(1L);
		System.out.println(myUser);
	}

}
