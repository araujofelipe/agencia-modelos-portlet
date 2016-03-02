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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link br.com.seatecnologia.treinamento.service.http.ModeloServiceSoap}.
 *
 * @author felipearaujo
 * @see br.com.seatecnologia.treinamento.service.http.ModeloServiceSoap
 * @generated
 */
public class ModeloSoap implements Serializable {
	public static ModeloSoap toSoapModel(Modelo model) {
		ModeloSoap soapModel = new ModeloSoap();

		soapModel.setModeloId(model.getModeloId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setNome(model.getNome());
		soapModel.setIdade(model.getIdade());
		soapModel.setAltura(model.getAltura());
		soapModel.setPeso(model.getPeso());
		soapModel.setEtinia(model.getEtinia());

		return soapModel;
	}

	public static ModeloSoap[] toSoapModels(Modelo[] models) {
		ModeloSoap[] soapModels = new ModeloSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ModeloSoap[][] toSoapModels(Modelo[][] models) {
		ModeloSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ModeloSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ModeloSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ModeloSoap[] toSoapModels(List<Modelo> models) {
		List<ModeloSoap> soapModels = new ArrayList<ModeloSoap>(models.size());

		for (Modelo model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ModeloSoap[soapModels.size()]);
	}

	public ModeloSoap() {
	}

	public long getPrimaryKey() {
		return _modeloId;
	}

	public void setPrimaryKey(long pk) {
		setModeloId(pk);
	}

	public long getModeloId() {
		return _modeloId;
	}

	public void setModeloId(long modeloId) {
		_modeloId = modeloId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getNome() {
		return _nome;
	}

	public void setNome(String nome) {
		_nome = nome;
	}

	public int getIdade() {
		return _idade;
	}

	public void setIdade(int idade) {
		_idade = idade;
	}

	public double getAltura() {
		return _altura;
	}

	public void setAltura(double altura) {
		_altura = altura;
	}

	public double getPeso() {
		return _peso;
	}

	public void setPeso(double peso) {
		_peso = peso;
	}

	public int getEtinia() {
		return _etinia;
	}

	public void setEtinia(int etinia) {
		_etinia = etinia;
	}

	private long _modeloId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _nome;
	private int _idade;
	private double _altura;
	private double _peso;
	private int _etinia;
}