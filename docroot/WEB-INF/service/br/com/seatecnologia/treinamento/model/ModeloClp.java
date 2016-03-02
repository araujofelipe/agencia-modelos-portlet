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

import br.com.seatecnologia.treinamento.service.ClpSerializer;
import br.com.seatecnologia.treinamento.service.ModeloLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author felipearaujo
 */
public class ModeloClp extends BaseModelImpl<Modelo> implements Modelo {
	public ModeloClp() {
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
	public long getPrimaryKey() {
		return _modeloId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setModeloId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _modeloId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
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

	@Override
	public long getModeloId() {
		return _modeloId;
	}

	@Override
	public void setModeloId(long modeloId) {
		_modeloId = modeloId;

		if (_modeloRemoteModel != null) {
			try {
				Class<?> clazz = _modeloRemoteModel.getClass();

				Method method = clazz.getMethod("setModeloId", long.class);

				method.invoke(_modeloRemoteModel, modeloId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_modeloRemoteModel != null) {
			try {
				Class<?> clazz = _modeloRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_modeloRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_modeloRemoteModel != null) {
			try {
				Class<?> clazz = _modeloRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_modeloRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_modeloRemoteModel != null) {
			try {
				Class<?> clazz = _modeloRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_modeloRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_modeloRemoteModel != null) {
			try {
				Class<?> clazz = _modeloRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_modeloRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_modeloRemoteModel != null) {
			try {
				Class<?> clazz = _modeloRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_modeloRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_modeloRemoteModel != null) {
			try {
				Class<?> clazz = _modeloRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_modeloRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getNome() {
		return _nome;
	}

	@Override
	public void setNome(String nome) {
		_nome = nome;

		if (_modeloRemoteModel != null) {
			try {
				Class<?> clazz = _modeloRemoteModel.getClass();

				Method method = clazz.getMethod("setNome", String.class);

				method.invoke(_modeloRemoteModel, nome);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getIdade() {
		return _idade;
	}

	@Override
	public void setIdade(int idade) {
		_idade = idade;

		if (_modeloRemoteModel != null) {
			try {
				Class<?> clazz = _modeloRemoteModel.getClass();

				Method method = clazz.getMethod("setIdade", int.class);

				method.invoke(_modeloRemoteModel, idade);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getAltura() {
		return _altura;
	}

	@Override
	public void setAltura(double altura) {
		_altura = altura;

		if (_modeloRemoteModel != null) {
			try {
				Class<?> clazz = _modeloRemoteModel.getClass();

				Method method = clazz.getMethod("setAltura", double.class);

				method.invoke(_modeloRemoteModel, altura);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public double getPeso() {
		return _peso;
	}

	@Override
	public void setPeso(double peso) {
		_peso = peso;

		if (_modeloRemoteModel != null) {
			try {
				Class<?> clazz = _modeloRemoteModel.getClass();

				Method method = clazz.getMethod("setPeso", double.class);

				method.invoke(_modeloRemoteModel, peso);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getEtinia() {
		return _etinia;
	}

	@Override
	public void setEtinia(int etinia) {
		_etinia = etinia;

		if (_modeloRemoteModel != null) {
			try {
				Class<?> clazz = _modeloRemoteModel.getClass();

				Method method = clazz.getMethod("setEtinia", int.class);

				method.invoke(_modeloRemoteModel, etinia);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getModeloRemoteModel() {
		return _modeloRemoteModel;
	}

	public void setModeloRemoteModel(BaseModel<?> modeloRemoteModel) {
		_modeloRemoteModel = modeloRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _modeloRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_modeloRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			ModeloLocalServiceUtil.addModelo(this);
		}
		else {
			ModeloLocalServiceUtil.updateModelo(this);
		}
	}

	@Override
	public Modelo toEscapedModel() {
		return (Modelo)ProxyUtil.newProxyInstance(Modelo.class.getClassLoader(),
			new Class[] { Modelo.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		ModeloClp clone = new ModeloClp();

		clone.setModeloId(getModeloId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setNome(getNome());
		clone.setIdade(getIdade());
		clone.setAltura(getAltura());
		clone.setPeso(getPeso());
		clone.setEtinia(getEtinia());

		return clone;
	}

	@Override
	public int compareTo(Modelo modelo) {
		int value = 0;

		value = getNome().compareTo(modelo.getNome());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ModeloClp)) {
			return false;
		}

		ModeloClp modelo = (ModeloClp)obj;

		long primaryKey = modelo.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{modeloId=");
		sb.append(getModeloId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", nome=");
		sb.append(getNome());
		sb.append(", idade=");
		sb.append(getIdade());
		sb.append(", altura=");
		sb.append(getAltura());
		sb.append(", peso=");
		sb.append(getPeso());
		sb.append(", etinia=");
		sb.append(getEtinia());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("br.com.seatecnologia.treinamento.model.Modelo");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>modeloId</column-name><column-value><![CDATA[");
		sb.append(getModeloId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nome</column-name><column-value><![CDATA[");
		sb.append(getNome());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>idade</column-name><column-value><![CDATA[");
		sb.append(getIdade());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>altura</column-name><column-value><![CDATA[");
		sb.append(getAltura());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>peso</column-name><column-value><![CDATA[");
		sb.append(getPeso());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>etinia</column-name><column-value><![CDATA[");
		sb.append(getEtinia());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _modeloId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _nome;
	private int _idade;
	private double _altura;
	private double _peso;
	private int _etinia;
	private BaseModel<?> _modeloRemoteModel;
	private Class<?> _clpSerializerClass = br.com.seatecnologia.treinamento.service.ClpSerializer.class;
}