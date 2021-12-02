package subProj_998

import subProj_998.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_998")
    name = "subProj 998"

    buildType(subProj_bt_998_4)
    buildType(subProj_bt_998_5)
    buildType(subProj_bt_998_2)
    buildType(subProj_bt_998_3)
    buildType(subProj_bt_998_0)
    buildType(subProj_bt_998_1)
})
