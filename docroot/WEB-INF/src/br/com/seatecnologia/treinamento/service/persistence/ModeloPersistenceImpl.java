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

import br.com.seatecnologia.treinamento.NoSuchModeloException;
import br.com.seatecnologia.treinamento.model.Modelo;
import br.com.seatecnologia.treinamento.model.impl.ModeloImpl;
import br.com.seatecnologia.treinamento.model.impl.ModeloModelImpl;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the modelo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author felipearaujo
 * @see ModeloPersistence
 * @see ModeloUtil
 * @generated
 */
public class ModeloPersistenceImpl extends BasePersistenceImpl<Modelo>
	implements ModeloPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ModeloUtil} to access the modelo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ModeloImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ModeloModelImpl.ENTITY_CACHE_ENABLED,
			ModeloModelImpl.FINDER_CACHE_ENABLED, ModeloImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ModeloModelImpl.ENTITY_CACHE_ENABLED,
			ModeloModelImpl.FINDER_CACHE_ENABLED, ModeloImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ModeloModelImpl.ENTITY_CACHE_ENABLED,
			ModeloModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_NOMEANDGROUPID =
		new FinderPath(ModeloModelImpl.ENTITY_CACHE_ENABLED,
			ModeloModelImpl.FINDER_CACHE_ENABLED, ModeloImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNomeAndGroupId",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMEANDGROUPID =
		new FinderPath(ModeloModelImpl.ENTITY_CACHE_ENABLED,
			ModeloModelImpl.FINDER_CACHE_ENABLED, ModeloImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNomeAndGroupId",
			new String[] { String.class.getName(), Long.class.getName() },
			ModeloModelImpl.NOME_COLUMN_BITMASK |
			ModeloModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_NOMEANDGROUPID = new FinderPath(ModeloModelImpl.ENTITY_CACHE_ENABLED,
			ModeloModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNomeAndGroupId",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the modelos where nome = &#63; and groupId = &#63;.
	 *
	 * @param nome the nome
	 * @param groupId the group ID
	 * @return the matching modelos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Modelo> findByNomeAndGroupId(String nome, long groupId)
		throws SystemException {
		return findByNomeAndGroupId(nome, groupId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<Modelo> findByNomeAndGroupId(String nome, long groupId,
		int start, int end) throws SystemException {
		return findByNomeAndGroupId(nome, groupId, start, end, null);
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
	@Override
	public List<Modelo> findByNomeAndGroupId(String nome, long groupId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMEANDGROUPID;
			finderArgs = new Object[] { nome, groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_NOMEANDGROUPID;
			finderArgs = new Object[] {
					nome, groupId,
					
					start, end, orderByComparator
				};
		}

		List<Modelo> list = (List<Modelo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Modelo modelo : list) {
				if (!Validator.equals(nome, modelo.getNome()) ||
						(groupId != modelo.getGroupId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_MODELO_WHERE);

			boolean bindNome = false;

			if (nome == null) {
				query.append(_FINDER_COLUMN_NOMEANDGROUPID_NOME_1);
			}
			else if (nome.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NOMEANDGROUPID_NOME_3);
			}
			else {
				bindNome = true;

				query.append(_FINDER_COLUMN_NOMEANDGROUPID_NOME_2);
			}

			query.append(_FINDER_COLUMN_NOMEANDGROUPID_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ModeloModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNome) {
					qPos.add(nome);
				}

				qPos.add(groupId);

				if (!pagination) {
					list = (List<Modelo>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Modelo>(list);
				}
				else {
					list = (List<Modelo>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public Modelo findByNomeAndGroupId_First(String nome, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchModeloException, SystemException {
		Modelo modelo = fetchByNomeAndGroupId_First(nome, groupId,
				orderByComparator);

		if (modelo != null) {
			return modelo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nome=");
		msg.append(nome);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchModeloException(msg.toString());
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
	@Override
	public Modelo fetchByNomeAndGroupId_First(String nome, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Modelo> list = findByNomeAndGroupId(nome, groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Modelo findByNomeAndGroupId_Last(String nome, long groupId,
		OrderByComparator orderByComparator)
		throws NoSuchModeloException, SystemException {
		Modelo modelo = fetchByNomeAndGroupId_Last(nome, groupId,
				orderByComparator);

		if (modelo != null) {
			return modelo;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("nome=");
		msg.append(nome);

		msg.append(", groupId=");
		msg.append(groupId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchModeloException(msg.toString());
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
	@Override
	public Modelo fetchByNomeAndGroupId_Last(String nome, long groupId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByNomeAndGroupId(nome, groupId);

		if (count == 0) {
			return null;
		}

		List<Modelo> list = findByNomeAndGroupId(nome, groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Modelo[] findByNomeAndGroupId_PrevAndNext(long modeloId,
		String nome, long groupId, OrderByComparator orderByComparator)
		throws NoSuchModeloException, SystemException {
		Modelo modelo = findByPrimaryKey(modeloId);

		Session session = null;

		try {
			session = openSession();

			Modelo[] array = new ModeloImpl[3];

			array[0] = getByNomeAndGroupId_PrevAndNext(session, modelo, nome,
					groupId, orderByComparator, true);

			array[1] = modelo;

			array[2] = getByNomeAndGroupId_PrevAndNext(session, modelo, nome,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Modelo getByNomeAndGroupId_PrevAndNext(Session session,
		Modelo modelo, String nome, long groupId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_MODELO_WHERE);

		boolean bindNome = false;

		if (nome == null) {
			query.append(_FINDER_COLUMN_NOMEANDGROUPID_NOME_1);
		}
		else if (nome.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_NOMEANDGROUPID_NOME_3);
		}
		else {
			bindNome = true;

			query.append(_FINDER_COLUMN_NOMEANDGROUPID_NOME_2);
		}

		query.append(_FINDER_COLUMN_NOMEANDGROUPID_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ModeloModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindNome) {
			qPos.add(nome);
		}

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(modelo);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Modelo> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the modelos where nome = &#63; and groupId = &#63; from the database.
	 *
	 * @param nome the nome
	 * @param groupId the group ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByNomeAndGroupId(String nome, long groupId)
		throws SystemException {
		for (Modelo modelo : findByNomeAndGroupId(nome, groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(modelo);
		}
	}

	/**
	 * Returns the number of modelos where nome = &#63; and groupId = &#63;.
	 *
	 * @param nome the nome
	 * @param groupId the group ID
	 * @return the number of matching modelos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByNomeAndGroupId(String nome, long groupId)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_NOMEANDGROUPID;

		Object[] finderArgs = new Object[] { nome, groupId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_MODELO_WHERE);

			boolean bindNome = false;

			if (nome == null) {
				query.append(_FINDER_COLUMN_NOMEANDGROUPID_NOME_1);
			}
			else if (nome.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_NOMEANDGROUPID_NOME_3);
			}
			else {
				bindNome = true;

				query.append(_FINDER_COLUMN_NOMEANDGROUPID_NOME_2);
			}

			query.append(_FINDER_COLUMN_NOMEANDGROUPID_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindNome) {
					qPos.add(nome);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_NOMEANDGROUPID_NOME_1 = "modelo.nome IS NULL AND ";
	private static final String _FINDER_COLUMN_NOMEANDGROUPID_NOME_2 = "modelo.nome = ? AND ";
	private static final String _FINDER_COLUMN_NOMEANDGROUPID_NOME_3 = "(modelo.nome IS NULL OR modelo.nome = '') AND ";
	private static final String _FINDER_COLUMN_NOMEANDGROUPID_GROUPID_2 = "modelo.groupId = ?";

	public ModeloPersistenceImpl() {
		setModelClass(Modelo.class);
	}

	/**
	 * Caches the modelo in the entity cache if it is enabled.
	 *
	 * @param modelo the modelo
	 */
	@Override
	public void cacheResult(Modelo modelo) {
		EntityCacheUtil.putResult(ModeloModelImpl.ENTITY_CACHE_ENABLED,
			ModeloImpl.class, modelo.getPrimaryKey(), modelo);

		modelo.resetOriginalValues();
	}

	/**
	 * Caches the modelos in the entity cache if it is enabled.
	 *
	 * @param modelos the modelos
	 */
	@Override
	public void cacheResult(List<Modelo> modelos) {
		for (Modelo modelo : modelos) {
			if (EntityCacheUtil.getResult(
						ModeloModelImpl.ENTITY_CACHE_ENABLED, ModeloImpl.class,
						modelo.getPrimaryKey()) == null) {
				cacheResult(modelo);
			}
			else {
				modelo.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all modelos.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(ModeloImpl.class.getName());
		}

		EntityCacheUtil.clearCache(ModeloImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the modelo.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Modelo modelo) {
		EntityCacheUtil.removeResult(ModeloModelImpl.ENTITY_CACHE_ENABLED,
			ModeloImpl.class, modelo.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Modelo> modelos) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Modelo modelo : modelos) {
			EntityCacheUtil.removeResult(ModeloModelImpl.ENTITY_CACHE_ENABLED,
				ModeloImpl.class, modelo.getPrimaryKey());
		}
	}

	/**
	 * Creates a new modelo with the primary key. Does not add the modelo to the database.
	 *
	 * @param modeloId the primary key for the new modelo
	 * @return the new modelo
	 */
	@Override
	public Modelo create(long modeloId) {
		Modelo modelo = new ModeloImpl();

		modelo.setNew(true);
		modelo.setPrimaryKey(modeloId);

		return modelo;
	}

	/**
	 * Removes the modelo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param modeloId the primary key of the modelo
	 * @return the modelo that was removed
	 * @throws br.com.seatecnologia.treinamento.NoSuchModeloException if a modelo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Modelo remove(long modeloId)
		throws NoSuchModeloException, SystemException {
		return remove((Serializable)modeloId);
	}

	/**
	 * Removes the modelo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the modelo
	 * @return the modelo that was removed
	 * @throws br.com.seatecnologia.treinamento.NoSuchModeloException if a modelo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Modelo remove(Serializable primaryKey)
		throws NoSuchModeloException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Modelo modelo = (Modelo)session.get(ModeloImpl.class, primaryKey);

			if (modelo == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchModeloException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(modelo);
		}
		catch (NoSuchModeloException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Modelo removeImpl(Modelo modelo) throws SystemException {
		modelo = toUnwrappedModel(modelo);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(modelo)) {
				modelo = (Modelo)session.get(ModeloImpl.class,
						modelo.getPrimaryKeyObj());
			}

			if (modelo != null) {
				session.delete(modelo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (modelo != null) {
			clearCache(modelo);
		}

		return modelo;
	}

	@Override
	public Modelo updateImpl(
		br.com.seatecnologia.treinamento.model.Modelo modelo)
		throws SystemException {
		modelo = toUnwrappedModel(modelo);

		boolean isNew = modelo.isNew();

		ModeloModelImpl modeloModelImpl = (ModeloModelImpl)modelo;

		Session session = null;

		try {
			session = openSession();

			if (modelo.isNew()) {
				session.save(modelo);

				modelo.setNew(false);
			}
			else {
				session.merge(modelo);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !ModeloModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((modeloModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMEANDGROUPID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						modeloModelImpl.getOriginalNome(),
						modeloModelImpl.getOriginalGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOMEANDGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMEANDGROUPID,
					args);

				args = new Object[] {
						modeloModelImpl.getNome(), modeloModelImpl.getGroupId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_NOMEANDGROUPID,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_NOMEANDGROUPID,
					args);
			}
		}

		EntityCacheUtil.putResult(ModeloModelImpl.ENTITY_CACHE_ENABLED,
			ModeloImpl.class, modelo.getPrimaryKey(), modelo);

		return modelo;
	}

	protected Modelo toUnwrappedModel(Modelo modelo) {
		if (modelo instanceof ModeloImpl) {
			return modelo;
		}

		ModeloImpl modeloImpl = new ModeloImpl();

		modeloImpl.setNew(modelo.isNew());
		modeloImpl.setPrimaryKey(modelo.getPrimaryKey());

		modeloImpl.setModeloId(modelo.getModeloId());
		modeloImpl.setGroupId(modelo.getGroupId());
		modeloImpl.setCompanyId(modelo.getCompanyId());
		modeloImpl.setUserId(modelo.getUserId());
		modeloImpl.setUserName(modelo.getUserName());
		modeloImpl.setCreateDate(modelo.getCreateDate());
		modeloImpl.setModifiedDate(modelo.getModifiedDate());
		modeloImpl.setNome(modelo.getNome());
		modeloImpl.setIdade(modelo.getIdade());
		modeloImpl.setAltura(modelo.getAltura());
		modeloImpl.setPeso(modelo.getPeso());
		modeloImpl.setEtinia(modelo.getEtinia());

		return modeloImpl;
	}

	/**
	 * Returns the modelo with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the modelo
	 * @return the modelo
	 * @throws br.com.seatecnologia.treinamento.NoSuchModeloException if a modelo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Modelo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModeloException, SystemException {
		Modelo modelo = fetchByPrimaryKey(primaryKey);

		if (modelo == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchModeloException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return modelo;
	}

	/**
	 * Returns the modelo with the primary key or throws a {@link br.com.seatecnologia.treinamento.NoSuchModeloException} if it could not be found.
	 *
	 * @param modeloId the primary key of the modelo
	 * @return the modelo
	 * @throws br.com.seatecnologia.treinamento.NoSuchModeloException if a modelo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Modelo findByPrimaryKey(long modeloId)
		throws NoSuchModeloException, SystemException {
		return findByPrimaryKey((Serializable)modeloId);
	}

	/**
	 * Returns the modelo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the modelo
	 * @return the modelo, or <code>null</code> if a modelo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Modelo fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Modelo modelo = (Modelo)EntityCacheUtil.getResult(ModeloModelImpl.ENTITY_CACHE_ENABLED,
				ModeloImpl.class, primaryKey);

		if (modelo == _nullModelo) {
			return null;
		}

		if (modelo == null) {
			Session session = null;

			try {
				session = openSession();

				modelo = (Modelo)session.get(ModeloImpl.class, primaryKey);

				if (modelo != null) {
					cacheResult(modelo);
				}
				else {
					EntityCacheUtil.putResult(ModeloModelImpl.ENTITY_CACHE_ENABLED,
						ModeloImpl.class, primaryKey, _nullModelo);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(ModeloModelImpl.ENTITY_CACHE_ENABLED,
					ModeloImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return modelo;
	}

	/**
	 * Returns the modelo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param modeloId the primary key of the modelo
	 * @return the modelo, or <code>null</code> if a modelo with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Modelo fetchByPrimaryKey(long modeloId) throws SystemException {
		return fetchByPrimaryKey((Serializable)modeloId);
	}

	/**
	 * Returns all the modelos.
	 *
	 * @return the modelos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Modelo> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Modelo> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Modelo> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Modelo> list = (List<Modelo>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_MODELO);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_MODELO;

				if (pagination) {
					sql = sql.concat(ModeloModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Modelo>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Modelo>(list);
				}
				else {
					list = (List<Modelo>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the modelos from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Modelo modelo : findAll()) {
			remove(modelo);
		}
	}

	/**
	 * Returns the number of modelos.
	 *
	 * @return the number of modelos
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_MODELO);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the modelo persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.br.com.seatecnologia.treinamento.model.Modelo")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Modelo>> listenersList = new ArrayList<ModelListener<Modelo>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Modelo>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(ModeloImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_MODELO = "SELECT modelo FROM Modelo modelo";
	private static final String _SQL_SELECT_MODELO_WHERE = "SELECT modelo FROM Modelo modelo WHERE ";
	private static final String _SQL_COUNT_MODELO = "SELECT COUNT(modelo) FROM Modelo modelo";
	private static final String _SQL_COUNT_MODELO_WHERE = "SELECT COUNT(modelo) FROM Modelo modelo WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "modelo.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Modelo exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Modelo exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(ModeloPersistenceImpl.class);
	private static Modelo _nullModelo = new ModeloImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Modelo> toCacheModel() {
				return _nullModeloCacheModel;
			}
		};

	private static CacheModel<Modelo> _nullModeloCacheModel = new CacheModel<Modelo>() {
			@Override
			public Modelo toEntityModel() {
				return _nullModelo;
			}
		};
}