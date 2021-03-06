/**
 * @Generated by sagacity-quickvo 4.16
 */
package com.sqltoy.quickstart.vo;

import com.sqltoy.quickstart.vo.base.AbstractCgformHeadVO;
import java.util.ArrayList;
import java.util.List;
import org.sagacity.sqltoy.config.annotation.OneToMany;
import org.sagacity.sqltoy.config.annotation.SqlToyEntity;

/**
 * @project sqltoy-quickstart
 * @author S5
 * @version 1.0.0
 * Table: cgform_head 	
 */
@SqlToyEntity
public class CgformHeadVO extends AbstractCgformHeadVO {

  /**
   *
   */
  private static final long serialVersionUID = 269660289932861939L;

  /** default constructor */
  public CgformHeadVO() {
    super();
  }

  /*---begin-constructor-area---don't-update-this-area--*/

  /** pk constructor */
  public CgformHeadVO(String id) {
    this.id = id;
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
  public CgformHeadVO clone() {
    try {
      return (CgformHeadVO) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return null;
  }

  /**
   * 主键关联子表信息
   */
  @OneToMany(fields = {"id"}, mappedTable = "cgform_field", mappedColumns = {
      "table_id"}, mappedFields = {"tableId"})
  protected List<CgformFieldVO> columns = new ArrayList<CgformFieldVO>();

  public List<CgformFieldVO> getColumns() {
    return columns;
  }

  public void setColumns(List<CgformFieldVO> columns) {
    this.columns = columns;
  }

}
