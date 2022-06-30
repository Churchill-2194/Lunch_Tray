/*
 * Copyright (C) 2021 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.lunchtray.data

import com.example.lunchtray.model.MenuItem

/**
 * Map of available menu items to be displayed in the menu fragments.
 */
object DataSource {
    val menuItems = mapOf(
        "cauliflower" to
        MenuItem(
            name = "Cauliflower",
        ),
        "chili" to
        MenuItem(
            name = "Three Bean Chili",
        ),
        "pasta" to
        MenuItem(
            name = "Mushroom Pasta",
        ),
        "skillet" to
        MenuItem(
            name = "Spicy Black Bean Skillet",
        ),
        "salad" to
        MenuItem(
            name = "Summer Salad",
        ),
        "soup" to
        MenuItem(
            name = "Butternut Squash Soup",
        ),
        "potatoes" to
        MenuItem(
            name = "Spicy Potatoes",
        ),
        "rice" to
        MenuItem(
            name = "Coconut Rice",
        ),
        "bread" to
        MenuItem(
            name = "Lunch Roll",
        ),
        "berries" to
        MenuItem(
            name = "Mixed Berries",
        ),
        "pickles" to
        MenuItem(
            name = "Pickled Veggies",
        )
    )
}
