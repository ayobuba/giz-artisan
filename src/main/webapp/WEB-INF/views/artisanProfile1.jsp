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
    <link href="<spring:url value="/resources/admin/css/custom.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/css/icheck/flat/green.css"/>" rel="stylesheet">


    <script src="<spring:url value="/resources/admin/assets/js/jquery.min.js"/>"></script>

    <!--[if lt IE 9]>
        <script src="../assets/js/ie8-responsive-file-warning.js"></script>
        <![endif]-->

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->



            <!-- INCLUDE HEADER HERE -->



            <!-- page content -->
            <div class="right_col" role="main">

                <div class="">
                    <div class="page-title">
                        <div class="title_left">
                            <h3>Artisan Prolfile</h3>
                        </div>

                        
                    </div>
                    <div class="clearfix"></div>

                    <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="x_panel">
                                <div class="x_title">
                                    <h2>{{Full Name of Artisan}} <small>Details</small></h2>
                                    
                                    <div class="clearfix"></div>
                                </div>
                                <div class="x_content">

                                    <div class="col-md-3 col-sm-3 col-xs-12 profile_left">

                                        <div class="profile_img">

                                            <!-- end of image cropping -->
                                            <div id="crop-avatar">
                                                <!-- Current avatar -->
                                                <div class="avatar-view" title="Client's Images">
                                                    <img src="images/picture.jpg" alt="Avatar">
                                                </div>

                                                <!-- Cropping modal -->
                                               
                                            </div>
                                            <!-- end of image cropping -->

                                        </div>
                                        <h3>{{Full Name of Artisan}}</h3>

                                        <ul class="list-unstyled user_data">
                                            <li><i class="fa fa-map-marker user-profile-icon"></i> {{Address of Artisan}}
                                            </li>

                                            <li>
                                                <i class="fa fa-briefcase user-profile-icon"></i> Software Engineer
                                            </li>

                                            <li class="m-top-xs">
                                                <i class="fa fa-external-link user-profile-icon"></i>
                                                <a href="http://www.kimlabs.com/profile/" target="_blank">{{Email Address}}</a>
                                            </li>
                                        </ul>

                                        <a class="btn btn-success" href="artisanGallery.html"><i class="fa fa-edit m-right-xs"></i>View Gallery</a>
                                        <br />

                                        <!-- start skills -->
                                        <h4>{{Skills}}</h4>
                                        <ul class="list-unstyled user_data">
                                            <li>
                                                <p>Web Applications</p>
                                                <div class="progress progress_sm">
                                                    <div class="progress-bar bg-green" role="progressbar" data-transitiongoal="50"></div>
                                                </div>
                                            </li>
                                            <li>
                                                <p>Website Design</p>
                                                <div class="progress progress_sm">
                                                    <div class="progress-bar bg-green" role="progressbar" data-transitiongoal="70"></div>
                                                </div>
                                            </li>
                                            <li>
                                                <p>Automation & Testing</p>
                                                <div class="progress progress_sm">
                                                    <div class="progress-bar bg-green" role="progressbar" data-transitiongoal="30"></div>
                                                </div>
                                            </li>
                                            <li>
                                                <p>UI / UX</p>
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
                                                <h2>User Activity Report</h2>
                                            </div>
                                            <div class="col-md-6">
                                                <div id="reportrange" class="pull-right" style="margin-top: 5px; background: #fff; cursor: pointer; padding: 5px 10px; border: 1px solid #E6E9ED">
                                                    <i class="glyphicon glyphicon-calendar fa fa-calendar"></i>
                                                    <span>December 30, 2014 - January 28, 2015</span> <b class="caret"></b>
                                                </div>
                                            </div>
                                        </div>
                                        <!-- start of user-activity-graph -->
                                        <div id="graph_bar" style="width:100%; height:280px;"></div>
                                        <!-- end of user-activity-graph -->

                                        <div class="" role="tabpanel" data-example-id="togglable-tabs">
                                            <ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
                                                <li role="presentation" class="active"><a href="#tab_content1" id="home-tab" role="tab" data-toggle="tab" aria-expanded="true">Recent Activity</a>
                                                </li>
                                                <li role="presentation" class=""><a href="#tab_content2" role="tab" id="profile-tab" data-toggle="tab" aria-expanded="false">Projects Worked on</a>
                                                </li>
                                                <li role="presentation" class=""><a href="#tab_content3" role="tab" id="profile-tab2" data-toggle="tab" aria-expanded="false">Profile</a>
                                                </li>
                                            </ul>
                                            <div id="myTabContent" class="tab-content">
                                                <div role="tabpanel" class="tab-pane fade active in" id="tab_content1" aria-labelledby="home-tab">

                                                    <!-- start recent activity -->
                                                    <ul class="messages">
                                                        <li>
                                                            <img src="images/img.jpg" class="avatar" alt="Avatar">
                                                            <div class="message_date">
                                                                <h3 class="date text-info">24</h3>
                                                                <p class="month">May</p>
                                                            </div>
                                                            <div class="message_wrapper">
                                                                <h4 class="heading">Desmond Davison</h4>
                                                                <blockquote class="message">Raw denim you probably haven't heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua butcher retro keffiyeh dreamcatcher synth.</blockquote>
                                                                <br />
                                                                <p class="url">
                                                                    <span class="fs1 text-info" aria-hidden="true" data-icon=""></span>
                                                                    <a href="#"><i class="fa fa-paperclip"></i> User Acceptance Test.doc </a>
                                                                </p>
                                                            </div>
                                                        </li>
                                                        <li>
                                                            <img src="images/img.jpg" class="avatar" alt="Avatar">
                                                            <div class="message_date">
                                                                <h3 class="date text-error">21</h3>
                                                                <p class="month">May</p>
                                                            </div>
                                                            <div class="message_wrapper">
                                                                <h4 class="heading">Brian Michaels</h4>
                                                                <blockquote class="message">Raw denim you probably haven't heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua butcher retro keffiyeh dreamcatcher synth.</blockquote>
                                                                <br />
                                                                <p class="url">
                                                                    <span class="fs1" aria-hidden="true" data-icon=""></span>
                                                                    <a href="#" data-original-title="">Download</a>
                                                                </p>
                                                            </div>
                                                        </li>
                                                        <li>
                                                            <img src="images/img.jpg" class="avatar" alt="Avatar">
                                                            <div class="message_date">
                                                                <h3 class="date text-info">24</h3>
                                                                <p class="month">May</p>
                                                            </div>
                                                            <div class="message_wrapper">
                                                                <h4 class="heading">Desmond Davison</h4>
                                                                <blockquote class="message">Raw denim you probably haven't heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua butcher retro keffiyeh dreamcatcher synth.</blockquote>
                                                                <br />
                                                                <p class="url">
                                                                    <span class="fs1 text-info" aria-hidden="true" data-icon=""></span>
                                                                    <a href="#"><i class="fa fa-paperclip"></i> User Acceptance Test.doc </a>
                                                                </p>
                                                            </div>
                                                        </li>
                                                        <li>
                                                            <img src="images/img.jpg" class="avatar" alt="Avatar">
                                                            <div class="message_date">
                                                                <h3 class="date text-error">21</h3>
                                                                <p class="month">May</p>
                                                            </div>
                                                            <div class="message_wrapper">
                                                                <h4 class="heading">Brian Michaels</h4>
                                                                <blockquote class="message">Raw denim you probably haven't heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua butcher retro keffiyeh dreamcatcher synth.</blockquote>
                                                                <br />
                                                                <p class="url">
                                                                    <span class="fs1" aria-hidden="true" data-icon=""></span>
                                                                    <a href="#" data-original-title="">Download</a>
                                                                </p>
                                                            </div>
                                                        </li>

                                                    </ul>
                                                    <!-- end recent activity -->

                                                </div>
                                                <div role="tabpanel" class="tab-pane fade" id="tab_content2" aria-labelledby="profile-tab">

                                                    <!-- start user projects -->
                                                    <table class="data table table-striped no-margin">
                                                        <thead>
                                                            <tr>
                                                                <th>#</th>
                                                                <th>Project Name</th>
                                                                <th>Client Company</th>
                                                                <th class="hidden-phone">Hours Spent</th>
                                                                <th>Contribution</th>
                                                            </tr>
                                                        </thead>
                                                        <tbody>
                                                            <tr>
                                                                <td>1</td>
                                                                <td>New Company Takeover Review</td>
                                                                <td>Deveint Inc</td>
                                                                <td class="hidden-phone">18</td>
                                                                <td class="vertical-align-mid">
                                                                    <div class="progress">
                                                                        <div class="progress-bar progress-bar-success" data-transitiongoal="35"></div>
                                                                    </div>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td>2</td>
                                                                <td>New Partner Contracts Consultanci</td>
                                                                <td>Deveint Inc</td>
                                                                <td class="hidden-phone">13</td>
                                                                <td class="vertical-align-mid">
                                                                    <div class="progress">
                                                                        <div class="progress-bar progress-bar-danger" data-transitiongoal="15"></div>
                                                                    </div>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td>3</td>
                                                                <td>Partners and Inverstors report</td>
                                                                <td>Deveint Inc</td>
                                                                <td class="hidden-phone">30</td>
                                                                <td class="vertical-align-mid">
                                                                    <div class="progress">
                                                                        <div class="progress-bar progress-bar-success" data-transitiongoal="45"></div>
                                                                    </div>
                                                                </td>
                                                            </tr>
                                                            <tr>
                                                                <td>4</td>
                                                                <td>New Company Takeover Review</td>
                                                                <td>Deveint Inc</td>
                                                                <td class="hidden-phone">28</td>
                                                                <td class="vertical-align-mid">
                                                                    <div class="progress">
                                                                        <div class="progress-bar progress-bar-success" data-transitiongoal="75"></div>
                                                                    </div>
                                                                </td>
                                                            </tr>
                                                        </tbody>
                                                    </table>
                                                    <!-- end user projects -->

                                                </div>
                                                <div role="tabpanel" class="tab-pane fade" id="tab_content3" aria-labelledby="profile-tab">
                                                    <p>xxFood truck fixie locavore, accusamus mcsweeney's marfa nulla single-origin coffee squid. Exercitation +1 labore velit, blog sartorial PBR leggings next level wes anderson artisan four loko farm-to-table craft beer twee. Qui photo booth letterpress, commodo enim craft beer mlkshk </p>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

                

                <!-- INCLUDE FOOTER HERE -->



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