package subProj_1110

import subProj_1110.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1110")
    name = "subProj 1110"

    buildType(subProj_bt_1110_4)
    buildType(subProj_bt_1110_3)
    buildType(subProj_bt_1110_5)
    buildType(subProj_bt_1110_0)
    buildType(subProj_bt_1110_2)
    buildType(subProj_bt_1110_1)
})
