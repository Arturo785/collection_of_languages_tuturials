

<%--Has to have the same name as in bottonNavigation--%>
<div class="modal fade" id="addClientModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">
                    Add Client
                </h5>
                <button class="close" data-dismiss="modal">
                    <span>
                        &times;
                    </span>
                </button>
            </div>

            <form action="${pageContext.request.contextPath}/ServletController?action=insert" method="POST"
                class="was-validated">

                <div class="modal-body">

                    <div class="form-group">
                        <label for="name">Name</label>
                        <input type="text" class="form-control" id="name" name="name" required>
                    </div>

                    <div class="form-group">
                        <label for="lastname">Lastname</label>
                        <input type="text" class="form-control" id="lastname" name="lastname" required>
                    </div>

                    <div class="form-group">
                        <label for="email">email</label>
                        <input type="email" class="form-control" id="email" name="email" required>
                    </div>

                    <div class="form-group">
                        <label for="phone">phone</label>
                        <input type="number" class="form-control" id="phone" name="phone" required>
                    </div>

                    <div class="form-group">
                        <label for="amount">amount</label>
                        <input type="number" class="form-control" id="amount" name="amount" required>
                    </div>

                </div>

                <%--Modal footer--%>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="submit">
                        Save
                    </button>
                </div>
                <%--END Modal footer--%>

            </form>

        </div>
    </div>
</div>
