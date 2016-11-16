/*
 * Created on 8 nov 2016 ( Time 16:16:33 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */
package it.csi.sira.backend.metadata.integration.dao;

import it.csi.sira.backend.metadata.integration.dto.SipraMtdTFunzione;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;




/**
 * SipraMtdTFunzione DAO interface
 * 
 * @author Telosys Tools
 */
public interface SipraMtdTFunzioneDAO {

	//----------------------------------------------------------------------
	/**
	 * Finds a bean by its primary key 
	 * @param idFunzione
	 * @return the bean found or null if not found 
	 */
	public SipraMtdTFunzione findByPK(Integer idFunzione);

	public List<SipraMtdTFunzione> findAll();
	
	public List<SipraMtdTFunzione> findByCriteria(java.util.Map<String, Object> params);
	public List<SipraMtdTFunzione> findByCriteria(MapSqlParameterSource params);
	
	public <V> List<V> findByGenericCriteria(String query, RowMapper<V>  rowMapper, Map<String, Object> params);
	public <V> List<V> findByGenericCriteria(String query, RowMapper<V>  rowMapper, MapSqlParameterSource params);
	public List<SipraMtdTFunzione> findByGenericCriteria(String query, MapSqlParameterSource params);
	
	public void insert(SipraMtdTFunzione bean);

	public void update(SipraMtdTFunzione bean);
	
	public void update(String sql, Map<String, Object> param);

	public int deleteByPK(Integer idFunzione);
	
	public int delete(String query, Map<String, Object> params);
	public int delete(String query, MapSqlParameterSource params);

	public boolean exist(Map<String, Object> params);

    public RowMapper<SipraMtdTFunzione> getRowMapper();
}
