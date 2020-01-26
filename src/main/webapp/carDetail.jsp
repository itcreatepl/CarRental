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
                    <form>formularz</form>

                </div>
            </div>
        </div>
    </section>

<c:if test="${not empty carModel}">
    <section class="section-sm">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="mt-5 mb-5 mt-md-0">
                        <h2> <c:out value="${carModel.getName()}"/></h2>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-5">
                    <img src="<c:out value="${carModel.getPhotoDirectory()}"/>">

                </div>
                <div class="col-md-7">
                    <p><c:out value="${carModel.getCarMark()}"/></p>
                    <p><c:out value="${carModel.getCarType()}"/></p>
                    <h4><c:out value="${carModel.getDailyCost()}"/>/day</h4>
                </div>

            </div>
        </div>
    </section>
</c:if>

</main>

<%@include file="../footer.jsp" %>
</body>

</html>