<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    
    
    <div class="container bgwhite p-t-35 p-b-80">
		<div class="flex-w flex-sb">
			<div class="w-size13 p-t-30 respon5">
				<div class="wrap-slick3 flex-sb flex-w">
					<div class="wrap-slick3-dots"><ul class="slick3-dots" role="tablist" style=""><li class="slick-active" role="presentation"><img src="${pageContext.request.contextPath }/assets/images/thumb-item-01.jpg "><div class="slick3-dot-overlay"></div></li><li role="presentation"><img src="${pageContext.request.contextPath }/assets/images/thumb-item-02.jpg "><div class="slick3-dot-overlay"></div></li><li role="presentation"><img src="${pageContext.request.contextPath }/assets/images/thumb-item-03.jpg "><div class="slick3-dot-overlay"></div></li></ul></div>

					<div class="slick3 slick-initialized slick-slider slick-dotted">
						<div class="slick-list draggable"><div class="slick-track" style="opacity: 1; width: 1503px;"><div class="item-slick3 slick-slide slick-current slick-active" data-thumb="images/thumb-item-01.jpg" data-slick-index="0" aria-hidden="false" tabindex="0" role="tabpanel" id="slick-slide10" aria-describedby="slick-slide-control10" style="width: 501px; position: relative; left: 0px; top: 0px; z-index: 999; opacity: 1;">
							<div class="wrap-pic-w">
								<img src="${pageContext.request.contextPath }/assets/images/product-detail-01.jpg" alt="IMG-PRODUCT">
							</div>
						</div><div class="item-slick3 slick-slide" data-thumb="${pageContext.request.contextPath }/assets/images/thumb-item-02.jpg" data-slick-index="1" aria-hidden="true" tabindex="-1" role="tabpanel" id="slick-slide11" aria-describedby="slick-slide-control11" style="width: 501px; position: relative; left: -501px; top: 0px; z-index: 998; opacity: 0;">
							<div class="wrap-pic-w">
								<img src="${pageContext.request.contextPath }/assets/images/product-detail-02.jpg" alt="IMG-PRODUCT">
							</div>
						</div><div class="item-slick3 slick-slide" data-thumb="${pageContext.request.contextPath }/assets/images/thumb-item-03.jpg" data-slick-index="2" aria-hidden="true" tabindex="-1" role="tabpanel" id="slick-slide12" aria-describedby="slick-slide-control12" style="width: 501px; position: relative; left: -1002px; top: 0px; z-index: 998; opacity: 0;">
							<div class="wrap-pic-w">
								<img src="${pageContext.request.contextPath }/assets/images/product-detail-03.jpg" alt="IMG-PRODUCT">
							</div>
						</div></div>
						</div>

						

						
					</div>
				</div>
			</div>

			<div class="w-size14 p-t-30 respon5">
				<h4 class="product-detail-name m-text16 p-b-13">
					${producto.nombre} ${producto.descrition}
				</h4>

				<span class="m-text17">
					S/. ${producto.precio}
				</span>

				<p class="s-text8 p-t-10">
					${producto.descrition}
				</p>

				<!--  -->
				<div class="p-t-33 p-b-60">
					<div class="flex-m flex-w p-b-10">
						<div class="s-text15 w-size15 t-center">
							Size
						</div>

						<div class="rs2-select2 rs3-select2 bo4 of-hidden w-size16">
							<select class="selection-2 select2-hidden-accessible" name="size" tabindex="-1" aria-hidden="true">
								<option>Choose an option</option>
								<option>Size S</option>
								<option>Size M</option>
								<option>Size L</option>
								<option>Size XL</option>
							</select><span class="select2 select2-container select2-container--default" dir="ltr" style="width: 150px;"><span class="selection"><span class="select2-selection select2-selection--single" role="combobox" aria-haspopup="true" aria-expanded="false" tabindex="0" aria-labelledby="select2-size-lc-container"><span class="select2-selection__rendered" id="select2-size-lc-container" title="Choose an option">Choose an option</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></span></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>
						</div>
					</div>

					<div class="flex-m flex-w">
						<div class="s-text15 w-size15 t-center">
							Color
						</div>

						<div class="rs2-select2 rs3-select2 bo4 of-hidden w-size16">
							<select class="selection-2 select2-hidden-accessible" name="color" tabindex="-1" aria-hidden="true">
								<option>Choose an option</option>
								<option>Gray</option>
								<option>Red</option>
								<option>Black</option>
								<option>Blue</option>
							</select><span class="select2 select2-container select2-container--default" dir="ltr" style="width: 150px;"><span class="selection"><span class="select2-selection select2-selection--single" role="combobox" aria-haspopup="true" aria-expanded="false" tabindex="0" aria-labelledby="select2-color-gc-container"><span class="select2-selection__rendered" id="select2-color-gc-container" title="Choose an option">Choose an option</span><span class="select2-selection__arrow" role="presentation"><b role="presentation"></b></span></span></span><span class="dropdown-wrapper" aria-hidden="true"></span></span>
						</div>
					</div>

					<div class="flex-r-m flex-w p-t-10">
						<div class="w-size16 flex-m flex-w">
							<div class="flex-w bo5 of-hidden m-r-22 m-t-10 m-b-10">
								<button class="btn-num-product-down color1 flex-c-m size7 bg8 eff2">
									<i class="fs-12 fa fa-minus" aria-hidden="true"></i>
								</button>

								<input class="size8 m-text18 t-center num-product" type="number" name="num-product" value="1">

								<button class="btn-num-product-up color1 flex-c-m size7 bg8 eff2">
									<i class="fs-12 fa fa-plus" aria-hidden="true"></i>
								</button>
							</div>

							<div class="btn-addcart-product-detail size9 trans-0-4 m-t-10 m-b-10">
								<!-- Button -->
								<button class="flex-c-m sizefull bg1 bo-rad-23 hov1 s-text1 trans-0-4">
									Add to Cart
								</button>
							</div>
						</div>
					</div>
				</div>

				<div class="p-b-45">
					<span class="s-text8 m-r-35">SKU: MUG-01</span>
					<span class="s-text8">Categories: Mug, Design</span>
				</div>

				<!--  -->
				<div class="wrap-dropdown-content bo6 p-t-15 p-b-14 active-dropdown-content">
					<h5 class="js-toggle-dropdown-content flex-sb-m cs-pointer m-text19 color0-hov trans-0-4 show-dropdown-content">
						Description
						<i class="down-mark fs-12 color1 fa fa-minus dis-none" aria-hidden="true"></i>
						<i class="up-mark fs-12 color1 fa fa-plus" aria-hidden="true"></i>
					</h5>

					<div class="dropdown-content dis-none p-t-15 p-b-23" style="display: block;">
						<p class="s-text8">
							Fusce ornare mi vel risus porttitor dignissim. Nunc eget risus at ipsum blandit ornare vel sed velit. Proin gravida arcu nisl, a dignissim mauris placerat
						</p>
					</div>
				</div>

				<div class="wrap-dropdown-content bo7 p-t-15 p-b-14">
					<h5 class="js-toggle-dropdown-content flex-sb-m cs-pointer m-text19 color0-hov trans-0-4">
						Additional information
						<i class="down-mark fs-12 color1 fa fa-minus dis-none" aria-hidden="true"></i>
						<i class="up-mark fs-12 color1 fa fa-plus" aria-hidden="true"></i>
					</h5>

					<div class="dropdown-content dis-none p-t-15 p-b-23" style="display: none;">
						<p class="s-text8">
							Fusce ornare mi vel risus porttitor dignissim. Nunc eget risus at ipsum blandit ornare vel sed velit. Proin gravida arcu nisl, a dignissim mauris placerat
						</p>
					</div>
				</div>

				<div class="wrap-dropdown-content bo7 p-t-15 p-b-14">
					<h5 class="js-toggle-dropdown-content flex-sb-m cs-pointer m-text19 color0-hov trans-0-4">
						Reviews (0)
						<i class="down-mark fs-12 color1 fa fa-minus dis-none" aria-hidden="true"></i>
						<i class="up-mark fs-12 color1 fa fa-plus" aria-hidden="true"></i>
					</h5>

					<div class="dropdown-content dis-none p-t-15 p-b-23" style="display: none;">
						<p class="s-text8">
							Fusce ornare mi vel risus porttitor dignissim. Nunc eget risus at ipsum blandit ornare vel sed velit. Proin gravida arcu nisl, a dignissim mauris placerat
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>