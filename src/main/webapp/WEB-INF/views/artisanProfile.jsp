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

    <title>GIZ! | Artisan Profile</title>

    <!-- Bootstrap core CSS -->

    <link href="<spring:url value="/resources/admin/assets/css/bootstrap.min.css"/>" rel="stylesheet">

    <link href="<spring:url value="/resources/admin/assets/fonts/css/font-awesome.min.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/assets/css/animate.min.css"/>" rel="stylesheet">

    <!-- Custom styling plus plugins -->
    <link href="<spring:url value="/resources/admin/assets/css/custom.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/assets/css/icheck/flat/green.css"/>" rel="stylesheet">


    <script src="<spring:url value="/resources/admin/assets/js/jquery.min.js"/>"></script>

   

 
<%@ include file="adminHeader.jsp" %>



            <!-- page content -->
            <div class="right_col" role="main">

                <div class="">
                    <div class="page-title">
                        <div class="title_left">
                            <h3>Artisan Profile</h3>
                        </div>

                        
                    </div>
                    <div class="clearfix"></div>

                    <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="x_panel">
                                <div class="x_title">
                                    <h2>${artisan.artisan.artisanBioData.lastName}, ${artisan.artisan.artisanBioData.firstName}</h2>
                                    
                                    <div class="clearfix"></div>
                                </div>
                                <div class="x_content">

                                    <div class="col-md-3 col-sm-3 col-xs-12 profile_left">

                                        <div class="profile_img">

                                            <!-- end of image cropping -->
                                            <div id="crop-avatar">
                                                <!-- Current avatar -->
                                                <div class="avatar-view" title="Client's Images">
                                                    <img src="<spring:url value="/resources/admin/assets/images/user.png"/>" alt="Artisan Picture">
                                                </div>

                                                <!-- Cropping modal -->
                                               
                                            </div>
                                            <!-- end of image cropping -->

                                        </div>
                                        

                                        <ul class="list-unstyled user_data">
                                             <li><i class=""></i><h2>First Name</h2> ${artisan.artisan.artisanBioData.firstName}
                                            </li>

                                             <li><i class=""></i><h2>Last Name</h2> ${artisan.artisan.artisanBioData.lastName}
                                            </li>
                                             <li><i class=""></i><h2>Marital Status</h2> ${artisan.maritalStatus.status}
                                            </li>

                                            
                                        </ul>

                                       <!--  <a class="btn btn-success" href="artisanGallery.html"><i class="fa fa-edit m-right-xs"></i>View Gallery</a> -->
                                        <br />

                                        <!-- start skills -->
                                        <h2>Skill</h2>
                                        <ul class="list-unstyled user_data">
                                            <li>
                                                <p>${artisan.artisan.subSkill.name}</p>
                                                <div class="progress progress_sm">
                                                    <div class="progress-bar bg-green" role="progressbar" data-transitiongoal="50"></div>
                                                </div>
                                            </li>
                                           
                                        </ul>
                                        <!-- end of skills -->

                                    </div>
                                    <div class="col-md-9 col-sm-9 col-xs-12">

                                        <div class="profile_title">
                                            <div class="col-md-6">
                                                <h2>Artisan Profile</h2>
                                            </div>
                                            <div class="col-md-6">
                                                
                                            </div>
                                        </div>


                                       

                                        <div class="" role="tabpanel" data-example-id="togglable-tabs">
                                            <ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
                                                <li role="presentation" class="active"><a href="#tab_content1" id="home-tab" role="tab" data-toggle="tab" aria-expanded="true">Contact Details</a>
                                                </li>
                                                <li role="presentation" class=""><a href="#tab_content2" role="tab" id="profile-tab" data-toggle="tab" aria-expanded="false">Guarantor Details</a>
                                                </li>
                                                <li role="presentation" class=""><a href="#tab_content3" role="tab" id="profile-tab2" data-toggle="tab" aria-expanded="false">Next of Kin Details</a>
                                                </li>
                                            </ul>
                                            <div id="myTabContent" class="tab-content">
                                                <div role="tabpanel" class="tab-pane fade active in" id="tab_content1" aria-labelledby="home-tab">

                                                    <!-- start recent activity -->
                                                    <ul class="messages">
                                                       
                                                          
                                                           
                                                            <div class="message_wrapper">
                                                                <h4 class="heading">Phone Number</h4>
                                                                <blockquote class="message">${artisan.artisan.artisanBioData.phoneNumber.number}</blockquote>
                                                                <br />
                                                               
                                                            </div>
                                                       
                                                       
                                                        <div class="message_wrapper">
                                                                <h4 class="heading">State of Residence</h4>
                                                                <blockquote class="message">${artisan.artisan.artisanBioData.address.lga.state.stateName}</blockquote>
                                                                <br />
                                                                
                                                        </div>

                                                         <div class="message_wrapper">
                                                                <h4 class="heading">Local Government Area</h4>
                                                                <blockquote class="message">${artisan.artisan.artisanBioData.address.lga.name}</blockquote>
                                                                <br />
                                                                
                                                        </div>

                                                         <div class="message_wrapper">
                                                                <h4 class="heading">Residential Address</h4>
                                                                <blockquote class="message">${artisan.artisan.artisanBioData.address.description}</blockquote>
                                                                <br />
                                                                
                                                        </div>

                                                    </ul>
                                                    <!-- end recent activity -->

                                                </div>
                                                <div role="tabpanel" class="tab-pane fade" id="tab_content2" aria-labelledby="profile-tab">

                                                    <!-- start recent activity -->
                                                    <ul class="messages">
                                                       
                                                          
                                                           
                                                            <div class="message_wrapper">
                                                                <h4 class="heading">First Name</h4>
                                                                <blockquote class="message">${artisan.guarantor.bioData.firstName}</blockquote>
                                                                <br />
                                                               
                                                            </div>
                                                       
                                                       
                                                        <div class="message_wrapper">
                                                                <h4 class="heading">Last Name</h4>
                                                                <blockquote class="message">${artisan.guarantor.bioData.lastName}</blockquote>
                                                                <br />
                                                                
                                                        </div>

                                                         <div class="message_wrapper">
                                                                <h4 class="heading">Mobile Number</h4>
                                                                <blockquote class="message">${artisan.guarantor.bioData.phoneNumber.number}</blockquote>
                                                                <br />
                                                                
                                                        </div>

                                                         <div class="message_wrapper">
                                                                <h4 class="heading">Address</h4>
                                                                <blockquote class="message">${artisan.guarantor.bioData.address.description}</blockquote>
                                                                <br />
                                                                
                                                        </div>

                                                    </ul>
                                                    <!-- end recent activity -->

                                                </div>
                                                <div role="tabpanel" class="tab-pane fade" id="tab_content3" aria-labelledby="profile-tab">
                                                     <ul class="messages">
                                                       
                                                          
                                                           
                                                            <div class="message_wrapper">
                                                                <h4 class="heading">First Name</h4>
                                                                <blockquote class="message">${artisan.nok.bioData.firstName}</blockquote>
                                                                <br />
                                                               
                                                            </div>
                                                       
                                                       
                                                        <div class="message_wrapper">
                                                                <h4 class="heading">Last Name</h4>
                                                                <blockquote class="message">${artisan.nok.bioData.lastName}</blockquote>
                                                                <br />
                                                                
                                                        </div>

                                                         <div class="message_wrapper">
                                                                <h4 class="heading">Mobile Number</h4>
                                                                <blockquote class="message">${artisan.nok.bioData.phoneNumber.number }</blockquote>
                                                                <br />
                                                                
                                                        </div>

                                                         <div class="message_wrapper">
                                                                <h4 class="heading">Address</h4>
                                                                <blockquote class="message">${artisan.nok.bioData.address.description}</blockquote>
                                                                <br />
                                                                
                                                        </div>

                                                    </ul>
                                                    <!-- end recent activity -->
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
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

    <!-- image cropping -->
    <script src="<spring:url value="/resources/admin/assets/js/cropping/cropper.min.js"/>"></script>
    <script src="<spring:url value="/resources/admin/assets/js/cropping/main.js"/>"></script>

    
    <!-- daterangepicker -->
    <script type="text/javascript" src="<spring:url value="/resources/admin/assets/js/moment.min.js"/>"></script>
    <script type="text/javascript" src="<spring:url value="/resources/admin/assets/js/datepicker/daterangepicker.js"/>"></script>
    <!-- moris js -->
    <script src="<spring:url value="/resources/admin/assets/js/moris/raphael-min.js"/>"></script>
    <script src="<spring:url value="/resources/admin/assets/js/moris/morris.js"/>"></script>
    <script>
        $(function () {
            var day_data = [
                {
                    "period": "Jan",
                    "Hours worked": 80
                },
                {
                    "period": "Feb",
                    "Hours worked": 125
                },
                {
                    "period": "Mar",
                    "Hours worked": 176
                },
                {
                    "period": "Apr",
                    "Hours worked": 224
                },
                {
                    "period": "May",
                    "Hours worked": 265
                },
                {
                    "period": "Jun",
                    "Hours worked": 314
                },
                {
                    "period": "Jul",
                    "Hours worked": 347
                },
                {
                    "period": "Aug",
                    "Hours worked": 287
                },
                {
                    "period": "Sep",
                    "Hours worked": 240
                },
                {
                    "period": "Oct",
                    "Hours worked": 211
                }
    ];
            Morris.Bar({
                element: 'graph_bar',
                data: day_data,
                xkey: 'period',
                hideHover: 'auto',
                barColors: ['#26B99A', '#34495E', '#ACADAC', '#3498DB'],
                ykeys: ['Hours worked', 'sorned'],
                labels: ['Hours worked', 'SORN'],
                xLabelAngle: 60
            });
        });
    </script>
    <!-- datepicker -->
    <script type="text/javascript">
        $(document).ready(function () {

            var cb = function (start, end, label) {
                console.log(start.toISOString(), end.toISOString(), label);
                $('#reportrange span').html(start.format('MMMM D, YYYY') + ' - ' + end.format('MMMM D, YYYY'));
                //alert("Callback has fired: [" + start.format('MMMM D, YYYY') + " to " + end.format('MMMM D, YYYY') + ", label = " + label + "]");
            }

            var optionSet1 = {
                startDate: moment().subtract(29, 'days'),
                endDate: moment(),
                minDate: '01/01/2012',
                maxDate: '12/31/2015',
                dateLimit: {
                    days: 60
                },
                showDropdowns: true,
                showWeekNumbers: true,
                timePicker: false,
                timePickerIncrement: 1,
                timePicker12Hour: true,
                ranges: {
                    'Today': [moment(), moment()],
                    'Yesterday': [moment().subtract(1, 'days'), moment().subtract(1, 'days')],
                    'Last 7 Days': [moment().subtract(6, 'days'), moment()],
                    'Last 30 Days': [moment().subtract(29, 'days'), moment()],
                    'This Month': [moment().startOf('month'), moment().endOf('month')],
                    'Last Month': [moment().subtract(1, 'month').startOf('month'), moment().subtract(1, 'month').endOf('month')]
                },
                opens: 'left',
                buttonClasses: ['btn btn-default'],
                applyClass: 'btn-small btn-primary',
                cancelClass: 'btn-small',
                format: 'MM/DD/YYYY',
                separator: ' to ',
                locale: {
                    applyLabel: 'Submit',
                    cancelLabel: 'Clear',
                    fromLabel: 'From',
                    toLabel: 'To',
                    customRangeLabel: 'Custom',
                    daysOfWeek: ['Su', 'Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa'],
                    monthNames: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
                    firstDay: 1
                }
            };
            $('#reportrange span').html(moment().subtract(29, 'days').format('MMMM D, YYYY') + ' - ' + moment().format('MMMM D, YYYY'));
            $('#reportrange').daterangepicker(optionSet1, cb);
            $('#reportrange').on('show.daterangepicker', function () {
                console.log("show event fired");
            });
            $('#reportrange').on('hide.daterangepicker', function () {
                console.log("hide event fired");
            });
            $('#reportrange').on('apply.daterangepicker', function (ev, picker) {
                console.log("apply event fired, start/end dates are " + picker.startDate.format('MMMM D, YYYY') + " to " + picker.endDate.format('MMMM D, YYYY'));
            });
            $('#reportrange').on('cancel.daterangepicker', function (ev, picker) {
                console.log("cancel event fired");
            });
            $('#options1').click(function () {
                $('#reportrange').data('daterangepicker').setOptions(optionSet1, cb);
            });
            $('#options2').click(function () {
                $('#reportrange').data('daterangepicker').setOptions(optionSet2, cb);
            });
            $('#destroy').click(function () {
                $('#reportrange').data('daterangepicker').remove();
            });
        });
    </script>
    <!-- /datepicker -->
</body>

</html>