jQuery(document).ready(function($){

	$(".previous-application-master input").change(function(){
		$(".previous-application-slave").slideToggle();
	});

	$(".previous-conviction-master input").change(function(){
		$(".previous-conviction-slave").slideToggle();
	});

	$("a.add-school").click(function(){
		var newIndex = $("tbody.add-school tr").length;
		$("tbody.add-school").append("<tr><td class='center'><input name='school' class='form-control'></td><td><input name='address' class='form-control'></td><td><input name='admission' class='form-control'></td><td><input name='graduation' class='form-control'></td><td><input name='certificate' class='form-control'></td><td><input name='certificate_no' class='form-control'></td><td><input name='file_cert_"+ newIndex +"' type='file' class='btn'></td></tr>").hide().fadeIn();
		return false;
	});



	// Add or Remove Skill

	$("a.add-skill").click(function(){
		var newIndex = $("tbody.add-skill tr").length;
		console.log(1);
		$("tbody.add-skill").append(" <tr> <td class='center'><select name='sList["+ newIndex + "]' class='form-control'> <option></option></select></td><td class='center'><select name='numList["+ newIndex + "]' class='form-control'><option></option></select></td><td class='center'><input type='Date' name='sDate["+ newIndex + "]' class='form-control'> </td><td class='center'><input type='Date' name='eDate["+ newIndex + "]' class='form-control'></td> </tr>").hide().fadeIn();
		return false;
	});

	$("a.remove-skill").click(function(){
		$("tbody.add-skill tr:last-child").fadeOut().remove();
		return false;
	});

	

	
});	