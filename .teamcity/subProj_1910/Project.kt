package subProj_1910

import subProj_1910.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1910")
    name = "subProj 1910"

    buildType(subProj_bt_1910_1)
    buildType(subProj_bt_1910_2)
    buildType(subProj_bt_1910_0)
    buildType(subProj_bt_1910_5)
    buildType(subProj_bt_1910_3)
    buildType(subProj_bt_1910_4)
})
