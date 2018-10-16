<%--
  Created by IntelliJ IDEA.
  User: nguyenkhanhtung
  Date: 10/16/18
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <div>
    <h1>Product Discount Calculator</h1>
    <form method="post" action="/display-discount">
      Product Description: <input type="text" name="description">
      List Price:<input type="text" name="price">
      Discount Percent:<input type="text" name="discount">
      <button type="submit">Calculate Discount</button>
    </form>
  </div>
  </body>
</html>
