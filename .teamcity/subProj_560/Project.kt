package subProj_560

import subProj_560.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_560")
    name = "subProj 560"

    buildType(subProj_bt_560_5)
    buildType(subProj_bt_560_0)
    buildType(subProj_bt_560_2)
    buildType(subProj_bt_560_1)
    buildType(subProj_bt_560_4)
    buildType(subProj_bt_560_3)
})
