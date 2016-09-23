var timer;
$(document).ready(function(){
	// imgタグを取得
	var manImgs = $("#anata img");
	var cpuImgs = $("#aite img");

	// imgタグを非表示
	manImgs.hide();
	cpuImgs.hide();

	// 表示するimgタグのインデックス[0, 1, 2]
	var cpuIndex = 0;

	startTimer();

	// imgタグを順番に表示する
	// 100msごとにfunction内の処理が実行される
	function startTimer(){
		timer = setInterval(function(){
			// インデックスを一つずらす
			cpuIndex++;
			// インデックスがimgタグの総数を超えた場合は0からスタート
			if(cpuIndex == cpuImgs.length){
				cpuIndex = 0;
			}
			// 一度すべてのimgタグを非表示
			cpuImgs.hide();

			// 表示するimgタグを取得
			var img = cpuImgs.get(cpuIndex);

			// 1つだけimgタグを表示
			$(img).show();
		}, 100);
	}

	// ボタンクリック時のイベントを追加
	// function内にボタンをクリックした時の処理を記述
	$("button").bind("click", function(){
		// あなたのimgタグを非表示
		manImgs.hide();

		// タイマーを停止
		clearInterval(timer);

		// 押下したボタンのvalueを取得
		var manIndex = $(this).val();

		// ボタンに対応する画像を取得
		var img = manImgs.get(manIndex);

		// 画像を表示
		$(img).show();

		// じゃんけんの結果を取得
		var result = judge(manIndex, cpuIndex);

		// 結果を表示
		switch (result){
			case -1:
				$("#kekka").text("負け");
				break;
			case 0:
				$("#kekka").text("あいこ");
				break;
			case 1:
				$("#kekka").text("勝ち");
				break;
		}
	});

	// リセットボタンをクリックした時の処理を記述
	$(".reset").bind("click", function(){
		// imgタグを非表示
		manImgs.hide();
		cpuImgs.hide();

		startTimer();
	});
});

//じゃんけんの結果を判定する関数
function judge(manIndex, cpuIndex){
	console.log("man:" + manIndex + " ,cpu:" + cpuIndex);

	// グー   0
	// チョキ 1
	// パー   2

	// 負け
	if(manIndex == 0 && cpuIndex == 2){
		return -1;
	}
	if(manIndex == 1 && cpuIndex == 0){
		return -1;
	}
	if(manIndex == 2 && cpuIndex == 1){
		return -1;
	}
	//あいこ
	if(manIndex == cpuIndex){
		return 0;
	}
	// 勝ち
	if(manIndex == 0 && cpuIndex == 1){
		return 1;
	}
	if(manIndex == 1 && cpuIndex == 2){
		return 1;
	}
	if(manIndex == 2 && cpuIndex == 0){
		return 1;
	}

}