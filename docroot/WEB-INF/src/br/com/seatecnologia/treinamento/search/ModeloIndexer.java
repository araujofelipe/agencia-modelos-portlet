package br.com.seatecnologia.treinamento.search;

import br.com.seatecnologia.treinamento.model.Modelo;
import br.com.seatecnologia.treinamento.service.ModeloLocalServiceUtil;

import com.liferay.portal.kernel.search.BaseIndexer;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.SearchEngineUtil;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.Locale;

import javax.portlet.PortletURL;

public class ModeloIndexer extends BaseIndexer {

	String [] CLASS_NAMES = {Modelo.class.getName()};
	public static final String PORTLET_ID = "modelo";

	@Override
	public String[] getClassNames() {
		// TODO Auto-generated method stub
		return CLASS_NAMES;
	}

	@Override
	public String getPortletId() {
		return PORTLET_ID;
	}

	@Override
	protected void doDelete(Object arg0) throws Exception {
	}

	@Override
	protected Document doGetDocument(Object obj) throws Exception {
		Modelo modelo = (Modelo)obj;
		long groupId = modelo.getGroupId();
		long scopeGroupId = modelo.getGroupId();
		String description = modelo.getNome();

		Document document = getBaseModelDocument(PORTLET_ID, modelo);

		document.addKeyword(Field.GROUP_ID, groupId);
		document.addKeyword(Field.SCOPE_GROUP_ID, scopeGroupId);
		document.addText("titulo_pt_BR", description);
		document.addText("id", String.valueOf(modelo.getModeloId()));
				
		return document;
	}

	@Override
	protected Summary doGetSummary(Document document, Locale locale, String snippet,
			PortletURL portletURL) throws Exception {
		String title = document.get("titulo_pt_BR");

		String content = snippet;

		if (Validator.isNull(snippet)) {
			content = document.get(Field.DESCRIPTION);

			if (Validator.isNull(content)) {
				content = StringUtil.shorten(document.get(Field.CONTENT), 200);
			}
		}

		String modeloId = document.get(Field.ENTRY_CLASS_PK);

		portletURL.setParameter("mvcPath", "/html/modelos/view.jsp");
		portletURL.setParameter("modeloId", modeloId);

		return new Summary(title, content, portletURL);
	}

	@Override
	protected void doReindex(Object obj) throws Exception {
		Modelo modelo = (Modelo)obj;
		SearchEngineUtil.addDocument(modelo.getCompanyId(), getDocument(modelo));
	}

	@Override
	protected void doReindex(String className, long classPK) throws Exception {
		Modelo sp = ModeloLocalServiceUtil.getModelo(classPK);

		doReindex(sp);
	}
	
	@Override
	protected String getPortletId(SearchContext arg0) {
		return PORTLET_ID;
	}

	@Override
	protected void doReindex(String[] arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
