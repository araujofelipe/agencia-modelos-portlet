<%@include file="/html/init.jsp" %>

<%
ResultRow row = (ResultRow)request.getAttribute(WebKeys.SEARCH_CONTAINER_RESULT_ROW);
long modeloId = GetterUtil.getLong(row.getPrimaryKey());
Modelo modelo = ModeloLocalServiceUtil.getModelo(modeloId);


%>

<liferay-ui:icon-menu>
		<portlet:renderURL var="editURL">
			<portlet:param name="jspPage" value="/html/modelos/edit_modelo.jsp" />
			<portlet:param name="modeloId" value="<%= String.valueOf(modeloId) %>" />
			<portlet:param name="redirect" value="<%= redirect %>" />
		</portlet:renderURL>
		<liferay-ui:icon image="edit" url="<%=editURL.toString() %>" />
		<portlet:actionURL name="deleteModelo" var="deleteURL">
			<portlet:param name="modeloId" value="<%= String.valueOf(modeloId) %>" />
			<portlet:param name="redirect" value="<%= redirect %>" />
		</portlet:actionURL>
		<liferay-ui:icon-delete url="<%=deleteURL.toString() %>" />
</liferay-ui:icon-menu>