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

    <title>GIZ! | Create Admin</title>

    <!-- Bootstrap core CSS -->

    <link href="<spring:url value="/resources/admin/assets/css/bootstrap.min.css"/>" rel="stylesheet">

    <link href="<spring:url value="/resources/admin/assets/fonts/css/font-awesome.min.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/assets/css/animate.min.css"/>" rel="stylesheet">

    <!-- Custom styling plus plugins -->
    <link href="<spring:url value="/resources/admin/assets/css/custom.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/assets/css/icheck/flat/green.css"/>" rel="stylesheet">
    <!-- editor -->
    <link href="http://netdna.bootstrapcdn.com/font-awesome/3.0.2/css/font-awesome.css" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/assets/css/editor/external/google-code-prettify/prettify.css"/>" rel="stylesheet">
    <link href="<spring:url value="/resources/admin/assets/css/editor/index.css"/>" rel="stylesheet">
    <!-- select2 -->
    <link href="<spring:url value="/resources/admin/assets/css/select/select2.min.css"/>" rel="stylesheet">
    <!-- switchery -->
    <link rel="stylesheet" href="<spring:url value="/resources/admin/assets/css/switchery/switchery.min.css"/>">

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
                            <h3>Create Admin</h3>
                        </div>
                        
                    </div>
                    <div class="clearfix"></div>
                    <div class="row">
                        <div class="col-md-12 col-sm-12 col-xs-12">
                            <div class="x_panel">
                                
                                <div class="x_content">
                                    <br />
                                    
                                    
                                    <spring:url value="/admin/add" var="adminFormUrl"/>
                                    <form:form id="demo-form2" class="form-horizontal form-label-left" method="POST" action="${adminFormUrl}" modelAttribute="adminCommandObject">
									<form:hidden path="adminId"/>
									<span ><h2 style="{color:green;}">${adminCreate}</h2></span>

                                        <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="title">Title<span class="required">*</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                          <form:select path="bioData.title.titleId" id="title" required="required" class="form-control col-md-7 col-xs-12">
                                            
                                            <c:forEach items="${titleList}" var="title">
                                            	<form:option value="${title.titleId }" name="title" ><c:out value="${title.titleName}"/></form:option>
                                            </c:forEach>
                                                
                                                </form:select>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="first-name">First Name <span class="required">*</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                <form:input type="text" id="firstName"  required="required" class="form-control col-md-7 col-xs-12" path="bioData.firstName"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="last-name">Last Name <span class="required">*</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                <form:input type="text" id="lastName"  required="required" class="form-control col-md-7 col-xs-12" path="bioData.lastName"/>
                                            </div>
                                            </div>

                                            <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="gender">Gender<span class="required">*</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                <form:select  path="bioData.gender.genderId" id="title" required="required" class="form-control col-md-7 col-xs-12">
                                            
                                            <c:forEach items="${genderList}" var="gender">
                                            	<form:option value="${gender.genderId }"><c:out value="${gender.genderName}"/></form:option>
                                            </c:forEach>
                                                
                                                </form:select>
                                            </div>
                                        </div>
                                            <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="email">Email Address <span class="required">*</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                <form:input type="email" id="email" required="required" class="form-control col-md-7 col-xs-12" path="bioData.email.emailAddress"/>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label for="userName" class="control-label col-md-3 col-sm-3 col-xs-12">Contact Address</label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                <form:textarea  title="Describe your location" class="form-control col-md-7 col-xs-12" type="text" required="required" path="bioData.address.description"/>
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="title">State<span class="required">*</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                          		<form:select  path="bioData.address.lga.state.stateId" id="title" required="required" class="form-control col-md-7 col-xs-12">
                                            
                                           			 <c:forEach items="${stateList}" var="state">
                                            			<form:option value="${state.stateId }"><c:out value="${state.stateName}"/></form:option>
                                            		</c:forEach>
                                                
                                          		</form:select>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="control-label col-md-3 col-sm-3 col-xs-12" for="title">LGA<span class="required">*</span>
                                            </label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                          		<form:select path="bioData.address.lga.lgaId" id="title" required="required" class="form-control col-md-7 col-xs-12">
                                            
                                           			 <c:forEach items="${lgaList}" var="lga">
                                            			<form:option value="${lga.lgaId }"><c:out value="${lga.name}"/></form:option>
                                            		</c:forEach>
                                                
                                          		</form:select>
                                            </div>
                                        </div>
                                        
                                   
                                        
                                        <div class="form-group">
                                            <label for="userName" class="control-label col-md-3 col-sm-3 col-xs-12">Username</label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                <form:input  id="userName" class="form-control col-md-7 col-xs-12" type="text" name="userName" required="required" path="login.username"/>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <label for="password" class="control-label col-md-3 col-sm-3 col-xs-12">Password</label>
                                            <div class="col-md-6 col-sm-6 col-xs-12">
                                                <form:input id="password" class="form-control col-md-7 col-xs-12" type="password"  required="required" path="login.password"/>
                                            </div>
                                        </div>

                                        
                                       
                                        <div class="ln_solid"></div>
                                        <div class="form-group">
                                            <div class="col-md-6 col-sm-6 col-xs-12 col-md-offset-3">
                                                <button type="reset" class="btn btn-primary">Cancel</button>
                                                <button type="submit" class="btn btn-success">Submit</button>
                                            </div>
                                        </div>

                                    </form:form>
                                </div>
                            </div>
                        </div>
                    </div>

                    <script type="text/javascript">
                        $(document).ready(function () {
                            $('#birthday').daterangepicker({
                                singleDatePicker: true,
                                calender_style: "picker_4"
                            }, function (start, end, label) {
                                console.log(start.toISOString(), end.toISOString(), label);
                            });
                        });
                    </script>


                    
                <!-- /page content -->

               






				<%@ include file="adminFooter.jsp" %>








            </div>

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
        <!-- tags -->
        <script src="<spring:url value="/resources/admin/assets/js/tags/jquery.tagsinput.min.js"/>"></script>
        <!-- switchery -->
        <script src="<spring:url value="/resources/admin/assets/js/switchery/switchery.min.js"/>"></script>
        <!-- daterangepicker -->
        <script type="text/javascript" src="<spring:url value="/resources/admin/assets/js/moment.min2.js"/>"></script>
        <script type="text/javascript" src="<spring:url value="/resources/admin/assets/js/datepicker/daterangepicker.js"/>"></script>
        <!-- richtext editor -->
        <script src="<spring:url value="/resources/admin/assets/js/editor/bootstrap-wysiwyg.js"/>"></script>
        <script src="<spring:url value="/resources/admin/assets/js/editor/external/jquery.hotkeys.js"/>"></script>
        <script src="<spring:url value="/resources/admin/assets/js/editor/external/google-code-prettify/prettify.js"/>"></script>
        <!-- select2 -->
        <script src="<spring:url value="/resources/admin/assets/js/select/select2.full.js"/>"></script>
        <!-- form validation -->
        <script type="text/javascript" src="<spring:url value="/resources/admin/assets/js/parsley/parsley.min.js"/>"></script>
        <!-- textarea resize -->
        <script src="<spring:url value="/resources/admin/assets/js/textarea/autosize.min.js"/>"></script>
        <script>
            autosize($('.resizable_textarea'));
        </script>
        <!-- Autocomplete -->
        <script type="text/javascript" src="<spring:url value="/resources/admin/assets/js/autocomplete/countries.js"/>"></script>
        <script src="<spring:url value="/resources/admin/assets/js/autocomplete/jquery.autocomplete.js"/>"></script>
        <script type="text/javascript">
            $(function () {
                'use strict';
                var countriesArray = $.map(countries, function (value, key) {
                    return {
                        value: value,
                        data: key
                    };
                });
                // Initialize autocomplete with custom appendTo:
                $('#autocomplete-custom-append').autocomplete({
                    lookup: countriesArray,
                    appendTo: '#autocomplete-container'
                });
            });
        </script>
        <script src="<spring:url value="/resources/admin/assets/js/custom.js"/>"></script>


        <!-- select2 -->
        <script>
            $(document).ready(function () {
                $(".select2_single").select2({
                    placeholder: "Select a state",
                    allowClear: true
                });
                $(".select2_group").select2({});
                $(".select2_multiple").select2({
                    maximumSelectionLength: 4,
                    placeholder: "With Max Selection limit 4",
                    allowClear: true
                });
            });
        </script>
        <!-- /select2 -->
        <!-- input tags -->
        <script>
            function onAddTag(tag) {
                alert("Added a tag: " + tag);
            }

            function onRemoveTag(tag) {
                alert("Removed a tag: " + tag);
            }

            function onChangeTag(input, tag) {
                alert("Changed a tag: " + tag);
            }

            $(function () {
                $('#tags_1').tagsInput({
                    width: 'auto'
                });
            });
        </script>
        <!-- /input tags -->
        <!-- form validation -->
        <script type="text/javascript">
            $(document).ready(function () {
                $.listen('parsley:field:validate', function () {
                    validateFront();
                });
                $('#demo-form .btn').on('click', function () {
                    $('#demo-form').parsley().validate();
                    validateFront();
                });
                var validateFront = function () {
                    if (true === $('#demo-form').parsley().isValid()) {
                        $('.bs-callout-info').removeClass('hidden');
                        $('.bs-callout-warning').addClass('hidden');
                    } else {
                        $('.bs-callout-info').addClass('hidden');
                        $('.bs-callout-warning').removeClass('hidden');
                    }
                };
            });

            $(document).ready(function () {
                $.listen('parsley:field:validate', function () {
                    validateFront();
                });
                $('#demo-form2 .btn').on('click', function () {
                    $('#demo-form2').parsley().validate();
                    validateFront();
                });
                var validateFront = function () {
                    if (true === $('#demo-form2').parsley().isValid()) {
                        $('.bs-callout-info').removeClass('hidden');
                        $('.bs-callout-warning').addClass('hidden');
                    } else {
                        $('.bs-callout-info').addClass('hidden');
                        $('.bs-callout-warning').removeClass('hidden');
                    }
                };
            });
            try {
                hljs.initHighlightingOnLoad();
            } catch (err) {}
        </script>
        <!-- /form validation -->
        <!-- editor -->
        <script>
            $(document).ready(function () {
                $('.xcxc').click(function () {
                    $('#descr').val($('#editor').html());
                });
            });

            $(function () {
                function initToolbarBootstrapBindings() {
                    var fonts = ['Serif', 'Sans', 'Arial', 'Arial Black', 'Courier',
                'Courier New', 'Comic Sans MS', 'Helvetica', 'Impact', 'Lucida Grande', 'Lucida Sans', 'Tahoma', 'Times',
                'Times New Roman', 'Verdana'],
                        fontTarget = $('[title=Font]').siblings('.dropdown-menu');
                    $.each(fonts, function (idx, fontName) {
                        fontTarget.append($('<li><a data-edit="fontName ' + fontName + '" style="font-family:\'' + fontName + '\'">' + fontName + '</a></li>'));
                    });
                    $('a[title]').tooltip({
                        container: 'body'
                    });
                    $('.dropdown-menu input').click(function () {
                            return false;
                        })
                        .change(function () {
                            $(this).parent('.dropdown-menu').siblings('.dropdown-toggle').dropdown('toggle');
                        })
                        .keydown('esc', function () {
                            this.value = '';
                            $(this).change();
                        });

                    $('[data-role=magic-overlay]').each(function () {
                        var overlay = $(this),
                            target = $(overlay.data('target'));
                        overlay.css('opacity', 0).css('position', 'absolute').offset(target.offset()).width(target.outerWidth()).height(target.outerHeight());
                    });
                    if ("onwebkitspeechchange" in document.createElement("input")) {
                        var editorOffset = $('#editor').offset();
                        $('#voiceBtn').css('position', 'absolute').offset({
                            top: editorOffset.top,
                            left: editorOffset.left + $('#editor').innerWidth() - 35
                        });
                    } else {
                        $('#voiceBtn').hide();
                    }
                };

                function showErrorAlert(reason, detail) {
                    var msg = '';
                    if (reason === 'unsupported-file-type') {
                        msg = "Unsupported format " + detail;
                    } else {
                        console.log("error uploading file", reason, detail);
                    }
                    $('<div class="alert"> <button type="button" class="close" data-dismiss="alert">&times;</button>' +
                        '<strong>File upload error</strong> ' + msg + ' </div>').prependTo('#alerts');
                };
                initToolbarBootstrapBindings();
                $('#editor').wysiwyg({
                    fileUploadError: showErrorAlert
                });
                window.prettyPrint && prettyPrint();
            });
        </script>
        <!-- /editor -->
</body>

</html>