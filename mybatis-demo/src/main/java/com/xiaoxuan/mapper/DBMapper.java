package com.xiaoxuan.mapper;

import com.xiaoxuan.model.DB;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * description
 *
 *     使用注解的方式进行整合
 *
 * Created by xiexiaoxuan on 2020/11/28.
 */
@Mapper
public interface DBMapper {

    @Select("select * from DBS where DB_ID = #{dbId}")
    public DB selectById(int dbId);

    @Select("select * from DBS")
    public List<DB> selectAll();

    @Insert("insert into DBS(DB_ID, DESC, DB_LOCATION_URI, NAME, OWNER_NAME, OWNER_TYPE) values (#{DB_ID}, #{DESC}, #{DB_LOCATION_URI}, #{NAME}, #{OWNER_NAME}, #{OWNER_TYPE})")
    public void insert(DB db);
}
