package subProj_1306

import subProj_1306.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1306")
    name = "subProj 1306"

    buildType(subProj_bt_1306_3)
    buildType(subProj_bt_1306_2)
    buildType(subProj_bt_1306_5)
    buildType(subProj_bt_1306_4)
    buildType(subProj_bt_1306_1)
    buildType(subProj_bt_1306_0)
})
