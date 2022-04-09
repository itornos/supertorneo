<<<<<<< HEAD
$(obtener_registros());

function obtener_registros(productos) {
    $.ajax({
            url: 'busqueda.php',
            type: 'POST',
            dataType: 'html',
            data: { productos: productos },
        })
        .done(function(resultado) {
            $("#tabla_resultados").html(resultado);
        })
}

$(document).on('keyup', '#termino', function() {
    var valorBusqueda = $(this).val();

    if (valorBusqueda != "") {
        obtener_registros(valorBusqueda);
    } else {
        obtener_registros();
    }

});
=======

$(obtener_registros());
function obtener_registros(productos)
{
	$.ajax({
		url : 'busqueda.php',
		type : 'POST',
		dataType : 'html',
		data : { productos: productos },
	})
	.done(function(resultado){
		$("#tabla_resultados").html(resultado);
	})
}

$(document).on('keyup', '#termino', function()
{
	var valorBusqueda=$(this).val();
	
	if (valorBusqueda!="")
	{
		obtener_registros(valorBusqueda);
	}
	else
	{
		obtener_registros();
	}
});



























$(obtener_registros());

function obtener_registros(productos)
{
	$.ajax({
		url : 'busqueda.php',
		type : 'POST',
		dataType : 'html',
		data : { productos: productos },
	})

	.done(function(resultado){
		$("#tabla_resultados").html(resultado);
	})
}

$(document).on('keyup', '#termino', function()
{
	var valorBusqueda=$(this).val();
	if (valorBusqueda!="")
	{
		obtener_registros(valorBusqueda);
	}
	else
	{
		obtener_registros();
	}
});
>>>>>>> cc81bb1931523740b6e9ef755088ee8a65954ccb
