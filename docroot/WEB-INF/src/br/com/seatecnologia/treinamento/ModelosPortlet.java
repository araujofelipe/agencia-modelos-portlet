package br.com.seatecnologia.treinamento;

import br.com.seatecnologia.treinamento.model.Modelo;
import br.com.seatecnologia.treinamento.model.impl.ModeloImpl;
import br.com.seatecnologia.treinamento.service.ModeloLocalServiceUtil;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * Portlet implementation class ModelosPortlet
 */
public class ModelosPortlet extends MVCPortlet {
 
	public void adicionarModelo(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException, SystemException, PortalException {
		Modelo modelo = getModeloFromRequest(actionRequest);
		ServiceContext serviceContext =  ServiceContextFactory.getInstance(actionRequest);
		ModeloLocalServiceUtil.addModelo(modelo,serviceContext);
		sendRedirect(actionRequest, actionResponse);
	}

	
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		try {
			List<Modelo> modelos = ModeloLocalServiceUtil.getAllModelos();
			renderRequest.setAttribute("modelos", modelos);
			renderRequest.setAttribute("totalModelos", modelos.size());
			
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.doView(renderRequest, renderResponse);
	}
	
	public void atualizarModelo(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException, SystemException {
		Modelo modelo = getModeloFromRequest(actionRequest);
		ModeloLocalServiceUtil.updateModelo(modelo);
	}
	
	public void deleteModelo(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException, PortalException, SystemException {
		Modelo modelo = getModeloFromRequest(actionRequest);
		ModeloLocalServiceUtil.deleteModelo(modelo.getModeloId());
		sendRedirect(actionRequest, actionResponse);
	}
	

	private Modelo getModeloFromRequest(ActionRequest actionRequest) {
		String nome = ParamUtil.getString(actionRequest, "nome");
		long id = ParamUtil.getLong(actionRequest, "modeloId");
		Modelo modelo = new ModeloImpl();
		modelo.setNome(nome);
		modelo.setModeloId(id);
		return modelo;
	}
	
}
