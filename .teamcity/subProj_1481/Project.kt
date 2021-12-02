package subProj_1481

import subProj_1481.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1481")
    name = "subProj 1481"

    buildType(subProj_bt_1481_4)
    buildType(subProj_bt_1481_5)
    buildType(subProj_bt_1481_2)
    buildType(subProj_bt_1481_3)
    buildType(subProj_bt_1481_0)
    buildType(subProj_bt_1481_1)
})
