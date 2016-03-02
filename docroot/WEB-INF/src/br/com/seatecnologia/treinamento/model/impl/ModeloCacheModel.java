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

package br.com.seatecnologia.treinamento.model.impl;

import br.com.seatecnologia.treinamento.model.Modelo;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Modelo in entity cache.
 *
 * @author felipearaujo
 * @see Modelo
 * @generated
 */
public class ModeloCacheModel implements CacheModel<Modelo>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{modeloId=");
		sb.append(modeloId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", nome=");
		sb.append(nome);
		sb.append(", idade=");
		sb.append(idade);
		sb.append(", altura=");
		sb.append(altura);
		sb.append(", peso=");
		sb.append(peso);
		sb.append(", etinia=");
		sb.append(etinia);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Modelo toEntityModel() {
		ModeloImpl modeloImpl = new ModeloImpl();

		modeloImpl.setModeloId(modeloId);
		modeloImpl.setGroupId(groupId);
		modeloImpl.setCompanyId(companyId);
		modeloImpl.setUserId(userId);

		if (userName == null) {
			modeloImpl.setUserName(StringPool.BLANK);
		}
		else {
			modeloImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			modeloImpl.setCreateDate(null);
		}
		else {
			modeloImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			modeloImpl.setModifiedDate(null);
		}
		else {
			modeloImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nome == null) {
			modeloImpl.setNome(StringPool.BLANK);
		}
		else {
			modeloImpl.setNome(nome);
		}

		modeloImpl.setIdade(idade);
		modeloImpl.setAltura(altura);
		modeloImpl.setPeso(peso);
		modeloImpl.setEtinia(etinia);

		modeloImpl.resetOriginalValues();

		return modeloImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		modeloId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nome = objectInput.readUTF();
		idade = objectInput.readInt();
		altura = objectInput.readDouble();
		peso = objectInput.readDouble();
		etinia = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(modeloId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (nome == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(nome);
		}

		objectOutput.writeInt(idade);
		objectOutput.writeDouble(altura);
		objectOutput.writeDouble(peso);
		objectOutput.writeInt(etinia);
	}

	public long modeloId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nome;
	public int idade;
	public double altura;
	public double peso;
	public int etinia;
}