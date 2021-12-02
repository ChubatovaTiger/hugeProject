package subProj_1015

import subProj_1015.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1015")
    name = "subProj 1015"

    buildType(subProj_bt_1015_2)
    buildType(subProj_bt_1015_1)
    buildType(subProj_bt_1015_0)
    buildType(subProj_bt_1015_5)
    buildType(subProj_bt_1015_4)
    buildType(subProj_bt_1015_3)
})
