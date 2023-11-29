package com.plcoding.cryptocurrencyappyt.presentation.coin_list.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.plcoding.cryptocurrencyappyt.data.remote.dto.TeamMember

@Composable
fun TeamListItem(
    teamMember: TeamMember,
    modifier: Modifier = Modifier
){
    Text(
        text = teamMember.name,
        style = MaterialTheme.typography.h4,
    )
    Spacer(modifier = Modifier.height(4.dp))
    Text(
        text = teamMember.position,
        style = MaterialTheme.typography.body2,
        fontStyle = FontStyle.Italic
    )
}