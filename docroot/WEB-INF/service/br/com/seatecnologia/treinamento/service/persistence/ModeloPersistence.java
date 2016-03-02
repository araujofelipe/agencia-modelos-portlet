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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the modelo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author felipearaujo
 * @see ModeloPersistenceImpl
 * @see ModeloUtil
 * @generated
 */
public interface ModeloPersistence extends BasePersistence<Modelo> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ModeloUtil} to access the modelo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the modelos where nome = &#63; and groupId = &#63;.
	*
	* @param nome the nome
	* @param groupId the group ID
	* @return the matching modelos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.treinamento.model.Modelo> findByNomeAndGroupId(
		java.lang.String nome, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<br.com.seatecnologia.treinamento.model.Modelo> findByNomeAndGroupId(
		java.lang.String nome, long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<br.com.seatecnologia.treinamento.model.Modelo> findByNomeAndGroupId(
		java.lang.String nome, long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public br.com.seatecnologia.treinamento.model.Modelo findByNomeAndGroupId_First(
		java.lang.String nome, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.treinamento.NoSuchModeloException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first modelo in the ordered set where nome = &#63; and groupId = &#63;.
	*
	* @param nome the nome
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching modelo, or <code>null</code> if a matching modelo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.treinamento.model.Modelo fetchByNomeAndGroupId_First(
		java.lang.String nome, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public br.com.seatecnologia.treinamento.model.Modelo findByNomeAndGroupId_Last(
		java.lang.String nome, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.treinamento.NoSuchModeloException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last modelo in the ordered set where nome = &#63; and groupId = &#63;.
	*
	* @param nome the nome
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching modelo, or <code>null</code> if a matching modelo could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.treinamento.model.Modelo fetchByNomeAndGroupId_Last(
		java.lang.String nome, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public br.com.seatecnologia.treinamento.model.Modelo[] findByNomeAndGroupId_PrevAndNext(
		long modeloId, java.lang.String nome, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws br.com.seatecnologia.treinamento.NoSuchModeloException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the modelos where nome = &#63; and groupId = &#63; from the database.
	*
	* @param nome the nome
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByNomeAndGroupId(java.lang.String nome, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of modelos where nome = &#63; and groupId = &#63;.
	*
	* @param nome the nome
	* @param groupId the group ID
	* @return the number of matching modelos
	* @throws SystemException if a system exception occurred
	*/
	public int countByNomeAndGroupId(java.lang.String nome, long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the modelo in the entity cache if it is enabled.
	*
	* @param modelo the modelo
	*/
	public void cacheResult(
		br.com.seatecnologia.treinamento.model.Modelo modelo);

	/**
	* Caches the modelos in the entity cache if it is enabled.
	*
	* @param modelos the modelos
	*/
	public void cacheResult(
		java.util.List<br.com.seatecnologia.treinamento.model.Modelo> modelos);

	/**
	* Creates a new modelo with the primary key. Does not add the modelo to the database.
	*
	* @param modeloId the primary key for the new modelo
	* @return the new modelo
	*/
	public br.com.seatecnologia.treinamento.model.Modelo create(long modeloId);

	/**
	* Removes the modelo with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param modeloId the primary key of the modelo
	* @return the modelo that was removed
	* @throws br.com.seatecnologia.treinamento.NoSuchModeloException if a modelo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.treinamento.model.Modelo remove(long modeloId)
		throws br.com.seatecnologia.treinamento.NoSuchModeloException,
			com.liferay.portal.kernel.exception.SystemException;

	public br.com.seatecnologia.treinamento.model.Modelo updateImpl(
		br.com.seatecnologia.treinamento.model.Modelo modelo)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the modelo with the primary key or throws a {@link br.com.seatecnologia.treinamento.NoSuchModeloException} if it could not be found.
	*
	* @param modeloId the primary key of the modelo
	* @return the modelo
	* @throws br.com.seatecnologia.treinamento.NoSuchModeloException if a modelo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.treinamento.model.Modelo findByPrimaryKey(
		long modeloId)
		throws br.com.seatecnologia.treinamento.NoSuchModeloException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the modelo with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param modeloId the primary key of the modelo
	* @return the modelo, or <code>null</code> if a modelo with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public br.com.seatecnologia.treinamento.model.Modelo fetchByPrimaryKey(
		long modeloId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the modelos.
	*
	* @return the modelos
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<br.com.seatecnologia.treinamento.model.Modelo> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<br.com.seatecnologia.treinamento.model.Modelo> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<br.com.seatecnologia.treinamento.model.Modelo> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the modelos from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of modelos.
	*
	* @return the number of modelos
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}