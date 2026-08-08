package dev.softikk.acksy.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLocale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.kizitonwose.calendar.compose.HorizontalCalendar
import com.kizitonwose.calendar.compose.rememberCalendarState
import com.kizitonwose.calendar.core.CalendarDay
import com.kizitonwose.calendar.core.firstDayOfWeekFromLocale
import java.time.DayOfWeek
import java.time.Year
import java.time.format.TextStyle

@Preview(apiLevel = 36)
@Composable
fun AcksyCalendar() {
    val currentYear = remember { Year.now() }
    val firstDayOfWeek = remember { firstDayOfWeekFromLocale() }

    val state = rememberCalendarState(
        firstDayOfWeek = firstDayOfWeek,
    )
    HorizontalCalendar(state = state, dayContent = { Day(it) }, monthHeader = { month ->
        val daysOfWeek = month.weekDays.first().map { it.date.dayOfWeek }
        MonthHeader(daysOfWeek = daysOfWeek)
    })
}

@Composable
fun MonthHeader(daysOfWeek: List<DayOfWeek>) {
    Row(modifier = Modifier.fillMaxWidth()) {
        for (dayOfWeek in daysOfWeek) {
            Text(
                modifier = Modifier.weight(1f),
                textAlign = TextAlign.Center,
                text = dayOfWeek.getDisplayName(
                    TextStyle.SHORT,
                    LocalLocale.current.platformLocale
                ),
            )
        }
    }
}

@Composable
fun Day(day: CalendarDay) {
    Box(
        modifier = Modifier.aspectRatio(1f), contentAlignment = Alignment.Center
    ) {
        Text(text = day.date.dayOfMonth.toString())
    }
}