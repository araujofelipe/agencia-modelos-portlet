/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package br.com.seatecnologia.treinamento.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Modelo}.
 * </p>
 *
 * @author felipearaujo
 * @see Modelo
 * @generated
 */
public class ModeloWrapper implements Modelo, ModelWrapper<Modelo> {
	public ModeloWrapper(Modelo modelo) {
		_modelo = modelo;
	}

	@Override
	public Class<?> getModelClass() {
		return Modelo.class;
	}

	@Override
	public String getModelClassName() {
		return Modelo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("modeloId", getModeloId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nome", getNome());
		attributes.put("idade", getIdade());
		attributes.put("altura", getAltura());
		attributes.put("peso", getPeso());
		attributes.put("etinia", getEtinia());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long modeloId = (Long)attributes.get("modeloId");

		if (modeloId != null) {
			setModeloId(modeloId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String nome = (String)attributes.get("nome");

		if (nome != null) {
			setNome(nome);
		}

		Integer idade = (Integer)attributes.get("idade");

		if (idade != null) {
			setIdade(idade);
		}

		Double altura = (Double)attributes.get("altura");

		if (altura != null) {
			setAltura(altura);
		}

		Double peso = (Double)attributes.get("peso");

		if (peso != null) {
			setPeso(peso);
		}

		Integer etinia = (Integer)attributes.get("etinia");

		if (etinia != null) {
			setEtinia(etinia);
		}
	}

	/**
	* Returns the primary key of this modelo.
	*
	* @return the primary key of this modelo
	*/
	@Override
	public long getPrimaryKey() {
		return _modelo.getPrimaryKey();
	}

	/**
	* Sets the primary key of this modelo.
	*
	* @param primaryKey the primary key of this modelo
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_modelo.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the modelo ID of this modelo.
	*
	* @return the modelo ID of this modelo
	*/
	@Override
	public long getModeloId() {
		return _modelo.getModeloId();
	}

	/**
	* Sets the modelo ID of this modelo.
	*
	* @param modeloId the modelo ID of this modelo
	*/
	@Override
	public void setModeloId(long modeloId) {
		_modelo.setModeloId(modeloId);
	}

	/**
	* Returns the group ID of this modelo.
	*
	* @return the group ID of this modelo
	*/
	@Override
	public long getGroupId() {
		return _modelo.getGroupId();
	}

	/**
	* Sets the group ID of this modelo.
	*
	* @param groupId the group ID of this modelo
	*/
	@Override
	public void setGroupId(long groupId) {
		_modelo.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this modelo.
	*
	* @return the company ID of this modelo
	*/
	@Override
	public long getCompanyId() {
		return _modelo.getCompanyId();
	}

	/**
	* Sets the company ID of this modelo.
	*
	* @param companyId the company ID of this modelo
	*/
	@Override
	public void setCompanyId(long companyId) {
		_modelo.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this modelo.
	*
	* @return the user ID of this modelo
	*/
	@Override
	public long getUserId() {
		return _modelo.getUserId();
	}

	/**
	* Sets the user ID of this modelo.
	*
	* @param userId the user ID of this modelo
	*/
	@Override
	public void setUserId(long userId) {
		_modelo.setUserId(userId);
	}

	/**
	* Returns the user uuid of this modelo.
	*
	* @return the user uuid of this modelo
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _modelo.getUserUuid();
	}

	/**
	* Sets the user uuid of this modelo.
	*
	* @param userUuid the user uuid of this modelo
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_modelo.setUserUuid(userUuid);
	}

	/**
	* Returns the user name of this modelo.
	*
	* @return the user name of this modelo
	*/
	@Override
	public java.lang.String getUserName() {
		return _modelo.getUserName();
	}

	/**
	* Sets the user name of this modelo.
	*
	* @param userName the user name of this modelo
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_modelo.setUserName(userName);
	}

	/**
	* Returns the create date of this modelo.
	*
	* @return the create date of this modelo
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _modelo.getCreateDate();
	}

	/**
	* Sets the create date of this modelo.
	*
	* @param createDate the create date of this modelo
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_modelo.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this modelo.
	*
	* @return the modified date of this modelo
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _modelo.getModifiedDate();
	}

	/**
	* Sets the modified date of this modelo.
	*
	* @param modifiedDate the modified date of this modelo
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_modelo.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the nome of this modelo.
	*
	* @return the nome of this modelo
	*/
	@Override
	public java.lang.String getNome() {
		return _modelo.getNome();
	}

	/**
	* Sets the nome of this modelo.
	*
	* @param nome the nome of this modelo
	*/
	@Override
	public void setNome(java.lang.String nome) {
		_modelo.setNome(nome);
	}

	/**
	* Returns the idade of this modelo.
	*
	* @return the idade of this modelo
	*/
	@Override
	public int getIdade() {
		return _modelo.getIdade();
	}

	/**
	* Sets the idade of this modelo.
	*
	* @param idade the idade of this modelo
	*/
	@Override
	public void setIdade(int idade) {
		_modelo.setIdade(idade);
	}

	/**
	* Returns the altura of this modelo.
	*
	* @return the altura of this modelo
	*/
	@Override
	public double getAltura() {
		return _modelo.getAltura();
	}

	/**
	* Sets the altura of this modelo.
	*
	* @param altura the altura of this modelo
	*/
	@Override
	public void setAltura(double altura) {
		_modelo.setAltura(altura);
	}

	/**
	* Returns the peso of this modelo.
	*
	* @return the peso of this modelo
	*/
	@Override
	public double getPeso() {
		return _modelo.getPeso();
	}

	/**
	* Sets the peso of this modelo.
	*
	* @param peso the peso of this modelo
	*/
	@Override
	public void setPeso(double peso) {
		_modelo.setPeso(peso);
	}

	/**
	* Returns the etinia of this modelo.
	*
	* @return the etinia of this modelo
	*/
	@Override
	public int getEtinia() {
		return _modelo.getEtinia();
	}

	/**
	* Sets the etinia of this modelo.
	*
	* @param etinia the etinia of this modelo
	*/
	@Override
	public void setEtinia(int etinia) {
		_modelo.setEtinia(etinia);
	}

	@Override
	public boolean isNew() {
		return _modelo.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_modelo.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _modelo.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_modelo.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _modelo.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _modelo.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_modelo.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _modelo.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_modelo.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_modelo.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_modelo.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ModeloWrapper((Modelo)_modelo.clone());
	}

	@Override
	public int compareTo(br.com.seatecnologia.treinamento.model.Modelo modelo) {
		return _modelo.compareTo(modelo);
	}

	@Override
	public int hashCode() {
		return _modelo.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<br.com.seatecnologia.treinamento.model.Modelo> toCacheModel() {
		return _modelo.toCacheModel();
	}

	@Override
	public br.com.seatecnologia.treinamento.model.Modelo toEscapedModel() {
		return new ModeloWrapper(_modelo.toEscapedModel());
	}

	@Override
	public br.com.seatecnologia.treinamento.model.Modelo toUnescapedModel() {
		return new ModeloWrapper(_modelo.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _modelo.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _modelo.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_modelo.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ModeloWrapper)) {
			return false;
		}

		ModeloWrapper modeloWrapper = (ModeloWrapper)obj;

		if (Validator.equals(_modelo, modeloWrapper._modelo)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Modelo getWrappedModelo() {
		return _modelo;
	}

	@Override
	public Modelo getWrappedModel() {
		return _modelo;
	}

	@Override
	public void resetOriginalValues() {
		_modelo.resetOriginalValues();
	}

	private Modelo _modelo;
}