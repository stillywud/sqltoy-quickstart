/**
 *@Generated by sagacity-quickvo 4.15
 */
package com.sqltoy.quickstart.vo;

import org.sagacity.sqltoy.config.annotation.SqlToyEntity;

import com.sqltoy.quickstart.vo.base.AbstractComplexpkItemVO;

/**
 * @project sqltoy-quickstart
 * @author zhongxuchen
 * @version 1.0.0
 * Table: sqltoy_complexpk_item,Remark:复合主键级联操作子表 	
 */
@SqlToyEntity
public class ComplexpkItemVO extends AbstractComplexpkItemVO {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2570764298251994911L;
	
	/** default constructor */
	public ComplexpkItemVO() {
		super();
	}
	/*---begin-constructor-area---don't-update-this-area--*/
	/** pk constructor */
	public ComplexpkItemVO(String id)
	{
		this.id=id;
	}

	/*---end-constructor-area---don't-update-this-area--*/
	/**
     * @todo vo columns to String
     */
    @Override
	public String toString() {
		return super.toString();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public ComplexpkItemVO clone() {
		try {
			return (ComplexpkItemVO) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
