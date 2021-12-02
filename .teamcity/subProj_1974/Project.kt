package subProj_1974

import subProj_1974.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1974")
    name = "subProj 1974"

    buildType(subProj_bt_1974_1)
    buildType(subProj_bt_1974_2)
    buildType(subProj_bt_1974_3)
    buildType(subProj_bt_1974_4)
    buildType(subProj_bt_1974_0)
    buildType(subProj_bt_1974_5)
})
