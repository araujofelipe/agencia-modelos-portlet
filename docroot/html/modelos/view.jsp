<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<portlet:actionURL name="adicionarModelo" var="adicionarModeloURL" />
<%  %>
<form name='<portlet:namespace/>fm' method="post" action="<%= adicionarModeloURL.toString() %>">
	Nome: <input type="text" name='<portlet:namespace/>nome' /> <br/>
	Idade: <input type="text" name='<portlet:namespace/>idade' /> <br/>
	Altura: <input type="text" name='<portlet:namespace/>altura' /><br/>
	Peso: <input type="text" name='<portlet:namespace/>peso' /><br/>
	Etnia: <select name='<portlet:namespace/>etnia'>
		<option value="1">Loira</option>
		<option value="1">Morena</option>
		<option value="3">Ruiva</option>
		<option value="4">Asiática</option>
	</select><br/>
	<input type="submit" name='<portlet:namespace/>submit'/>
</form>