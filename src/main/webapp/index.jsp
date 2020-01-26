<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import=" java.util.* " %>
<%@ page isELIgnored="false" %>
<%@include file="../header.jsp" %>
    <main>
        <!-- Hero -->
        <section class="section section-lg bg-secondary bg-main text-white overflow-hidden z-2">
            <div class="container z-2">
                <div class="row justify-content-center text-center pt-6 pt-md-5 pb-0 mb-2">
                    <div class="col-lg-8 col-xl-8">
                        <h1 class="display-2 font-weight-light mb-3">Select Date<span class="font-weight-bolder ml-3"> & Search Car</span></h1>
							<form class="form-inline" action="search" method="post">
                                <div class="row">
                                    <div class="col-md-6"><div class="form-group">
                                        <select class="custom-select" name="fromLocation">
                                            <option>Pickup location</option>
                                            <c:forEach items="${allLocation}" var="location">
                                                <option value="${location.idLocation}">${location.name}</option>
                                            </c:forEach>
                                        </select>
                                    </div></div>
                                    <div class="col-md-6"><div class="form-group">
                                        <select class="custom-select" name="toLocation">
                                            <option>Back location</option>
                                            <c:forEach items="${allLocation}" var="location">
                                                <option value="${location.idLocation}">${location.name}</option>
                                            </c:forEach>
                                        </select>
                                    </div></div>
                                    <div class="col-md-6"><div class="form-group">
                                        <input id="dateStart" type="text" placeholder="From date" class="form-control" name="dateFrom">
                                    </div></div>
                                    <div class="col-md-6"><div class="form-group">
                                        <input id="dateEnd" type="text" placeholder="To date" class="form-control" name="dateTo">
                                    </div></div>
                                </div>

                                <button type="submit" class="btn btn-primary mb-2">Search</button>
                            </form>
                    </div>
                </div>
            </div>
        </section>
        <section class="section-sm">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="mt-5 mb-5 mt-md-0">
                            <h4>Cars</h4>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <c:forEach items="${allCarModels}" var="carmodel">
                    <div class="col-md-6 col-lg-4">
                        <div class="blog-card">
                            <div class="card shadow-soft border-light">
                                <a href="${pageContext.request.contextPath}/car?id=${carmodel.idModel}">
                                <img src="${carmodel.photoDirectory}" class="card-img-top" alt="${carmodel.carMark} ${carmodel.name}">
                                </a>
                                <div class="card-header">
                                    <div class="post-meta d-block">
                                        <span class="small text-gray"><i class="fa fa-car mr-2"></i>${carmodel.carType}</span>
                                    </div>
                                </div>
                                <div class="card-body pt-0">
                                    <a href="${pageContext.request.contextPath}/car?id=${carmodel.idModel}">
                                        <h4>${carmodel.carMark} ${carmodel.name}</h4>
                                    </a>
                                </div>
                                <div class="card-footer mx-4 px-0 pt-0">
                                    <a class="btn btn-sm btn-secondary" href="${pageContext.request.contextPath}/car?id=${carmodel.idModel}">
                                        Read More
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>
                    </c:forEach>
                </div>
            </div>
        </section>
    </main>
<%@include file="../footer.jsp" %>
</body>

</html>