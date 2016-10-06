//CPUとジャンケンするPG

//hideが非表示、showが表示
//「$」マークの行がjQuereiのやつ
//「#」は場所指定


var timer;
//画面起動時の処理をする
$(document).ready(function(){
	//imgタグをセレクターで取得
	var manImgs = $("#man img");
	var cpuImgs = $("#cpu img");
	//■追加
	var osusumeImgs = $("#osusume img");

	//imgタグを非表示
	manImgs.hide();
	cpuImgs.hide();
	//■追加
	osusumeImgs.hide();

	//表示するimgタグのインデックス[0,1,2]
	var cpuIndex = 0;
	//■追加
	var osusumeIndex = 1;
	var i = 0;

	//imgタグを順番に表示する
	timer = setInterval(function(){
		cpuIndex++;
		//■追加
		osusumeIndex++;
		if (cpuIndex == cpuImgs.length){
			cpuIndex = 0;
		}
		//■追加
		if (osusumeIndex == osusumeImgs.length){
			osusumeIndex = 0;
		}


		//一度すべてのimgタグを非表示
		cpuImgs.hide();
		//■追加
		osusumeImgs.hide();

		//表示するimgを取得
		var img = cpuImgs.get(cpuIndex);
		//■追加
		var img2 = osusumeImgs.get(osusumeIndex);

		//1つ表示jQ
		$(img).show();
		//■追加
		$(img2).show();
	},900);

	//ボタンクリック時
	$("button").bind("click", function(){

		//■追加  ボタン非表示にする
		manImgs.hide();



		//タイマーを停止
		clearInterval(timer);

		//おしたボタンの値を取得
		var manIndex = $(this).val();

		// ボタンに対応する画像を取得
		var img = manImgs.get(manIndex);

		// 画像を表示
		$(img).show();

		// じゃんけんの結果を取得
		var result = judge(manIndex, cpuIndex);

		// 結果
		switch (result) {
		case 0:
			$("#result").text("負け ΣΣ┏（|||｀□´|||;;）┓");
			break;
		case 1:
			$("#result").text("引き分け ｢(ﾟ～ﾟo)ｳｩｰﾝ");
			break;
		case -1:
			$("#result").text("勝ち ( v^-ﾟ)⌒☆ﾌﾞｲ!(ﾟ∇^*)ｖ⌒☆ﾌﾞｲｯ!");
			break;


		//■追加　2回目のボタン押下時
		}timer = setInterval(function(){
			cpuIndex++;
			//■追加
			osusumeIndex++;
			if (cpuIndex == cpuImgs.length){
				cpuIndex = 0;
			}
			//■追加
			if (osusumeIndex == osusumeImgs.length){
				osusumeIndex = 0;
			}


			//一度すべてのimgタグを非表示
			cpuImgs.hide();
			//■追加
			osusumeImgs.hide();

			//表示するimgを取得
			var img = cpuImgs.get(cpuIndex);
			//■追加
			var img2 = osusumeImgs.get(osusumeIndex);

			//1つ表示jQ
			$(img).show();
			//■追加
			$(img2).show();
		},500);


	});
});

//じゃんけんの結果を判定する関数
function judge(manIndex, cpuIndex) {
	console.log("man:" + manIndex + ", cpu:" + cpuIndex);

	if (manIndex == cpuIndex) {
		// あいこ
		return 0;
	}

	if (manIndex == 0 && cpuIndex == 1) {
		// あなたが「グー」、あいてが「チョキ」
		return 1;
	} else if (manIndex == 0 && cpuIndex == 2) {
		// あなたが「グー」、あいてが「パー」
		return -1;
	}

	if (manIndex == 1 && cpuIndex == 2) {
		// あなたが「チョキ」、あいてが「パー」
		return 1;
	} else if (manIndex == 1 && cpuIndex == 0)  {
		// あなたが「チョキ」、あいてが「グー」
		return -1;
	}

	if (manIndex == 2 && cpuIndex == 0) {
		// あなたが「パー」、あいてが「グー」
		return 1;
	} else if (manIndex == 2 && cpuIndex == 1)  {
		// あなたが「パー」、あいてが「チョキ」
		return -1;
	}
}