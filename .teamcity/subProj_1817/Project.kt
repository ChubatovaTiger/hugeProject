package subProj_1817

import subProj_1817.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1817")
    name = "subProj 1817"

    buildType(subProj_bt_1817_5)
    buildType(subProj_bt_1817_1)
    buildType(subProj_bt_1817_2)
    buildType(subProj_bt_1817_3)
    buildType(subProj_bt_1817_4)
    buildType(subProj_bt_1817_0)
})
