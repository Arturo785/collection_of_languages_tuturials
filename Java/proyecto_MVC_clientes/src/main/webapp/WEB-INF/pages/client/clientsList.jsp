<%--
  Created by IntelliJ IDEA.
  User: Arturo
  Date: 21/12/2020
  Time: 1:57
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_MX"/>

<section id="clients">
    <div class="container">
        <div class="row">
            <div class="col-md-9">
                <div class="card">
                    <div class="card-header">
                        <h4>Clients List</h4>
                    </div>
                    <table class="table table-striped">
                        <thead class="thead-dark">
                            <tr>
                                <th>#</th>
                                <th>Name</th>
                                <th>Amount</th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <%--comes from the servletController--%>
                            <c:forEach var="client" items="${clients}" varStatus="status">
                                <tr>
                                    <td>${status.count}</td>
                                    <td>${client.name} ${client.lastname}</td>
                                    <td><fmt:formatNumber value="${client.amount}" type="currency"/> </td>
                                    <td>
                                        <a href="${pageContext.request.contextPath}/ServletController?action=edit&idClient=${client.idClient}"
                                           class="btn btn-secondary"> <i class="fas fa-angle-double-right"> </i> Edit </a>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>

            <%-- Lateral cards--%>
            <div class="col-md-3">
                <div class="card text-center bg-danger text-white mb-3">
                    <div class="card-body">
                        <h3>Total amount</h3>
                        <h4 class="display-4">
                            <fmt:formatNumber value="${totalAmount}" type="currency" />
                        </h4>
                    </div>
                </div>

                <%--Second card--%>
                <div class="card text-center bg-success text-white mb-3">
                    <div class="card-body">
                        <h3>Clients total</h3>
                        <h4 class="display-4">
                            <i class="fas fa-users"></i> ${clientsTotal}
                        </h4>
                    </div>
                </div>
                <%--END second card--%>
            </div>
            <%-- end Lateral cards--%>

        </div>
    </div>
</section>


<%--Add client modal--%>
<jsp:include page="/WEB-INF/pages/client/addClient.jsp"/>
