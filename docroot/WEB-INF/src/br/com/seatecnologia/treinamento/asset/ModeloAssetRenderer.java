package br.com.seatecnologia.treinamento.asset;

import br.com.seatecnologia.treinamento.model.Modelo;

import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portlet.asset.model.BaseAssetRenderer;

import java.util.Locale;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class ModeloAssetRenderer extends BaseAssetRenderer {

	public ModeloAssetRenderer(Modelo entry) {
		_entry = entry;
	}

	public long getClassPK() {
		return _entry.getModeloId();
	}

	public long getGroupId() {
		return _entry.getGroupId();
	}

	public String getSummary(Locale locale) {
		return HtmlUtil.stripHtml(_entry.getNome());
	}

	public String getTitle(Locale locale) {
		return _entry.getNome();
	}

	public long getUserId() {
		return _entry.getUserId();
	}

	public String getUuid() {
		return null;
	}

	public String render(
			RenderRequest renderRequest, RenderResponse renderResponse,
			String template)
		throws Exception {

		if (template.equals(TEMPLATE_ABSTRACT) ||
			template.equals(TEMPLATE_FULL_CONTENT)) {

			renderRequest.setAttribute("modeloContent", _entry);

			return "/html/modelo/asset/" + template + ".jsp";
		}
		else {
			return null;
		}
	}

	private Modelo _entry;

	@Override
	public String getUserName() {
		return _entry.getUserName();
	}

	@Override
	public String getClassName() {
		return Modelo.class.getName();
	}

}
