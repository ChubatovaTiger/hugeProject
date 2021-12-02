package subProj_1678

import subProj_1678.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1678")
    name = "subProj 1678"

    buildType(subProj_bt_1678_4)
    buildType(subProj_bt_1678_5)
    buildType(subProj_bt_1678_2)
    buildType(subProj_bt_1678_3)
    buildType(subProj_bt_1678_0)
    buildType(subProj_bt_1678_1)
})
