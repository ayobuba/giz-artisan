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

    <title>AJC | Interviewees</title>

    <!-- Bootstrap core CSS -->

    <link href="<spring:url value="/resources/admin/assets/css/bootstrap.min.css"/>" rel="stylesheet">

    <link href="<spring:url value="/resources/admin/assets/fonts/css/font-awesome.min.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/assets/css/animate.min.css"/>" rel="stylesheet">

    <!-- Custom styling plus plugins -->
    <link href="<spring:url value="/resources/admin/assets/css/custom.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/assets/css/icheck/flat/green.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/assets/css/datatables/tools/css/dataTables.tableTools.css"/>" rel="stylesheet">

    <script src="<spring:url value="/resources/admin/assets/js/jquery.min.js"/>"></script>
    <script type="text/javascript">

    $(function () {
        $("#inputFile").change(function () {
            readURL(this);
        });
    });


    function readURL(input) {
        if (input.files && input.files[0]) {
            var reader = new FileReader();

            reader.onload = function (e) {
                //alert(e.target.result);
                $('#imgLogo').attr('src', e.target.result);
            }

            reader.readAsDataURL(input.files[0]);
        }
    }

</script>

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
                    Interviewees
                   
                </h3>
                        </div>

                        
                    </div>
                    <div class="clearfix"></div>

                    <div class="row">

                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="x_panel">
                                <h5><span style="color:green">${msg}</span><span style="color:red">${errMsg}</span></h5>
                                <div class="x_content">
                                    <table id="example" class="table table-striped responsive-utilities jambo_table">
                                        <thead>
                                            <tr class="headings" colspan="4">
                                            	<th>S/N</th>
                                                <th>Last Name</th>
                                                <th>First Name </th>
                                                <th>Gender</th>
                                                <th>Status</th>
                                                <th>Experience</th>
                                                
                                                <th class=" no-link last" colspan="3" align="center"><span class="nobr">Action</span>
                                                </th>
                                            </tr>
                                        </thead>
										<%int sn=0; %>
                                        <tbody>
                                        <c:forEach items="${invitedList}" var="interview">
                                        <span>${upload}</span>
                                            <tr class="even pointer">
                                            	<td class=" "><%=++sn %></td>
                                                <td class=" ">${interview.enrolment.artisan.artisanBioData.lastName }</td>
                                                <td class=" ">${interview.enrolment.artisan.artisanBioData.firstName }</td>
                                                <td class=" ">${interview.enrolment.artisan.artisanBioData.gender.genderName }</td>
                                                <td class=" ">${interview.enrolment.maritalStatus.status }</td>
                                                <td class=" ">${interview.enrolment.yearsOfExperience}</td> 
                                                
                                                
                                                 <td class=" last"><a href="<spring:url value="/enrol/promote/${interview.interviewId}"/>" class="btn btn-success btn-xs"><i class="fa fa-pencil"></i>Make Expert</a>
                                                </td>
                                                <%-- <td class=" last"><a href="<spring:url value="/enrol/promote/${interview.interviewId}"/>" class="btn btn-success btn-xs" data-toggle="modal" data-target=".bs-example-modal-sm"><i class="fa fa-folder"></i>Make Expert</a>
                                                </td> --%>
                                                 
                                            </tr>
                                            </c:forEach>
                                            <% sn=0; %>
                        
                                            
                                        
                                        </tbody>

                                    </table>
                                </div>
                                
                                <!--start modal form-->
                                
                                
 <div class="modal fade bs-example-modal-sm" tabindex="-1" role="dialog" aria-hidden="true">
                                   <div class="modal-dialog modal-sm">
                                        <div class="modal-content">
                                    <form method="POST" action="<spring:url value="/enrol/expert/${interview.interviewId}"/>" enctype="multipart/form-data">
                                            <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">×</span>
                                                </button>
                                                <h4 class="modal-title" id="myModalLabel2">Upload Artisan Picture</h4>
                                            </div>

                                            <div class="modal-body">
                                                 <div class="form-group">
                                                     <div align="center">
                                                         <img src="<spring:url value="/resources/admin/assets/images/user.png"/>" id="imgLogo" style="height:140px; width:150px">
                                                         <br/>
                                                         <input type="file" name="image" id="inputFile">
                                                     </div>
                                                 </div>
                                            </div>
                                            <div class="modal-footer">
                                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                                <button type="submit" class="btn btn-primary">Make Expert</button>
                                            </div>
                                        </form>
                                        </div>
                                    </div>
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