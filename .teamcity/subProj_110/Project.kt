package subProj_110

import subProj_110.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_110")
    name = "subProj 110"

    buildType(subProj_bt_110_4)
    buildType(subProj_bt_110_5)
    buildType(subProj_bt_110_2)
    buildType(subProj_bt_110_3)
    buildType(subProj_bt_110_0)
    buildType(subProj_bt_110_1)
})
