package subProj_1625

import subProj_1625.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1625")
    name = "subProj 1625"

    buildType(subProj_bt_1625_2)
    buildType(subProj_bt_1625_3)
    buildType(subProj_bt_1625_4)
    buildType(subProj_bt_1625_5)
    buildType(subProj_bt_1625_0)
    buildType(subProj_bt_1625_1)
})
