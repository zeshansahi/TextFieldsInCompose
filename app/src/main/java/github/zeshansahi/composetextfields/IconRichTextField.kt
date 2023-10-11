package github.zeshansahi.composetextfields

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun IconRichTextField() {
    Column(
        modifier = Modifier.padding(top = 20.dp)
    ) {
        var nameText by remember { mutableStateOf("") }
        TextField(value = nameText, onValueChange = { newString ->
            nameText = newString

        }, label = {
            Text(text = "Enter E-mail here..")
        }, leadingIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Email, contentDescription = "email-icon")
            }
        }, trailingIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Filled.Check, contentDescription ="check-icon")
            }
        }, keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)


        )
    }
}

@Composable
@Preview
fun previewIcon() {
    IconRichTextField()
}