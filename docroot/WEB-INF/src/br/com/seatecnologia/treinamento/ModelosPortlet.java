package br.com.seatecnologia.treinamento;

import br.com.seatecnologia.treinamento.model.Modelo;
import br.com.seatecnologia.treinamento.model.impl.ModeloImpl;
import br.com.seatecnologia.treinamento.service.ModeloLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
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
			ActionResponse actionResponse) throws IOException, PortletException, SystemException {
		String nome = ParamUtil.getString(actionRequest, "nome");
		Modelo modelo = new ModeloImpl();
		modelo.setNome(nome);
		ModeloLocalServiceUtil.addModelo(modelo);
		sendRedirect(actionRequest, actionResponse);
	}
	
	
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		try {
			List<Modelo> modelos = ModeloLocalServiceUtil.getAllModelos();
			for (Modelo modelo : modelos) {
				System.out.println(modelo.getNome());
			}
			renderRequest.setAttribute("modelos", modelos);
			
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		super.doView(renderRequest, renderResponse);
	}
	
	
	
	
}
