package com.yzp.cloud.dao;

import com.yzp.cloud.model.entity.StudentSign;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @program:
 * @description:
 * @author: yzp
 * @create: 2020/2/13 19:30
 */
public interface StudentSignDao {
    @Insert("insert into t_sign(name,clsname,stime,type) values(#{name},#{clsname},now(),#{type})")
    @Options(useGeneratedKeys = true,keyProperty = "id") //主键回显
    int insert(StudentSign studentSign);

    //根据名字查询打卡记录
    @Select("select id,name,clsname,stime,type from t_sign where name=#{name}")
    List<StudentSign> selectByName(String name);

    //查所有
    @Select("select id,name,clsname,stime,type  from t_sign order by stime desc")
    List<StudentSign> selectAll();
}
