package subProj_1796

import subProj_1796.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1796")
    name = "subProj 1796"

    buildType(subProj_bt_1796_0)
    buildType(subProj_bt_1796_2)
    buildType(subProj_bt_1796_1)
    buildType(subProj_bt_1796_4)
    buildType(subProj_bt_1796_3)
    buildType(subProj_bt_1796_5)
})
