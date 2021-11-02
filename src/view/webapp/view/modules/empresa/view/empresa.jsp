<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<jsp:include page="../../../components/layouttopo.jsp"></jsp:include>
<div class="row">
	<h1>Empresa</h1>
</div>
<div class="row">
	<p>A Empresa Master Software ME atua no desenvolvimento de
		aplicações Web em Java.</p>
	<p>Colaboradora: ${colaboradora}</p>

	<!-- Card -->
	<jsp:include page="../components/card.jsp"></jsp:include>
</div>
<jsp:include page="../../../components/layoutrodape.jsp"></jsp:include>