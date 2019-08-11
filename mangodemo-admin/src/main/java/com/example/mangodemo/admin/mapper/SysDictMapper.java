package com.example.mangodemo.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.mangodemo.admin.model.SysDict;

public interface SysDictMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysDict record);

    int insertSelective(SysDict record);

    SysDict selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDict record);

    int updateByPrimaryKey(SysDict record);
    /**
     * 分页查询
     * @return
     */
    List<SysDict> findPage();
    
    /**
     * 根据标签名查询
     * @param lable
     * @return
     */
    List<SysDict> findByLabel(@Param(value="label")String label); 
    /**
     * 根据标签名分页查询
     * @param lable
     * @return
     */
    List<SysDict> findPageByLabel(@Param(value="lable") String label);
    
    
    
    
    
    
}