package dev.softikk.acksy.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.wear.compose.material.Text

@Composable
private fun AcksyText(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment,
    text: String,
    style: TextStyle,
    color: Color
) {
    Box(
        modifier = modifier,
        contentAlignment = contentAlignment
    ) {
        Text(
            text = text,
            style = style,
            color = color
        )
    }
}

@Composable
fun AcksyScreenName(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment,
    text: String
) {
    AcksyText(
        modifier = modifier,
        contentAlignment = contentAlignment,
        text = text,
        style = MaterialTheme.typography.headlineLarge,
        color = MaterialTheme.colorScheme.onSurface
    )
}

@Composable
fun AcksyTitle(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment,
    text: String
) {
    AcksyText(
        modifier = modifier,
        contentAlignment = contentAlignment,
        text = text,
        style = MaterialTheme.typography.headlineMedium,
        color = MaterialTheme.colorScheme.onSurface
    )
}

@Composable
fun AcksySubtitle(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment,
    text: String
) {
    AcksyText(
        modifier = modifier,
        contentAlignment = contentAlignment,
        text = text,
        style = MaterialTheme.typography.bodyMedium,
        color = MaterialTheme.colorScheme.onSurfaceVariant
    )
}