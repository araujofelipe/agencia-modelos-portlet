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

package br.com.seatecnologia.treinamento.service.impl;

import br.com.seatecnologia.treinamento.model.Modelo;
import br.com.seatecnologia.treinamento.service.base.ModeloLocalServiceBaseImpl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexer;
import com.liferay.portal.kernel.search.IndexerRegistryUtil;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portlet.asset.service.AssetEntryLocalServiceUtil;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the modelo local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link br.com.seatecnologia.treinamento.service.ModeloLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author felipearaujo
 * @see br.com.seatecnologia.treinamento.service.base.ModeloLocalServiceBaseImpl
 * @see br.com.seatecnologia.treinamento.service.ModeloLocalServiceUtil
 */
public class ModeloLocalServiceImpl extends ModeloLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link br.com.seatecnologia.treinamento.service.ModeloLocalServiceUtil} to access the modelo local service.
	 */
	
	@Override
	public Modelo addModelo(Modelo modelo) throws SystemException {
		Long modeloId = counterLocalService.increment(Modelo.class.getName());
		modelo.setModeloId(modeloId);
		modelo.setNew(true);
		Indexer indexer = IndexerRegistryUtil.getIndexer(Modelo.class.getName());
		try {
			indexer.reindex(modelo);
			return super.addModelo(modelo);
		} catch (SearchException e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public Modelo addModelo(Modelo modelo, ServiceContext serviceContext) throws SystemException, PortalException {
		modelo.setGroupId(serviceContext.getScopeGroupId());
		modelo.setCompanyId(serviceContext.getCompanyId());
		Modelo resource = addModelo(modelo);
		AssetEntryLocalServiceUtil.updateEntry(
				resource.getUserId(), resource.getGroupId(), Modelo.class.getName(),
				resource.getModeloId(), serviceContext.getUuid(), 0, new long[0],
				new String[0], true, null, null, new Date(), null,
				ContentTypes.TEXT_HTML, resource.getNome(), null, "", null, null,
				0, 0, null, false);
		return resource;
	}
	
	public List<Modelo> getAllModelos() throws SystemException{
		return modeloPersistence.findAll(); 
	}
	
	public int countAllModelos() throws SystemException {
		return modeloPersistence.countAll();
	}
	
}