<%@ page contentType="text/html; charset=UTF-8" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %>

<%@page import="br.com.seatecnologia.treinamento.service.ModeloLocalServiceUtil"%>
<%@page import="br.com.seatecnologia.treinamento.model.Modelo"%>
<%@page import="com.liferay.portal.kernel.util.GetterUtil"%>
<%@page import="com.liferay.portal.kernel.dao.search.ResultRow"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
                                                          <%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portal.kernel.language.LanguageUtil"%>


<%@ page import="java.util.List" %>

<liferay-theme:defineObjects />
<portlet:defineObjects />
<% String redirect = ParamUtil.getString(request,"redirect", PortalUtil.getCurrentURL(request)); %>

