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

    <title>AJC | Experts</title>

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



<%@ include file="adminHeader.jsp" %>




            <!-- page content -->
            <div class="right_col" role="main">
                <div class="">
                    <div class="page-title">
                        <div class="title_left">
                            <h3>
                    Experts
                   
                </h3>
                        </div>

                        
                    </div>
                    <div class="clearfix"></div>

                    <div class="row">

                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="x_panel">
                                
                                <div class="x_content">
                                    <table id="example" class="table table-striped responsive-utilities jambo_table">
                                     <h4><span style="color:red">${errMsg}</span> <span style="color:Orange">${msg}<span style="color:blue">${remaining}</span> ${msg1}</span></h4>
                                        <thead>
                                            <tr class="headings" colspan="4">
                                            	<th>S/N</th>
                                                <th>Full Name</th>
                                                <th>Skill</th>
                                                <th>Gender</th>
                                                <th>Status</th>
                                                <th>Experience</th>
                                                
                                                <th class=" no-link last" colspan="3" align="center"><span class="nobr">Action</span>
                                                </th>
                                            </tr>
                                        </thead>
										<%int sn=0; %>
                                        <tbody>
                                        <c:forEach items="${expertList}" var="expert">
                                        
                                            <tr class="even pointer">
                                            	<td class=" "><%=++sn %></td> 
                                                <td class=" ">${expert.interview.enrolment.artisan.artisanBioData.lastName } 
                                                			${expert.interview.enrolment.artisan.artisanBioData.firstName }</td>
                                                <td class=" ">${expert.interview.enrolment.artisan.subSkill.name}</td>
                                                <td class=" ">${expert.interview.enrolment.artisan.artisanBioData.gender.genderName }</td>
                                                <td class=" ">${expert.availabilityStatus.availability }</td>
                                                <td class=" ">${expert.interview.enrolment.yearsOfExperience}</td> 
                                                
                                                
                                                 
                                                <td class=" last"><a href="<spring:url value="/service/assign-expert/${expert.expertId}"/>" class="btn btn-info btn-xs"><i class="fa fa-pencil"></i>Assign to Request</a>
                                                </td>
                                                <td class=" last"><a href="<spring:url value="/experts/view/${expert.expertId}"/>" class="btn btn-warning btn-xs"><i class="fa fa-eye"></i>view Details</a>
                                                </td>
                                                 
                                            </tr>
                                            </c:forEach>
                                            <% sn=0; %>
                        
                                            
                                        
                                        </tbody>

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