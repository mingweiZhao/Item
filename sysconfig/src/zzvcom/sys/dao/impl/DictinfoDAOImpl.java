package zzvcom.sys.dao.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import zzvcom.sys.dao.DictinfoDAO;
import zzvcom.sys.pojo.Dictinfo;
import zzvcom.sys.pojo.DictinfoExample;

public class DictinfoDAOImpl extends SqlMapClientDaoSupport implements DictinfoDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dictinfo
     *
     * @abatorgenerated Fri Dec 10 16:57:21 CST 2010
     */
    public DictinfoDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dictinfo
     *
     * @abatorgenerated Fri Dec 10 16:57:21 CST 2010
     */
    public void insert(Dictinfo record) {
        getSqlMapClientTemplate().insert("dictinfo.abatorgenerated_insert", record);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dictinfo
     *
     * @abatorgenerated Fri Dec 10 16:57:21 CST 2010
     */
    public int updateByPrimaryKey(Dictinfo record) {
        int rows = getSqlMapClientTemplate().update("dictinfo.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dictinfo
     *
     * @abatorgenerated Fri Dec 10 16:57:21 CST 2010
     */
    public int updateByPrimaryKeySelective(Dictinfo record) {
        int rows = getSqlMapClientTemplate().update("dictinfo.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dictinfo
     *
     * @abatorgenerated Fri Dec 10 16:57:21 CST 2010
     */
    public List selectByExample(DictinfoExample example) {
        List list = getSqlMapClientTemplate().queryForList("dictinfo.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dictinfo
     *
     * @abatorgenerated Fri Dec 10 16:57:21 CST 2010
     */
    public Dictinfo selectByPrimaryKey(String id) {
        Dictinfo key = new Dictinfo();
        key.setId(id);
        Dictinfo record = (Dictinfo) getSqlMapClientTemplate().queryForObject("dictinfo.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dictinfo
     *
     * @abatorgenerated Fri Dec 10 16:57:21 CST 2010
     */
    public int deleteByExample(DictinfoExample example) {
        int rows = getSqlMapClientTemplate().delete("dictinfo.abatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dictinfo
     *
     * @abatorgenerated Fri Dec 10 16:57:21 CST 2010
     */
    public int deleteByPrimaryKey(String id) {
        Dictinfo key = new Dictinfo();
        key.setId(id);
        int rows = getSqlMapClientTemplate().delete("dictinfo.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dictinfo
     *
     * @abatorgenerated Fri Dec 10 16:57:21 CST 2010
     */
    public int countByExample(DictinfoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("dictinfo.abatorgenerated_countByExample", example);
        return count.intValue();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dictinfo
     *
     * @abatorgenerated Fri Dec 10 16:57:21 CST 2010
     */
    public int updateByExampleSelective(Dictinfo record, DictinfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("dictinfo.abatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table dictinfo
     *
     * @abatorgenerated Fri Dec 10 16:57:21 CST 2010
     */
    public int updateByExample(Dictinfo record, DictinfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("dictinfo.abatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table dictinfo
     *
     * @abatorgenerated Fri Dec 10 16:57:21 CST 2010
     */
    private static class UpdateByExampleParms extends DictinfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, DictinfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}