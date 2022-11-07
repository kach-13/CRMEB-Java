package mall.pojo;

import com.baomidou.mybatisplus.annotation.TableField;

import java.util.Date;
import java.util.List;

public class EbSystemConfig {
    @TableField(exist = false)
    private EbSystemFormTemp fromList;

    public EbSystemFormTemp getFromList() {
        return fromList;
    }

    public void setFromList(EbSystemFormTemp fromList) {
        this.fromList = fromList;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_config.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_config.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_config.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_config.form_id
     *
     * @mbg.generated
     */
    private Integer formId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_config.value
     *
     * @mbg.generated
     */
    private String value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_config.status
     *
     * @mbg.generated
     */
    private Boolean status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_config.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_config.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_config
     *
     * @mbg.generated
     */
    public EbSystemConfig(Integer id, String name, String title, Integer formId, String value, Boolean status, Date createTime, Date updateTime) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.formId = formId;
        this.value = value;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_config
     *
     * @mbg.generated
     */
    public EbSystemConfig() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_config.id
     *
     * @return the value of eb_system_config.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_config.id
     *
     * @param id the value for eb_system_config.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_config.name
     *
     * @return the value of eb_system_config.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_config.name
     *
     * @param name the value for eb_system_config.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_config.title
     *
     * @return the value of eb_system_config.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_config.title
     *
     * @param title the value for eb_system_config.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_config.form_id
     *
     * @return the value of eb_system_config.form_id
     *
     * @mbg.generated
     */
    public Integer getFormId() {
        return formId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_config.form_id
     *
     * @param formId the value for eb_system_config.form_id
     *
     * @mbg.generated
     */
    public void setFormId(Integer formId) {
        this.formId = formId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_config.value
     *
     * @return the value of eb_system_config.value
     *
     * @mbg.generated
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_config.value
     *
     * @param value the value for eb_system_config.value
     *
     * @mbg.generated
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_config.status
     *
     * @return the value of eb_system_config.status
     *
     * @mbg.generated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_config.status
     *
     * @param status the value for eb_system_config.status
     *
     * @mbg.generated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_config.create_time
     *
     * @return the value of eb_system_config.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_config.create_time
     *
     * @param createTime the value for eb_system_config.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_config.update_time
     *
     * @return the value of eb_system_config.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_config.update_time
     *
     * @param updateTime the value for eb_system_config.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}