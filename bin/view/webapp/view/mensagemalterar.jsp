<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<jsp:include page="layouttopo.jsp"></jsp:include>
	<div class="row">
		<h3>Mensagem</h3>
	</div>
	<div class="row">	
		<p>
			${texto}
		</p>
	</div>
	<script type="text/javascript">
		setTimeout(() => {
			window.location = "http://localhost:9000/listarprodutos";
		}, 2000);
	</script>
<jsp:include page="layoutrodape.jsp"></jsp:include>