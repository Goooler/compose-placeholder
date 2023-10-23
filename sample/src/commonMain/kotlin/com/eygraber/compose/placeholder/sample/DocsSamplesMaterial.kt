/*
 * Copyright 2021 The Android Open Source Project
 * Copyright 2023 Eliezer Graber
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.eygraber.compose.placeholder.sample

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.eygraber.compose.placeholder.PlaceholderHighlight
import com.eygraber.compose.placeholder.material.fade
import com.eygraber.compose.placeholder.material.placeholder
import com.eygraber.compose.placeholder.material.shimmer

@Composable
fun DocSample_Material_Placeholder() {
  Text(
    text = "Content to display after content has loaded",
    modifier = Modifier
      .padding(16.dp)
      .placeholder(visible = true)
  )
}

@Composable
fun DocSample_Material_PlaceholderFade() {
  Text(
    text = "Content to display after content has loaded",
    modifier = Modifier
      .padding(16.dp)
      .placeholder(
        visible = true,
        highlight = PlaceholderHighlight.fade(),
      )
  )
}

@Composable
fun DocSample_Material_PlaceholderShimmer() {
  Text(
    text = "Content to display after content has loaded",
    modifier = Modifier
      .padding(16.dp)
      .placeholder(
        visible = true,
        highlight = PlaceholderHighlight.shimmer(),
      )
  )
}
