package subProj_862

import subProj_862.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_862")
    name = "subProj 862"

    buildType(subProj_bt_862_3)
    buildType(subProj_bt_862_2)
    buildType(subProj_bt_862_1)
    buildType(subProj_bt_862_0)
    buildType(subProj_bt_862_5)
    buildType(subProj_bt_862_4)
})
