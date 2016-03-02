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

package br.com.seatecnologia.treinamento.service.persistence;

import br.com.seatecnologia.treinamento.model.Modelo;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the modelo service. This utility wraps {@link ModeloPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author felipearaujo
 * @see ModeloPersistence
 * @see ModeloPersistenceImpl
 * @generated
 */
public class ModeloUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Modelo modelo) {
		getPersistence().clearCache(modelo);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Modelo> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Modelo> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Modelo> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Modelo update(Modelo modelo) throws SystemException {
		return getPersistence().update(modelo);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Modelo update(Modelo modelo, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(modelo, serviceContext);
	}

	/**
	* Returns all the modelos where nome = &#63; and groupId = &#63;.
	*
	* @param nome the nome
	* @param groupId the group ID
	* @return the matching modelos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<br.com.seatecnologia.treinamento.model.Modelo> findByNomeAndGroupId(
		java.lang.String nome, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNomeAndGroupId(nome, groupId);
	}

	/**
	* Returns a range of all the modelos where nome = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.treinamento.model.impl.ModeloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nome the nome
	* @param groupId the group ID
	* @param start the lower bound of the range of modelos
	* @param end the upper bound of the range of modelos (not inclusive)
	* @return the range of matching modelos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<br.com.seatecnologia.treinamento.model.Modelo> findByNomeAndGroupId(
		java.lang.String nome, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByNomeAndGroupId(nome, groupId, start, end);
	}

	/**
	* Returns an ordered range of all the modelos where nome = &#63; and groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.treinamento.model.impl.ModeloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param nome the nome
	* @param groupId the group ID
	* @param start the lower bound of the range of modelos
	* @param end the upper bound of the range of modelos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching modelos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<br.com.seatecnologia.treinamento.model.Modelo> findByNomeAndGroupId(
		java.lang.String nome, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNomeAndGroupId(nome, groupId, start, end,
			orderByComparator);
	}

	/**
	* Returns the first modelo in the ordered set where nome = &#63; and groupId = &#63;.
	*
	* @param nome the nome
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching modelo
	* @throws br.com.seatecnologia.treinamento.NoSuchModeloException if a matching modelo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static br.com.seatecnologia.treinamento.model.Modelo findByNomeAndGroupId_First(
		java.lang.String nome, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.treinamento.NoSuchModeloException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNomeAndGroupId_First(nome, groupId, orderByComparator);
	}

	/**
	* Returns the first modelo in the ordered set where nome = &#63; and groupId = &#63;.
	*
	* @param nome the nome
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching modelo, or <code>null</code> if a matching modelo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static br.com.seatecnologia.treinamento.model.Modelo fetchByNomeAndGroupId_First(
		java.lang.String nome, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNomeAndGroupId_First(nome, groupId, orderByComparator);
	}

	/**
	* Returns the last modelo in the ordered set where nome = &#63; and groupId = &#63;.
	*
	* @param nome the nome
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching modelo
	* @throws br.com.seatecnologia.treinamento.NoSuchModeloException if a matching modelo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static br.com.seatecnologia.treinamento.model.Modelo findByNomeAndGroupId_Last(
		java.lang.String nome, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.treinamento.NoSuchModeloException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNomeAndGroupId_Last(nome, groupId, orderByComparator);
	}

	/**
	* Returns the last modelo in the ordered set where nome = &#63; and groupId = &#63;.
	*
	* @param nome the nome
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching modelo, or <code>null</code> if a matching modelo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static br.com.seatecnologia.treinamento.model.Modelo fetchByNomeAndGroupId_Last(
		java.lang.String nome, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByNomeAndGroupId_Last(nome, groupId, orderByComparator);
	}

	/**
	* Returns the modelos before and after the current modelo in the ordered set where nome = &#63; and groupId = &#63;.
	*
	* @param modeloId the primary key of the current modelo
	* @param nome the nome
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next modelo
	* @throws br.com.seatecnologia.treinamento.NoSuchModeloException if a modelo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static br.com.seatecnologia.treinamento.model.Modelo[] findByNomeAndGroupId_PrevAndNext(
		long modeloId, java.lang.String nome, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.treinamento.NoSuchModeloException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByNomeAndGroupId_PrevAndNext(modeloId, nome, groupId,
			orderByComparator);
	}

	/**
	* Removes all the modelos where nome = &#63; and groupId = &#63; from the database.
	*
	* @param nome the nome
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByNomeAndGroupId(java.lang.String nome,
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByNomeAndGroupId(nome, groupId);
	}

	/**
	* Returns the number of modelos where nome = &#63; and groupId = &#63;.
	*
	* @param nome the nome
	* @param groupId the group ID
	* @return the number of matching modelos
	* @throws SystemException if a system exception occurred
	*/
	public static int countByNomeAndGroupId(java.lang.String nome, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByNomeAndGroupId(nome, groupId);
	}

	/**
	* Caches the modelo in the entity cache if it is enabled.
	*
	* @param modelo the modelo
	*/
	public static void cacheResult(
		br.com.seatecnologia.treinamento.model.Modelo modelo) {
		getPersistence().cacheResult(modelo);
	}

	/**
	* Caches the modelos in the entity cache if it is enabled.
	*
	* @param modelos the modelos
	*/
	public static void cacheResult(
		java.util.List<br.com.seatecnologia.treinamento.model.Modelo> modelos) {
		getPersistence().cacheResult(modelos);
	}

	/**
	* Creates a new modelo with the primary key. Does not add the modelo to the database.
	*
	* @param modeloId the primary key for the new modelo
	* @return the new modelo
	*/
	public static br.com.seatecnologia.treinamento.model.Modelo create(
		long modeloId) {
		return getPersistence().create(modeloId);
	}

	/**
	* Removes the modelo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param modeloId the primary key of the modelo
	* @return the modelo that was removed
	* @throws br.com.seatecnologia.treinamento.NoSuchModeloException if a modelo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static br.com.seatecnologia.treinamento.model.Modelo remove(
		long modeloId)
		throws br.com.seatecnologia.treinamento.NoSuchModeloException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(modeloId);
	}

	public static br.com.seatecnologia.treinamento.model.Modelo updateImpl(
		br.com.seatecnologia.treinamento.model.Modelo modelo)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(modelo);
	}

	/**
	* Returns the modelo with the primary key or throws a {@link br.com.seatecnologia.treinamento.NoSuchModeloException} if it could not be found.
	*
	* @param modeloId the primary key of the modelo
	* @return the modelo
	* @throws br.com.seatecnologia.treinamento.NoSuchModeloException if a modelo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static br.com.seatecnologia.treinamento.model.Modelo findByPrimaryKey(
		long modeloId)
		throws br.com.seatecnologia.treinamento.NoSuchModeloException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(modeloId);
	}

	/**
	* Returns the modelo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param modeloId the primary key of the modelo
	* @return the modelo, or <code>null</code> if a modelo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static br.com.seatecnologia.treinamento.model.Modelo fetchByPrimaryKey(
		long modeloId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(modeloId);
	}

	/**
	* Returns all the modelos.
	*
	* @return the modelos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<br.com.seatecnologia.treinamento.model.Modelo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<br.com.seatecnologia.treinamento.model.Modelo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the modelos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link br.com.seatecnologia.treinamento.model.impl.ModeloModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of modelos
	* @param end the upper bound of the range of modelos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of modelos
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<br.com.seatecnologia.treinamento.model.Modelo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the modelos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of modelos.
	*
	* @return the number of modelos
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ModeloPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ModeloPersistence)PortletBeanLocatorUtil.locate(br.com.seatecnologia.treinamento.service.ClpSerializer.getServletContextName(),
					ModeloPersistence.class.getName());

			ReferenceRegistry.registerReference(ModeloUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(ModeloPersistence persistence) {
	}

	private static ModeloPersistence _persistence;
}