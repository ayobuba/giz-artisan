<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>AJC! | Pending Request</title>

    <!-- Bootstrap core CSS -->

    <link href="<spring:url value="/resources/admin/assets/css/bootstrap.min.css"/>" rel="stylesheet">

    <link href="<spring:url value="/resources/admin/assets/fonts/css/font-awesome.min.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/assets/css/animate.min.css"/>" rel="stylesheet">

    <!-- Custom styling plus plugins -->
    <link href="<spring:url value="/resources/admin/assets/css/custom.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/assets/css/icheck/flat/green.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/assets/css/datatables/tools/css/dataTables.tableTools.css"/>" rel="stylesheet">

    <script src="<spring:url value="/resources/admin/assets/js/jquery.min.js"/>"></script>

    <!--[if lt IE 9]>
        <script src="../assets/js/ie8-responsive-file-warning.js"></script>
        <![endif]-->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

<script type="text/javascript">
    function toggle(source) {
  checkboxes = document.getElementsByName('requestCheck');
  for(var i=0, n=checkboxes.length;i<n;i++) {
    checkboxes[i].checked = source.checked;
  }
}
</script>



<%@ include file="adminHeader.jsp" %>
    

            <!-- page content -->
            <div class="right_col" role="main">
                <div class="">
                    <div class="page-title">
                        <div class="title_left">
                            <h3>
                    Pending Requests
                    
                </h3>
                        </div>

                        
                    </div>
                    <div class="clearfix"></div>

                    <div class="row">

                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="x_panel">
                                <h4><span style="color:blue">${msgOrg} ${msgInd} ${msg}</span></h5>
                                <div class="x_content">
                                    <table id="example" class="table table-striped responsive-utilities jambo_table">
                                        <thead>
                                            <tr class="headings">
                                                
                                                <th>S/N </th>
                                                <th>Client</th>
                                                <th>Client Type</th>
                                                <th>No of experts</th>
                                                <th>Service Requested</th>
                                                <th class=" no-link last" colspan="3"><span class="nobr">Action</span>
                                                </th>
                                            </tr>
                                        </thead>
                                        <%int sn=0; %>

							<c:forEach items="${ pendingRequestList}" var="pendingRequest">
                                        <tbody>
                                            <tr class="even pointer">
                                                
                                                <td class=" "><%=++sn %></td>
                                                
                                                <td class=" ">
                                                	${pendingRequest.client.organization.organizationName}
                                                	${pendingRequest.client.clientIndividual.bioData.lastName}
                                                	${pendingRequest.client.clientIndividual.bioData.firstName}
                                                </td>
                                                <td class=" ">${pendingRequest.client.clientType.clientTypeName}</td>
                                                <td class=" ">${pendingRequest.numOfExpertRequest}</td>
                                                <td class=" ">${pendingRequest.subSkill.name}</td>
                                                
                                                <td class=" last"><a href="#" class="btn btn-primary btn-xs">View Request<i class="fa fa-eye"></i></a></td>
                                                <td class=" last"><a href="<spring:url value="/service/approval/${pendingRequest.requestMadeId }"/>" class="btn btn-success btn-xs">Approve<i class="fa fa-pencil"></i></a></td>
                                                <td class=" last"><a href="#" class="btn btn-danger btn-xs">Disapprove<i class="fa fa-trash-o"></i></a></td>
                                            </tr>
                                            

                                        </tbody>
                             </c:forEach>
                             <% sn=0; %>
                                    </table>
                                     
                                </div>
                            </div>
                        </div>

                        <br />
                        <br />
                        <br />

                    </div>
                </div>
                  


<%@ include file="adminFooter.jsp" %>






                    
                </div>
                <!-- /page content -->
            </div>

        </div>

        <div id="custom_notifications" class="custom-notifications dsp_none">
            <ul class="list-unstyled notifications clearfix" data-tabbed_notifications="notif-group">
            </ul>
            <div class="clearfix"></div>
            <div id="notif-group" class="tabbed_notifications"></div>
        </div>

        <script src="<spring:url value="/resources/admin/assets/js/bootstrap.min.js"/>"></script>

        <!-- chart js -->
        <script src="<spring:url value="/resources/admin/assets/js/chartjs/chart.min.js"/>"></script>
        <!-- bootstrap progress js -->
        <script src="<spring:url value="/resources/admin/assets/js/progressbar/bootstrap-progressbar.min.js"/>"></script>
        <script src="<spring:url value="/resources/admin/assets/js/nicescroll/jquery.nicescroll.min.js"/>"></script>
        <!-- icheck -->
        <script src="<spring:url value="/resources/admin/assets/js/icheck/icheck.min.js"/>"></script>

        <script src="<spring:url value="/resources/admin/assets/js/custom.js"/>"></script>


        <!-- Datatables -->
        <script src="<spring:url value="/resources/admin/assets/js/datatables/js/jquery.dataTables.js"/>"></script>
        <script src="<spring:url value="/resources/admin/assets/js/datatables/tools/js/dataTables.tableTools.js"/>"></script>
        <script>
            $(document).ready(function () {
                $('input.tableflat').iCheck({
                    checkboxClass: 'icheckbox_flat-green',
                    radioClass: 'iradio_flat-green'
                });
            });

            var asInitVals = new Array();
            $(document).ready(function () {
                var oTable = $('#example').dataTable({
                    "oLanguage": {
                        "sSearch": "Search all columns:"
                    },
                    "aoColumnDefs": [
                        {
                            'bSortable': false,
                            'aTargets': [0]
                        } //disables sorting for column one
            ],
                    'iDisplayLength': 12,
                    "sPaginationType": "full_numbers",
                   
                    "tableTools": {
                        "sSwfPath": "<?php echo base_url('assets2/js/Datatables/tools/swf/copy_csv_xls_pdf.swf'); ?>"
                    }
                });
                $("tfoot input").keyup(function () {
                    /* Filter on the column based on the index of this element's parent <th> */
                    oTable.fnFilter(this.value, $("tfoot th").index($(this).parent()));
                });
                $("tfoot input").each(function (i) {
                    asInitVals[i] = this.value;
                });
                $("tfoot input").focus(function () {
                    if (this.className == "search_init") {
                        this.className = "";
                        this.value = "";
                    }
                });
                $("tfoot input").blur(function (i) {
                    if (this.value == "") {
                        this.className = "search_init";
                        this.value = asInitVals[$("tfoot input").index(this)];
                    }
                });
            });
        </script>
</body>

</html>