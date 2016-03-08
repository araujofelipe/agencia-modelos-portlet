<%@include file="/html/init.jsp" %>
<portlet:actionURL name="adicionarModelo" var="adicionarModeloURL" />

<portlet:renderURL var="addModeloURL">
			<portlet:param name="jspPage" value="/html/modelos/edit_modelo.jsp" />
			<portlet:param name="redirect" value="<%= redirect %>" />
</portlet:renderURL>
<aui:button-row>
	<aui:button onClick="${addModeloURL}" value="Adicionar nova Modelo" />
</aui:button-row>

<liferay-ui:search-container delta="10" emptyResultsMessage="no-users-were-found">
<liferay-ui:search-container-results
		results="${modelos }" 	total="${totalModelos }"
	/>
	<liferay-ui:search-container-row className="br.com.seatecnologia.treinamento.model.Modelo" keyProperty="modeloId" modelVar="modelo" escapedModel="<%=true %>">
		<liferay-ui:search-container-column-text
			name="nome"
			value="${modelo.nome }"
		/>
		<liferay-ui:search-container-column-jsp path="/html/modelos/actions_modelo.jsp" />
	</liferay-ui:search-container-row>
		<liferay-ui:search-iterator />
	
</liferay-ui:search-container>