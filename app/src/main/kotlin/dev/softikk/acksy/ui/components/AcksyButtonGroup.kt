package dev.softikk.acksy.ui.components

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import dev.softikk.acksy.ui.theme.AcksyTheme
import dev.softikk.acksy.ui.theme.Dimens
import dev.softikk.acksy.ui.theme.White

@Composable
fun AcksyButtonGroup(
    state: Int, buttons: List<String>, onState: (Int) -> Unit
) {
    AcksyTheme {
        val buttonsCount: Int = buttons.size
        Row(
            modifier = Modifier
                .height(Dimens.heightButtonGroup)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(Dimens.xsPadding)
        ) {
            repeat(buttonsCount) { index ->
                val topStart by animateDpAsState(
                    if (index == state) Dimens.largeShape else if (index == 0) Dimens.largeShape else Dimens.smallShape,
                    animationSpec = tween(400)
                )
                val bottomStart by animateDpAsState(
                    if (index == state) Dimens.largeShape else if (index == 0) Dimens.largeShape else Dimens.smallShape,
                    animationSpec = tween(400)
                )
                val topEnd by animateDpAsState(
                    if (index == state) Dimens.largeShape else if (index == (buttonsCount - 1)) Dimens.largeShape else Dimens.smallShape,
                    animationSpec = tween(400)
                )
                val bottomEnd by animateDpAsState(
                    if (index == state) Dimens.largeShape else if (index == (buttonsCount - 1)) Dimens.largeShape else Dimens.smallShape,
                    animationSpec = tween(400)
                )
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f)
                        .clickable(
                            indication = null,
                            interactionSource = remember { MutableInteractionSource() }) {
                            onState(index)
                        }
                        .background(
                            color = if (index == state) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.secondary,
                            shape = RoundedCornerShape(
                                topStart = topStart,
                                bottomStart = bottomStart,
                                topEnd = topEnd,
                                bottomEnd = bottomEnd
                            )
                        ), contentAlignment = Alignment.Center) {
                    Text(
                        text = buttons[index],
                        style = MaterialTheme.typography.labelLarge,
                        color = if (index == state) White else MaterialTheme.colorScheme.onSecondary
                    )
                }
            }
        }
    }
}