<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<link type="text/css" rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Open+Sans:400,300" />
<title>Calculatrice</title>

<style>
html, body, div, span, applet, object, iframes, h1, h2, h3, h4, h5, h6,
	p, blockquote, pre, a, abbr, acronym, address, big, cite, code, del,
	dfn, em, img, ins, kbd, q, s, samp, small, strike, sub, sup, tt, var, u,
	i, center, dl, dt, dd, ol, ul, li, fieldset, form, label, legend, table,
	caption, tbody, tfoot, thead, tr, th, td, article, aside, canvas,
	details, embed, figure, figcaption, footer, header, hgroup, menu, nav,
	output, ruby, section, summary, time, mark, audio, video {
	margin: 0;
	padding: 0;
	border: 0;
	font-size: 100%;
	font: inherit;
	vertical-align: baseline;
}

article, aside, details, figcaption, figure, footer, header, hgroup,
	menu, nav, section {
	display: block;
}

blockquote, q {
	quotes: none;
}

blockquote:before, blockquote:after, q:before, q:after {
	content: '';
	content: none;
}

table {
	border-collapse: collapse;
	border-spacing: 0;
}

body {
	font-family: 'OpenSans', sans-serif;
	background: url(../background.jpg) center fixed;
	-webkit-background-size: cover;
	-moz-background-size: cover;
	-ms-background-size: cover;
	-o-background-size: cover;
	background-size: cover;
}

#container {
	font-size: 32px;
	margin: 128px auto;
	width: 768px;
}

h1 {
	text-align: center;
	color: #333;
	margin-bottom: 32px;
	text-shadow: 0 1px 1px rgba(0, 0, 0, .4);
}

#calculator, #number, .buttons {
	border-radius: 6px;
}

#calculator {
	margin: 0 auto;
	background-color: #454545;
	border: 1px solid #3D3D3D;
	width: 279px;
	box-shadow: 0 7px 10px rgba(0, 0, 0, .8);
}

#header {
	border-top: 1px solid #777;
	border-radius: 6px 6px 0 0;
	padding: 10px;
}

input#number {
	text-align: right;
	background-color: #121212;
	border: none;
	border-bottom: 1px solid #777;
	color: #C8C8C8;
	font-size: 20px;
	padding: 16px;
	width: 227px;
	box-shadow: inset 0 0 10px 4px rgba(0, 0, 0, .6);
}

input#number:focus {
	outline: none;
}

#body {
	padding: 0 10px;
}

.buttons {
	cursor: default;
	text-align: center;
	padding: 7px 12px;
	font-size: 20px;
	text-shadow: 0 -1px 1px #000;
	color: #FFF;
	font-weight: bold;
	display: inline-block;
	border-top: 1px solid #777;
	width: 34px;
	background: linear-gradient(#5F5F5F 0%, #404040 100%);
	box-shadow: 0 2px 6px rgba(0, 0, 0, .8);
	margin-bottom: 10px;
}

.buttons:hover {
	background: linear-gradient(#79D144 0%, #50A61F 100%);
	border-top: 1px solid #9ADD73;
	text-shadow: 0 -1px 1px #008000;
}

.buttons:active {
	box-shadow: none;
}
</style>
</head>
<body>
	<div id="container">
		<h1>Calculatrice</h1>
		<div id="calculator">
			<div id="header">
				<input type="text" id="number" value="0" autocomplete="off" disabled />
			</div>
			<div id="body">
				<div class="buttons">7</div>
				<div class="buttons">8</div>
				<div class="buttons">9</div>
				<div class="buttons">/</div>
				<div class="buttons">4</div>
				<div class="buttons">5</div>
				<div class="buttons">6</div>
				<div class="buttons">*</div>
				<div class="buttons">1</div>
				<div class="buttons">2</div>
				<div class="buttons">3</div>
				<div class="buttons">-</div>
				<div class="buttons">0</div>
				<div class="buttons">.</div>
				<div class="buttons">=</div>
				<div class="buttons">+</div>

			</div>
		</div>
	</div>
	
	<p> Après plusieurs semaines de recherche, nous n'avons absolument pas réussi à faire fonctionner le struts
	, sachant que même votre projet ne fonctionnait pas avec struts (sous notre ide Eclispe, nous avons même essayé de passer sous Intellij)</p>
	<ul>
	<li>Voici nos liens consulté</li>
	<li> <a> https://www.youtube.com/watch?v=9y1K827DeSA&t=307s </a> </li>
	<li> <a> https://www.youtube.com/watch?v=hhXfq_lg25A&t=152s  </a> </li>
	<li> <a> https://www.youtube.com/watch?v=6C2FheQ9HEM&t=445s </a> </li>
	<li> <a> https://www.youtube.com/watch?v=VmDIMXtvyGU </a> </li>
	<li> <a> https://www.youtube.com/watch?v=IhdPzI483Wk </a> </li>
	<li> <a> https://www.youtube.com/watch?v=YcCsJtqI72A&t=523s </a> </li>
	<li> <a> https://www.youtube.com/watch?v=k3gppBz0Xow </a> </li>
	<li> <a> https://www.jmdoudoux.fr/java/dej/chap-struts.htm </a> </li>
	<li> <a> https://tahe.developpez.com/java/struts2/?page=page_2 </a> </li>
	</ul>
	
</body>
</html>