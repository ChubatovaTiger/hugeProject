package subProj_1862

import subProj_1862.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1862")
    name = "subProj 1862"

    buildType(subProj_bt_1862_5)
    buildType(subProj_bt_1862_3)
    buildType(subProj_bt_1862_4)
    buildType(subProj_bt_1862_1)
    buildType(subProj_bt_1862_2)
    buildType(subProj_bt_1862_0)
})
