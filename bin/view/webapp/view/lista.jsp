<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="components/layouttopo.jsp"></jsp:include>
	<c:set var="numero" value="9"></c:set>
	<div class="row">
		<h3>Lista de Telefones</h3>
	</div>
	<div class="row">
		<%
			//int numero = 9;
			/*if (numero > 5) {
				out.println("Maior que 5");
			}*/
		%>	
		<c:if test="${numero > 5}">
			Exemplo: Maior que 5	
		</c:if>
				
		<ul>	
			<c:forEach items="${telefones}" var="telefone">
				<li>${telefone}</li>	
			</c:forEach>
		</ul>
	</div>
<jsp:include page="components/layoutrodape.jsp"></jsp:include>