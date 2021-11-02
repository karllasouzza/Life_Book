<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<jsp:include page="../../../components/layouttopo.jsp"></jsp:include>
<div class="row">
	<h1>Altera&ccedil;&atilde;o de Produto</h1>
</div>
<div class="row">
	<form method="POST" action="/alterarproduto">
		<div class="mb-3">
			<label for="codigo" class="form-label">Código</label> <input
				type="text" id="codigo" name="codigo" class="form-control"
				value="${produto.getCodigo()}" readonly /> <input type="hidden"
				name="cod" value="${produto.getCodigo()}" />
		</div>
		<div class="mb-3">
			<label for="descricao" class="form-label">Descrição</label> <input
				type="text" id="descricao" name="descricao" class="form-control"
				value="${produto.getDescricao()}" />
		</div>
		<div class="mb-3">
			<label for="valor" class="form-label">Valor</label> <input
				type="text" id="valor" name="valor" class="form-control"
				value="${produto.getValor()}" />
		</div>
		<button type="submit" class="btn btn-primary">Alterar</button>
	</form>
</div>
<jsp:include page="../../../components/layoutrodape.jsp"></jsp:include>