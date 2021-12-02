package subProj_833

import subProj_833.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_833")
    name = "subProj 833"

    buildType(subProj_bt_833_4)
    buildType(subProj_bt_833_5)
    buildType(subProj_bt_833_2)
    buildType(subProj_bt_833_3)
    buildType(subProj_bt_833_0)
    buildType(subProj_bt_833_1)
})
