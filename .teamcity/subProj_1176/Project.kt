package subProj_1176

import subProj_1176.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1176")
    name = "subProj 1176"

    buildType(subProj_bt_1176_3)
    buildType(subProj_bt_1176_4)
    buildType(subProj_bt_1176_5)
    buildType(subProj_bt_1176_0)
    buildType(subProj_bt_1176_1)
    buildType(subProj_bt_1176_2)
})
