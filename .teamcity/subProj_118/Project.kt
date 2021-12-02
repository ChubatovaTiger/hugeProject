package subProj_118

import subProj_118.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_118")
    name = "subProj 118"

    buildType(subProj_bt_118_2)
    buildType(subProj_bt_118_3)
    buildType(subProj_bt_118_0)
    buildType(subProj_bt_118_1)
    buildType(subProj_bt_118_4)
    buildType(subProj_bt_118_5)
})
