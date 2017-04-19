/**
 * 	Funcoes javascripts custumizadas do projeto
 */
$(function() {
	var decimal = $('.js-decimal');
	decimal.maskMoney();
	
	var plain = $('.js-plain');
	plain.maskMoney({ precision: 0 });
	
	$('.js-status').bootstrapSwitch();
	
});