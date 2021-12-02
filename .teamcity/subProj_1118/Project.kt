package subProj_1118

import subProj_1118.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1118")
    name = "subProj 1118"

    buildType(subProj_bt_1118_0)
    buildType(subProj_bt_1118_2)
    buildType(subProj_bt_1118_1)
    buildType(subProj_bt_1118_4)
    buildType(subProj_bt_1118_3)
    buildType(subProj_bt_1118_5)
})
