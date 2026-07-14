<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Information</title>
<link href = "	https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"  rel="stylesheet">
</head>
<body>

<div class="container mt-5">

    <h2 class="text-center text-primary mb-4">
        Account Details
    </h2>

    <table class="table table-bordered table-striped table-hover">

        <tr>
            <th>Account Number</th>
            <td>${account.accNo}</td>
        </tr>

        <tr>
            <th>Account Holder Name</th>
            <td>${account.accHolderName}</td>
        </tr>

        <tr>
            <th>Bank Name</th>
            <td>${account.bankName}</td>
        </tr>

        <tr>
            <th>Address</th>
            <td>${account.address}</td>
        </tr>

        <tr>
            <th>Balance</th>
            <td>${account.balance}</td>
        </tr>

    </table>

    <a href="${pageContext.request.contextPath}/accounts"
       classml>