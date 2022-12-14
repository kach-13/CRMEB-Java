package mall.pojo;

import com.baomidou.mybatisplus.annotation.TableField;

import java.util.Date;
import java.util.List;

public class EbSystemMenu {
    @TableField(exist = false)
    private List<EbSystemMenu> childList ;


    public List<EbSystemMenu> getChildList() {
        return childList;
    }

    public void setChildList(List<EbSystemMenu> childList) {
        this.childList = childList;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_menu.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_menu.pid
     *
     * @mbg.generated
     */
    private Integer pid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_menu.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_menu.icon
     *
     * @mbg.generated
     */
    private String icon;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_menu.perms
     *
     * @mbg.generated
     */
    private String perms;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_menu.component
     *
     * @mbg.generated
     */
    private String component;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_menu.menu_type
     *
     * @mbg.generated
     */
    private String menuType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_menu.sort
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_menu.is_show
     *
     * @mbg.generated
     */
    private Boolean isShow;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_menu.is_delte
     *
     * @mbg.generated
     */
    private Boolean isDelte;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_menu.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column eb_system_menu.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_menu
     *
     * @mbg.generated
     */
    public EbSystemMenu(Integer id, Integer pid, String name, String icon, String perms, String component, String menuType, Integer sort, Boolean isShow, Boolean isDelte, Date createTime, Date updateTime) {
        this.id = id;
        this.pid = pid;
        this.name = name;
        this.icon = icon;
        this.perms = perms;
        this.component = component;
        this.menuType = menuType;
        this.sort = sort;
        this.isShow = isShow;
        this.isDelte = isDelte;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_menu
     *
     * @mbg.generated
     */
    public EbSystemMenu() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_menu.id
     *
     * @return the value of eb_system_menu.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_menu.id
     *
     * @param id the value for eb_system_menu.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_menu.pid
     *
     * @return the value of eb_system_menu.pid
     *
     * @mbg.generated
     */
    public Integer getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_menu.pid
     *
     * @param pid the value for eb_system_menu.pid
     *
     * @mbg.generated
     */
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_menu.name
     *
     * @return the value of eb_system_menu.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_menu.name
     *
     * @param name the value for eb_system_menu.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_menu.icon
     *
     * @return the value of eb_system_menu.icon
     *
     * @mbg.generated
     */
    public String getIcon() {
        return icon;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_menu.icon
     *
     * @param icon the value for eb_system_menu.icon
     *
     * @mbg.generated
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_menu.perms
     *
     * @return the value of eb_system_menu.perms
     *
     * @mbg.generated
     */
    public String getPerms() {
        return perms;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_menu.perms
     *
     * @param perms the value for eb_system_menu.perms
     *
     * @mbg.generated
     */
    public void setPerms(String perms) {
        this.perms = perms == null ? null : perms.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_menu.component
     *
     * @return the value of eb_system_menu.component
     *
     * @mbg.generated
     */
    public String getComponent() {
        return component;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_menu.component
     *
     * @param component the value for eb_system_menu.component
     *
     * @mbg.generated
     */
    public void setComponent(String component) {
        this.component = component == null ? null : component.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_menu.menu_type
     *
     * @return the value of eb_system_menu.menu_type
     *
     * @mbg.generated
     */
    public String getMenuType() {
        return menuType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_menu.menu_type
     *
     * @param menuType the value for eb_system_menu.menu_type
     *
     * @mbg.generated
     */
    public void setMenuType(String menuType) {
        this.menuType = menuType == null ? null : menuType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_menu.sort
     *
     * @return the value of eb_system_menu.sort
     *
     * @mbg.generated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_menu.sort
     *
     * @param sort the value for eb_system_menu.sort
     *
     * @mbg.generated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_menu.is_show
     *
     * @return the value of eb_system_menu.is_show
     *
     * @mbg.generated
     */
    public Boolean getIsShow() {
        return isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_menu.is_show
     *
     * @param isShow the value for eb_system_menu.is_show
     *
     * @mbg.generated
     */
    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_menu.is_delte
     *
     * @return the value of eb_system_menu.is_delte
     *
     * @mbg.generated
     */
    public Boolean getIsDelte() {
        return isDelte;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_menu.is_delte
     *
     * @param isDelte the value for eb_system_menu.is_delte
     *
     * @mbg.generated
     */
    public void setIsDelte(Boolean isDelte) {
        this.isDelte = isDelte;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_menu.create_time
     *
     * @return the value of eb_system_menu.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_menu.create_time
     *
     * @param createTime the value for eb_system_menu.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column eb_system_menu.update_time
     *
     * @return the value of eb_system_menu.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column eb_system_menu.update_time
     *
     * @param updateTime the value for eb_system_menu.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}