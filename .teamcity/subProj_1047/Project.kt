package subProj_1047

import subProj_1047.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1047")
    name = "subProj 1047"

    buildType(subProj_bt_1047_4)
    buildType(subProj_bt_1047_5)
    buildType(subProj_bt_1047_0)
    buildType(subProj_bt_1047_1)
    buildType(subProj_bt_1047_2)
    buildType(subProj_bt_1047_3)
})
