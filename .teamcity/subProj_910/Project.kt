package subProj_910

import subProj_910.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_910")
    name = "subProj 910"

    buildType(subProj_bt_910_3)
    buildType(subProj_bt_910_2)
    buildType(subProj_bt_910_1)
    buildType(subProj_bt_910_0)
    buildType(subProj_bt_910_5)
    buildType(subProj_bt_910_4)
})
