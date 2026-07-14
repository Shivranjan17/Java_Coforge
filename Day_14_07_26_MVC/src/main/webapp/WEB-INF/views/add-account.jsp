<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Form</title>

<link href = "	https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"  rel="stylesheet">

</head>
<body class="bg-light">

<div class="container mt-5">

    <div class="card shadow">
    
        <div class="card-header bg-primary text-white">
            <h3 class="text-center">Account Registration Form</h3>
        </div>

        <div class="card-body">

            <form action="create" method ="post"

                <div class="mb-3">
                    <label class="form-label">Account Number</label>
                    <input type="number"
                           name="accNo"
                           class="form-control"
                           required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Account Holder Name</label>
                    <input type="text"
                           name="accHolderName"
                           class="form-control"
                           required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Bank Name</label>
                    <input type="text"
                           name="bankName"
                           class="form-control"
                           required>
                </div>

                <div class="mb-3">
                    <label class="form-label">Address</label>
                    <textarea name="address"
                              class="form-control"
                              rows="3"
                              required></textarea>
                </div>

                <div class="mb-3">
                    <label class="form-label">Balance</label>
                    <input type="number"
                           step="0.01"
                           name="balance"
                           class="form-control"
                           required>
                </div>

                <div class="text-center">
                    <button type="submit"
                            class="btn btn-success">
                        Submit
                    </button>

                    <button type="reset"
                            class="btn btn-danger">
                        Reset
                    </button>
                </div>

            </form>

        </div>

    </div>

</div>

</body>
</html>