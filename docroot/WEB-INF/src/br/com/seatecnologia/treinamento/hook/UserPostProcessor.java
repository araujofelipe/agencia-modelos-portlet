package br.com.seatecnologia.treinamento.hook;

import com.liferay.portal.kernel.search.BooleanQuery;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.kernel.search.IndexerPostProcessor;
import com.liferay.portal.kernel.search.SearchContext;
import com.liferay.portal.kernel.search.Summary;
import com.liferay.portal.model.User;

import java.util.Locale;

import javax.portlet.PortletURL;

public class UserPostProcessor implements IndexerPostProcessor {

	@Override
	public void postProcessContextQuery(BooleanQuery arg0, SearchContext arg1)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postProcessDocument(Document doc, Object obj)
			throws Exception {
		User user = (User)obj;
		String cargo = user.getJobTitle() != null ? user.getJobTitle() : "" ;
		if(cargo.length() > 0) {
			doc.addText(Field.TITLE, user.getJobTitle());
		}
		
	}

	@Override
	public void postProcessFullQuery(BooleanQuery arg0, SearchContext arg1)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postProcessSearchQuery(BooleanQuery arg0, SearchContext arg1)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postProcessSummary(Summary arg0, Document arg1, Locale arg2,
			String arg3, PortletURL arg4) {
		// TODO Auto-generated method stub

	}

}
