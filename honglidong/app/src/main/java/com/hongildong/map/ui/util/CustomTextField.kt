package com.hongildong.map.ui.util

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.hongildong.map.ui.theme.Black
import com.hongildong.map.ui.theme.Gray100
import com.hongildong.map.ui.theme.Gray400
import com.hongildong.map.ui.theme.White


// 커스텀 텍스트 필드
@Composable
fun CustomTextField(
    placeholderMessage: String,
    textState: String,
    onTextChange: (String) -> Unit,
    isPassword: Boolean = false,
    maxLength: Int = 20,
    textStyle: TextStyle = MaterialTheme.typography.labelMedium.copy(color = Black)
) {
    BasicTextField(
        value = textState,
        onValueChange =  { if (it.length <= maxLength) onTextChange(it) },
        singleLine = true,
        textStyle = textStyle,
        visualTransformation = if (isPassword) {
            PasswordVisualTransformation()
        } else {
            VisualTransformation.None
        },
        modifier = Modifier.wrapContentSize(),
        decorationBox = { innerTextField ->
            Row(
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .fillMaxWidth()
                    .background(color = White, shape = RoundedCornerShape(size = 10.dp))
                    .border(1.dp, color = Gray100, shape = RoundedCornerShape(size = 10.dp))
                    .padding(all = 16.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                if (textState.isEmpty()) {
                    Text(
                        text = placeholderMessage,
                        color = Gray400,
                        textAlign = TextAlign.Start,
                        style = MaterialTheme.typography.labelMedium,
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.CenterVertically),
                    )
                } else {
                    innerTextField()
                }
            }

        },
    )
}
