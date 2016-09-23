var timer;
$(document).ready(function(){
	//Imgを取得
	var manImgs = $("#man Img");
	var cpuImgs = $("#cpu Img");
	var speed = 100;

	//Imgタグを非表示
	manImgs.hide();
	cpuImgs.hide();
//		if($("#r1:checked").changed(function(){ speed =100 }));
//		if($("#r2:checked").changed(function(){ speed =10 }));
//		if($("#r3:checked").changed(function(){ speed =1 }));
	// 表示するimgタグのインデックス[0, 1, 2]
	var cpuIndex = 0;
		// imgタグを順番に表示
		// 100msごとにfunction内の処理が実行される
		timer = setInterval(function(){
			//ボタン非表示
			$("#reset button").prop("disabled",true);
			// インデックスを一つずらす
			cpuIndex++;
			if(cpuIndex == cpuImgs.length){
				// インデックスがimgタグの総数を超えた場合は0からスタート
				cpuIndex = 0;
			}
			// 一度すべてのimgタグを非表示
			cpuImgs.hide();
			// 表示するimgタグを取得
			var img = cpuImgs.get(cpuIndex);
			// 1つだけimgタグを表示
			$(img).show();
		},speed);
	// ボタンクリック時のイベントを追加
	// function内にボタンをクリックした時の処理を記述
	$("#rps button").bind("click", function(){
		//ボタン表示
		$("#reset button").prop("disabled",false);
		//タイマーを停止
		clearInterval(timer);

		// 押下したボタンのvalueを取得
		var manIndex =$(this).val();

		//ボタンに対応する画像を取得
		var img = manImgs.get(manIndex);

		manImgs.hide();

		// 画像を表示
		$(img).show();

		//じゃんけんの結果を取得
		var result = judge(manIndex, cpuIndex);

		//結果を表示
		switch (result){
			case -1:
				$("#result").text("You Lose...")
				break;
			case 0:
				$("#result").text("◆◇Draw◇◆")
				break;
			case 1:
				$("#result").text("★☆★You Win!!!!★☆★")
				break;
		}
	});
	$("#reset button").bind("click", function(){
		timer = setInterval(function(){
			//ボタン非表示
			$("#reset button").prop("disabled",true);
			manImgs.hide();
			cpuImgs.hide();
			// インデックスを一つずらす
			cpuIndex++;
			if(cpuIndex == cpuImgs.length){
				// インデックスがimgタグの総数を超えた場合は0からスタート
				cpuIndex = 0;
			}
			// 一度すべてのimgタグを非表示
			cpuImgs.hide();

			// 表示するimgタグを取得
			var img = cpuImgs.get(cpuIndex);

			// 1つだけimgタグを表示
			$(img).show();
		},100);
	});
});

//じゃんけんの結果を判定
function judge(manIndex, cpuIndex){
	console.log("man:" + manIndex + ", cpu:" + cpuIndex);

	if(manIndex == cpuIndex) {
		//あいこ
		return 0;
	}
	//グー		:0
	//チョキ	:1
	//パー		:2
	if(manIndex == 0 && cpuIndex == 1){
		// あなたが「グー」、あいてが「チョキ」
		return 1;
	} else if (manIndex ==0 && cpuIndex == 2){
		// あなたが「グー」、あいてが「パー」
		return -1;
	}

	if(manIndex == 1 && cpuIndex == 2){
		// あなたが「チョキ」、あいてが「パー」
		return 1;
	} else if (manIndex == 1 && cpuIndex == 0){
		// あなたが「チョキ」、あいてが「グー」
		return -1;
	}

	if(manIndex == 2 && cpuIndex == 0){
		// あなたが「パー」、あいてが「グー」
		return 1;
	} else if(manIndex == 2 && cpuIndex ==1){
		// あなたが「パー」、あいてが「チョキ」
		return -1;
	}
}