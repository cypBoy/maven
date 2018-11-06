package com.ssm.dao;

import com.ssm.model.ClassInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IClassInfoDao {
    /**
     * 新增班级
     * @param model
     * @return
     * @throws Exception
     */
    public abstract int insertClassInfo(ClassInfo model) throws Exception;
    
    /**
     * 修改班级
     * @param model
     * @return
     * @throws Exception
     */
    public abstract int updateClassInfo(ClassInfo model) throws Exception;
    
     /**
      * 刪除班级
      * @param id
      * @return
      * @throws Exception
      */
    public abstract int deleteClassInfo(long id) throws Exception;
    
    /**
     * 根据id查询班级信息
     * @param id
     * @return
     * @throws Exception
     */
    public abstract ClassInfo selectClassInfoById(long id) throws Exception;
    
     /**
      * 查询所有的班级信息
      * @return
      * @throws Exception
      */
    public abstract List<ClassInfo> selectAllClassInfo() throws Exception;
    
    public abstract List<ClassInfo> selectClassInfoByName(String name) throws Exception;
}