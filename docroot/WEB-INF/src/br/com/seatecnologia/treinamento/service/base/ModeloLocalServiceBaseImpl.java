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

package br.com.seatecnologia.treinamento.service.base;

import br.com.seatecnologia.treinamento.model.Modelo;
import br.com.seatecnologia.treinamento.service.ModeloLocalService;
import br.com.seatecnologia.treinamento.service.persistence.ModeloPersistence;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the modelo local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link br.com.seatecnologia.treinamento.service.impl.ModeloLocalServiceImpl}.
 * </p>
 *
 * @author felipearaujo
 * @see br.com.seatecnologia.treinamento.service.impl.ModeloLocalServiceImpl
 * @see br.com.seatecnologia.treinamento.service.ModeloLocalServiceUtil
 * @generated
 */
public abstract class ModeloLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements ModeloLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link br.com.seatecnologia.treinamento.service.ModeloLocalServiceUtil} to access the modelo local service.
	 */

	/**
	 * Adds the modelo to the database. Also notifies the appropriate model listeners.
	 *
	 * @param modelo the modelo
	 * @return the modelo that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Modelo addModelo(Modelo modelo) throws SystemException {
		modelo.setNew(true);

		return modeloPersistence.update(modelo);
	}

	/**
	 * Creates a new modelo with the primary key. Does not add the modelo to the database.
	 *
	 * @param modeloId the primary key for the new modelo
	 * @return the new modelo
	 */
	@Override
	public Modelo createModelo(long modeloId) {
		return modeloPersistence.create(modeloId);
	}

	/**
	 * Deletes the modelo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param modeloId the primary key of the modelo
	 * @return the modelo that was removed
	 * @throws PortalException if a modelo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Modelo deleteModelo(long modeloId)
		throws PortalException, SystemException {
		return modeloPersistence.remove(modeloId);
	}

	/**
	 * Deletes the modelo from the database. Also notifies the appropriate model listeners.
	 *
	 * @param modelo the modelo
	 * @return the modelo that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public Modelo deleteModelo(Modelo modelo) throws SystemException {
		return modeloPersistence.remove(modelo);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(Modelo.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return modeloPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.treinamento.model.impl.ModeloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return modeloPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.treinamento.model.impl.ModeloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return modeloPersistence.findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return modeloPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return modeloPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public Modelo fetchModelo(long modeloId) throws SystemException {
		return modeloPersistence.fetchByPrimaryKey(modeloId);
	}

	/**
	 * Returns the modelo with the primary key.
	 *
	 * @param modeloId the primary key of the modelo
	 * @return the modelo
	 * @throws PortalException if a modelo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Modelo getModelo(long modeloId)
		throws PortalException, SystemException {
		return modeloPersistence.findByPrimaryKey(modeloId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return modeloPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the modelos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.treinamento.model.impl.ModeloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of modelos
	 * @param end the upper bound of the range of modelos (not inclusive)
	 * @return the range of modelos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Modelo> getModelos(int start, int end)
		throws SystemException {
		return modeloPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of modelos.
	 *
	 * @return the number of modelos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getModelosCount() throws SystemException {
		return modeloPersistence.countAll();
	}

	/**
	 * Updates the modelo in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param modelo the modelo
	 * @return the modelo that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public Modelo updateModelo(Modelo modelo) throws SystemException {
		return modeloPersistence.update(modelo);
	}

	/**
	 * Returns the modelo local service.
	 *
	 * @return the modelo local service
	 */
	public br.com.seatecnologia.treinamento.service.ModeloLocalService getModeloLocalService() {
		return modeloLocalService;
	}

	/**
	 * Sets the modelo local service.
	 *
	 * @param modeloLocalService the modelo local service
	 */
	public void setModeloLocalService(
		br.com.seatecnologia.treinamento.service.ModeloLocalService modeloLocalService) {
		this.modeloLocalService = modeloLocalService;
	}

	/**
	 * Returns the modelo remote service.
	 *
	 * @return the modelo remote service
	 */
	public br.com.seatecnologia.treinamento.service.ModeloService getModeloService() {
		return modeloService;
	}

	/**
	 * Sets the modelo remote service.
	 *
	 * @param modeloService the modelo remote service
	 */
	public void setModeloService(
		br.com.seatecnologia.treinamento.service.ModeloService modeloService) {
		this.modeloService = modeloService;
	}

	/**
	 * Returns the modelo persistence.
	 *
	 * @return the modelo persistence
	 */
	public ModeloPersistence getModeloPersistence() {
		return modeloPersistence;
	}

	/**
	 * Sets the modelo persistence.
	 *
	 * @param modeloPersistence the modelo persistence
	 */
	public void setModeloPersistence(ModeloPersistence modeloPersistence) {
		this.modeloPersistence = modeloPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("br.com.seatecnologia.treinamento.model.Modelo",
			modeloLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"br.com.seatecnologia.treinamento.model.Modelo");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return Modelo.class;
	}

	protected String getModelClassName() {
		return Modelo.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = modeloPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = br.com.seatecnologia.treinamento.service.ModeloLocalService.class)
	protected br.com.seatecnologia.treinamento.service.ModeloLocalService modeloLocalService;
	@BeanReference(type = br.com.seatecnologia.treinamento.service.ModeloService.class)
	protected br.com.seatecnologia.treinamento.service.ModeloService modeloService;
	@BeanReference(type = ModeloPersistence.class)
	protected ModeloPersistence modeloPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private ModeloLocalServiceClpInvoker _clpInvoker = new ModeloLocalServiceClpInvoker();
}