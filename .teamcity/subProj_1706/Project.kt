package subProj_1706

import subProj_1706.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1706")
    name = "subProj 1706"

    buildType(subProj_bt_1706_3)
    buildType(subProj_bt_1706_2)
    buildType(subProj_bt_1706_5)
    buildType(subProj_bt_1706_4)
    buildType(subProj_bt_1706_1)
    buildType(subProj_bt_1706_0)
})
