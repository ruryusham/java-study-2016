$(document).ready(function() {
	// 現在ソート中のカラム
	var targetColIndex = -1;
	// 現在のソート状態（-1:降順、0:なし、1:昇順）
	var currentOrder = 0;
	
	// ヘッダー押下時のイベント
    $("th").click(function() {
    	// 何番目のヘッダーが押下されたか取得
    	var index = $("th").index(this);
    	
    	if (targetColIndex != index) {
    		// 現在ソートされているカラムと異なるカラムをソートする場合
    		// 新たにソートするカラムのインデックスを保持
    		targetColIndex = index;
    		// 昇順から開始
    		currentOrder = 1;
    	} else {
    		// 現在ソートされているカラムと同じカラムをソートする場合
    		// 昇順と降順を入れ替える
    		currentOrder = currentOrder == -1 ? 1 : -1;
    	}
    	
    	// 行の並べ替え
    	if (currentOrder != -1) {
    		// 昇順でHTMLを並び替える
	    	$("table tbody").html(
			    $("tbody tr").sort(function(a, b) {
			    	var aText = $(a).find("td").eq(index).text();
			    	var bText = $(b).find("td").eq(index).text();
			    	return aText < bText ? -1 : 1;
			    })
		    );
	    } else {
    		// 降順でHTMLを並び替える
	    	$("table tbody").html(
			    $("tbody tr").sort(function(a, b) {
			    	var aText = $(a).find("td").eq(index).text();
			    	var bText = $(b).find("td").eq(index).text();
			    	return bText < aText ? -1 : 1;
			    })
		    );
	    }
    });
});
