var timer;
$(document).ready(function(){
	// imgタグを取得
	var manImgs = $("#man img");
	var cpuImgs = $("#cpu img");
	
	// imgタグを非表示
	manImgs.hide();
	cpuImgs.hide();
	
	// 表示するimgタグのインデックス[0, 1, 2]
	var cpuIndex = 0;
	
	// imgタグを順番に表示する
	// 100msごとにfunction内の処理が実行される
	timer = setInterval(function(){
		// インデックスを一つずらす
		cpuIndex++;
		if (cpuIndex == cpuImgs.length){
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
	
	// ボタンクリック時のイベントを追加
	// function内にボタンをクリックした時の処理を記述
	$("button").bind("click", function(){
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
		switch (result) {
			case -1:
				$("#result").text("あなたの「負け」です。。。");
				break;
			case 0:
				$("#result").text("あいこです。");
				break;
			case 1:
				$("#result").text("あなたの「勝ち」です！");
				break;
		}
	});
});

// じゃんけんの結果を判定する関数
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