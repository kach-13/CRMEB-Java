package mall.mapper;

import java.util.List;
import mall.pojo.EbSystemConfig;
import mall.pojo.EbSystemConfigExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EbSystemConfigMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_config
     *
     * @mbg.generated
     */
    long countByExample(EbSystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_config
     *
     * @mbg.generated
     */
    int deleteByExample(EbSystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_config
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_config
     *
     * @mbg.generated
     */
    int insert(EbSystemConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_config
     *
     * @mbg.generated
     */
    int insertSelective(EbSystemConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_config
     *
     * @mbg.generated
     */
    List<EbSystemConfig> selectByExampleWithRowbounds(EbSystemConfigExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_config
     *
     * @mbg.generated
     */
    List<EbSystemConfig> selectByExample(EbSystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_config
     *
     * @mbg.generated
     */
    EbSystemConfig selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_config
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EbSystemConfig record, @Param("example") EbSystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_config
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EbSystemConfig record, @Param("example") EbSystemConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EbSystemConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table eb_system_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EbSystemConfig record);
}