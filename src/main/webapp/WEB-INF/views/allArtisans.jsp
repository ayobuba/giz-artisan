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

    <title>GIZ! | Artisan</title>

    <!-- Bootstrap core CSS -->

    <link href="<spring:url value="/resources/admin/assets/css/bootstrap.min.css"/>" rel="stylesheet">

    <link href="<spring:url value="/resources/admin/assets/fonts/css/font-awesome.min.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/assets/css/animate.min.css"/>" rel="stylesheet">

    <!-- Custom styling plus plugins -->
    <link href="<spring:url value="/resources/admin/assets/css/custom.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/assets/css/icheck/flat/green.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/assets/css/datatables/tools/css/dataTables.tableTools.css"/>" rel="stylesheet">

    <script src="<spring:url value="/resources/assets/admin/js/jquery.min.js"/>"></script>

    <!--[if lt IE 9]>
        <script src="../assets/js/ie8-responsive-file-warning.js"></script>
        <![endif]-->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->



<%@ include file="adminHeader.jsp" %>



            <!-- page content -->
            <div class="right_col" role="main">
                <div class="">
                    <div class="page-title">
                        <div class="title_left">
                            <h3>
                  EXPERTS
                    
                </h3>
                        </div>

                        
                    </div>
                    <div class="clearfix"></div>

                    <div class="row">

                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="x_panel">
                                
                                <div class="x_content">
                                    <table id="example" class="table table-striped responsive-utilities jambo_table " colspan="3">
                                        <thead>
                                            <tr class="headings" colspan="3">
                                                
                                                <th>S/N </th>
                                                <th>Skill</th>
                                                <th>First Name </th>
                                                <th>Last Name</th>
                                                <th>Email</th>
                                                <th class=" no-link last" colspan="3"><span class="nobr">Action</span>
                                                </th>
                                            </tr>
                                        </thead>

										<c:forEach items="${artisanList }" var="artisan">
                                        <tbody>
                                            <tr class="even pointer">
                                                
                                                <td class=" "></td>
                                               <td class=" ">${artisan.subSkill.name} </td>
                                                <td class=" ">${artisan.artisanBioData.firstName} </td>
                                                <td class=" ">${artisan.artisanBioData.lastName} <i class="success fa fa-long-arrow-up"></i>
                                                </td>
                                                <td class=" ">${artisan.artisanBioData.email.emailAddress}</td>
                                                
                                                <td class=" last"><a class="btn btn-primary btn-xs" href="artisanProfile.html"><i class="fa fa-folder"></i> View </a>
                                                </td>
                                                <td class=" last"><a class="btn btn-danger btn-xs" href="<spring:url value="/artisan/delete/${artisan.sid}"/>"><i class="fa fa-folder"></i> Delete </a>
                                                </td>
                                            </tr>
                                            

                                        </tbody>
                                        </c:forEach>

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
                    "dom": 'T<"clear">lfrtip',
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