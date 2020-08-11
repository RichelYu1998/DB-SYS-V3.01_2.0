package cn.tedu.sys.dao;

import java.util.List;

import cn.tedu.sys.vo.SysRoleMenuVo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import cn.tedu.common.vo.CheckBox;
import cn.tedu.sys.entity.SysRole;

/**
 * 操作角色表的数据层对象
 * @author qilei
 */
@Mapper
public interface SysRoleDao {
	/**
	 * 查询角色所有信息
	 * @return
	 */
	@Select("select id,name from sys_roles")
	List<CheckBox> findObjects();
	
	/**
	 * 基于角色id获取角色id，name,note相关信息
	 * @param id
	 * @return
	 */
	SysRoleMenuVo findObjectById(Integer id);
	
	/**
	 * 更新角色自身信息
	 * @param entity
	 * @return
	 */
	int updateObject(SysRole entity);
	/**
	 * 保存角色自身信息
	 * @param entity
	 * @return
	 */
	int insertObject(SysRole entity);
	/**
	 * 基于角色id删除角色自身信息
	 * @param id
	 * @return
	 */
	@Delete("delete from sys_roles where id=#{id}")
	int deleteObject(Integer id);
	/**
	 * 基于角色名查询角色相关信息
	 * @param name 角色名
	 * @return 记录总数
	 */
    int getRowCount(String name);
    
    /**
     * 查询当前页要呈现的角色信息
     * @param name 角色名
     * @param startIndex 当前页起始位置
     * @param pageSize 页面大小
     * @return 当前页记录
     */
    List<SysRole> findPageObjects(String name,Integer startIndex,Integer pageSize);
    
    
}
