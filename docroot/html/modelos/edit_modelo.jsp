<%@include file="/html/init.jsp" %>

<%
long modeloId = ParamUtil.getLong(request,"modeloId");
Modelo modelo = null;
if(modeloId != 0l) {
	modelo = ModeloLocalServiceUtil.getModelo(modeloId);
}


%>

<liferay-ui:header backURL="<%= redirect %>"  title='<%= (modelo != null) ? modelo.getNome() : "new-model" %>' showBackURL="true" />
<aui:model-context bean="<%= modelo %>" model="<%= Modelo.class %>" />

<portlet:actionURL name='<%= modelo == null ? "adicionarModelo" : "atualizarModelo" %>' var="editModeloURL" windowState="normal">
		<portlet:param name="redirect" value="<%=redirect.toString() %>" />
</portlet:actionURL>


<aui:form name='fm' method="post" action="<%= editModeloURL.toString() %>">
	<aui:fieldset>
		<aui:input type="hidden"  name="modeloId" id="modeloId" value='<%= modelo == null ? ""  : modelo.getModeloId() %>' />
		<aui:input type="text"  name="nome" id="nome" label="Nome" value='<%= modelo == null ? ""  : modelo.getNome() %>' >
			<aui:validator name="required" errorMessage='<%= LanguageUtil.get(themeDisplay.getLocale(), "model-nome-required") %>' />
		</aui:input>
		
	<%-- Idade: <input type="text" name='<portlet:namespace/>idade' /> <br/>
	Altura: <input type="text" name='<portlet:namespace/>altura' /><br/>
	Peso: <input type="text" name='<portlet:namespace/>peso' /><br/>
	Etnia: <select name='<portlet:namespace/>etnia'>
		<option value="1">Loira</option>
		<option value="1">Morena</option>
		<option value="3">Ruiva</option>
		<option value="4">Asiática</option>
	</select><br/> --%>
	<aui:button type="submit" />
	</aui:fieldset>
</aui:form>