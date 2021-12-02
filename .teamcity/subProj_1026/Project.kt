package subProj_1026

import subProj_1026.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1026")
    name = "subProj 1026"

    buildType(subProj_bt_1026_2)
    buildType(subProj_bt_1026_1)
    buildType(subProj_bt_1026_0)
    buildType(subProj_bt_1026_5)
    buildType(subProj_bt_1026_4)
    buildType(subProj_bt_1026_3)
})
