<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<jsp:include page="../../../components/layouttopo.jsp"></jsp:include>
<div class="row">
	<h1>Cadastro de Produto</h1>
</div>
<div class="row">
	<form method="POST" action="/cadastrarproduto">
		<div class="mb-3">
			<label for="descricao" class="form-label">Descrição</label> <input
				type="text" id="descricao" name="descricao" class="form-control" />
		</div>
		<div class="mb-3">
			<label for="valor" class="form-label">Valor</label> <input
				type="text" id="valor" name="valor" class="form-control" />
		</div>
		<button type="submit" class="btn btn-primary">Cadastrar</button>
	</form>
</div>
<jsp:include page="../../../components/layoutrodape.jsp"></jsp:include>