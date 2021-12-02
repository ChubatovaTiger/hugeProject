package subProj_1986

import subProj_1986.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1986")
    name = "subProj 1986"

    buildType(subProj_bt_1986_1)
    buildType(subProj_bt_1986_0)
    buildType(subProj_bt_1986_3)
    buildType(subProj_bt_1986_2)
    buildType(subProj_bt_1986_5)
    buildType(subProj_bt_1986_4)
})
