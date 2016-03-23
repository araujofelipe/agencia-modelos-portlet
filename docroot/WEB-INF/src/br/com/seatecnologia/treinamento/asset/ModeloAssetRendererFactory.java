package br.com.seatecnologia.treinamento.asset;

import br.com.seatecnologia.treinamento.model.Modelo;
import br.com.seatecnologia.treinamento.service.ModeloLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.asset.model.AssetRenderer;
import com.liferay.portlet.asset.model.BaseAssetRendererFactory;

public class ModeloAssetRendererFactory extends BaseAssetRendererFactory {
	public static final String CLASS_NAME = Modelo.class.getName();

	public static final String TYPE = "Modelo";

	public AssetRenderer getAssetRenderer(long classPK, int type)
		throws PortalException, SystemException {

		Modelo entry = ModeloLocalServiceUtil.getModelo(classPK);

		return new ModeloAssetRenderer(entry);
	}

	public String getClassName() {
		return CLASS_NAME;
	}

	public String getType() {
		return TYPE;
	}

	@Override
	public boolean isLinkable() {
		return _LINKABLE;
	}

	private static final boolean _LINKABLE = true;


}
