package com.example.complexexchange

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.text.style.LineHeightStyle
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import complexexchange.composeapp.generated.resources.Res
import complexexchange.composeapp.generated.resources.flag_vn
import complexexchange.composeapp.generated.resources.flag_ni
import complexexchange.composeapp.generated.resources.flag_kr
import complexexchange.composeapp.generated.resources.flag_ru
import complexexchange.composeapp.generated.resources.flag_cn
import complexexchange.composeapp.generated.resources.flag_pt
import complexexchange.composeapp.generated.resources.flag_fr
import org.jetbrains.compose.resources.DrawableResource
import complexexchange.composeapp.generated.resources.ic_back

private val TextPrimary = Color(0xFF343434)
private val TextSecondary = Color(0xFF989898)
private val DividerColor = Color(0xFFECECEC)

@Composable
@Preview
fun App() {
	MaterialTheme {
		Column(
			modifier = Modifier
				.background(Color.White)
				.fillMaxSize()
				.padding(horizontal = 24.dp)
		) {
			StatusBar()
			TopBar(title = "Exchange rate", topPadding = 0.dp)
			HeaderRow()
			CountryRow(
				flag = Res.drawable.flag_vn,
				country = "Vietnam",
				buy = "1.403",
				sell = "1.746"
			)
			CountryRow(
				flag = Res.drawable.flag_ni,
				country = "Nicaragua",
				buy = "9.123",
				sell = "12.09"
			)
			CountryRow(
				flag = Res.drawable.flag_kr,
				country = "Korea",
				buy = "3.704",
				sell = "5.151"
			)
			CountryRow(
				flag = Res.drawable.flag_ru,
				country = "Russia",
				buy = "116.0",
				sell = "144.4"
			)
			CountryRow(
				flag = Res.drawable.flag_cn,
				country = "China",
				buy = "1.725",
				sell = "2.234"
			)
			CountryRow(
				flag = Res.drawable.flag_pt,
				country = "Portuguese",
				buy = "1.403",
				sell = "1.746"
			)
			CountryRow(
				flag = Res.drawable.flag_kr,
				country = "Korea",
				buy = "3.454",
				sell = "4.312"
			)
			CountryRow(
				flag = Res.drawable.flag_fr,
				country = "French",
				buy = "23.45",
				sell = "34.56"
			)
			CountryRow(
				flag = Res.drawable.flag_ni,
				country = "Nicaragua",
				buy = "263.1",
				sell = "300.3"
			)
			CountryRow(
				flag = Res.drawable.flag_cn,
				country = "China",
				buy = "1.725",
				sell = "2.234"
			)
		}
	}
}

@Composable
private fun StatusBar() {
	Row(
		modifier = Modifier
			.fillMaxWidth()
			.height(40.dp),
		verticalAlignment = Alignment.CenterVertically
	) {
		Text(
			text = "9:09",
			color = Color.Black,
			fontSize = 11.sp,
			fontWeight = FontWeight.Medium,
			modifier = Modifier.weight(1f)
		)
		Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(8.dp)) {
			SignalIcon()
			WifiIcon()
			BatteryIcon()
		}
	}
}

@Composable
private fun SignalIcon() {
	Row(horizontalArrangement = Arrangement.spacedBy(2.dp), verticalAlignment = Alignment.Bottom) {
		Box(Modifier.size(width = 3.dp, height = 5.dp).background(Color.Black, RoundedCornerShape(0.75.dp)))
		Box(Modifier.size(width = 3.dp, height = 7.5.dp).background(Color.Black, RoundedCornerShape(0.75.dp)))
		Box(Modifier.size(width = 3.dp, height = 9.5.dp).background(Color.Black, RoundedCornerShape(0.75.dp)))
		Box(Modifier.size(width = 3.dp, height = 11.dp).background(Color.Black, RoundedCornerShape(0.75.dp)))
	}
}

@Composable
private fun WifiIcon() {
	Canvas(modifier = Modifier.size(width = 16.dp, height = 11.dp)) {
		val stroke = 1.2.dp.toPx()
		val color = Color.Black
		drawArc(
			color = color,
			startAngle = 200f,
			sweepAngle = 140f,
			useCenter = false,
			style = Stroke(width = stroke),
			size = Size(size.width, size.height),
			topLeft = Offset(0f, 0f)
		)
		drawArc(
			color = color,
			startAngle = 210f,
			sweepAngle = 120f,
			useCenter = false,
			style = Stroke(width = stroke),
			size = Size(size.width * 0.75f, size.height * 0.75f),
			topLeft = Offset(size.width * 0.125f, size.height * 0.125f)
		)
		drawArc(
			color = color,
			startAngle = 220f,
			sweepAngle = 100f,
			useCenter = false,
			style = Stroke(width = stroke),
			size = Size(size.width * 0.5f, size.height * 0.5f),
			topLeft = Offset(size.width * 0.25f, size.height * 0.25f)
		)
	}
}

@Composable
private fun BatteryIcon() {
	Row(verticalAlignment = Alignment.CenterVertically) {
		Box(
			Modifier
				.size(width = 24.33.dp, height = 11.33.dp)
				.border(1.dp, Color.Black, RoundedCornerShape(2.66.dp))
		) {
			Box(
				Modifier
					.padding(horizontal = 3.dp, vertical = 2.dp)
					.size(width = 18.dp, height = 7.33.dp)
					.background(Color.Black, RoundedCornerShape(1.dp))
			)
		}
		Spacer(Modifier.width(2.dp))
		Box(
			Modifier
				.size(width = 2.3.dp, height = 6.dp)
				.background(Color.Black, RoundedCornerShape(1.dp))
		)
	}
}

@Composable
private fun TopBar(title: String, topPadding: Dp) {
	Spacer(Modifier.height(topPadding))
	Row(
		modifier = Modifier
			.fillMaxWidth()
			.height(53.dp),
		verticalAlignment = Alignment.CenterVertically
	) {
		Image(
			painter = painterResource(Res.drawable.ic_back),
			contentDescription = null,
			modifier = Modifier.size(16.dp)
		)
		Text(
			text = title,
			color = TextPrimary,
			fontSize = 20.sp,
			fontWeight = FontWeight.SemiBold
		)
	}
	Spacer(Modifier.height(24.dp))
}

@Composable
private fun HeaderRow() {
	Row(
		modifier = Modifier
			.fillMaxWidth(),
		horizontalArrangement = Arrangement.SpaceBetween,
		verticalAlignment = Alignment.CenterVertically
	) {
		Text(
			text = "Country",
			color = TextSecondary,
			fontSize = 16.sp,
			fontWeight = FontWeight.SemiBold,
			modifier = Modifier.weight(1f)
		)
		Text(
			text = "Buy",
			color = TextSecondary,
			fontSize = 16.sp,
			fontWeight = FontWeight.SemiBold,
			modifier = Modifier.width(72.dp)
		)
		Text(
			text = "Sell",
			color = TextSecondary,
			fontSize = 16.sp,
			fontWeight = FontWeight.SemiBold,
			modifier = Modifier.width(72.dp)
		)
	}
	Spacer(Modifier.height(12.dp))
}

@Composable
private fun CountryRow(
	flag: DrawableResource,
	country: String,
	buy: String,
	sell: String
) {
	Row(
		modifier = Modifier
			.fillMaxWidth()
			.height(42.dp),
		verticalAlignment = Alignment.CenterVertically
	) {
		Image(
			painter = painterResource(flag),
			contentDescription = null,
			modifier = Modifier.size(width = 40.dp, height = 30.dp)
		)
		Spacer(Modifier.width(16.dp))
		Text(
			text = country,
			color = TextPrimary,
			fontSize = 16.sp,
			fontWeight = FontWeight.Medium,
			modifier = Modifier.weight(1f)
		)
		Text(
			text = buy,
			color = TextPrimary,
			fontSize = 16.sp,
			fontWeight = FontWeight.Medium,
			modifier = Modifier.width(72.dp)
		)
		Text(
			text = sell,
			color = TextPrimary,
			fontSize = 16.sp,
			fontWeight = FontWeight.Medium,
			modifier = Modifier.width(72.dp)
		)
	}
	Divider(color = DividerColor, thickness = 1.dp)
}