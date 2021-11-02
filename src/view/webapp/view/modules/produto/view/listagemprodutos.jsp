<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<jsp:include page="../../../components/layouttopo.jsp"></jsp:include>
<div>
	<h1>Listagem de Produtos</h1>
</div>
<div>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>C&oacute;digo</th>
				<th>Descri&ccedil;&atilde;o</th>
				<th>Valor</th>
				<th>Alterar</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listaProdutos}" var="produto">
				<tr>
					<td>${produto.getCodigo()}</td>
					<td>${produto.getDescricao()}</td>
					<td>${produto.getValor()}</td>
					<td><a href="/alteracaoproduto?codigo=${produto.getCodigo()}">
							Alterar</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<jsp:include page="../../../components/layoutrodape.jsp"></jsp:include>