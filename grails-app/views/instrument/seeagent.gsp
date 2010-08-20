<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="content-type" content="text/html; charset=utf-8"/>
	<title>OOICI - LCA Demo</title>
	<link rel="stylesheet" type="text/css" href="../../../css/reset.css" media="screen"/>
	<link rel="stylesheet" type="text/css" href="../../../css/text.css" media="screen"/>
	<link rel="stylesheet" type="text/css" href="../../../css/960.css" media="screen"/>
	<link rel="stylesheet" type="text/css" href="../../../css/layout.css" media="screen"/>
	<link rel="stylesheet" type="text/css" href="../../../css/nav.css" media="screen"/>
	<!--[if IE 6]><link rel="stylesheet" type="text/css" href="../../../css/ie6.css" media="screen" /><![endif]-->
	<!--[if IE 7]><link rel="stylesheet" type="text/css" href="../../../css/ie.css" media="screen" /><![endif]-->
</head>
<body>
<div class="container_16">
	<div class="grid_16">
		<h1 id="branding"><a href="../../../">Ocean Observatories Initiative Cyberinfrastructure</a></h1>
	</div>
	<div class="clear"></div>
	<div class="grid_16">
		<ul class="nav main">
			<li><g:link controller="home" action="index">Home</g:link>
			<li><g:link controller="instrument" action="index">Instruments</g:link>
				<ul>
					<li><g:link controller="instrument" action="show">View all Instruments</g:link></li>
					<li><g:link controller="instrument" action="create">Register an Instrument</g:link></li>
				</ul>
			</li>
			<li><g:link controller="dataproduct" action="index">Data Products</g:link>
				<ul>
					<li><g:link controller="dataproduct" action="show">View all Data Products</g:link></li>
					<li><g:link controller="dataproduct" action="create">Register a Data Product</g:link></li>
					<li><g:link controller="instrument" action="runcommand">Command a new Instrument</g:link></li>
				</ul>
			</li>
			<li><a href="">About OOICI</a></li>
			<li><a href="">Contact Us</a></li>
			<li><g:link controller="logout" action="index">Logout</g:link></li>
		</ul>
	</div>
	<div class="clear"></div>
	<div class="grid_16">
		<h2 id="page-heading">LCA Demo - Start Agent Status</h2>
	</div>
	<div class="clear"></div>
	<div class="grid_4">
		<div class="box menu">
			<h2>Menu</h2>
			<div class="block">
				<ul class="section menu">
					<li><a class="menuitem">Home</a>
					</li>
					<li>Instruments
						<ul class="submenu">
							<li><g:link controller="instrument" action="show">View all Instruments</g:link></li>
							<li><g:link controller="instrument" action="create">Register an Instrument</g:link></li>
							<li><g:link controller="instrument" action="runcommand">Command a new Instrument</g:link></li>
						</ul>
					</li>
					<li>Data Products
						<ul class="submenu">
							<li><g:link controller="dataproduct" action="show">View all Data Products</g:link></li>
							<li><g:link controller="dataproduct" action="create">Register a Data Product</g:link></li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
	</div>
	<div class="grid_12">
		<div class="box">
			<h2>Welcome</h2>
			<div class="block" id="blockquote">
				<blockquote>
					<p>The results of the Start Agent command can be found below.</p>
				</blockquote>
			</div>
		</div>
		<div class="box">
			<h2>Command Status</h2>
			<div class="block" id="header-table">
				<table summary="This table includes examples of as many table elements as possible">
					<colgroup>
						<col class="colA"/>
					</colgroup>
					<thead>
					<tr>
						<th colspan="5" class="table-head">Headers</th>
					</tr>
					<tr>
						<th>Header values</th>
					</tr>
					</thead>
					<tbody>
					<tr class="odd">
						<th>${headers}</th>
					</tr>
					</tbody>
				</table>
			</div>
			<div class="block" id="status-table">
				<table summary="This table includes examples of as many table elements as possible">
					<colgroup>
						<col class="colA"/>
					</colgroup>
					<thead>
					<tr>
						<th colspan="5" class="table-head">Status</th>
					</tr>
					<tr>
						<th>Status values</th>
					</tr>
					</thead>
					<tbody>
					<tr class="odd">
						<th>${status}</th>
					</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div class="clear"></div>
	<script type="text/javascript" src="../../../js/jquery-1.3.2.min.js"></script>
	<script type="text/javascript" src="../../../js/jquery-ui.js"></script>
	<script type="text/javascript" src="../../../js/jquery-fluid16.js"></script>
</body>
</html>