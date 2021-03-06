/**
 * @Generated by sagacity-quickvo 4.16
 */
package com.sqltoy.quickstart.vo.base;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.sagacity.sqltoy.callback.SelectFields;
import org.sagacity.sqltoy.config.annotation.Column;
import org.sagacity.sqltoy.config.annotation.Entity;
import org.sagacity.sqltoy.config.annotation.Id;

/**
 * @project sqltoy-quickstart
 * @version 1.0.0
 * Table: cgform_field  
 */
@Entity(tableName = "cgform_field", pk_constraint = "PRIMARY")
public abstract class AbstractCgformFieldVO implements Serializable {

  /**
   *
   */
  private static final long serialVersionUID = 5378155749229315108L;

  /**
   * jdbcType:VARCHAR
   * 主键ID
   */
  @Id(strategy = "generator", generator = "org.sagacity.sqltoy.plugins.id.NanoTimeIdGenerator")
  @Column(name = "id", length = 32L, type = java.sql.Types.VARCHAR, nullable = false)
  protected String id;

  /**
   * jdbcType:VARCHAR
   * 字段备注
   */
  @Column(name = "content", length = 200L, type = java.sql.Types.VARCHAR, nullable = false)
  protected String content;

  /**
   * jdbcType:VARCHAR
   * 创建人
   */
  @Column(name = "create_by", length = 255L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String createBy;

  /**
   * jdbcType:DATETIME
   * 创建时间
   */
  @Column(name = "create_date", length = 19L, type = java.sql.Types.DATE, nullable = true)
  protected LocalDateTime createDate;

  /**
   * jdbcType:VARCHAR
   * 创建人名字
   */
  @Column(name = "create_name", length = 32L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String createName;

  /**
   * jdbcType:VARCHAR
   * 字典code
   */
  @Column(name = "dict_field", length = 100L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String dictField;

  /**
   * jdbcType:VARCHAR
   * 字典表
   */
  @Column(name = "dict_table", length = 100L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String dictTable;

  /**
   * jdbcType:VARCHAR
   * 字典Text
   */
  @Column(name = "dict_text", length = 100L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String dictText;

  /**
   * jdbcType:VARCHAR
   * 表字段默认值
   */
  @Column(name = "field_default", length = 20L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String fieldDefault;

  /**
   * jdbcType:VARCHAR
   * 跳转URL
   */
  @Column(name = "field_href", length = 1000L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String fieldHref;

  /**
   * jdbcType:INT
   * 表单控件长度
   */
  @Column(name = "field_length", length = 10L, type = java.sql.Types.INTEGER, nullable = true)
  protected Integer fieldLength;

  /**
   * jdbcType:VARCHAR
   * 字段名字
   */
  @Column(name = "field_name", length = 32L, type = java.sql.Types.VARCHAR, nullable = false)
  protected String fieldName;

  /**
   * jdbcType:VARCHAR
   * 表单字段校验规则
   */
  @Column(name = "field_valid_type", length = 300L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String fieldValidType;

  /**
   * jdbcType:VARCHAR
   * 字段是否必填
   */
  @Column(name = "field_must_input", length = 2L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String fieldMustInput;

  /**
   * jdbcType:VARCHAR
   * 是否主键
   */
  @Column(name = "is_key", length = 2L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String isKey;

  /**
   * jdbcType:VARCHAR
   * 是否允许为空
   */
  @Column(name = "is_null", length = 5L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String isNull;

  /**
   * jdbcType:VARCHAR
   * 是否查询条件
   */
  @Column(name = "is_query", length = 5L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String isQuery;

  /**
   * jdbcType:VARCHAR
   * 表单是否显示
   */
  @Column(name = "is_show", length = 5L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String isShow;

  /**
   * jdbcType:VARCHAR
   * 列表是否显示
   */
  @Column(name = "is_show_list", length = 5L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String isShowList;

  /**
   * jdbcType:INT
   * 数据库字段长度
   */
  @Column(name = "length", length = 10L, type = java.sql.Types.INTEGER, nullable = false)
  protected Integer length;

  /**
   * jdbcType:VARCHAR
   * 外键主键字段
   */
  @Column(name = "main_field", length = 100L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String mainField;

  /**
   * jdbcType:VARCHAR
   * 外键主表名
   */
  @Column(name = "main_table", length = 100L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String mainTable;

  /**
   * jdbcType:VARCHAR
   * 原字段名
   */
  @Column(name = "old_field_name", length = 32L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String oldFieldName;

  /**
   * jdbcType:INT
   * 原排列序号
   */
  @Column(name = "order_num", length = 10L, type = java.sql.Types.INTEGER, nullable = true)
  protected Integer orderNum;

  /**
   * jdbcType:INT
   * 小数点
   */
  @Column(name = "point_length", length = 10L, type = java.sql.Types.INTEGER, nullable = true)
  protected Integer pointLength;

  /**
   * jdbcType:VARCHAR
   * 查询模式
   */
  @Column(name = "query_mode", length = 10L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String queryMode;

  /**
   * jdbcType:VARCHAR
   * 表单控件类型
   */
  @Column(name = "show_type", length = 64L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String showType;

  /**
   * jdbcType:VARCHAR
   * 数据库字段类型
   */
  @Column(name = "type", length = 32L, type = java.sql.Types.VARCHAR, nullable = false)
  protected String type;

  /**
   * jdbcType:VARCHAR
   * 修改人
   */
  @Column(name = "update_by", length = 32L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String updateBy;

  /**
   * jdbcType:DATETIME
   * 修改时间
   */
  @Column(name = "update_date", length = 19L, type = java.sql.Types.DATE, nullable = true)
  protected LocalDateTime updateDate;

  /**
   * jdbcType:VARCHAR
   * 修改人名称
   */
  @Column(name = "update_name", length = 32L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String updateName;

  /**
   * jdbcType:VARCHAR
   * 表ID
   */
  @Column(name = "table_id", length = 32L, type = java.sql.Types.VARCHAR, nullable = false)
  protected String tableId;

  /**
   * jdbcType:VARCHAR
   * 扩展参数JSON
   */
  @Column(name = "extend_json", length = 500L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String extendJson;

  /**
   * jdbcType:VARCHAR
   * 填值规则code
   */
  @Column(name = "fill_rule_code", length = 500L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String fillRuleCode;

  /**
   * jdbcType:VARCHAR
   *
   */
  @Column(name = "is_primary", length = 5L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String isPrimary;

  /**
   * jdbcType:VARCHAR
   *
   */
  @Column(name = "db_data_type", length = 32L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String dbDataType;

  /**
   * jdbcType:VARCHAR
   *
   */
  @Column(name = "number_precision", length = 4L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String numberPrecision;

  /**
   * jdbcType:VARCHAR
   *
   */
  @Column(name = "number_scale", length = 4L, type = java.sql.Types.VARCHAR, nullable = true)
  protected String numberScale;


  /** default constructor */
  public AbstractCgformFieldVO() {
  }

  /** pk constructor */
  public AbstractCgformFieldVO(String id) {
    this.id = id;
  }


  /**
   *@param id the id to set
   */
  public AbstractCgformFieldVO setId(String id) {
    this.id = id;
    return this;
  }

  /**
   *@return the Id
   */
  public String getId() {
    return this.id;
  }

  /**
   *@param content the content to set
   */
  public AbstractCgformFieldVO setContent(String content) {
    this.content = content;
    return this;
  }

  /**
   *@return the Content
   */
  public String getContent() {
    return this.content;
  }

  /**
   *@param createBy the createBy to set
   */
  public AbstractCgformFieldVO setCreateBy(String createBy) {
    this.createBy = createBy;
    return this;
  }

  /**
   *@return the CreateBy
   */
  public String getCreateBy() {
    return this.createBy;
  }

  /**
   *@param createDate the createDate to set
   */
  public AbstractCgformFieldVO setCreateDate(LocalDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   *@return the CreateDate
   */
  public LocalDateTime getCreateDate() {
    return this.createDate;
  }

  /**
   *@param createName the createName to set
   */
  public AbstractCgformFieldVO setCreateName(String createName) {
    this.createName = createName;
    return this;
  }

  /**
   *@return the CreateName
   */
  public String getCreateName() {
    return this.createName;
  }

  /**
   *@param dictField the dictField to set
   */
  public AbstractCgformFieldVO setDictField(String dictField) {
    this.dictField = dictField;
    return this;
  }

  /**
   *@return the DictField
   */
  public String getDictField() {
    return this.dictField;
  }

  /**
   *@param dictTable the dictTable to set
   */
  public AbstractCgformFieldVO setDictTable(String dictTable) {
    this.dictTable = dictTable;
    return this;
  }

  /**
   *@return the DictTable
   */
  public String getDictTable() {
    return this.dictTable;
  }

  /**
   *@param dictText the dictText to set
   */
  public AbstractCgformFieldVO setDictText(String dictText) {
    this.dictText = dictText;
    return this;
  }

  /**
   *@return the DictText
   */
  public String getDictText() {
    return this.dictText;
  }

  /**
   *@param fieldDefault the fieldDefault to set
   */
  public AbstractCgformFieldVO setFieldDefault(String fieldDefault) {
    this.fieldDefault = fieldDefault;
    return this;
  }

  /**
   *@return the FieldDefault
   */
  public String getFieldDefault() {
    return this.fieldDefault;
  }

  /**
   *@param fieldHref the fieldHref to set
   */
  public AbstractCgformFieldVO setFieldHref(String fieldHref) {
    this.fieldHref = fieldHref;
    return this;
  }

  /**
   *@return the FieldHref
   */
  public String getFieldHref() {
    return this.fieldHref;
  }

  /**
   *@param fieldLength the fieldLength to set
   */
  public AbstractCgformFieldVO setFieldLength(Integer fieldLength) {
    this.fieldLength = fieldLength;
    return this;
  }

  /**
   *@return the FieldLength
   */
  public Integer getFieldLength() {
    return this.fieldLength;
  }

  /**
   *@param fieldName the fieldName to set
   */
  public AbstractCgformFieldVO setFieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   *@return the FieldName
   */
  public String getFieldName() {
    return this.fieldName;
  }

  /**
   *@param fieldValidType the fieldValidType to set
   */
  public AbstractCgformFieldVO setFieldValidType(String fieldValidType) {
    this.fieldValidType = fieldValidType;
    return this;
  }

  /**
   *@return the FieldValidType
   */
  public String getFieldValidType() {
    return this.fieldValidType;
  }

  /**
   *@param fieldMustInput the fieldMustInput to set
   */
  public AbstractCgformFieldVO setFieldMustInput(String fieldMustInput) {
    this.fieldMustInput = fieldMustInput;
    return this;
  }

  /**
   *@return the FieldMustInput
   */
  public String getFieldMustInput() {
    return this.fieldMustInput;
  }

  /**
   *@param isKey the isKey to set
   */
  public AbstractCgformFieldVO setIsKey(String isKey) {
    this.isKey = isKey;
    return this;
  }

  /**
   *@return the IsKey
   */
  public String getIsKey() {
    return this.isKey;
  }

  /**
   *@param isNull the isNull to set
   */
  public AbstractCgformFieldVO setIsNull(String isNull) {
    this.isNull = isNull;
    return this;
  }

  /**
   *@return the IsNull
   */
  public String getIsNull() {
    return this.isNull;
  }

  /**
   *@param isQuery the isQuery to set
   */
  public AbstractCgformFieldVO setIsQuery(String isQuery) {
    this.isQuery = isQuery;
    return this;
  }

  /**
   *@return the IsQuery
   */
  public String getIsQuery() {
    return this.isQuery;
  }

  /**
   *@param isShow the isShow to set
   */
  public AbstractCgformFieldVO setIsShow(String isShow) {
    this.isShow = isShow;
    return this;
  }

  /**
   *@return the IsShow
   */
  public String getIsShow() {
    return this.isShow;
  }

  /**
   *@param isShowList the isShowList to set
   */
  public AbstractCgformFieldVO setIsShowList(String isShowList) {
    this.isShowList = isShowList;
    return this;
  }

  /**
   *@return the IsShowList
   */
  public String getIsShowList() {
    return this.isShowList;
  }

  /**
   *@param length the length to set
   */
  public AbstractCgformFieldVO setLength(Integer length) {
    this.length = length;
    return this;
  }

  /**
   *@return the Length
   */
  public Integer getLength() {
    return this.length;
  }

  /**
   *@param mainField the mainField to set
   */
  public AbstractCgformFieldVO setMainField(String mainField) {
    this.mainField = mainField;
    return this;
  }

  /**
   *@return the MainField
   */
  public String getMainField() {
    return this.mainField;
  }

  /**
   *@param mainTable the mainTable to set
   */
  public AbstractCgformFieldVO setMainTable(String mainTable) {
    this.mainTable = mainTable;
    return this;
  }

  /**
   *@return the MainTable
   */
  public String getMainTable() {
    return this.mainTable;
  }

  /**
   *@param oldFieldName the oldFieldName to set
   */
  public AbstractCgformFieldVO setOldFieldName(String oldFieldName) {
    this.oldFieldName = oldFieldName;
    return this;
  }

  /**
   *@return the OldFieldName
   */
  public String getOldFieldName() {
    return this.oldFieldName;
  }

  /**
   *@param orderNum the orderNum to set
   */
  public AbstractCgformFieldVO setOrderNum(Integer orderNum) {
    this.orderNum = orderNum;
    return this;
  }

  /**
   *@return the OrderNum
   */
  public Integer getOrderNum() {
    return this.orderNum;
  }

  /**
   *@param pointLength the pointLength to set
   */
  public AbstractCgformFieldVO setPointLength(Integer pointLength) {
    this.pointLength = pointLength;
    return this;
  }

  /**
   *@return the PointLength
   */
  public Integer getPointLength() {
    return this.pointLength;
  }

  /**
   *@param queryMode the queryMode to set
   */
  public AbstractCgformFieldVO setQueryMode(String queryMode) {
    this.queryMode = queryMode;
    return this;
  }

  /**
   *@return the QueryMode
   */
  public String getQueryMode() {
    return this.queryMode;
  }

  /**
   *@param showType the showType to set
   */
  public AbstractCgformFieldVO setShowType(String showType) {
    this.showType = showType;
    return this;
  }

  /**
   *@return the ShowType
   */
  public String getShowType() {
    return this.showType;
  }

  /**
   *@param type the type to set
   */
  public AbstractCgformFieldVO setType(String type) {
    this.type = type;
    return this;
  }

  /**
   *@return the Type
   */
  public String getType() {
    return this.type;
  }

  /**
   *@param updateBy the updateBy to set
   */
  public AbstractCgformFieldVO setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
    return this;
  }

  /**
   *@return the UpdateBy
   */
  public String getUpdateBy() {
    return this.updateBy;
  }

  /**
   *@param updateDate the updateDate to set
   */
  public AbstractCgformFieldVO setUpdateDate(LocalDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   *@return the UpdateDate
   */
  public LocalDateTime getUpdateDate() {
    return this.updateDate;
  }

  /**
   *@param updateName the updateName to set
   */
  public AbstractCgformFieldVO setUpdateName(String updateName) {
    this.updateName = updateName;
    return this;
  }

  /**
   *@return the UpdateName
   */
  public String getUpdateName() {
    return this.updateName;
  }

  /**
   *@param tableId the tableId to set
   */
  public AbstractCgformFieldVO setTableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  /**
   *@return the TableId
   */
  public String getTableId() {
    return this.tableId;
  }

  /**
   *@param extendJson the extendJson to set
   */
  public AbstractCgformFieldVO setExtendJson(String extendJson) {
    this.extendJson = extendJson;
    return this;
  }

  /**
   *@return the ExtendJson
   */
  public String getExtendJson() {
    return this.extendJson;
  }

  /**
   *@param fillRuleCode the fillRuleCode to set
   */
  public AbstractCgformFieldVO setFillRuleCode(String fillRuleCode) {
    this.fillRuleCode = fillRuleCode;
    return this;
  }

  /**
   *@return the FillRuleCode
   */
  public String getFillRuleCode() {
    return this.fillRuleCode;
  }

  /**
   *@param isPrimary the isPrimary to set
   */
  public AbstractCgformFieldVO setIsPrimary(String isPrimary) {
    this.isPrimary = isPrimary;
    return this;
  }

  /**
   *@return the IsPrimary
   */
  public String getIsPrimary() {
    return this.isPrimary;
  }

  /**
   *@param dbDataType the dbDataType to set
   */
  public AbstractCgformFieldVO setDbDataType(String dbDataType) {
    this.dbDataType = dbDataType;
    return this;
  }

  /**
   *@return the DbDataType
   */
  public String getDbDataType() {
    return this.dbDataType;
  }

  /**
   *@param numberPrecision the numberPrecision to set
   */
  public AbstractCgformFieldVO setNumberPrecision(String numberPrecision) {
    this.numberPrecision = numberPrecision;
    return this;
  }

  /**
   *@return the NumberPrecision
   */
  public String getNumberPrecision() {
    return this.numberPrecision;
  }

  /**
   *@param numberScale the numberScale to set
   */
  public AbstractCgformFieldVO setNumberScale(String numberScale) {
    this.numberScale = numberScale;
    return this;
  }

  /**
   *@return the NumberScale
   */
  public String getNumberScale() {
    return this.numberScale;
  }


  /**
   * @todo vo columns to String
   */
  @Override
  public String toString() {
    StringBuilder columnsBuffer = new StringBuilder();
    columnsBuffer.append("id=").append(getId()).append("\n");
    columnsBuffer.append("content=").append(getContent()).append("\n");
    columnsBuffer.append("createBy=").append(getCreateBy()).append("\n");
    columnsBuffer.append("createDate=").append(getCreateDate()).append("\n");
    columnsBuffer.append("createName=").append(getCreateName()).append("\n");
    columnsBuffer.append("dictField=").append(getDictField()).append("\n");
    columnsBuffer.append("dictTable=").append(getDictTable()).append("\n");
    columnsBuffer.append("dictText=").append(getDictText()).append("\n");
    columnsBuffer.append("fieldDefault=").append(getFieldDefault()).append("\n");
    columnsBuffer.append("fieldHref=").append(getFieldHref()).append("\n");
    columnsBuffer.append("fieldLength=").append(getFieldLength()).append("\n");
    columnsBuffer.append("fieldName=").append(getFieldName()).append("\n");
    columnsBuffer.append("fieldValidType=").append(getFieldValidType()).append("\n");
    columnsBuffer.append("fieldMustInput=").append(getFieldMustInput()).append("\n");
    columnsBuffer.append("isKey=").append(getIsKey()).append("\n");
    columnsBuffer.append("isNull=").append(getIsNull()).append("\n");
    columnsBuffer.append("isQuery=").append(getIsQuery()).append("\n");
    columnsBuffer.append("isShow=").append(getIsShow()).append("\n");
    columnsBuffer.append("isShowList=").append(getIsShowList()).append("\n");
    columnsBuffer.append("length=").append(getLength()).append("\n");
    columnsBuffer.append("mainField=").append(getMainField()).append("\n");
    columnsBuffer.append("mainTable=").append(getMainTable()).append("\n");
    columnsBuffer.append("oldFieldName=").append(getOldFieldName()).append("\n");
    columnsBuffer.append("orderNum=").append(getOrderNum()).append("\n");
    columnsBuffer.append("pointLength=").append(getPointLength()).append("\n");
    columnsBuffer.append("queryMode=").append(getQueryMode()).append("\n");
    columnsBuffer.append("showType=").append(getShowType()).append("\n");
    columnsBuffer.append("type=").append(getType()).append("\n");
    columnsBuffer.append("updateBy=").append(getUpdateBy()).append("\n");
    columnsBuffer.append("updateDate=").append(getUpdateDate()).append("\n");
    columnsBuffer.append("updateName=").append(getUpdateName()).append("\n");
    columnsBuffer.append("tableId=").append(getTableId()).append("\n");
    columnsBuffer.append("extendJson=").append(getExtendJson()).append("\n");
    columnsBuffer.append("fillRuleCode=").append(getFillRuleCode()).append("\n");
    columnsBuffer.append("isPrimary=").append(getIsPrimary()).append("\n");
    columnsBuffer.append("dbDataType=").append(getDbDataType()).append("\n");
    columnsBuffer.append("numberPrecision=").append(getNumberPrecision()).append("\n");
    columnsBuffer.append("numberScale=").append(getNumberScale()).append("\n");
    return columnsBuffer.toString();
  }

  /**
   * @TODO create entityQuery fields
   */
  public static SelectFieldsImpl select() {
    return new SelectFieldsImpl();
  }

  public static class SelectFieldsImpl extends SelectFields {

    private List<String> fields = new ArrayList<String>();

    @Override
    public String[] getSelectFields() {
      String[] result = new String[fields.size()];
      fields.toArray(result);
      return result;
    }

    public SelectFieldsImpl id() {
      if (!fields.contains("id")) {
        fields.add("id");
      }
      return this;
    }

    public SelectFieldsImpl content() {
      if (!fields.contains("content")) {
        fields.add("content");
      }
      return this;
    }

    public SelectFieldsImpl createBy() {
      if (!fields.contains("createBy")) {
        fields.add("createBy");
      }
      return this;
    }

    public SelectFieldsImpl createDate() {
      if (!fields.contains("createDate")) {
        fields.add("createDate");
      }
      return this;
    }

    public SelectFieldsImpl createName() {
      if (!fields.contains("createName")) {
        fields.add("createName");
      }
      return this;
    }

    public SelectFieldsImpl dictField() {
      if (!fields.contains("dictField")) {
        fields.add("dictField");
      }
      return this;
    }

    public SelectFieldsImpl dictTable() {
      if (!fields.contains("dictTable")) {
        fields.add("dictTable");
      }
      return this;
    }

    public SelectFieldsImpl dictText() {
      if (!fields.contains("dictText")) {
        fields.add("dictText");
      }
      return this;
    }

    public SelectFieldsImpl fieldDefault() {
      if (!fields.contains("fieldDefault")) {
        fields.add("fieldDefault");
      }
      return this;
    }

    public SelectFieldsImpl fieldHref() {
      if (!fields.contains("fieldHref")) {
        fields.add("fieldHref");
      }
      return this;
    }

    public SelectFieldsImpl fieldLength() {
      if (!fields.contains("fieldLength")) {
        fields.add("fieldLength");
      }
      return this;
    }

    public SelectFieldsImpl fieldName() {
      if (!fields.contains("fieldName")) {
        fields.add("fieldName");
      }
      return this;
    }

    public SelectFieldsImpl fieldValidType() {
      if (!fields.contains("fieldValidType")) {
        fields.add("fieldValidType");
      }
      return this;
    }

    public SelectFieldsImpl fieldMustInput() {
      if (!fields.contains("fieldMustInput")) {
        fields.add("fieldMustInput");
      }
      return this;
    }

    public SelectFieldsImpl isKey() {
      if (!fields.contains("isKey")) {
        fields.add("isKey");
      }
      return this;
    }

    public SelectFieldsImpl isNull() {
      if (!fields.contains("isNull")) {
        fields.add("isNull");
      }
      return this;
    }

    public SelectFieldsImpl isQuery() {
      if (!fields.contains("isQuery")) {
        fields.add("isQuery");
      }
      return this;
    }

    public SelectFieldsImpl isShow() {
      if (!fields.contains("isShow")) {
        fields.add("isShow");
      }
      return this;
    }

    public SelectFieldsImpl isShowList() {
      if (!fields.contains("isShowList")) {
        fields.add("isShowList");
      }
      return this;
    }

    public SelectFieldsImpl length() {
      if (!fields.contains("length")) {
        fields.add("length");
      }
      return this;
    }

    public SelectFieldsImpl mainField() {
      if (!fields.contains("mainField")) {
        fields.add("mainField");
      }
      return this;
    }

    public SelectFieldsImpl mainTable() {
      if (!fields.contains("mainTable")) {
        fields.add("mainTable");
      }
      return this;
    }

    public SelectFieldsImpl oldFieldName() {
      if (!fields.contains("oldFieldName")) {
        fields.add("oldFieldName");
      }
      return this;
    }

    public SelectFieldsImpl orderNum() {
      if (!fields.contains("orderNum")) {
        fields.add("orderNum");
      }
      return this;
    }

    public SelectFieldsImpl pointLength() {
      if (!fields.contains("pointLength")) {
        fields.add("pointLength");
      }
      return this;
    }

    public SelectFieldsImpl queryMode() {
      if (!fields.contains("queryMode")) {
        fields.add("queryMode");
      }
      return this;
    }

    public SelectFieldsImpl showType() {
      if (!fields.contains("showType")) {
        fields.add("showType");
      }
      return this;
    }

    public SelectFieldsImpl type() {
      if (!fields.contains("type")) {
        fields.add("type");
      }
      return this;
    }

    public SelectFieldsImpl updateBy() {
      if (!fields.contains("updateBy")) {
        fields.add("updateBy");
      }
      return this;
    }

    public SelectFieldsImpl updateDate() {
      if (!fields.contains("updateDate")) {
        fields.add("updateDate");
      }
      return this;
    }

    public SelectFieldsImpl updateName() {
      if (!fields.contains("updateName")) {
        fields.add("updateName");
      }
      return this;
    }

    public SelectFieldsImpl tableId() {
      if (!fields.contains("tableId")) {
        fields.add("tableId");
      }
      return this;
    }

    public SelectFieldsImpl extendJson() {
      if (!fields.contains("extendJson")) {
        fields.add("extendJson");
      }
      return this;
    }

    public SelectFieldsImpl fillRuleCode() {
      if (!fields.contains("fillRuleCode")) {
        fields.add("fillRuleCode");
      }
      return this;
    }

    public SelectFieldsImpl isPrimary() {
      if (!fields.contains("isPrimary")) {
        fields.add("isPrimary");
      }
      return this;
    }

    public SelectFieldsImpl dbDataType() {
      if (!fields.contains("dbDataType")) {
        fields.add("dbDataType");
      }
      return this;
    }

    public SelectFieldsImpl numberPrecision() {
      if (!fields.contains("numberPrecision")) {
        fields.add("numberPrecision");
      }
      return this;
    }

    public SelectFieldsImpl numberScale() {
      if (!fields.contains("numberScale")) {
        fields.add("numberScale");
      }
      return this;
    }

  }

  public static class Fields {

    /**
     * 主键ID
     */
    public static String id = "id";

    /**
     * 字段备注
     */
    public static String content = "content";

    /**
     * 创建人
     */
    public static String createBy = "createBy";

    /**
     * 创建时间
     */
    public static String createDate = "createDate";

    /**
     * 创建人名字
     */
    public static String createName = "createName";

    /**
     * 字典code
     */
    public static String dictField = "dictField";

    /**
     * 字典表
     */
    public static String dictTable = "dictTable";

    /**
     * 字典Text
     */
    public static String dictText = "dictText";

    /**
     * 表字段默认值
     */
    public static String fieldDefault = "fieldDefault";

    /**
     * 跳转URL
     */
    public static String fieldHref = "fieldHref";

    /**
     * 表单控件长度
     */
    public static String fieldLength = "fieldLength";

    /**
     * 字段名字
     */
    public static String fieldName = "fieldName";

    /**
     * 表单字段校验规则
     */
    public static String fieldValidType = "fieldValidType";

    /**
     * 字段是否必填
     */
    public static String fieldMustInput = "fieldMustInput";

    /**
     * 是否主键
     */
    public static String isKey = "isKey";

    /**
     * 是否允许为空
     */
    public static String isNull = "isNull";

    /**
     * 是否查询条件
     */
    public static String isQuery = "isQuery";

    /**
     * 表单是否显示
     */
    public static String isShow = "isShow";

    /**
     * 列表是否显示
     */
    public static String isShowList = "isShowList";

    /**
     * 数据库字段长度
     */
    public static String length = "length";

    /**
     * 外键主键字段
     */
    public static String mainField = "mainField";

    /**
     * 外键主表名
     */
    public static String mainTable = "mainTable";

    /**
     * 原字段名
     */
    public static String oldFieldName = "oldFieldName";

    /**
     * 原排列序号
     */
    public static String orderNum = "orderNum";

    /**
     * 小数点
     */
    public static String pointLength = "pointLength";

    /**
     * 查询模式
     */
    public static String queryMode = "queryMode";

    /**
     * 表单控件类型
     */
    public static String showType = "showType";

    /**
     * 数据库字段类型
     */
    public static String type = "type";

    /**
     * 修改人
     */
    public static String updateBy = "updateBy";

    /**
     * 修改时间
     */
    public static String updateDate = "updateDate";

    /**
     * 修改人名称
     */
    public static String updateName = "updateName";

    /**
     * 表ID
     */
    public static String tableId = "tableId";

    /**
     * 扩展参数JSON
     */
    public static String extendJson = "extendJson";

    /**
     * 填值规则code
     */
    public static String fillRuleCode = "fillRuleCode";

    /**
     *
     */
    public static String isPrimary = "isPrimary";

    /**
     *
     */
    public static String dbDataType = "dbDataType";

    /**
     *
     */
    public static String numberPrecision = "numberPrecision";

    /**
     *
     */
    public static String numberScale = "numberScale";

  }
}
