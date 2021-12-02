package subProj_140

import subProj_140.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_140")
    name = "subProj 140"

    buildType(subProj_bt_140_5)
    buildType(subProj_bt_140_4)
    buildType(subProj_bt_140_3)
    buildType(subProj_bt_140_2)
    buildType(subProj_bt_140_1)
    buildType(subProj_bt_140_0)
})
