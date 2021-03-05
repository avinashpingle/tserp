<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="../font-awesome/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link rel="stylesheet" href="../views/css/style.css">
<link rel="stylesheet" id="enlighten-responsive-css"
	href="../views/css/responsive.css" type="text/css" media="all">
<link rel="stylesheet" id="aptf-bxslider-css" href="https://demo.accesspressthemes.com/enlighten/wp-content/plugins/accesspress-twitter-feed/css/jquery.bxslider.css?ver=1.6.3" type="text/css" media="all">
<style>
.theiaStickySidebar:after {
	content: "";
	display: table;
	clear: both;
}
</style>
</head>

<body>
	<header id="masthead" class="site-header" role="banner">
		<div class="ak-container">
			<div class="social_htext_wrap">
				<div class="header_text">
					<span class="text_wrap">Join with us and be a part of the
						success</span>
				</div>
				<div class="header_social_link">
					<div class="fa_link_wrap">
						<a target="_blank" href="#"> <span class="fa_wrap"> <i
								class="fa fa-facebook"></i>
						</span>
							<div class="link_wrap">facebook</div>
						</a>
					</div>
					<div class="fa_link_wrap">
						<a target="_blank" href="#"> <span class="fa_wrap"> <i
								class="fa fa-twitter"></i>
						</span>
							<div class="link_wrap">twitter</div>
						</a>
					</div>
					<div class="fa_link_wrap">
						<a target="_blank" href="#"> <span class="fa_wrap"> <i
								class="fa fa-instagram"></i>
						</span>
							<div class="link_wrap">instagram</div>
						</a>
					</div>
				</div>
			</div>

			<div class="logo_info_wrap">
				<div class="header-logo-container">
					<a href="#" class="custom-logo-link" rel="home"><img
						width="259" height="70" src="../views/images/ts-logo.png"
						class="custom-logo"
						style="margin-left: 10px; border-left-width: 15px; padding-left: -15; margin-top: 20px;" /></a>
				</div>
				<div class="header_info_wrap">
					<div class="phone_header wow fadeIn">
						<div class="fa_icon">
							<i class="fa fa-phone" aria-hidden="true"></i>
						</div>
						<div class="title_phone">
							<span class="pnone_title">Call Support</span> <span class="phone">+91-9130502135</span>
						</div>
					</div>
					<div class="email_header wow fadeIn">
						<div class="fa_icon">
							<i class="fa fa-envelope-o" aria-hidden="true"></i>
						</div>
						<div class="title_email_wrap">
							<span class="title_email">Email Support</span> <span
								class="email_address">info@testingshastra.com</span>
						</div>
					</div>
					<div class="location_header wow fadeIn">
						<div class="fa_icon">
							<i class="fa fa-map-marker" aria-hidden="true"></i>
						</div>
						<div class="title_location_wrap">
							<span class="title_location">Location</span> <span
								class="location">New Sangvi, Pune</span>
						</div>
					</div>
				</div>
			</div>
		</div>
		<button type="button" class="btn btn-primary login-btn">Login</button>
		<nav id="site-navigation" class="main-navigation center top"
			role="navigation">
			<div class="ak-container">
				<div class="mb-ham">
					<span></span> <span></span> <span></span>
				</div>
				<div class="menu-menu-1-container mmenu-wrapper">
					<ul id="primary-menu" class="menu">
						<li id="menu-item-255"
							class="menu-item menu-item-type-custom menu-item-object-custom current-menu-item current_page_item menu-item-home menu-item-255"><a
							href="#" aria-current="page">Home</a></li>
						<li id="menu-item-153"
							class="menu-item menu-item-type-custom menu-item-object-custom menu-item-has-children menu-item-153"><a
							href="#">Courses</a>
							<ul class="sub-menu">
								<li id="menu-item-144"
									class="menu-item menu-item-type-post_type menu-item-object-page menu-item-144"><a
									href="">Java Selenium-Online</a></li>
								<li id="menu-item-141"
									class="menu-item menu-item-type-post_type menu-item-object-page menu-item-141"><a
									href="">Java Selenium-Offline</a></li>
								<li id="menu-item-142"
									class="menu-item menu-item-type-post_type menu-item-object-page menu-item-142"><a
									href="">Java Full Stack-Online</a></li>
								<li id="menu-item-143"
									class="menu-item menu-item-type-post_type menu-item-object-page menu-item-143"><a
									href="">Java Full Stack-Offline</a></li>
								<li id="menu-item-351"
									class="menu-item menu-item-type-custom menu-item-object-custom menu-item-351"><a
									href="">REST API Testing</a></li>
								<li id="menu-item-352"
									class="menu-item menu-item-type-custom menu-item-object-custom menu-item-352"><a
									href="">Manual Testing</a></li>
							</ul></li>
						<li id="menu-item-363"
							class="menu-item menu-item-type-taxonomy menu-item-object-category menu-item-363"><a
							href="">Downloads</a></li>
						<li id="menu-item-353"
							class="menu-item menu-item-type-post_type menu-item-object-page menu-item-353"><a
							href="">Assignments</a></li>
						<li id="menu-item-353"
							class="menu-item menu-item-type-post_type menu-item-object-page menu-item-353"><a
							href="">Videos</a></li>
						<li id="menu-item-251"
							class="menu-item menu-item-type-post_type menu-item-object-page menu-item-251"><a
							href="">Contact Us</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</body>

</html>